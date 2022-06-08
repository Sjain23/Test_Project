package a_family;

import org.testng.Assert;
import org.testng.annotations.Test;
import dataprovider_repository.RepoData;
import testbase.TestBase;

public class AAA extends TestBase{
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataAFamily")
	public void testAAA(String user, String Subject) throws Exception {
		log("Starting AAA");
		softAssert.assertEquals("Title1", "Title");	//(Expected, actual)
		softAssert.assertEquals("Text", "Text1");
		Thread.sleep(1000);
		log("Ending AAA");
		log(user + "----" + Subject);
		
		//Assert.fail("Failing deliberately to show listener example");
		softAssert.assertAll();
	}

}
