package com.cognizant.vehiclereservationsystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.vehiclereservationsystem.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	User findByUserId(String username);
	
	@Query(value = "select br.branch_name from branch br, user us where us.user_id =:uName AND us.user_branch_id=br.branch_id", nativeQuery = true)
	public String getBranchByUserName(@Param("uName") String name);

	@Query(value = "select user_role from user  where user_id =:uName", nativeQuery = true)
	public String getRoleByUserName(@Param("uName") String name);

	@Query(value = "select * from user u " + "JOIN user_status us ON u.user_status_id=us.us_id "
			+ "JOIN branch b ON b.branch_id=u.user_branch_id " + "where b.branch_name=:bName"
			+ " AND us.us_value='pending' ", nativeQuery = true)
	public List<User> getMemberRequestList(@Param("bName") String branchName);

	@Query(value = "Update user SET user_status_id=(select us_id from user_status where us_value=:status) where user_id=:uName", nativeQuery = true)
	public void updateStatus(@Param("uName") String uName, @Param("status") String status);

}
