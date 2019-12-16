import { Injectable } from '@angular/core';
import { Observable, Observer } from 'rxjs';
import { User } from './user';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
  
  private token: string;
  user:String;
  loggedIn:boolean=false;
  constructor(private httpClient:HttpClient) { }
  public setToken(token: string) {
    this.token = token;
  }
  public getToken() {
    return this.token; 
  }
  authenticate(username: string, password: string): Observable<any> {
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Basic ' +btoa(username + ':' + password));
    this.loggedIn=true;
    this.user=username;
    return this.httpClient.get(environment.baseUrl+'authenticate/', {headers})
  }
  signUp(user:User):Observable<any>{
    return this.httpClient.post<User>(environment.baseUrl+'users/',user);
  }
  logout(){
    this.token=null;
  }
}
