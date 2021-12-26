package com.prabhat.testmicrometer.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prabhat.testmicrometer.integration.AuditHelper;
import com.prabhat.testmicrometer.model.APIResponse;
import com.prabhat.testmicrometer.model.AddressInfo;
import com.prabhat.testmicrometer.model.AuditEntry;
import com.prabhat.testmicrometer.services.AddressService;

@RestController
public class AddressController {
	@Autowired
	private AddressService addsvc;
	@Autowired
	private AuditHelper auditHelper;
	
	private static final Logger logger = LoggerFactory.getLogger(AddressController.class);
	
	@RequestMapping(method = RequestMethod.GET, value = "/addressDetails/{addressId}")
	public ResponseEntity<APIResponse<AddressInfo>>getAddressDetails(@PathVariable("addressId") String addressId){
		logger.debug("received addressid :{}", addressId);
		AddressInfo addressInfo = addsvc.getAddress(addressId);
		APIResponse<AddressInfo> saveCase =new APIResponse<AddressInfo>();
		saveCase.setResponse(addressInfo);
		saveCase.setStatus(APIResponse.STATUS_SUCCESS);
		auditHelper.logAuditEntry("prabhat","addressInfo", AuditEntry.ACTION_READ);
		
		return ResponseEntity.ok(saveCase);
	}

	
}
