import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  signupForm:FormGroup;

  constructor(private fb:FormBuilder,private userService:UserServiceService) { }

  ngOnInit() {

    this.signupForm=this.fb.group({
      username:["",[Validators.required,Validators.maxLength(20)]],
      firstname:["",[Validators.required]],
      lastname:["",[Validators.required]],
      age:["",[Validators.required,Validators.min(18)]],
      gender:["",[Validators.required]],
      contact:["",[Validators.required,Validators.min(1000000000),Validators.max(9999999999)]],
      email:["",[Validators.required]],
      password:["",[Validators.required,Validators.minLength(6)]],
      ConPassword:["",[Validators.required,Validators.minLength(6),this.matchConfirmPassword.bind(this)]],
      branch:["",[Validators.required,Validators.maxLength(5)]]
    });
  }
  get username() {
    return this.signupForm.get('username');
  }
  get firstname() {
    return this.signupForm.get('firstname');
  }
  get lastname() {
    return this.signupForm.get('lastname');
  }
  get age() {
    return this.signupForm.get('age');
  }
  get gender() {
    return this.signupForm.get('gender');
  }
  get contact() {
    return this.signupForm.get('contact');
  }
  get email() {
    return this.signupForm.get('email');
  }
  get password() {
    return this.signupForm.get('password');
  }
  get ConPassword() {
    return this.signupForm.get('ConPassword');
  }
  get branch() {
    return this.signupForm.get('branch');
  }


  matchConfirmPassword(formControl: FormControl): { [s: string]: boolean } {
    if (this.signupForm) {
      if (formControl.value && formControl.value.length > 0 && formControl.value !== this.signupForm.get('password').value) {
        return { 'nomatch': true };
      }
    }
    return null;
  }



}
