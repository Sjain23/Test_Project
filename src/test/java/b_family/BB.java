package b_family;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import dataprovider_repository.RepoData;
import testbase.TestBase;

public class BB extends TestBase{
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataBFamily")
	public void testBB(String user, String Subject) throws Exception {
		log("Starting BB");
		Thread.sleep(1000);
		log("Ending BB");
		log(user + "----" + Subject);
	}

}
