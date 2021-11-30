package com.noppcommerce.demo.testsuite;

import com.noppcommerce.demo.pages.electronics.Electronics;
import com.noppcommerce.demo.pages.electronics.ElectronicsPayment;
import com.noppcommerce.demo.pages.electronics.ElectronicsShoppinCart;
import com.noppcommerce.demo.pages.electronics.RegisterPage;
import com.noppcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {

    Electronics electronics = new Electronics();
    ElectronicsShoppinCart electronics1 = new ElectronicsShoppinCart();
    RegisterPage electronic3 = new RegisterPage();
    ElectronicsPayment electronic5 = new ElectronicsPayment();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        electronics.mouseHoverToEletronicTab();
        String expectedResult = "Cell phones";
        WebElement Actualresult = driver.findElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
        String realMsg = Actualresult.getText();
        Assert.assertEquals(expectedResult, realMsg, "Verify the text is not match");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        electronics1.mouseHoverToEletronicTab();

        electronics1.mouseHoverToEletronicTab();
        String expectedText = "Nokia Lumia 1020";
        WebElement ActualText = driver.findElement(By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"));
        String RealText = ActualText.getText();
        Assert.assertEquals(expectedText, RealText, "Verify the text is not match");
        String expectedPrice = "$349.00";
        WebElement ActualPrice = driver.findElement(By.xpath("//span[@id='price-value-20']"));
        String RealPrice = ActualPrice.getText();
        Assert.assertEquals(expectedPrice, RealPrice, "Verify the text is not match");
        electronics1.clickToClearCartItem();
        electronics1.enterCartItemValue("2");
        electronics1.clickOnAddToCartButton();
        String expectedProductAdd = "The product has been added to your shopping cart";
        WebElement ActualProductAdd = driver.findElement(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]"));
        String RealProductAdd = ActualProductAdd.getText();
        Assert.assertEquals(expectedProductAdd, RealProductAdd, "Verify the text is not match");
        electronics1.clickOnCloseMessage();
        electronics1.mouseHoverOnGoToCart();
        electronics1.clickOnGOToCart();
        String expectedShoppingCart = "Shopping cart";
        WebElement ActualshoppingCart = driver.findElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
        String RealshoppingCart = ActualshoppingCart.getText();
        Assert.assertEquals(expectedShoppingCart, RealshoppingCart, "Verify the text is not match");
        String expecteditemQuantity = "(2)";
        WebElement ActualitemQuantity = driver.findElement(By.xpath("//span[@class='cart-qty']"));
        String RealitemQuantity = ActualitemQuantity.getText();
        Assert.assertEquals(expecteditemQuantity, RealitemQuantity, "Verify the value is not match");
        String expectedtotal = "$698.00";
        WebElement ActualTotal = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/span[1]"));
        String RealTotal = ActualTotal.getText();
        Assert.assertEquals(expectedtotal, RealTotal, "Verify the value is not match");
        electronics1.clickOnTerms();
        electronics1.clickOncheckout();
        WebElement ActualText1 = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String RealText1 = ActualText1.getText();
        String expectedText1 = "Welcome, Please Sign In!";
        Assert.assertEquals(expectedText1, RealText1, "Verify the text is not match");

        electronic3.clickOnRegisterLink();
        String expectedText2 = "Register";
        WebElement ActualText2 = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String RealText2 = ActualText2.getText();
        Assert.assertEquals(expectedText2, RealText2, "Verify the value is not match");
        Thread.sleep(2000);
        electronic3.enterFirstname("Anand");
        electronic3.enterLastname("Tripathi");
        electronic3.enterEmail("anand27@yahoo.com");
        electronic3.enterPassword("Anand120378");
        electronic3.enterConfirmPassword("Anand120378");
        electronic3.ClickOnRegisterButton();
        String expectedRegister = "Your registration completed";
        WebElement ActualRegister = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String RealRegister = ActualRegister.getText();
        Assert.assertEquals(expectedRegister, RealRegister, "Registration is not Completed");
        electronic3.clickOncontinueButton();
        String expectedShopCart = "Shopping cart";
        WebElement ActualShopCart = driver.findElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
        String RealshopCart = ActualShopCart.getText();
        Assert.assertEquals(expectedShopCart, RealshopCart, "Registration is not Completed");
        electronic3.clickOnTermOfService();
        electronic3.clickOnCheckout();
        electronic3.enterCompanyName("JIRA AUTOMATION LIMITED");
        electronic3.enterCountryName("230");
        electronic3.enterStateId("0");
        electronic3.enterCityName("Harrow");
        electronic3.enterAddress1("154-A");
        electronic3.enterAddress2("Kenton Road");
        electronic3.enterZipCode("HA3 8AZ");
        electronic3.enterPhoneNumber("07969476490");
        electronic3.enterFaxNumber("02085704850");
        electronic3.clickOnBilling();
        electronic3.clickShipping();
        electronic3.clickOnShippingMethod();
        electronic3.clickOnPaymentMethod();
        electronic3.clickOnNextStepButton();
        Thread.sleep(2000);
        electronic5.selectCreditCardType("visa");
        electronic5.selectCardholder("MR A TRIPATHI");
        electronic5.selectCreditCardnumber("4012888888881881");
        electronic5.selectExpireMonth("8");
        electronic5.selectyear("2025");
        electronic5.selctCardCode("570");
        electronic5.clickOnPaymentButton();
        String expectedCreditCard = "Credit Card";
        WebElement ActualCreditCard = driver.findElement(By.xpath("//span[normalize-space()='Credit Card']"));
        String RealCreditCard = ActualCreditCard.getText();
        Assert.assertEquals(expectedCreditCard, RealCreditCard, "Text is not display");
        String expectDayAir = "(2nd Day Air)";
        WebElement ActualdayAir = driver.findElement(By.xpath("//span[@class='selected-shipping-method']"));
        String RealDayAir = ActualdayAir.getText();
        Assert.assertEquals(expectDayAir, RealDayAir, "Text is not display");
        String expectvalue = "$698.00";
        Thread.sleep(2000);
        WebElement Actualvalue = driver.findElement(By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]"));
        String Realvalue = Actualvalue.getText();
        Assert.assertEquals(expectvalue, Realvalue, "Text is not display");
        electronic5.clickOnConfirmButton();
        String expectThank = "Thank you";
        WebElement ActualThank = driver.findElement(By.xpath("//h1[normalize-space()='Thank you']"));
        String RealThank = ActualThank.getText();
        Assert.assertEquals(expectThank, RealThank, "Text is not display");
        String expectSuccess = "Your order has been successfully processed!";
        WebElement ActualSuccess = driver.findElement(By.xpath("//strong[normalize-space()='Your order has been successfully processed!']"));
        String RealSuccess = ActualSuccess.getText();
        Assert.assertEquals(expectSuccess, RealSuccess, "Order has not been sucessfully");
        Thread.sleep(1000);
        electronic5.clickOnContinueConfirm();
        String expectedWelcomeMessageShown = "Welcome to our store";
        String actualWelcomeMessageShown = getTextFromElement(By.xpath("//h2[text()='Welcome to our store']"));
        Assert.assertEquals(expectedWelcomeMessageShown, actualWelcomeMessageShown, "User Is Not On Main Page");
        electronic5.clickOnUrl();
        String url = "https://demo.nopcommerce.com/";
        String realUrl = driver.getCurrentUrl();
        Assert.assertEquals(url, realUrl, "Wrong Url");
    }

}
