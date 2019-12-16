import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { User } from './signup/User';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
  userExists:boolean=true;
  user:User;



  constructor(private router:Router,private httpClient:HttpClient) { }


  addUsers(user:User):Observable<any>{

    return this.httpClient.post<User>(`${environment.baseUrl}`+'users',user);

   }

   addUser(user:any) {
    let newUser:User={username:user['username'],firstname:user['firstname'],lastname:user['lastname'],age:user['age'],
    gender:user['gender'],contact:user['contact'],email:user['email'],password:user['password'],branch:user['branch'],status:"P"}
    this.addUsers(newUser).subscribe(data=>{
      this.userExists=data;
      if(data)
      alert("Your details are submitted successfully");
        this.router.navigate(['login']);
    },
    (error)=>{
      console.log(error);
    })
  }

}
