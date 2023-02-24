package Testcases;

import org.openqa.selenium.By;

import utils.Apputils;

public class Windowhandles  extends Apputils{

	public static void main(String[] args) {
		
		utils.Apputils.launchapp("http://gmail.com");
		 String currentwindow=  driver.getWindowHandle();
		System.out.println(currentwindow);
	
		
		

	}

}
