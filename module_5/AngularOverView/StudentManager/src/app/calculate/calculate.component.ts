import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculate',
  templateUrl: './calculate.component.html',
  styleUrls: ['./calculate.component.css']
})
export class CalculateComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  output: number;
  first: number;
  second: number;
  operator = '+';
  onFirstChange(value) {
    console.log(value);
    this.first = Number(value);
  }
  onSecondChange(value) {
    this.second = Number(value);
  }
  onSelectChange(value) {
    this.operator = value;
  }
  calculate() {
    console.log("VAO CALCULATE");
    switch (this.operator) {
      case '+':
        this.output = this.first + this.second;
        console.log(this.first);
        console.log(this.second);
        break;
      case '-':
        this.output = this.first - this.second;
        break;
      case '*':
        this.output = this.first * this.second;
        break;
      case '/':
        this.output = this.first / this.second;
        break;
    }
  }
}
