import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IStudent} from "../../model/student";
@Component({
  selector: 'app-student-info',
  templateUrl: './student-info.component.html',
  styleUrls: ['./student-info.component.css']
})
export class StudentInfoComponent implements OnInit {
  @Input()
  student :IStudent= {
    id:1,
    name:"Tan",
    age:18,
    mark:9
  }
  @Output()
  throwCurrentMark = new EventEmitter()
  constructor() { }
  changeStudentMark(mark:Number){
      this.student.mark=mark;
  }
  changeStudentMarkInList(id:Number,mark:Number){
    this.throwCurrentMark.emit({id:id,mark:mark})
  }
  ngOnInit(): void {
  }

}
