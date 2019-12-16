package com.cognizant.Vehicle_RS.repository;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.Vehicle_RS.model.Booking;
import com.cognizant.Vehicle_RS.model.User;

public interface BookingRepository extends CrudRepository<Booking, Integer> {

	//@Query(name="select * from booking bk join vehicle vh on bk.bk_vh_id = vh.vh_id join user us on bk.bk_us_id=us.us_id  where  bk_us_id in (select us_id from user where us_emp_id= :username)",nativeQuery=true)
	//Vehicle UserVehicle(@Param(value="username") String username);
	Booking findByUser(User user);
}
