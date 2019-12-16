package com.cognizant.vehiclereservationsystem.repositories;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.vehiclereservationsystem.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {

	@Query(value = "select * from vehicle v" + " JOIN branch b ON v.vehicle_branch_id=b.branch_id "
			+ "LEFT JOIN booking bk ON v.vehicle_number=bk.bk_vh_no  " + "where b.branch_name=:branchName  "
			+ "AND vehicle_insurance_expiry_date > current_date() " + "AND vehicle_service_due_date > current_date() "
			+ "AND (bk.bk_end_date < current_date() OR bk.bk_end_date IS NULL)", nativeQuery = true)
	public List<Vehicle> getVehicleCustomerList(@Param("branchName") String branchName);

	@Query(value = "select * from vehicle v Join branch b ON v.vehicle_branch_id=b.branch_id where b.branch_name=:branchName ", nativeQuery = true)
	public List<Vehicle> getVehicleAdminList(@Param("branchName") String branchName);

	@Query(value = "select vehicle_price from vehicle where vehicle_number=:number ", nativeQuery = true)
	public BigDecimal getPrice(@Param("number") String number);

}
