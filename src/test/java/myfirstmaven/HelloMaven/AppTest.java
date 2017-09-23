package myfirstmaven.HelloMaven;



import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {

	@Test
	public void testPrintHelloDivya() {

		Assert.assertEquals(App.getHelloDivya(), "Hello Divya");
	}
	@Test
	public void testPrintHelloDSC() {

		Assert.assertEquals(App.getHelloDSC(), "Hello Divya Sri Chindam");
	}
	
	@Test
	public void testPrintHelloName() {

		Assert.assertEquals(App.getHelloName("D"), "Hello Divya");
	}

}
