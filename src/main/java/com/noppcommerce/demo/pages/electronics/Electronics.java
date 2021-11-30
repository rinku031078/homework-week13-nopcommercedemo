package com.noppcommerce.demo.pages.electronics;

import com.noppcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {


    By Ele = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By Ele1 = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");

    public void mouseHoverToEletronicTab() {
        mouseHoverToElement(Ele);
        mouseHoverToClickElement(Ele1);
    }

}
