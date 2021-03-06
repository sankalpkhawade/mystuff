import { Injectable } from '@angular/core';
import { CanActivate, RouterStateSnapshot, ActivatedRouteSnapshot, Router } from '@angular/router';
import { Observable, Observer } from 'rxjs';
import { AuthServiceService } from './auth-service.service';


@Injectable({
  providedIn: 'root'
})
export class AuthGaurdService implements CanActivate {

  constructor(private authService: AuthServiceService, private router: Router) { }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<boolean> | Promise<boolean> | boolean {
    this.authService.redirectUrl = state.url;

    console.log('URL', state.url);
    
    return Observable.create((observer: Observer<boolean>) => {
      if (this.authService.loggedIn) {
        console.log('Logged in');
        observer.next(true);
      } else {
        console.log('Not Logged in');
        this.router.navigate(['login'], { queryParams: { from: state.url.substr(1) } });
      }
    });
  }
}
