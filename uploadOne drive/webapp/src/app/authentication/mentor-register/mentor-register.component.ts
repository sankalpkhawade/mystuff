import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { MentorSkills } from '../MentorSkills';
import { RegistrationService } from 'src/app/services/registration.service';
import { MentorDetails } from '../MentorDetails';

@Component({
  selector: 'app-mentor-register',
  templateUrl: './mentor-register.component.html',
  styleUrls: ['./mentor-register.component.css']
})
export class MentorRegisterComponent implements OnInit {
  signupForm: FormGroup;
  mentorForm: FormGroup;
  data: boolean = false;
  skillAdded: boolean = false;
  skillsData = [
    {
      'skillName': null,
      'experience': 0,
      'rating': 0,
      'facilities': null,
      'trainings': 0
    }
  ]
  mentorName: String;
  constructor(private registrationService: RegistrationService) {

  }

  ngOnInit() {
    this.signupForm = new FormGroup({
      'userName': new FormControl(null, [Validators.required, Validators.maxLength(20)]),
      'firstName': new FormControl(null, [Validators.required, Validators.pattern('^[a-zA-Z]+$'), Validators.maxLength(50)]),
      'lastName': new FormControl(null, [Validators.required, Validators.pattern('^[a-zA-Z]+$'), Validators.maxLength(50)]),
      'password': new FormControl(null, [Validators.required]),
      'confirmpassword': new FormControl(null, [Validators.required, this.matchConfirmPassword.bind(this)]),
      'email': new FormControl(null, [Validators.required, Validators.email]),
      'contact': new FormControl(null, [Validators.required, Validators.min(1000000000), Validators.max(9999999999), Validators.pattern('^[0-9]+$')]),
      'linkedInUrl': new FormControl(null, [Validators.required]),
      'experience': new FormControl(null, [Validators.required, Validators.pattern('^[0-9]+$')])
    });
    this.mentorForm = new FormGroup({
      'skillName': new FormControl(null, [Validators.required]),
      'experience': new FormControl(null, [Validators.required, Validators.pattern('^[0-9]+$')]),
      'facilities': new FormControl(null, [Validators.required]),
      'rating': new FormControl(null, [Validators.required]),
      'trainings': new FormControl(null, [Validators.required]),
    })
  }
  matchConfirmPassword(formControl: FormControl): { [s: string]: boolean } {
    if (this.signupForm) {
      if (formControl.value && formControl.value.length > 0 && formControl.value !== this.signupForm.get('password').value) {
        return { 'nomatch': true };
      }
    }
    return null;
  }
  onSubmitSignUp() {
    console.log(this.signupForm.value);
    this.data = true;
    this.mentorName = this.signupForm.get('userName').value;

    this.registrationService.addMentorDetails(this.signupForm.value).subscribe((data) => {
      console.log(data);
    })

  }
  onSubmitmentorSkill() {
    let skill: MentorSkills = {} as any;
    skill.skillName = this.mentorForm.get('skillName').value
    skill.rating = this.mentorForm.get('rating').value
    skill.facilities = this.mentorForm.get('facilities').value
    skill.trainings = this.mentorForm.get('trainings').value
    skill.experience = this.mentorForm.get('experience').value
    if (this.skillsData[0].skillName == null) {
      this.skillsData = [{ skillName: skill.skillName, rating: skill.rating, trainings: skill.trainings, experience: skill.experience, facilities: skill.facilities }]
    } else {
      this.skillsData.push({ skillName: skill.skillName, rating: skill.rating, trainings: skill.trainings, experience: skill.experience, facilities: skill.facilities });
    }
    this.skillAdded = true;
    setTimeout(() => {
      this.skillAdded = false;
    }, 1000);
    console.log(skill.skillName)
    console.log(this.mentorForm.value);
    this.registrationService.addMentorSkills(this.mentorForm.value, this.mentorName, skill.skillName).subscribe((data) => {
      console.log(data);
    })
    this.mentorForm.reset();
  }
}
