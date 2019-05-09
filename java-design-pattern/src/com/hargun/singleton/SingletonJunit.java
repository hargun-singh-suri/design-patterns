package com.hargun.singleton;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SingletonJunit {

	@Test
	public void compareObject() {

		// Get 2 object for comparision
		SingletonExample objOne = SingletonExample.getSingletonObject();
		SingletonExample objTwo = SingletonExample.getSingletonObject();

		// Perform Test
		Assert.assertEquals("Objects are equal", objOne, objTwo);

	}

}
