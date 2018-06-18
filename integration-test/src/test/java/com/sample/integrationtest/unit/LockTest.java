package com.sample.integrationtest.unit;

import com.sample.integrationtest.integration_test.Lock;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class LockTest 
    extends TestCase
{
   

    /**
     * Rigourous Test :-)
     */
    public void testLock()
    {
    	Lock lock = new Lock(10);
    	assertEquals(true, lock.isLocked());
    	assertEquals(true, lock.unlock(10));
    }
}
