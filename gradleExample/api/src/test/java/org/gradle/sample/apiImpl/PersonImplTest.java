package org.gradle.sample.apiImpl;

import org.junit.Test;
import org.junit.Assert;

//import org.gradle.sample.apiImpl.PersonImpl;

public class PersonImplTest {
    @Test
    public void testToString() {
    	PersonImpl pImpl = new PersonImpl("borne", "jason");
    	System.out.println(pImpl.toString());
    	Assert.assertEquals("*** jason borne ***", pImpl.toString());
    }
}
