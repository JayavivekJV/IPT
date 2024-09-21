package com.IPT_Project;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ReadExcelDataClown;

public class RunnerClassSQL {
	public static void main(String[] args) throws InvalidFormatException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/?locale=en_GB&_rdr");
		String username = ReadExcelDataClown.getParticularCell(1,0);
		driver.findElement(By.name("email")).sendKeys(username);
		String password = ReadExcelDataClown.getParticularCell(2,2);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.quit();
	}

}
