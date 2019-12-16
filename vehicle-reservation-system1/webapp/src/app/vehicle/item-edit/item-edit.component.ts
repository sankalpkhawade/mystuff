import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormControlName } from '@angular/forms';
import { ActivatedRoute, Params, Router } from '@angular/router';

import { Vehicle } from '../item-info/vehicle-list'

import { CarListService } from '../../services/car-list-services.service'


@Component({
  selector: 'app-item-edit',
  templateUrl: './item-edit.component.html',
  styleUrls: ['./item-edit.component.css']
})
export class ItemEditComponent implements OnInit {
foodItem:Vehicle;
food:Vehicle;
  editForm: FormGroup;
  cartUpdated = false;

  constructor(private productsService: CarListService, private route: ActivatedRoute, private router: Router) { }
  product:Vehicle[];
  ngOnInit() {

    this.editForm = new FormGroup({
    'number': new FormControl(null, [Validators.required, Validators.maxLength(200)]),
      'name': new FormControl(null, [Validators.required, Validators.maxLength(200)]),
      'imageLink': new FormControl(null, [Validators.required]),
      'price': new FormControl(null, [Validators.required, Validators.pattern('^[0-9]+$')]),
      'insuranceExpiryDate': new FormControl(null,[Validators.required]),
      'lastServicedDate': new FormControl(null,[Validators.required]),
      'serviceDueDate': new FormControl(null,[Validators.required]),
      
    });
    this.route.params.subscribe((params: Params) => {
      const prodId = params['id'];
       console.log(prodId);
       
      this.productsService.getFoodItem(prodId).subscribe((product: Vehicle) => {
        if (product) {
         product.insuranceExpiryDate=new Date(product.insuranceExpiryDate);
         product.lastServicedDate=new Date(product.lastServicedDate);
         product.serviceDueDate=new Date(product.serviceDueDate);
       product.insuranceExpiryDate.setDate(product.insuranceExpiryDate.getDate()+1);
       product.lastServicedDate.setDate(product.lastServicedDate.getDate()+1);
       product.serviceDueDate.setDate(product.serviceDueDate.getDate()+1);
          this.editForm.patchValue({
           number:product.number,
            name: product.type,
            imageLink: product.image,
            price: product.price,
            insuranceExpiryDate: product.insuranceExpiryDate.toISOString().substring(0,10),
            lastServicedDate: product.lastServicedDate.toISOString().substring(0,10),
            serviceDueDate: product.serviceDueDate.toISOString().substring(0,10)
          });
        }
      });
    }); 
  }

  onSubmitEditForm1() {
    this.cartUpdated = true;
    this.productsService.modifyItem(this.editForm.value).subscribe(data=>{
      console.log(data);
    });
    
  }

}
