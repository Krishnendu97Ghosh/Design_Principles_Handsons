package com.cts.one;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;

class Test {
	
	
	
	

	@org.junit.jupiter.api.Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() 
	{
	    
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
	    assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	    
	}
	
	@org.junit.jupiter.api.Test
	public void whenConvertingUSDToEURO_thenSuccessfullyConverted()
	{
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getPrice(), 1596000.0, 0.00001);
	}
}
