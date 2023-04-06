package com.crm.Actitime.GenericLabrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadtheDataFromProperty  {
	public String readdatafromproperty(String key) throws IOException {
		FileInputStream fs = new FileInputStream("./testdata/Commondata.property");
		Properties p = new Properties();
		p.load(fs);
		String value =p.getProperty(key);
		return value;
		
		
	}
	

}

