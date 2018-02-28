package pkgTest;

import static org.junit.Assert.*;
import org.junit.Test;

import pkgCore.carJawn;

public class carJawnTest {
	
	@Test
	public void test()
	{
		carJawn car1 = new carJawn(35000.0,0.0,60,.10);
		assertEquals((Math.round(car1.findMonthlyPay() * 100) / 100.0), 743.65, .01);
		assertEquals((Math.round(car1.findTotalInterest() * 100) / 100.0), 9618.79, .01);
		
		carJawn car2 = new carJawn(2000.0,400.0,45,.15);
		assertEquals((Math.round(car2.findMonthlyPay() * 100) / 100.0), 46.70, .01);
		assertEquals((Math.round(car2.findTotalInterest() * 100) / 100.0), 501.69, .01);	
	}
}