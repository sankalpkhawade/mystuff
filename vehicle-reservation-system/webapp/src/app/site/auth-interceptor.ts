// import { HttpInterceptor, HttpRequest, HttpHandler } from '@angular/common/http';
// import { AuthService } from './auth.service';
// import { Injectable } from '@angular/core';

// @Injectable()
// export class AuthInterceptorService implements HttpInterceptor {

//     constructor(private authService: AuthService) { }

//     intercept(req: HttpRequest<any>, next: HttpHandler) {
//         let authToken = '';
//         //console.log('Token', this.authService.userAuthenticated);

//         if (this.authService.userAuthenticated) {
//             authToken = this.authService.userAuthenticated.accessToken;
//         }
//         const modifiedRequest = req.clone(
//             {
//                 // headers: req.headers.append('Auth-Token', authToken)
//             }
//         );
//         return next.handle(modifiedRequest);
//     }
// }
