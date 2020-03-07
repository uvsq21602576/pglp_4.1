package fr.uvsq.uvsq21602576.pglp_4_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TelephoneTest {

	@Test
	public void equalsTest() {
		Telephone T = new Telephone("06", "portable");
		Telephone T2 = new Telephone("06", "portable");
		assertTrue(T.equals(T2));
	}

}
