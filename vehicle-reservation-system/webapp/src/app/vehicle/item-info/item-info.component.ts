import { Component, OnInit, Input, Output ,EventEmitter} from '@angular/core';
import { Vehicle } from './vehicle-list';
import {FoodServiceService} from '../food-service.service';
import { CartService } from 'src/app/booking/cart.service';
import { AuthService } from '../../site/auth.service';
import { CarListService } from 'src/app/services/car-list-services.service';

@Component({
  selector: 'app-item-info',
  templateUrl: './item-info.component.html',
  styleUrls: ['./item-info.component.css']
})

export class ItemInfoComponent implements OnInit {
  vehicle:Vehicle[];
  @Input() vehicleIte:Vehicle;
  @Output() cartUpdated: EventEmitter<number> = new EventEmitter<number>();
  cartAdded=false;
  constructor(private foodService:FoodServiceService,private cartService:CartService,private authService: AuthService,private carListService:CarListService){
  }
  addToCart(foodId:number){
    this.cartUpdated.emit(foodId);
    this.cartAdded=true;
    setTimeout(() => {
      this.cartAdded = false;
    }, 1000);
   // this.cartService.addToCart(foodId,1);//hard corderd to 1
  }
  ngOnInit() {
    this.carListService.getAllMenuItems().subscribe((data)=>{
      this.vehicle=data;
    });
    this.carListService.getSubject().subscribe((data)=>{
      this.vehicle=data;
    });
  
  }

  isEditAllowed() {
    return this.authService.loggedIn && this.authService.isAdminUser();
  }

} 

