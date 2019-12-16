import { Component, OnInit } from '@angular/core';
import { FormControl,FormGroup,Validators, FormBuilder} from '@angular/forms';
import { vehicleItem } from '../item-info/vehicleItem';
import { VehicleServiceService } from '../vehicle-service.service';
import { ActivatedRoute, Router } from '@angular/router';
import { VehicleListService } from '../vehicleList/vehicle-list.service';

@Component({
  selector: 'app-item-edit',
  templateUrl: './item-edit.component.html',
  styleUrls: ['./item-edit.component.css']
})
export class ItemEditComponent implements OnInit {

  vehicleItem:vehicleItem;
  form:FormGroup;
  saved:boolean=false;

  Seaters=[2,4,6];
  types=["Petrol","Diesel","Electric","Gas"];

  

  constructor(private fb: FormBuilder, private vehicleService:VehicleServiceService,private route : ActivatedRoute,public router:Router,private vehicleListService:VehicleListService) { }
    

  ngOnInit() {
    const vehicleItemId=this.route.snapshot.paramMap.get('id');
    this.vehicleListService.getVehicle(+vehicleItemId).subscribe(data=>{
      this.vehicleItem=data;
      this.vehicleItem.insurance_exp_date=new Date(this.vehicleItem.insurance_exp_date);
      this.vehicleItem.insurance_exp_date.setDate(this.vehicleItem.insurance_exp_date.getDate()+1);
      this.vehicleItem.last_service_date=new Date(this.vehicleItem.last_service_date);
      this.vehicleItem.last_service_date.setDate(this.vehicleItem.last_service_date.getDate()+1);
      this.vehicleItem.service_due_date=new Date(this.vehicleItem.service_due_date);
      this.vehicleItem.service_due_date.setDate(this.vehicleItem.service_due_date.getDate()+1);
      this.saved=true;
      this.form=this.fb.group({
        name:[this.vehicleItem.name],
        vh_number:[this.vehicleItem.vehicle_no],
        photoURL:[this.vehicleItem.image,[Validators.required]],
        price:[this.vehicleItem.price,[Validators.required]],
        seater:[this.vehicleItem.seater,[Validators.required]],
        type:[this.vehicleItem.type,[Validators.required]],
        active:[this.vehicleItem.active,[Validators.required]],
        branch:[this.vehicleItem.branch,[Validators.required,Validators.maxLength(5)]],
        in_exp_date:[this.vehicleItem.insurance_exp_date.toISOString().substring(0,10),[Validators.required]],
        last_serv_date:[this.vehicleItem.last_service_date.toISOString().substring(0,10),[Validators.required]],
        serv_due_date:[this.vehicleItem.service_due_date.toISOString().substring(0,10),[Validators.required]]
      })
    })
   
  }

  get name() { 
    return this.form.get('name'); }
    
  get vh_number() { 
    return this.form.get('vh_number'); }
    
  get photoURL() { 
    return this.form.get('photoURL'); }
    
  get price() { 
    return this.form.get('price'); }
    
  get seater() { 
    return this.form.get('seater'); }
    
  get type() { 
    return this.form.get('type'); }
    
  get active() { 
    return this.form.get('active'); }
    
  get branch() { 
    return this.form.get('branch'); }
    
  get in_exp_date() { 
    return this.form.get('in_exp_date'); }
    
  get last_serv_date() { 
    return this.form.get('last_serv_date'); }
    
  get serv_due_date() { 
    return this.form.get('serv_due_date'); }


    onSubmit() {
      let newItem:vehicleItem={id:this.vehicleItem.id,name:this.form.value["name"],vehicle_no:this.form.value["vh_number"],image:this.form.value["photoURL"],
      price:this.form.value["price"],seater:this.form.value["seater"],type:this.form.value["type"],active:this.form.value["active"],status:this.vehicleItem.status,
      branch:this.form.value["branch"],insurance_exp_date:new Date(this.form.value["in_exp_date"]),last_service_date:new Date(this.form.value["last_serv_date"]),
      service_due_date:new Date(this.form.value["serv_due_date"])};
      this.vehicleListService.saveVehicle(newItem).subscribe(data=>{
        this.router.navigate(['search-bar'])
      })
    
    }


}
