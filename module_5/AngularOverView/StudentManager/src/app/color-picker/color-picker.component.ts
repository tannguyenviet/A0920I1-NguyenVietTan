import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-color-picker',
  templateUrl: './color-picker.component.html',
  styleUrls: ['./color-picker.component.css']
})
export class ColorPickerComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  background = '#00e067';


  onChange(value) {
    console.log("Change Color");
    this.background = value;
  }
}
