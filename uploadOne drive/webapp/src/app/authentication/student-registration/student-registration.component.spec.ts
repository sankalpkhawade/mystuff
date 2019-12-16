import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { StudentRegistrationComponent } from './student-registration.component';
import { first } from 'rxjs/operators';

describe('StudentRegistrationComponent', () => {
  let component: StudentRegistrationComponent;
  let fixture: ComponentFixture<StudentRegistrationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentRegistrationComponent ],
      imports:[FormsModule,ReactiveFormsModule,HttpClientTestingModule]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentRegistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
  it('form invalid when empty', () => {
    expect(component.signupForm.valid).toBeFalsy();
  });
  it('user name Validity',()=>{
    let userName=component.signupForm.controls['userName'];
    expect(userName.valid).toBeFalsy();

    userName.setValue("");
    expect(userName.hasError('required')).toBeTruthy();

    userName.setValue("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    expect(userName.hasError('maxLength')).toBeFalsy();
  });
  it('firstName Validity',()=>{
    let firstName=component.signupForm.controls['firstName'];
    expect(firstName.valid).toBeFalsy();

    firstName.setValue('');
    expect(firstName.hasError('required')).toBeTruthy();

    firstName.setValue("asdfhalsdhfalsdflkhasdflasdfhasdf");
    expect(firstName.hasError('maxLength')).toBeFalsy();

    firstName.setValue('78979');
    expect(firstName.hasError('pattern')).toBeTruthy();
  });
  it('LastName Validity',()=>{
    let LastName=component.signupForm.controls['lastName'];
    expect(LastName.valid).toBeFalsy();
    LastName.setValue('');
    expect(LastName.hasError('required')).toBeTruthy();

    LastName.setValue("asdfhalsdhfalsdflkhasdflasdfhasdf");
    expect(LastName.hasError('maxLength')).toBeFalsy();

    LastName.setValue('78979');
    expect(LastName.hasError('pattern')).toBeTruthy();
    
  });
  it('Password Matching Validity',()=>{
    let password=component.signupForm.controls['password'];
    expect(password.valid).toBeFalsy();
    password.setValue('');
    expect(password.hasError('required')).toBeTruthy();
    let confirmpassword=component.signupForm.controls['confirmpassword'];
    expect(confirmpassword.valid).toBeFalsy();
    confirmpassword.setValue('');
    expect(confirmpassword.hasError('required')).toBeTruthy();
  });
  it('Email Validity',()=>{
    let email=component.signupForm.controls['email'];
    expect(email.valid).toBeFalsy();
    email.setValue('');
    expect(email.hasError('required')).toBeTruthy();
    email.setValue('xyz');
    expect(email.hasError('email')).toBeTruthy();
  });
  it('Contact Validity',()=>{
    let contact=component.signupForm.controls['contact'];
    expect(contact.valid).toBeFalsy();
    contact.setValue('');
    expect(contact.hasError('required')).toBeTruthy();
    contact.setValue('xyz');
    expect(contact.hasError('pattern')).toBeTruthy();
  });
  // it('On submission Valisity',()=>{
  //   expect(component.onSubmitSignUp).toHaveBeenCalledTimes(1);
  // })
});
