import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { VehicleListService } from '../vehicleList/vehicle-list.service';
import { vehicleItem } from '../item-info/vehicleItem';

@Component({
  selector: 'app-add-vehicle',
  templateUrl: './add-vehicle.component.html',
  styleUrls: ['./add-vehicle.component.css']
})
export class AddVehicleComponent implements OnInit {

  constructor(private fb:FormBuilder,public router:Router,private vehicleListService:VehicleListService ) { }
  addform:FormGroup;
  Seaters=[2,4,6];
  types=["Petrol","Diesel","Electric","Gas"];
  ngOnInit() {
    this.addform=this.fb.group({
    name:["",[Validators.required]],
    vh_number:["",[Validators.required,Validators.maxLength(10)]],
    image:["",[Validators.required]],
    price:["",[Validators.required]],
    seater:["",[Validators.required]],
    type:["",[Validators.required]],
    active:["",[Validators.required]],
    branch:["",[Validators.required,Validators.maxLength(5)]],
    in_exp_date:["",[Validators.required]],
    last_serv_date:["",[Validators.required]],
    serv_due_date:["",[Validators.required]]
  })
}

get name() { 
return this.addform.get('name'); }

get vh_number() { 
return this.addform.get('vh_number'); }

get image() { 
return this.addform.get('image'); }

get price() { 
return this.addform.get('price'); }

get seater() { 
return this.addform.get('seater'); }

get type() { 
return this.addform.get('type'); }

get active() { 
return this.addform.get('active'); }

get branch() { 
return this.addform.get('branch'); }

get in_exp_date() { 
return this.addform.get('in_exp_date'); }

get last_serv_date() { 
return this.addform.get('last_serv_date'); }

get serv_due_date() { 
return this.addform.get('serv_due_date'); }


onSubmit(){
let newItem:vehicleItem={name:this.addform.value["name"],vehicle_no:this.addform.value["vh_number"],image:this.addform.value["image"],
      price:this.addform.value["price"],seater:this.addform.value["seater"],type:this.addform.value["type"],active:this.addform.value["active"],
      branch:this.addform.value["branch"],insurance_exp_date:new Date(this.addform.value["in_exp_date"]),last_service_date:new Date(this.addform.value["last_serv_date"]),
      service_due_date:new Date(this.addform.value["serv_due_date"]),status:false};
  this.vehicleListService.addNewVehicle(newItem).subscribe(data=>{
    this.router.navigate(['search-bar'])
  })

}
}
