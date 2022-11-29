package com.rms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rms.model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

	public Address findByLaneNo(int laneNo);
}
