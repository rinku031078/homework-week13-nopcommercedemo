package com.noppcommerce.demo.pages.computer;

import com.noppcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DigitalDownloadsPage extends Utility {
    By digitalDownloadsTitle = By.xpath("//h1[normalize-space()='Digital downloads']");
    public String getDigitalDownloadPageTitle(){
        return getTextFromElement(digitalDownloadsTitle);
    }
}
