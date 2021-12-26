package com.prabhat.testmicrometer.services;

import java.util.Random;

import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.prabhat.testmicrometer.model.AddressInfo;

@Service
public class AddressService {
	private static final Logger logger = LoggerFactory.getLogger(AddressService.class);

	public AddressInfo getAddress(String addressId) {
		int i = RandomUtils.nextInt();
		if(i %3 == 0) {
			throw new IllegalStateException("simulated error");
		}
		else if (i %7 == 0) {
			throw new IllegalArgumentException("simulated : specified address is not correct");
		}
		logger.debug("recived address id in service : {} ", addressId);
		return new AddressInfo(addressId, "AT Rajwara", "89", "begusarai", "851112");
		
	}
	
	
	

}
