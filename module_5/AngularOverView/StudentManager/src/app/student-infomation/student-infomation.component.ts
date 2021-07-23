import { Component, OnInit } from '@angular/core';
import { IStudent } from '../model/IStudent';
// import { IStudent } from '../model/IStudent';

@Component({
  selector: 'app-student-infomation',
  templateUrl: './student-infomation.component.html',
  styleUrls: ['./student-infomation.component.css']
})
export class StudentInfomationComponent implements OnInit {
  student:IStudent={
    id:1,
    name:"Tan",
    age:20,
    mark:5,
    avatar:''
  };
  constructor() { }

  ngOnInit(): void {
  }
  fontSize = 14;
  onChange(value) {
    this.fontSize = value;
}
  changeMarkForStudent(mark:number){
      this.student.mark=mark;
  }
}
