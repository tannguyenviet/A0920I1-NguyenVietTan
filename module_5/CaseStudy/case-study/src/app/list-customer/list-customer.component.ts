import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../customer.service";
import {MatDialog, MatDialogModule} from "@angular/material/dialog";

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  customerList: any;
  constructor(private customerService: CustomerService, private dialog: MatDialogModule) { }

  ngOnInit(): void {
    this.customerList = this.customerService.getAllCustomer();
    console.log(this.customerList);
  }
  openDialogDelete(id){

  }
}
