package c_family;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import dataprovider_repository.RepoData;
import testbase.TestBase;

public class CCC extends TestBase{
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataCFamily")
	public void testCCC(String user, String Subject) throws Exception {
		log("Starting CCC");
		Thread.sleep(1000);
		log("Ending CCC");
		log(user + "----" + Subject);
	}

}
