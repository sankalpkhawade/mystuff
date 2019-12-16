import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { vehicleItem } from '../item-info/vehicleItem';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Booking } from 'src/app/booking/booking';
import { User } from 'src/app/site/signup/User';


@Injectable({
  providedIn: 'root'
})
export class VehicleListService {
  vehicleItem:vehicleItem;
  private token:String;
  userName:String;
  public setToken(token: string) {
  this.token = token;
 }
 public getToken() {
   return this.token;
 }

  constructor(private HttpClient:HttpClient) { }

  getAllVehicle():Observable<vehicleItem[]>{
    // let username="admin"
    // let password="pwd"
    // const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
     const headers = new HttpHeaders({ Authorization: 'Bearer ' +  this.getToken()});

    return this.HttpClient.get<vehicleItem[]>(`${environment.baseUrl}`+'vehicle',{headers});

  }

  getVehicle(id:number):Observable<any>{
    const headers = new HttpHeaders({ Authorization: 'Bearer ' +  this.getToken()});

    return this.HttpClient.get<vehicleItem>(`${environment.baseUrl}`+'vehicle/'+id,{headers})

  }

  deleteVechile(id:number):Observable<any>{
    const headers = new HttpHeaders({ Authorization: 'Bearer ' +  this.getToken()});

    return this.HttpClient.delete<vehicleItem>(`${environment.baseUrl}`+'vehicle/'+id,{headers})

  }

  saveVehicle(vehicleItem:vehicleItem):Observable<any>{
    const headers = new HttpHeaders({ Authorization: 'Bearer ' +  this.getToken()});
    return this.HttpClient.put<vehicleItem>(`${environment.baseUrl}`+'vehicle',vehicleItem,{headers})
  }
  addNewVehicle(vehicleItem:vehicleItem):Observable<any>{
    const headers = new HttpHeaders({ Authorization: 'Bearer ' +  this.getToken()});
    return this.HttpClient.post<vehicleItem>(`${environment.baseUrl}`+'vehicle',vehicleItem,{headers})
  }

  addBookingsItem(vehicleItemId:number,booking:Booking):Observable<any>{
    const headers = new HttpHeaders({ Authorization: 'Bearer ' +  this.getToken()});
    return this.HttpClient.post<vehicleItem>(`${environment.baseUrl}`+'booking/'+this.userName+'/'+vehicleItemId,booking,{headers})
  }

  getAllBookingsItems():Observable<any>{
    const headers = new HttpHeaders({ Authorization: 'Bearer ' +  this.getToken()});

    return this.HttpClient.get<vehicleItem>(`${environment.baseUrl}`+'booking/'+this.userName,{headers})
  }
	deleteBookingsItem(vehicleItemId:number):Observable<any>{
    const headers = new HttpHeaders({ Authorization: 'Bearer ' +  this.getToken()});
    return this.HttpClient.delete<vehicleItem>(`${environment.baseUrl}`+'booking/'+this.userName+'/'+vehicleItemId,{headers})
  }

  getPendingData() : Observable<any>{
    const headers = new HttpHeaders({ Authorization: 'Bearer ' +  this.getToken()});
    return this.HttpClient.get(`${environment.baseUrl}`+'users'+"/pendingRegistration", {headers});
  }
  editUserData(user:User) : Observable<any>{
    const headers = new HttpHeaders({ Authorization: 'Bearer ' +  this.getToken()});
    return this.HttpClient.post(`${environment.baseUrl}`+'users'+"/editPendingUserStatus", user, {headers});
  }

}
