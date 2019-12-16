import { TestBed } from '@angular/core/testing';

import { VehicleListService } from './vehicle-list.service';

describe('MovieListService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: VehicleListService = TestBed.get(VehicleListService);
    expect(service).toBeTruthy();
  });
});
