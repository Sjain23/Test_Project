package b_family;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import dataprovider_repository.RepoData;
import testbase.TestBase;

public class BBB extends TestBase{
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataBFamily")
	public void testBBB(String user, String Subject) throws Exception {
		log("Starting BBB");
		Thread.sleep(1000);
		log("Ending BBB");
		log(user + "----" + Subject);
	}

}
