import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  customerList: any;
// [
//   {
//     id: 1,
//     name: 'Tuấn Anh HIhi',
//     birthDate: '2000-12-12',
//     idCard: '123456789',
//     phone: '0948123123',
//     email: 'anh1910@gmail.com',
//     address: 'Quang Tri',
//     typeCustomer: {
//       id: 2,
//       nameTypeCustomer: 'Platinum'
//     },
//   },
//   {
//     id: 2,
//     name: 'Tuấn Anh HIhi',
//     birthDate: '2000-12-12',
//     idCard: '123456789',
//     phone: '0948123123',
//     email: 'anh1910@gmail.com',
//     address: 'Quang Tri',
//     typeCustomer: {
//       id: 2,
//       nameTypeCustomer: 'Platinum'
//     }
//   },
//   {
//     id: 2,
//     name: 'Tuấn Anh HIhi',
//     birthDate: '2000-12-12',
//     idCard: '123456789',
//     phone: '0948123123',
//     email: 'anh1910@gmail.com',
//     address: 'Quang Tri',
//     typeCustomer: {
//       id: 2,
//       nameTypeCustomer: 'Platinum'
//     }
//   },
//   {
//     id: 2,
//     name: 'Tuấn Anh HIhi',
//     birthDate: '2000-12-12',
//     idCard: '123456789',
//     phone: '0948123123',
//     email: 'anh1910@gmail.com',
//     address: 'Quang Tri',
//     typeCustomer: {
//       id: 2,
//       nameTypeCustomer: 'Platinum'
//     }
//   },
//   {
//     id: 2,
//     name: 'Tuấn Anh HIhi',
//     birthDate: '2000-12-12',
//     idCard: '123456789',
//     phone: '0948123123',
//     email: 'anh1910@gmail.com',
//     address: 'Quang Tri',
//     typeCustomer: {
//       id: 2,
//       nameTypeCustomer: 'Platinum'
//     }
//   },
//   {
//     id: 2,
//     name: 'Tuấn Anh HIhi',
//     birthDate: '2000-12-12',
//     idCard: '123456789',
//     phone: '0948123123',
//     email: 'anh1910@gmail.com',
//     address: 'Quang Tri',
//     typeCustomer: {
//       id: 2,
//       nameTypeCustomer: 'Platinum'
//     }
//   },
//   {
//     id: 6,
//     name: 'Tuấn Anh HIhi',
//     birthDate: '2000-12-12',
//     idCard: '123456789',
//     phone: '0948123123',
//     email: 'anh1910@gmail.com',
//     address: 'Quang Tri',
//     typeCustomer: {
//       id: 2,
//       nameTypeCustomer: 'Platinum'
//     }
//   }
// ];
  // httpOptions = {
  //   headers: {
  //     'Content-Type': 'application/json',
  //     'Access-Control-Allow-Origin' : '*'
  //   }
  // };

  httpOptions = {
    headers: new HttpHeaders()
      .set('content-type', 'application/json')
      .set('Access-Control-Allow-Origin', '*')
  }
  URl = 'http://localhost:3000/customers';
  regURL = 'http://localhost:3000/typeCustomers';
  constructor(private http: HttpClient) { }
  getAllCustomer(){
     this.http.get(this.URl, this.httpOptions).subscribe(data => {
      console.log(data);
    });
    // return this.customerList;
  }
}
