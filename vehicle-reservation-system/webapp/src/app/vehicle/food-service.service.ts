import { Injectable } from '@angular/core';
import { Vehicle } from './item-info/vehicle-list';
import { Subject, Observer, Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class FoodServiceService  {
  vehicle:Vehicle[];
  filter = new Subject();
  private subject=new Subject<Vehicle[]>();
  filteredList:Vehicle[];
  constructor() { 
    // this.foodItem=[
    //   {id:1,name:'sandwich',price:99,active:true,dateOfLaunch:new Date('12/03/2017'),category:'Main Course',freeDelivery:true ,imageLink:'https://images.unsplash.com/photo-1528735602780-2552fd46c7af?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1353&q=80'},
    //   {id:2,name:'Burger',price:129,active:true,dateOfLaunch:new Date('08/12/2017'),category:'Main Course',freeDelivery:false,imageLink:'https://images.unsplash.com/photo-1512152272829-e3139592d56f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80'},
    //   {id:3,name:'Pizza',price:149,active:true,dateOfLaunch:new Date('08/08/2017'),category:'Main Course',freeDelivery:false,imageLink:'https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1510&q=80'},
    //   {id:4,name:'FrenchFries',price:57,active:false,dateOfLaunch:new Date('02/07/2017'),category:'Starters',freeDelivery:true,imageLink:'https://images.unsplash.com/photo-1526230427044-d092040d48dc?ixlib=rb-1.2.1&auto=format&fit=crop&w=1500&q=80'},
    //   {id:5,name:'Chocolate Brownie',price:32,active:true,dateOfLaunch:new Date('02/11/2022'),category:'Dessert',freeDelivery:true,imageLink:'https://images.unsplash.com/photo-1564355808539-22fda35bed7e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1030&q=80'}
    // ]
  }
  getFoodItems(){
    return this.vehicle;
  }
  getFoodItems1(){
    return Observable.arguments(this.vehicle);
  }
  getSubject():Subject<Vehicle[]>{
    return this.subject;
  }
  // getFoodItem(id:number):Observable<any>{
  //   return Observable.create((observer: Observer<FoodItem>) => {
      
  //       const prod = this.getFoodItems().find(product => product.id == id);
  //       observer.next(prod);
      
  //   });
  // }
  // updateFoodItem(editfood:FoodItem){
  //   // const foodIndex=this.foodItem.findIndex(food =>food.id===editfood.id);
  //   // const updatedFoodItem=this.foodItem.splice(foodIndex,1,editfood);  
  //   // return updatedFoodItem; 
  //  let updatedItem=this.foodItem.find(this.findIndexToUpdate,editfood.id);
  //  let index=this.foodItem.indexOf(updatedItem);
  //  this.foodItem[index]=editfood;
  // }
  findIndexToUpdate(editfood:any) { 
    return editfood.id === this.vehicle;
}


}
