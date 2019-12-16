import { Injectable } from '@angular/core';
import { UserServiceService } from './user-service.service';
import { VehicleServiceService } from '../vehicle/vehicle-service.service';
import { Router } from '@angular/router';
import { BookingsServiceService } from '../booking/bookings-service.service';
import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { VehicleListService } from '../vehicle/vehicleList/vehicle-list.service';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {


  loggedInUser={loggedOut:true};
  validCredentials:boolean = true;
  accessToken: string;
  redirectUrl = '/';
  loggedIn:boolean = false;
  private token: string;
  error: string = "Login Failed";
  userStatus:boolean=false;

  authenticateSpring(user:string,password:string):Observable<any> {
    let credentials = btoa(user+':'+password);
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Basic '+credentials)
    return this.httpClient.get(`${environment.baseUrl}`+"authenticate", {headers})
  }
  public setToken(token: string) {
    this.vehicleListService.setToken(token);
    this.token = token;
  }
  public getToken() {
    return this.token;
  }
  


  constructor(private userService:UserServiceService,private vehicleService:VehicleServiceService,public router:Router,private bookingsService:BookingsServiceService,private httpClient:HttpClient,private vehicleListService:VehicleListService) { }

  authenticateUser(user) {
  

    this.authenticateSpring(user.username,user.password).subscribe(
      (data)=>{
        if(data.token==null){
          this.userStatus=true;
        }
        else{
          this.loggedInUser = user;
          this.validCredentials = true;
          if(data['role'] == 'ADMIN')
            this.vehicleService.isAdmin = true;
          this.loggedIn = true;
          this.vehicleService.isLoggedIn = true;
          this.setToken(data.token);
          this.vehicleListService.userName=user.username;
          console.log(data.token);
          console.log(data);
  
          this.router.navigate(['search-bar']);

        }
       
      },
      (error)=>{
        this.validCredentials = false;
        console.log(error);
        console.log("ERROR");
        this.error = error.error.message;
        if (error.error.errors != null) {
          this.error = error.error.errors[0];
        }
      }
      )
  }

  logout() {
    this.loggedInUser = {loggedOut:true};
    this.vehicleService.isAdmin = false;
    this.loggedIn = false;
    this.vehicleService.isLoggedIn = false;
    this.vehicleService.clickedOnAdd = false;
    this.vehicleService.addedToBookings = false;
    this.router.navigate(['login']);
    // this.router.navigate(['search-bar']);
  }


}
