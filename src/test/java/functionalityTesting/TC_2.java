package functionalityTesting;

import org.testng.annotations.Test;

import com.crm.BaseClass.VtigerBaseClasss;
import com.crm.Pom.CalendarRepo;

public class TC_2 extends VtigerBaseClasss{

	@Test
	
public void TasteCase2 () throws InterruptedException {
	CalendarRepo cr = new CalendarRepo(driver);
	cr.calendarTab().click();
	Thread.sleep(1000);
	cr.calendarDayTab().click();
	Thread.sleep(1000);
	
}	
}


