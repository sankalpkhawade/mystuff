import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { MentorDetails } from '../authentication/MentorDetails';
import { MentorSkills } from '../authentication/MentorSkills';
import { StudentDetails } from '../authentication/StudentDetails';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor(private httpClient: HttpClient) { }

  addMentorDetails(mentorDetails:MentorDetails): Observable<any> {
    return this.httpClient.post('http://localhost:9801/registration/mentor',mentorDetails);
  }

  addMentorSkills(mentorSkills:MentorSkills,mentorName:String,technologyName:String): Observable<any> {
    return this.httpClient.post('http://localhost:9801/registration/mentor/mentorSkills/'+mentorName+'/'+technologyName,mentorSkills);
  }

  addStudentDetails(studentDetails:StudentDetails): Observable<any> {
    return this.httpClient.post('http://localhost:9801/registration/student',studentDetails);
  }
}
