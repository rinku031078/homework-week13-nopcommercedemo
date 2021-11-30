package com.noppcommerce.demo.pages.computer;

import com.noppcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {
    By verifySignInPg =By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By cickonCheckOutAsGuest =By.xpath("//button[normalize-space()='Checkout as Guest']");

    public String setVerifySignInPg(){
        return getTextFromElement(verifySignInPg);
    }
    public void setCickonCheckOutAsGuest(){
        clickOnElement(cickonCheckOutAsGuest);
    }
}
