package Testcases;

import java.util.Set;

import org.openqa.selenium.By;

import utils.Apputils;

public class Windowhandles  extends Apputils{

	public static void main(String[] args) {
		
		utils.Apputils.launchapp("http://gmail.com");
		// String currentwindow=  driver.getWindowHandle();
		//System.out.println(currentwindow);
		driver.findElement(By.linkText("Help")).click();
	Set<String>	 windowha=driver.getWindowHandles();
	Object [] windows=	windowha.toArray();
	String window1= windows[0].toString();
	   String   window2= windows[1].toString();
	System.out.println(driver.getTitle());
	  driver.switchTo().window(window2);
	String title=  driver.switchTo().window(window1).getTitle();
	   System.out.println(title);
	}
	
	
	

}
