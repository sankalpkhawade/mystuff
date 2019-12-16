import { Injectable } from '@angular/core';
import { CanActivate, RouterStateSnapshot, ActivatedRouteSnapshot, Router } from '@angular/router';
import { Observable, Observer } from 'rxjs';
import { AuthenticationService } from './authentication.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService implements CanActivate {
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<boolean> | Promise<boolean> | boolean {
    this.authService.redirectUrl = state.url;

    console.log('URL', state.url);
    
    return Observable.create((observer: Observer<boolean>) => {
      if (this.authService.loggedIn) {
        console.log('Logged in');
        observer.next(true);
      } else {
        console.log('Not Logged in');
        this.router.navigate([''], { queryParams: { from: state.url.substr(1) } });
      }
    });
  }


  constructor(private authService:AuthenticationService,private router:Router) { 

  }
}
