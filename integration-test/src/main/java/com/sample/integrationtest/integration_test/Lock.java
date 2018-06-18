package com.sample.integrationtest.integration_test;

public class Lock {
	
	private Integer keyValue ;
	
	private boolean locked;
	
	public Lock(Integer keyValue) {
		this.keyValue = keyValue;
		locked = true;
	}
		
	public boolean unlock(Integer keyValue) {
		if (this.keyValue == keyValue) {
			locked = false;
			return true;
		}
		locked = true;
		return false;
	}
	
	public void lock () {
		locked = true ;
	}
	
	public boolean isLocked () {
		return locked;
	}
		
	
}