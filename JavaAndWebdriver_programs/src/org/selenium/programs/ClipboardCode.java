package org.selenium.programs;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClipboardCode implements ClipboardOwner {

	public static void main(String args[]) throws IOException, InterruptedException 
	{
		ClipboardCode object = new ClipboardCode();
		object.setClipboardContents("http://www.amazon.com/Eric-Church/e/B00197KBFW/digital/ref=ntt_mp3_rdr?_encoding=UTF8&sn=d");
		System.out.println("Clipboard contains:" + object.getClipboardContents());

		WebDriver driver = new FirefoxDriver();
		driver.get("http://se:newyear@qa.exacly.me/lc/home.seam");
		Thread.sleep(50000);
		driver.findElement(By.xpath("//div[@id='recommendUrl']/div/textarea")).sendKeys(Keys.CONTROL + "v");
	}
	public void setClipboardContents(String aString){
		StringSelection stringSelection = new StringSelection(aString);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, this);
	}
	public String getClipboardContents() throws IOException {
		String result = "";
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		//odd: the Object param of getContents is not currently used
		Transferable contents = clipboard.getContents(null);
		boolean hasTransferableText =
			(contents != null) &&
			contents.isDataFlavorSupported(DataFlavor.stringFlavor)
			;
		if (hasTransferableText) {
			try {
				result = (String)contents.getTransferData(DataFlavor.stringFlavor);
			}
			catch (UnsupportedFlavorException ex ){
				System.out.println(ex);
				ex.printStackTrace();
			}
		}
		return result;
	}
	@Override
	public void lostOwnership(Clipboard arg0, Transferable arg1) {
		// TODO Auto-generated method stub

	}
	

}
