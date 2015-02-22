package maventest;

import org.junit.Assert;
import org.junit.Test;

public class ClassToTestTest {

	@Test
	public void junitTest() {
		Assert.assertEquals(2, new ClassToTest().add(1, 1));
	}
	
}
