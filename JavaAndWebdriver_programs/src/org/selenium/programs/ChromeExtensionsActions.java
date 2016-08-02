package org.selenium.programs;
/*package selenium.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import au.com.bytecode.opencsv.CSVReader;

public class ChromeExtensionsActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Browsers_Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(System.getProperty("user.dir")+"\\chromeExtensions\\fdmmgilgnpjigdojojpjoooidkmcomcm-0.8.4.12-www.Crx4Chrome.com.crx"));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		ChromeDriver driver = new ChromeDriver(capabilities);
		driver.get("chrome-extension://fdmmgilgnpjigdojojpjoooidkmcomcm/index.html");
		driver.findElement(By.cssSelector("li[data-id=basicAuth]")).click();
		driver.findElement(By.id("request-helper-basicAuth-username")).sendKeys("se");
		driver.findElement(By.id("request-helper-basicAuth-password")).sendKeys("newyear");
		driver.findElement(By.linkText("Refresh headers")).click();
		driver.findElementById("url").sendKeys("http://prodapi.exacly.me/xme/api/v2/PublicService/logIn");
		Select sel = new Select(driver.findElement(By.id("request-method-selector")));
		sel.selectByValue("POST");
		String csvFile = "D:\\Downloads\\create.csv";
		FileReader fw = new FileReader(csvFile);
		BufferedReader br = new BufferedReader(fw);
//		CSVReader csvReader = new CSVReader(br);

		ArrayList<ArrayList<String>> csvData = new ArrayList<ArrayList<String>>();
		String[] line = null;
		int rowNo =1;
		while((line = csvReader.readNext()) != null){
			ArrayList<String> rowData = new ArrayList<String>();
			for(int j=0;j<line.length;j++){
				rowData.add(line[j]);
			}
			if(rowNo ==1){
				System.out.print(rowData.get(0)+"&");
				System.out.print(rowData.get(1)+"&");
				System.out.print(rowData.get(2)+"&");
				System.out.print(rowData.get(3)+"&");
				System.out.println(rowData.get(4));
				for(int i=0;i<5;i++){
					WebElement wElement = driver.findElement(By.id("formdata-keyvaleditor"));
					List<WebElement> wElement1 = wElement.findElements(By.tagName("input"));
					List<WebElement> wElement2 = wElement.findElements(By.tagName("select"));
					if(i==0){
						wElement1.get(i).sendKeys(rowData.get(0));
						wElement2.get(i).sendKeys("File");
					}
					if(i==1){
						wElement1.get(i+2).sendKeys(rowData.get(1));
					}
					if(i==2){
						wElement1.get(i+4).sendKeys(rowData.get(2));
					}
					if(i==3){
						wElement1.get(i+6).sendKeys(rowData.get(3));
					}
					if(i==4){
						wElement1.get(i+8).sendKeys(rowData.get(4));
					}
				}
			}
			if(rowNo >= 2){
				System.out.print(rowData.get(0)+"&");
				System.out.print(rowData.get(1)+"&");
				System.out.print(rowData.get(2)+"&");
				System.out.print(rowData.get(3)+"&");
				System.out.println(rowData.get(4));
				for(int i=0;i<5;i++){
					WebElement wElement = driver.findElement(By.id("formdata-keyvaleditor"));
					List<WebElement> wElement1 = wElement.findElements(By.tagName("input"));
					List<WebElement> wElement2 = wElement.findElements(By.tagName("select"));
					if(i==0){
						int temp=rowNo%2;
						System.out.println(temp);
						wElement1.get(i+2).sendKeys("D:\\error"+temp+".png");
					}
					if(i==1){
						wElement1.get(i+3).clear();
						wElement1.get(i+3).sendKeys(rowData.get(1));
					}
					if(i==2){
						wElement1.get(i+5).clear();
						wElement1.get(i+5).sendKeys(rowData.get(2));
					}
					if(i==3){
						wElement1.get(i+7).clear();
						wElement1.get(i+7).sendKeys(rowData.get(3));
					}
					if(i==4){
						wElement1.get(i+9).clear();
						wElement1.get(i+9).sendKeys(rowData.get(4));
					}
				}
			}
			if(rowNo!=1){
				driver.findElement(By.id("submit-request")).click();
				Thread.sleep(1000);
				while(!driver.findElement(By.id("submit-request")).getText().equalsIgnoreCase("Send")){
					Thread.sleep(2000);
				}
			}
			rowNo++;
		}
		System.out.println("script completed");
		driver.quit();
	}

}
*/