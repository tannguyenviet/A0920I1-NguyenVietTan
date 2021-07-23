import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { StudentInfomationComponent } from './student-infomation/student-infomation.component';
import { PetCoponentComponent } from './pet-coponent/pet-coponent.component';
import { CalculateComponent } from './calculate/calculate.component';
import { ColorPickerComponent } from './color-picker/color-picker.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentInfomationComponent,
    PetCoponentComponent,
    CalculateComponent,
    ColorPickerComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
