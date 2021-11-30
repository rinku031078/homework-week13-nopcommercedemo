package com.noppcommerce.demo.pages.computer;

import com.noppcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {

    By booksPageTitle = By.xpath("//h1[normalize-space()='Books']");
    public String getBooksTitleText(){
        return getTextFromElement(booksPageTitle);
    }
}
