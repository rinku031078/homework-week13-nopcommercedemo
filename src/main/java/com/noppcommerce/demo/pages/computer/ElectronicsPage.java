package com.noppcommerce.demo.pages.computer;

import com.noppcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By electronicsPageTitle = By.xpath("//h1[normalize-space()='Electronics']");


    public String getElectronicsPageTitle(){

        return getTextFromElement(electronicsPageTitle);
    }
}
