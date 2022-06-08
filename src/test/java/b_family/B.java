package b_family;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import dataprovider_repository.RepoData;
import testbase.TestBase;

public class B extends TestBase{
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataBFamily")
	public void testB(String user, String Subject) throws Exception {
		log("Starting B");
		Thread.sleep(1000);
		log("Ending B");
		log(user + "----" + Subject);
	}

}
