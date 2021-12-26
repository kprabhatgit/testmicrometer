package com.prabhat.testmicrometer.model;

import java.io.Serializable;
import java.util.Objects;

public class AuditEntry implements Serializable {

	public static final String ACTION_CREATE= "CREATE";
	public static final String ACTION_UPDATE="UPDATE";
	public static final String ACTION_DELETE= "DELETE";
	public static final String ACTION_READ = "READ";
	
	private long id;
	private long createdAT;
	private String entityName;
	private String userId;
	private String action;
	public AuditEntry() {
		
	}
	public AuditEntry(long id, long createdAT, String entityName, String userId, String action) {
		super();
		this.id = id;
		this.createdAT = createdAT;
		this.entityName = entityName;
		this.userId = userId;
		this.action = action;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCreatedAT() {
		return createdAT;
	}
	public void setCreatedAT(long createdAT) {
		this.createdAT = createdAT;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuditEntry other = (AuditEntry) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "AuditEntry [id=" + id + ", createdAT=" + createdAT + ", entityName=" + entityName + ", userId=" + userId
				+ ", action=" + action + "]";
	}
	
	
	/*  private long id;
    private long createdAt;
    private String entityName;
    private String userId;
    private String action;
	*/
}
