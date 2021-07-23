import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PetCoponentComponent } from './pet-coponent.component';

describe('PetCoponentComponent', () => {
  let component: PetCoponentComponent;
  let fixture: ComponentFixture<PetCoponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PetCoponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PetCoponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
