import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LikesCoponentComponent } from './likes-coponent.component';

describe('LikesCoponentComponent', () => {
  let component: LikesCoponentComponent;
  let fixture: ComponentFixture<LikesCoponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LikesCoponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LikesCoponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
