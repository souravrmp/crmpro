package com.crmpro.testscript;

import com.crmpro.utilityclass.ExcelUtilities;
import com.crmpro.utilityclass.ReadProp;

public class Test {

	public static void main(String[] args) {
		
		 String ckey = ReadProp.readData("url");
		 System.out.println(ckey);
		 System.out.println(ExcelUtilities.readData("sheet2", 1, 3));
	}

}
