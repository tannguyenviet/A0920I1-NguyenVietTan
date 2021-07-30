import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-likes-coponent',
  templateUrl: './likes-coponent.component.html',
  styleUrls: ['./likes-coponent.component.css']
})
export class LikesCoponentComponent implements OnInit {
  likes: number = 0;
  likeThis() {
    this.likes++;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
