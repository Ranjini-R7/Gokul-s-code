package com.testleaf.selenium.challenge;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		/*
		String downloadFilepath ="C:\\Users\\DELL\\OneDrive - TestLeaf Software Solutions Private Limited\\myCloudFiles\\git clone files\\HarelyDavidsonProject\\files";
	     ChromeOptions option = new ChromeOptions();
	     option.addArguments("--incognito");
	     ChromeDriver driver = new ChromeDriver(option);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.manage().window().maximize();
		 driver.get("https://pontoon.mozilla.org/");
		// Click on 'Start Localizing Now'
	     WebElement startLocalizingButton = driver.findElement(By.linkText("Start Localizing Now"));
	     startLocalizingButton.click();

	     // Enter 'India' in the filter
	     WebElement filterInput = driver.findElement(By.xpath("//input[@placeholder='Filter teams']"));
	     filterInput.sendKeys("India");

	     // Click on 'Bengali (India)'
	     WebElement bengaliIndiaLink = driver.findElement(By.linkText("Bengali (India)"));
	     bengaliIndiaLink.click();

	     // Click on download icon
	     WebElement downloadIcon = driver.findElement(By.xpath("//i[@class='fa fa-cloud-download-alt']"));
	     downloadIcon.click();

	     // Click on 'Download Terminology'
	     WebElement downloadTerminologyLink = driver.findElement(By.linkText("Download Terminology"));
	     downloadTerminologyLink.click();
	     Thread.sleep(5000);
	     String filePath = System.getProperty("user.dir")+"\\files\\Terminology.tbx";
	     StringSelection stringSelection = new StringSelection(filePath);
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	     Robot robot  = new Robot();
	  // Press CTRL+V to paste the file path 
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);

	     // Press Enter to save the file
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	     Thread.sleep(3000);
	     robot.keyPress(KeyEvent.VK_LEFT);
	     robot.keyRelease(KeyEvent.VK_LEFT);
	     
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(3000);
	     driver.close();
	     */
	     
//		String parentDirectoryPath = System.getProperty("user.dir");
//        String downloadFilepath = parentDirectoryPath + "/downloads/";
//        HashMap<String, Object> prefs = new HashMap<String, Object>();
//        prefs.put("download.default_directory", downloadFilepath);
//        prefs.put("download.prompt_for_download", false); // Disable file chooser
//        prefs.put("profile.default_content_settings.popups", 0); // Disable popups
//        prefs.put("profile.default_content_setting_values.automatic_downloads", 1); // Auto-download files
//
//        EdgeOptions options = new EdgeOptions();
//        options.setExperimentalOption("prefs", prefs);
//
//        EdgeDriver driver = new EdgeDriver(options);
		
		String parentDirectoryPath = System.getProperty("user.dir");
        String downloadFilepath = parentDirectoryPath + "\\downloads";
//		 String downloadFilepath  ="C:\\Users\\DELL\\Downloads";
//		 String downloadFilepath  ="C:\\Users\\DELL\\OneDrive - TestLeaf Software Solutions Private Limited\\myCloudFiles\\git clone files\\HarelyDavidsonProject\\downloads";
        // Preferences for Edge browser
        HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadFilepath);
//        prefs.put("download.prompt_for_download", true); // Disable the file chooser
//        prefs.put("profile.default_content_settings.popups", 0); // Disable popups
//        prefs.put("profile.default_content_setting_values.automatic_downloads", 1); // Allow multiple automatic downloads
//        prefs.put("download.directory_upgrade", true); // Upgrade the existing directory
//        prefs.put("safebrowsing.enabled", true); // Enable safe browsing features
        
        // Setting the preferences in EdgeOptions
        EdgeOptions options = new EdgeOptions();
        options.setExperimentalOption("prefs", prefs);

        // Instantiate EdgeDriver with options
        EdgeDriver driver = new EdgeDriver(options);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.manage().window().maximize();
		 driver.get("https://pontoon.mozilla.org/");
		// Click on 'Start Localizing Now'
	     WebElement startLocalizingButton = driver.findElement(By.linkText("Start Localizing Now"));
	     startLocalizingButton.click();

	     // Enter 'India' in the filter
	     WebElement filterInput = driver.findElement(By.xpath("//input[@placeholder='Filter teams']"));
	     filterInput.sendKeys("India");

	     // Click on 'Bengali (India)'
	     WebElement bengaliIndiaLink = driver.findElement(By.linkText("Bengali (India)"));
	     bengaliIndiaLink.click();

	     // Click on download icon
	     WebElement downloadIcon = driver.findElement(By.xpath("//i[@class='fa fa-cloud-download-alt']"));
	     downloadIcon.click();

	     // Click on 'Download Terminology'
	     WebElement downloadTerminologyLink = driver.findElement(By.linkText("Download Terminology"));
	     downloadTerminologyLink.click();
	     
	     
	     
	     
	}

}
