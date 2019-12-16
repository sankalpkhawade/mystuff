import { Component, OnInit, Output,EventEmitter, Input } from '@angular/core';
import {Vehicle} from '../item-info/vehicle-list';
import {FoodServiceService} from '../food-service.service';

import { CartService } from 'src/app/booking/cart.service';
import { Router } from '@angular/router';
import { AuthService } from '../../site/auth.service'
import { CarListService } from 'src/app/services/car-list-services.service';
import { UserServiceService } from 'src/app/site/user-service.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  vehicle:Vehicle[];
  originalList: Vehicle[];

  cartAdded=false;
  constructor(private cartService:CartService, private authService: AuthService,
    private router: Router,private carListService:CarListService,private userService:UserServiceService) { 
  
  }
  
  ngOnInit() {
    this.carListService.getAllMenuItems().subscribe((data)=>{
      this.vehicle=data;
    })
    this.carListService.getSubject().subscribe((data)=>{
     // this.foodItem=data;
      this.originalList = [...data]; // maintain original copy
      this.vehicle = [...data]; // update list rendered in template
    });

    this.carListService.filter.subscribe((obj: { name: string }) => {
      if (obj.name !== '') { // filter from original list for search text, and update list rendered
        const result = this.originalList.filter(prod => prod.type.toLowerCase().includes(obj.name.toLowerCase()));
        this.vehicle = result ? result : [];
      } else { // reset to original product list, if not search text entered
        this.vehicle = [...this.originalList];
      }
    });
  
  }
  addedToCart(foodId:number){
    if (!this.authService.loggedIn) {
      this.router.navigate(['/cart']);
    }else{
    this.carListService.addToCart(foodId,this.userService.user).subscribe((data)=>{
      console.log(data);
    });
  }
  }

}
