import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { VehicleServiceService } from 'src/app/vehicle/vehicle-service.service';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm:FormGroup;

  constructor(private fb:FormBuilder,private authService:AuthServiceService,public router:Router,private vehicleService:VehicleServiceService) { }

  ngOnInit() {
    this.loginForm = this.fb.group({
      username: ['',[ Validators.required]],
      password: ['',[Validators.required]]
    })
  }
  get username(){
    return this.loginForm.get('username');
  }
  get password(){
    return this.loginForm.get('password');
  }
  toSignup() {
    this.router.navigate(['signup'])
  }
  onSubmit(){
    this.authService.authenticateUser(this.loginForm.value)
  }



}
