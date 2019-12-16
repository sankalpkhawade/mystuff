import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute, Params } from '@angular/router';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styles: [`
    input.ng-invalid.ng-touched {
      border: 1px solid red;
      background-color: #fdd;
    }
  `]
})
export class LoginComponent implements OnInit {
  
  isLoginValid = true;
  authSource: string;
  error:String;
  constructor(private router: Router,
    private route: ActivatedRoute,
    private authService: AuthService,
    private userService:UserServiceService) { }

  ngOnInit() {
    this.route.queryParams.subscribe((params: Params) => {
      this.authSource = params['from'];
    });
  }

  onSubmit(form: NgForm) {
    const username = form.value.username;
    const password = form.value.password;
    console.log(password+''+username);
    this.userService.authenticate(username,password).subscribe((data)=>{
      this.userService.setToken(data.token);
      console.log(data.token);
      this.authService.logIn(username, password);
      this.router.navigate([this.authService.redirectUrl]);
    },
    (error)=>{
      error="Invalid Username or Password";          
      this.isLoginValid = false;
    }
    );

  }

}
