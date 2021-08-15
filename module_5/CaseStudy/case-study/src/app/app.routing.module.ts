import { NgModule } from '@angular/core';
import {PreloadAllModules, RouterModule, Routes} from '@angular/router';
import {ListCustomerComponent} from './list-customer/list-customer.component';
import {UpdateCustomerComponent} from './update-customer/update-customer.component';
import {CreateCustomerComponent} from './create-customer/create-customer.component';


const routes: Routes = [
  {
    path: 'customer',
    component: ListCustomerComponent,
  },
  {
    path: 'update-Customer/:id',
    component: UpdateCustomerComponent,
  },
  {
    path: 'customer/create',
    component: CreateCustomerComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {
    preloadingStrategy: PreloadAllModules
  })],
  exports: [RouterModule]
})


export class AppRoutingModule { }
