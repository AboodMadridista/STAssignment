
package test;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import main.User;

import org.junit.Test;
import org.junit.runner.RunWith;

public class UserTest {

	User user = new User();
	@Test
	@Parameters({"100,A"  })
	public void getMemberType() {
		
	}
}
