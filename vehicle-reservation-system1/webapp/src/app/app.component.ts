import { Component } from '@angular/core';
import { AuthService } from './site/auth.service'
import { Router } from '@angular/router';
import { CartService } from './booking/cart.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';

  constructor(private router: Router,private cartService: CartService,private authService: AuthService) {
 this.router.navigate(['/vehicleList']);
  }

  isAuthenticated() {
    return this.authService.loggedIn;
  }

  isAdmin() {
    return this.authService.isAdmin;
  }

  getUser() {
    return this.authService.userAuthenticated1;
  }

  onSignOut() {
    this.cartService.clearCart();
    this.authService.logOut();
    this.router.navigate([this.authService.redirectUrl]);
  }

}
