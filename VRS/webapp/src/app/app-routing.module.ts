import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SignupComponent } from './site/signup/signup.component';
import { LoginComponent } from './site/login/login.component';
import { AuthGaurdService } from './site/auth-gaurd-service.service';
import { NotfoundComponent } from './site/notfound/notfound.component';
import { ApprovalComponent } from './site/approval/approval.component';
import { ItemEditComponent } from './vehicle/item-edit/item-edit.component';
import { SearchComponent } from './vehicle/search/search.component';
import { BookingsComponent } from './booking/bookings/bookings.component';
import { AddVehicleComponent } from './vehicle/add-vehicle/add-vehicle.component';

const routes: Routes = [
  {path:"item-edit/:id" , component:ItemEditComponent , canActivate: [AuthGaurdService]},
  {path:"signup" , component:SignupComponent},
  {path:"addVehicle" , component:AddVehicleComponent},
  {path:"bookings" , component:BookingsComponent, canActivate: [AuthGaurdService]},
  {path:"login" , component:LoginComponent},
  {path:"search-bar" , component:SearchComponent},
  {path:"approval" , component:ApprovalComponent},
  {path:"**" , component:NotfoundComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
