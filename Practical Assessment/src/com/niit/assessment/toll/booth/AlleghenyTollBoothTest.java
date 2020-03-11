package com.niit.assessment.toll.booth;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlleghenyTollBoothTest
{
	
	NissanTruck truckObj;
	AlleghenyTollBooth tollObj;
	
	@Before
	public void setUp () throws Exception
	{
		truckObj = new NissanTruck (5, 12000);
		tollObj = new AlleghenyTollBooth ();
	}
	
	@After
	public void tearDown () throws Exception
	{
		tollObj = null;
		truckObj = null;
	}

	@Test
	public void testCalculateToll()
	{
		System.out.println(tollObj.clacToll(truckObj));
		assertEquals(145.0, tollObj.clacToll(truckObj), 0);
	}
}