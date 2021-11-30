package com.noppcommerce.demo.pages.computer;

import com.noppcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class JewelryPage extends Utility {
    By jewelryPageTitle = By.xpath("//h1[normalize-space()='Jewelry']");
    public String getJewelryPageTitle(){
        return getTextFromElement(jewelryPageTitle);
    }
}
