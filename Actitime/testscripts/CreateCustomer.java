package com.crm.Actitime.testscripts;




import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Actitime.GenericLabrary.BaseClass;
import com.crm.Actitime.GenericLabrary.Excelfile;
import com.crm.Actitime.GenericLabrary.ListenerImp;
import com.crm.Actitime.objectrepository.HomePage;
import com.crm.Actitime.objectrepository.TaskPage;



@Listeners(ListenerImp.class)
public class CreateCustomer extends BaseClass{
	@Test
	public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.getTasklink().click();
		TaskPage tp  = new TaskPage(driver);
		tp.CreateCust();
	
		
		
	}


}

