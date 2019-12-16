// import { Component, OnInit } from '@angular/core';
// import { FormGroup, FormControl, Validators, FormControlName } from '@angular/forms';
// import { ActivatedRoute, Params, Router } from '@angular/router';

// import { FoodItem } from '../item-info/food-item'

// import { MenuItemServicesService } from 'src/app/services/menu-item-services.service';


// @Component({
//   selector: 'app-item-edit',
//   templateUrl: './item-edit.component.html',
//   styleUrls: ['./item-edit.component.css']
// })
// export class ItemEditComponent implements OnInit {
// foodItem:FoodItem;
// food:FoodItem;
//   editForm: FormGroup;
//   cartUpdated = false;

//   constructor(private productsService: MenuItemServicesService, private route: ActivatedRoute, private router: Router) { }
//   product:FoodItem[];
//   ngOnInit() {

//     this.editForm = new FormGroup({
//       'id':new FormControl(null,[Validators.required]),
//       'name': new FormControl(null, [Validators.required, Validators.maxLength(200)]),
//       'imageLink': new FormControl(null, [Validators.required]),
//       'price': new FormControl(null, [Validators.required, Validators.pattern('^[0-9]+$')]),
//       'category': new FormControl(null, Validators.required),
//       'dateOfLaunch': new FormControl(null,[Validators.required]),
//       'active': new FormControl(null, Validators.required),
//       'freeDelivery': new FormControl(null)
//     });
//     this.route.params.subscribe((params: Params) => {
//       const prodId = params['id'];
//        //console.log(prodId);
//       this.productsService.getFoodItem(prodId).subscribe((product: FoodItem) => {
//         // if (product) {
//          product.dateOfLaunch=new Date(product.dateOfLaunch);
//        product.dateOfLaunch.setDate(product.dateOfLaunch.getDate()+1);
//           // this.foodItem=product;
//           this.editForm.patchValue({
//             id:product.id,
//             name: product.name,
//             imageLink: product.imageLink,
//             price: product.price,
//             category: product.category,
//             dateOfLaunch: product.dateOfLaunch.toISOString().substring(0,10),
//             active: product.active,
//             freeDelivery: product.freeDelivery
//           });
//         // } else {
//         //   this.router.navigate(['not-found']);
//         // }
//       });
//     }); 
//   }

//   onSubmitEditForm1() {
//     // console.log(this.editForm);
//     // console.log(this.editForm.value['name']);
//     // console.log(this.editForm.value['id']);
//     this.cartUpdated = true;
//     this.productsService.modifyItem(this.editForm.value).subscribe(data=>{
//       console.log(data);
//     });
    
//   }

// }
