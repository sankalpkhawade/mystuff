import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {ReactiveFormsModule} from "@angular/forms";
import { FormsModule }   from '@angular/forms';
import { RouterModule } from '@angular/router';
import { SignupComponent } from './site/signup/signup.component';
import { LoginComponent } from './site/login/login.component';
import { NotfoundComponent } from './site/notfound/notfound.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { ApprovalComponent } from './site/approval/approval.component';
import { ItemInfoComponent } from './vehicle/item-info/item-info.component';
import { SearchComponent } from './vehicle/search/search.component';
import { ItemEditComponent } from './vehicle/item-edit/item-edit.component';
import { AddVehicleComponent } from './vehicle/add-vehicle/add-vehicle.component';
import { VehicleComponent } from './vehicle/vehicleList/vehicleList.component';
import { BookingsComponent } from './booking/bookings/bookings.component';



@NgModule({
  declarations: [
    AppComponent,
    ItemInfoComponent,
    VehicleComponent,
    SearchComponent,
    BookingsComponent,
    ItemEditComponent,
    SignupComponent,
    LoginComponent,
    NotfoundComponent,
    AddVehicleComponent,
    ApprovalComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
