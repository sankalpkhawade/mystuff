import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthenticationService } from 'src/app/services/authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  isLoginValid = true;
  submitted=undefined
  constructor(private authenticationService: AuthenticationService) { }

  ngOnInit() {
  }
  onSubmit(form: NgForm){
    const username = form.value.username;
    const password = form.value.password;
    console.log(username+" "+password);
    this.authenticationService.authenticate(username,password).subscribe((data)=>{
      console.log(data);
    });
    if(form.controls.username.valid && form.controls.password.valid){
      this.submitted=true
    } else{
      this.submitted=false
    }
  }

}
