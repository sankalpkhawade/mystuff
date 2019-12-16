import { Injectable } from '@angular/core';
import { vehicleItem } from './item-info/vehicleItem';
import { Subject } from 'rxjs';
import { BookingsServiceService } from '../booking/bookings-service.service';
import { Router } from '@angular/router';
import { VehicleListService } from './vehicleList/vehicle-list.service';
import { Booking } from '../booking/booking';

@Injectable({
  providedIn: 'root'
})
export class VehicleServiceService {

  private subject= new Subject<vehicleItem[]>();
  isAdmin:boolean=false;
  addedToBookings:boolean = false;
  bookingsAddedId:number;
  isLoggedIn:boolean = false;
  clickedOnAdd:boolean = false;

  
  vehicleItem:vehicleItem[]

  constructor(private bookingsService:BookingsServiceService,private router:Router,private vehicleListService:VehicleListService) {
    this.vehicleListService.getAllVehicle().subscribe((data:vehicleItem[])=>{
      this.vehicleItem=data;
    }
    )
   }


  
  getVehicleItems():vehicleItem[]
  {
    return this.vehicleItem;
  }
  getAllVehicleItem():vehicleItem[]
  {
    return this.vehicleItem;
  }
  getSubject():Subject<vehicleItem[]> {
    return this.subject;
  }
 


  removeFromBookings(vehicleItemId:number){
    this.vehicleListService.deleteBookingsItem(vehicleItemId).subscribe(data=>{
      this.bookingsService.getAllBookings();
    })
  }





}
