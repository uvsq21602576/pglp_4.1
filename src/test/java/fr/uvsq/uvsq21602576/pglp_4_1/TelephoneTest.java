package fr.uvsq.uvsq21602576.pglp_4_1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TelephoneTest {

	@Test
	public void equalsTest() {
		Telephone T = new Telephone("06", "portable");
		Telephone T2 = new Telephone("06", "portable");
		assertTrue(T.equals(T2));
	}
	
	@Test
	public void equalsTest2() {
		Telephone T = new Telephone("065", "portable");
		Telephone T2 = new Telephone("06", "portable");
		assertFalse(T.equals(T2));
	}
	
	@Test
	public void equalsTest3() {
		Telephone T = new Telephone("06", "porta ble");
		Telephone T2 = new Telephone("06", "portable");
		assertFalse(T.equals(T2));
	}


}
