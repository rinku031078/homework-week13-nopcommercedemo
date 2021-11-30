package com.noppcommerce.demo.pages.computer;

import com.noppcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhone extends Utility {
    By verifyCellTextonPage= By.xpath("//h1[normalize-space()='Cell phones']");


    public String setVerifyCellTextOnPage(){
        return getTextFromElement(verifyCellTextonPage);
    }

}
