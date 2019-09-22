import static org.junit.Assert.*;

import org.junit.Test;

public class CrookedDie2_Test
{

	@Test
	public void testToString()
	{
		CrookedDie2 crooked2 = new CrookedDie2();
		assertEquals("A CrookedDie2 rolling 1,2,3,4,5,6 in sequence, and... ", crooked2.toString());
	}

	@Test
	public void testTestStaticObj()
	{
		Die die = new Die();
		CrookedDie1 crooked1 = new CrookedDie1();
		die = crooked1;
		
		assertEquals("Die.testStatic()", die.testStatic());
	}
	
	@Test
	public void testTestStaticDirect()
	{		
		assertEquals("CrookedDie1.testStatic()", CrookedDie1.testStatic());
	}

}
