import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, Subject } from 'rxjs';
import { Vehicle } from '../vehicle/item-info/vehicle-list';
import { environment } from 'src/environments/environment';
import { UserServiceService } from '../site/user-service.service';

@Injectable({
  providedIn: 'root'
})
export class CarListService {
  filter = new Subject();
  private subject=new Subject<Vehicle[]>();
  constructor(private httpClient:HttpClient,private userService:UserServiceService) { }
  
  getAllMenuItems():Observable<any>{

    if(this.userService.getToken()){
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Bearer ' + this.userService.getToken());  
    
    return this.httpClient.get<Vehicle[]>(`${environment.baseUrl}`+'vehicle/user',{headers});
    }
    else{
      let username='masteradmin';
      let password='pwd';
      let headers = new HttpHeaders();
      headers = headers.set('Authorization', 'Basic ' + btoa(username+':'+password));  
      return this.httpClient.get<Vehicle[]>(`${environment.baseUrl}`+'vehicle/user',{headers});
    }
  }
  getSubject():Subject<Vehicle[]>{
    return this.subject;
  }
  getFoodItem(id:number):Observable<Vehicle>{
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Bearer ' + this.userService.getToken());  
    return this.httpClient.get<Vehicle>(environment.baseUrl+'vehicle/user/'+id,{headers});
  }
  modifyItem(foodItem:Vehicle):Observable<any>{
  let headers = new HttpHeaders();
  headers = headers.set('Authorization', 'Bearer ' + this.userService.getToken()); 
  return this.httpClient.put<Vehicle>(environment.baseUrl+'vehicle/user',foodItem,{headers});
  }
  addToCart(menuItemId:number,userId:String){ 
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Bearer ' + this.userService.getToken()); 
    console.log(environment.baseUrl+'carts/'+userId+'/'+menuItemId);
    return this.httpClient.post<Vehicle>(environment.baseUrl+'vehicle/carts/'+userId+'/'+menuItemId,null,{headers});
  }
}
