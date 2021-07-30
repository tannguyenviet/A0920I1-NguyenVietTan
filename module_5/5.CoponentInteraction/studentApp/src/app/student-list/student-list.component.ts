import { Component, OnInit } from '@angular/core';
import {students} from "../../dao/studentDAO";
import {IStudent} from "../../model/student";

@Component({
  selector: 'student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  students:IStudent[] = students;

  parentStudent:IStudent
  selectStudent = (id:Number)=>{
    const studentSelected = students.find((stu)=>stu.id===id)
    this.parentStudent = {...studentSelected}
  }
  constructor() { }
  catchMarkStudent(value){
    const studentChange = this.students.find((stu)=>stu.id===value.id)
    studentChange.mark = value.mark;
  }

  ngOnInit(): void {
  }

}
