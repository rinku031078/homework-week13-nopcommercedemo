package com.noppcommerce.demo.pages.computer;

import com.noppcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility {
    By giftCardsPageTitle = By.xpath("//h1[normalize-space()='Gift Cards']");
    public String getGiftPageTitle(){
        return getTextFromElement(giftCardsPageTitle);
    }
}
