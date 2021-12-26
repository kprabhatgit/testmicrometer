package com.prabhat.testmicrometer.integration;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.prabhat.testmicrometer.model.AuditEntry;
@Component
public class AuditHelper {

	private static final Logger logger = LoggerFactory.getLogger(AuditHelper.class);
	
	private long generateUUID() {
		return UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
	}
	
	public void logAuditEntry(String userId, String entityName, String action) {
		AuditEntry ae = new AuditEntry(generateUUID(), System.currentTimeMillis(), entityName, userId, action);
		logger.debug("publishing audit event", ae);
		
	}
	
}
