import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { vehicleItem } from './vehicleItem';
import { VehicleServiceService } from '../vehicle-service.service';
import { VehicleListService } from '../vehicleList/vehicle-list.service';
import { FormControl,FormGroup,Validators, FormBuilder} from '@angular/forms';
import { Booking } from 'src/app/booking/booking';
import { Router } from '@angular/router';
import { BookingsServiceService } from 'src/app/booking/bookings-service.service';


@Component({
  selector: 'app-item-info',
  templateUrl: './item-info.component.html',
  styleUrls: ['./item-info.component.css']
})
export class ItemInfoComponent implements OnInit {

  @Input() vehicleItem:vehicleItem;
  @Output() deleteVehicleClicked = new EventEmitter();
  isAdmin:boolean;
  bookingsAddedId:number;
  clickname:String =null;
  Bookingform:FormGroup;
  dateAvailable:boolean;
  nextDate:Date;
  booking:Booking;
  
  constructor(private fb: FormBuilder,private vehicleService:VehicleServiceService, private vehiclelist:VehicleListService,public router:Router,private bookingsService:BookingsServiceService) { }

  ngOnInit() {
    this.isAdmin=this.vehicleService.isAdmin;
    this.Bookingform=this.fb.group({
      startDate:["",[Validators.required]],
      endDate:["",[Validators.required]]
    })
  }
  
  get startDate() {
    return this.Bookingform.get('startDate');
  }
  get endDate() {
    return this.Bookingform.get('endDate');
  }
  onSubmit(id:number){
    console.log(this.Bookingform.value)
    let newBooking:Booking={bookingStart:this.Bookingform.value["startDate"],bookingEnd:this.Bookingform.value["endDate"]}
    this.vehiclelist.addBookingsItem(id,newBooking).subscribe(data=>{
      console.log(data)
      alert("Please Proceed To Payment")
      this.router.navigate(['bookings'])
    });

  }

  displayAddToBookings(id:number) {
    this.bookingsAddedId = id;
  }
 
  moreDetails(vehicleItem:vehicleItem){
    // this.nextDate=new Date(this.Bookingform.value["endDate"])
    // this.nextDate.setDate(this.nextDate.getDate()+1);
    // console.log(this.Bookingform.value["endDate"])
  this.clickname=vehicleItem.name;
  vehicleItem.insurance_exp_date=new Date(vehicleItem.insurance_exp_date)
  if(vehicleItem.insurance_exp_date>= new Date()){
    this.dateAvailable=false;

  }
  else{
    this.dateAvailable=true;
  }
  }
  lessDetails(){
    this.clickname=null;
    
  }
  // deleteVehicle(id:number){
  //   this.vehiclelist.deleteVechile(id).subscribe(data=>{
  //     this.vehicleItem=data;
  //     this.router.navigate(['search-bar'])

  //   })

  // }

  
  }
