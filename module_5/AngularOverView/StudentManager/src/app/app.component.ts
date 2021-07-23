import { Component } from '@angular/core';
import { StudentInfomationComponent } from './student-infomation/student-infomation.component';
import { PetCoponentComponent } from './pet-coponent/pet-coponent.component';
import { CalculateComponent } from './calculate/calculate.component';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {
  title = 'StudentManager';
}
