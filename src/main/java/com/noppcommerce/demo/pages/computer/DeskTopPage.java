package com.noppcommerce.demo.pages.computer;

import com.noppcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DeskTopPage extends Utility {
    By selectShortByMenu = By.id("products-orderby");
    By verifyTextBuildYourComputer = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By clickOnBuildYourOwnComputer = By.xpath("//div[@class='picture']//img[@title='Show details for Build your own computer']");

    public void selectformDropDownMenu(String visibleText) {
        selectByVisibleTextFromDropDown(selectShortByMenu, visibleText);
    }

    public void clickOnBuildYourOwnComputer() {
        driver.findElement(clickOnBuildYourOwnComputer).click();
    }

    public String verifyBuildYourOwnComputer() {
        return getTextFromElement(verifyTextBuildYourComputer);
    }
}
