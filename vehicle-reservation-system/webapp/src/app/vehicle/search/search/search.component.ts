import { Component, OnInit } from '@angular/core';
import {FoodServiceService } from '../../food-service.service'
import {Vehicle} from '../../item-info/vehicle-list';
import { CarListService } from 'src/app/services/car-list-services.service';
@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  searchkey:string;
  filteredList:Vehicle[];
  originalLists:Vehicle[];
  constructor(private carListService:CarListService) { }

  ngOnInit() {
    this.carListService.getAllMenuItems().subscribe((data)=>{
      this.originalLists=data;
    });
    this.filteredList=this.originalLists;
   
  }
  search(event:any){
    this.filteredList=this.originalLists.filter(food=>food.type.toLocaleLowerCase().includes(this.searchkey.toLocaleLowerCase()));
    this.carListService.getSubject().next(this.filteredList);
  }
}
