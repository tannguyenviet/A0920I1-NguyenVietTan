import { Component } from '@angular/core';
import { title } from 'process';
import { LikesCoponentComponent } from './likes-coponent/likes-coponent.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  article = {
    title: 'The Evolution of Async JavaScript: From Callbacks, to Promises, to Async/Await',
    url: 'https://medium.freecodecamp.org/the-evolution-of-async-javascript-from-callbacks-to-promises-to-async-await-e73b047f2f40'

  };
  articles =[];
  hello:string;
  url:string;
  title:string;
  likes:string;
  updateArticle(){
    this.articles.push({title:this.title,url:this.url});
    // this.article.title = document.getElementById('article-title').value;
    // this.article.url = document.getElementById('article-url').value;
    console.log(this.articles);
    console.log("VO Article Handle")
  }
}
