import { Component, OnInit } from '@angular/core';
import { VehicleListService } from 'src/app/vehicle/vehicleList/vehicle-list.service';
import { User } from '../signup/User';
import { Router } from '@angular/router';

@Component({
  selector: 'app-approval',
  templateUrl: './approval.component.html',
  styleUrls: ['./approval.component.css']
})
export class ApprovalComponent implements OnInit {
  pendingUserList;
  constructor(private vehicleListService:VehicleListService,private router:Router) { }

  ngOnInit() {
    this.vehicleListService.getPendingData().subscribe(data=>{
      this.pendingUserList = data;
    },
    (error)=>{
      console.log(error);        
    }
  );
  }

  approve(user:User) {
    user.status = "A";
    this.vehicleListService.editUserData(user).subscribe(
      (data)=>{
        this.pendingUserList = data;
      }
    );
  }
  deny(user:User) {
    user.status = "D";
    this.vehicleListService.editUserData(user).subscribe(
      (data)=>{
        this.pendingUserList = data;
      }
    );
  }
}

