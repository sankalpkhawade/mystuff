import { Component, OnInit } from '@angular/core';
import { AuthServiceService } from './site/auth-service.service';
import { Router } from '@angular/router';
import { VehicleServiceService } from './vehicle/vehicle-service.service';
import { VehicleListService } from './vehicle/vehicleList/vehicle-list.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Vehicle Reservation System';
  isLoggedIn:boolean = false;

  constructor(private authService:AuthServiceService,public router: Router,private vehicleService:VehicleServiceService,private vehicleListService:VehicleListService) {  
  }
  ngOnInit(): void {
    this.loggedIn();
    this.router.navigate(['search-bar']);
  }
  
  

  loggedIn():boolean {
    if(!this.authService.loggedInUser.loggedOut){
      this.isLoggedIn = true;
      return true
    }
    else{
      this.isLoggedIn = false;
      return false;
    }
  }
  clickOnAddBookings(){
    this.vehicleService.clickedOnAdd = false;
    this.vehicleService.addedToBookings = false;
  }



}

