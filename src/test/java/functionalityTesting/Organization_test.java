package functionalityTesting;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.crm.BaseClass.VtigerBaseClasss;
import com.crm.Pom.OrganizationsRepo;

public class Organization_test extends VtigerBaseClasss{
	@Test
	public void org_page() {
		String actual_url = driver.getCurrentUrl();
		OrganizationsRepo or = new OrganizationsRepo(driver);
		
		assertEquals(expected_url, actual_url);
		
		or.organizationsTab().click();
		or.createButton().click();
		or.orgName().sendKeys("Rohan");
		or.saveButton().click();
		
		
	}

}