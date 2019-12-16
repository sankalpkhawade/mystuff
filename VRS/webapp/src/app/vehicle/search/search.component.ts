import { Component, OnInit } from '@angular/core';
import { vehicleItem } from '../item-info/vehicleItem';
import { VehicleServiceService } from '../vehicle-service.service';
import { VehicleListService } from '../vehicleList/vehicle-list.service';
import { BookingsServiceService } from 'src/app/booking/bookings-service.service';
import { AuthServiceService } from 'src/app/site/auth-service.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  searchKey: String;
  vehicleItem: vehicleItem[];
  filteredVehicleItem: vehicleItem[];
  isAdmin: boolean;

  constructor(private vehicleService: VehicleServiceService, private vehicleListService: VehicleListService, private bookingsService: BookingsServiceService, private authService: AuthServiceService) { }

  ngOnInit() {
    if (this.authService.loggedIn) {
      this.bookingsService.getAllBookings();
    }
    this.vehicleListService.getAllVehicle().subscribe(data => {
      this.vehicleService.vehicleItem = data;
      this.isAdmin = this.vehicleService.isAdmin;
      if (this.isAdmin) {
        this.vehicleItem = this.vehicleService.getAllVehicleItem();
      } else {
        this.vehicleItem = this.vehicleService.getVehicleItems();
      }

      this.filteredVehicleItem = this.vehicleItem;
    })


  }
  search() {
    let filter = this.searchKey.toLocaleLowerCase();
    this.filteredVehicleItem = this.vehicleItem.filter(
      (item) => item.vehicle_no.toLocaleLowerCase().includes(filter));

    this.vehicleService.getSubject().next(this.filteredVehicleItem);
  }

}
