package functionalityTesting;

import org.testng.annotations.Test;

import com.crm.BaseClass.VtigerBaseClasss;
import com.crm.Pom.CalendarRepo;

public class TC_1 extends VtigerBaseClasss
{
	public static CalendarRepo cr;
	@Test
	public void calendar_page()
	{
		cr = new CalendarRepo(driver);
		cr.calendarTab().click();
		
	}
}
