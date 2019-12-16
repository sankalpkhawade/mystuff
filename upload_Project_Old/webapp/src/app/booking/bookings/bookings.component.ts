import { Component, OnInit } from '@angular/core';
import { Booking } from '../booking';
import { BookingsServiceService } from '../bookings-service.service';
import { VehicleServiceService } from 'src/app/vehicle/vehicle-service.service';

@Component({
  selector: 'app-bookings',
  templateUrl: './bookings.component.html',
  styleUrls: ['./bookings.component.css']
})
export class BookingsComponent implements OnInit {

  bookings:Booking;
  
  
  constructor(private bookingsService:BookingsServiceService,private vehicleService:VehicleServiceService) {

   
   }

  ngOnInit() {

 
    this.bookingsService.getAllBookings();
  }


    

  

}
