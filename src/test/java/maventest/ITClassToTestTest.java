package maventest;

import org.junit.Assert;
import org.junit.Test;

public class ITClassToTestTest {

	@Test
	public void junitTest() {
		Assert.assertEquals(2, new ClassToTest().add(1, 1));
	}
	
}
