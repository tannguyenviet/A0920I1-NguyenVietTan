import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pet-coponent',
  templateUrl: './pet-coponent.component.html',
  styleUrls: ['./pet-coponent.component.css']
})
export class PetCoponentComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  petName = 'puppie';
  petImage = 'http://yourdost-blog-images.s3-ap-southeast-1.amazonaws.com/wp-content/uploads/2016/01/03165939/Dogs.jpg';

  updateName(name) {
      this.petName = name;
  }

  updateImage(image) {
      this.petImage = image;
  }
}
