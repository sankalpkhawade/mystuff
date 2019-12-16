import { Component, OnInit, Input, EventEmitter } from '@angular/core';
import { vehicleItem } from '../item-info/vehicleItem';
import { VehicleServiceService } from '../vehicle-service.service';
import { BookingsServiceService } from 'src/app/booking/bookings-service.service';
import { VehicleListService } from './vehicle-list.service';
import { AuthServiceService } from 'src/app/site/auth-service.service';
@Component({
  selector: 'app-vehicleList',
  templateUrl: './vehicleList.component.html',
  styleUrls: ['./vehicleList.component.css']
})
export class VehicleComponent implements OnInit {

  //@Input()
  vehicleItem: vehicleItem[];
  deleteVehicleClicked = new EventEmitter();
  isAdmin: boolean;

  searchKey: String;
  sortkey: String;
  filteredVehicleItem: vehicleItem[];

  constructor(private vehicleService: VehicleServiceService, private bookingsService: BookingsServiceService, private vehicleListService: VehicleListService, private authService: AuthServiceService) { }

  ngOnInit() {
    this.isAdmin = this.vehicleService.isAdmin;
    this.vehicleListService.getAllVehicle().subscribe(data => {
      this.vehicleItem = data;
      if (this.isAdmin) {
        this.isAdminMethod();
      }
      else {
        this.isNotAdminMethod();
      }
    })

    this.vehicleListService.getAllVehicle().subscribe(data => {
      this.vehicleService.vehicleItem = data;
      this.filteredVehicleItem = this.vehicleItem;
    })

  }
  isAdminMethod() {
    this.vehicleItem = this.vehicleService.getAllVehicleItem();
    this.vehicleService.getSubject().subscribe((data) => (
      this.vehicleItem = data
    ));
  }

  isNotAdminMethod() {
    this.vehicleItem = this.vehicleService.getVehicleItems();
    this.vehicleService.getSubject().subscribe((data) => (
      this.vehicleItem = data
    ));
  }
  deleteVehicle(id: number) {
    this.vehicleListService.deleteVechile(id).subscribe(data => {
      this.vehicleItem = data;
      // this.router.navigate(['search-bar'])

    })
  }

  sortFunction() {
    if (this.sortkey == "seater") {
      this.filteredVehicleItem = this.filteredVehicleItem.sort((a: vehicleItem, b: vehicleItem): number => {
        if (a.seater > b.seater)
          return 1;
        else
          return -1;
      })
    }
    if (this.sortkey == "type") {
      this.filteredVehicleItem = this.filteredVehicleItem.sort((a: vehicleItem, b: vehicleItem): number => {
        if (a.type > b.type)
          return 1;
        else
          return -1;
      })
    }
    if (this.sortkey == "price") {
      this.filteredVehicleItem = this.filteredVehicleItem.sort((a: vehicleItem, b: vehicleItem): number => {
        if (a.price > b.price)
          return 1;
        else
          return -1;
      })
    }

  }

}
