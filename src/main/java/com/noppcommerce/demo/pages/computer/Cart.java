package com.noppcommerce.demo.pages.computer;

import com.noppcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Cart extends Utility {
    By verifyCartPage = By.xpath("//h1[normalize-space()='Shopping cart']");
    By quantityUpdate =By.xpath("//input[@class='qty-input']");
    By updateCart  =By.xpath("//button[normalize-space()='Update shopping cart']");
    By verifyValue =By.xpath("//span[@class='product-subtotal']");
    By termsCondition =By.id("termsofservice");
    By checkOutButton =By.id("checkout");

    public String setVerifyCartPage(){
        return getTextFromElement(verifyCartPage);
    }
    public void setQuantityUpdate(){

        doubleClickAndSendKeysOnElement(quantityUpdate,"2");
    }
    public void setUpdateCart(){
        clickOnElement(updateCart);
    }
    public String getValueofAmount(){
        return getTextFromElement(verifyValue);
    }
    public void setTermsCondition(){
        clickOnElement(termsCondition);
    }
    public void setCheckOutButton(){
        clickOnElement(checkOutButton);
    }

}
