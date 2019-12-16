import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class Junit {
	Profit p;

	@Before
	public void setUp() {
		p = new Profit();
		p.calculateProfit(10, 200, 20);
		p.calculateProfit(10, -200, 20);
		p.calculateProfit(10, 200, -1);
		p.calculateProfit(10, -200, -1);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		p = new Profit();
		Assert.assertEquals(20.00, p.calculateProfit(10, 200, 20));
		Assert.assertEquals("Buying price or selling price cannot be lesser than 0", p.calculateProfit(10, -200, 20));
		Assert.assertEquals("Buying price or selling price cannot be lesser than 0", p.calculateProfit(10, 200, -1));
		Assert.assertEquals("Buying price or selling price cannot be lesser than 0", p.calculateProfit(10, -200, -1));
		// fail("Not yet implemented");
	}

	@After
	public void shutDown() {
		System.out.println("------closed--------");
	}
}
