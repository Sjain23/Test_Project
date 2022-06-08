package c_family;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import dataprovider_repository.RepoData;
import testbase.TestBase;

public class CC extends TestBase{
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataCFamily")
	public void testCC(String user, String Subject) throws Exception {
		log("Starting CC");
		Thread.sleep(1000);
		log("Ending CC");
		log(user + "----" + Subject);
	}

}
