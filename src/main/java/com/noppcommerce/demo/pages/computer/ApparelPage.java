package com.noppcommerce.demo.pages.computer;

import com.noppcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {
    By apparelTitle = By.xpath("//h1[normalize-space()='Apparel']");
    public String getApparelPageTitle(){
        return getTextFromElement(apparelTitle);
    }

}
