import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { RegistrationService } from './registration.service';

describe('RegistrationService', () => {
  let httpTestingController: HttpTestingController;
  let service: RegistrationService;
  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule]
    });
    httpTestingController = TestBed.get(HttpTestingController);
    service = TestBed.get(RegistrationService);
  });

  afterEach(() => {
    httpTestingController.verify();
  });
  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  // describe('#addStudentDetails()', () => {
  //   it('Check the type of httpClient', () => {
  //     const req = httpTestingController.expectOne('http://localhost:9801/registration/student','post to api');
  //     expect(req.request.method).toEqual('POST');
  //     req.flush([]);
  //     httpTestingController.verify();
  //   });
  // });

});

