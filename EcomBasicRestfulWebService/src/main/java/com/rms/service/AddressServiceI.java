package com.rms.service;

import java.util.Optional;

import com.rms.model.Address;

public interface AddressServiceI {

	public Address addAddress(Address address);
	public Iterable<Address> getAllAddress();
	public Optional<Address> getSingleAddress(int laneNo);
	public Address editAddress(Address address, int laneNo);
	public void deleteAddress(int laneNo);

}
