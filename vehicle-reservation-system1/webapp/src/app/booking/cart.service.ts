import { Injectable, Output,EventEmitter } from '@angular/core';
import { CartInterface} from './cart-item';
import { Vehicle } from '../vehicle/item-info/vehicle-list';
import { FoodServiceService } from '../vehicle/food-service.service';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { UserServiceService } from '../site/user-service.service';
import { environment } from 'src/environments/environment';
import { UUID} from 'angular2-uuid';
import { AuthService } from '../site/auth.service';


@Injectable({
  providedIn: 'root'
})
export class CartService {
  @Output() cartUpdated=new EventEmitter<Vehicle>();
  cart: CartInterface 
  vehicle:Vehicle[]
  i: any;
  total:number;
  constructor(private foodService:FoodServiceService,private httpClient:HttpClient,private userService:UserServiceService,private authService:AuthService) { }
  getCart():Observable<any>{ 
    // const uid =UUID.UUID();
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Bearer ' + this.userService.getToken()); 

    return this.httpClient.get<CartInterface>(environment.baseUrl+'menuitem-service/carts/'+this.authService.userAuthenticated1,{headers});
  }
 
  removeFromCart(itemtId: String) {
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Bearer ' + this.userService.getToken()); 
    return this.httpClient.delete(environment.baseUrl+'menuitem-service/carts/'+this.authService.userAuthenticated1+'/'+itemtId,{headers})
  }

  clearCart() {
    this.cart.vehicleList = null;
    this.cart.total = 0;
  }

}
