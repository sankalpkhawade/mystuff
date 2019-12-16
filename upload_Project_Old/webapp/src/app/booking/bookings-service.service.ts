import { Injectable, Output, EventEmitter } from '@angular/core';
import { VehicleListService } from '../vehicle/vehicleList/vehicle-list.service';
import { Booking } from './booking';

@Injectable({
  providedIn: 'root'
})
export class BookingsServiceService {

  @Output() bookingsUpdated = new EventEmitter();

  bookings:Booking={id:0,bookingEnd:null,bookingStart:null,vehicle:[],price:0};
  bookingsEmpty:boolean=false;


  constructor(private vehicleListService:VehicleListService) { }

  getAllBookings(){
    this.vehicleListService.getAllBookingsItems().subscribe(data=>{
      this.bookings=data;
      console.log(data)
      if(this.bookings == null){
        this.bookingsEmpty=true;
      }
      else{
        this.bookingsEmpty=false;
      }
      
    })

  }

  
}