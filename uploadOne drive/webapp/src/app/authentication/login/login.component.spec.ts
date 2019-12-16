import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { LoginComponent } from './login.component';
import { FormsModule, NgForm } from '@angular/forms';

describe('LoginComponent', () => {
  let component: LoginComponent;
  let fixture: ComponentFixture<LoginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoginComponent ],
      imports:[FormsModule,HttpClientTestingModule
      ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
   
    expect(component).toBeTruthy();
  });
  // it('testing form the wrong way', () => {
  //   const testForm = <NgForm>{
  //     value:{
  //       username:undefined,
  //       password:undefined
  //     }
  //   }
  //   fixture.detectChanges();
    
  //   component.onSubmit(testForm);
     
  //   expect(component.submitted).toEqual(false);
  // });
});
