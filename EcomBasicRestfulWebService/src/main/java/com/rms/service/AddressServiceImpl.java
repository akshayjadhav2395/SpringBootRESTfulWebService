package com.rms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.dao.AddressRepo;
import com.rms.model.Address;

@Service
public class AddressServiceImpl implements AddressServiceI {

 	@Autowired
 	private AddressRepo addressRepo;
 	
 	@Override
 	public Address addAddress(Address address) {
 		System.out.println("adding address");
 		return addressRepo.save(address);
 	}
 
 	@Override
 	public Iterable<Address> getAllAddress() {
 		System.out.println("fetching all address");
 		return addressRepo.findAll();
 	}
 
 	@Override
 	public Optional<Address> getSingleAddress(int laneNo) {
 		System.out.println("fetching single address");
 		return addressRepo.findById(laneNo);
 	}
 
 	@Override
 	public Address editAddress(Address address, int laneNo) {
 		System.out.println("editing address");
 		Address ad=addressRepo.findByLaneNo(laneNo);
 		ad.setLaneNo(address.getLaneNo());
 		ad.setStreetName(address.getStreetName());
 		ad.setAreaName(address.getAreaName());
 		ad.setCity(address.getCity());
 		ad.setPinCode(address.getPinCode());
 		return addressRepo.save(ad);
 	}
 
 	@Override
 	public void deleteAddress(int laneNo) {
 		System.out.println("deleting address");
 		
 	}

}
