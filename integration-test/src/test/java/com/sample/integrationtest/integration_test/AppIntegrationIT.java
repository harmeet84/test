package com.sample.integrationtest.integration_test;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppIntegrationIT 
    
{
   
    /**
     * Rigourous Test :-)
     */
	@Test	
	public void AppIntegrationTest()
    {
    	App app = new App();
    	app.setName("abc");
    	app.setId(123);
    	app.setSecret(123);
    	
    	Lock lock = new Lock(10);
    	
    	Assert.assertEquals(false, lock.unlock(app.calculatedKey()));
    	Assert.assertEquals(true, lock.isLocked());
    	
    }
}
