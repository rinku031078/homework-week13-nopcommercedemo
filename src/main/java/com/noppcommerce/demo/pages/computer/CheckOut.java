package com.noppcommerce.demo.pages.computer;

import com.noppcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOut extends Utility {
    By inputFirstName = By.id("BillingNewAddress_FirstName");
    By inputLastName = By.id("BillingNewAddress_LastName");
    By inputEMailAddress = By.id("BillingNewAddress_Email");
    By inputCompanyName = By.id("BillingNewAddress_Company");
    By inputCountyName = By.id("BillingNewAddress_CountryId");
    By inputStateName= By.id("BillingNewAddress_StateProvinceId");
    By inputCityName= By.id("BillingNewAddress_City");
    By inputAddressLineOne= By.id("BillingNewAddress_Address1");
    By inputAddressLineTwo= By.id("BillingNewAddress_Address2");
    By inputZipPostalCode= By.id("BillingNewAddress_ZipPostalCode");
    By inputPhoneNumber= By.id("BillingNewAddress_PhoneNumber");
    By inputFaxNumber= By.id("BillingNewAddress_FaxNumber");
    By clickSaveButton= By.xpath("//button[@onclick='Billing.save()']");
    By shippingMethodSelect =By.id("shippingoption_1");
    By clickOnContinueButton =By.xpath("(//button[@class='button-1 shipping-method-next-step-button'])[1]");
    By selectCreditCardOption =By.id("paymentmethod_1");
    By clickOnCreditCardContinueButton = By.xpath("(//button[@class='button-1 payment-method-next-step-button'])[1]");
    By creditCardDropDownList= By.id("CreditCardType");
    By cardHolderName=By.id("CardholderName");
    By cardHolderNumber=By.id("CardNumber");
    By cardHolderCVVCode=By.id("CardCode");
    By cardHolderExpYearDropDown=By.id("ExpireYear");
    By cardHolderExpMonthDropDown=By.id("ExpireMonth");
    By confirmCreditCardButton =By.xpath("//button[@onclick='PaymentInfo.save()']");
    By verifyCreditCardPayment =By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyAirShippingMethod =By.xpath("//span[contains(text(),'Next Day Air')]");
    By verifyTotalAmount=By.xpath("//span[contains(text(),'$2,950.00')]");
    By clickOnConfirmOrder =By.xpath("//button[contains(text(),'Confirm')]");
    By verifyThankYou =By.xpath("//h1[contains(text(),'Thank you')]");
    By verifyOrderSuccessfulMessage =By.xpath("//div[@class='page checkout-page order-completed-page']//div/strong[contains(text(),'Your order has been successfully processed!')]");
    By clickOnFinalContinueButton =By.xpath("//button[contains(text(),'Continue')]");
    By verifyWelcomeMessage=By.xpath("//h2[contains(text(),'Welcome to our store')]");
    public void basicFormFillUp(){
        doubleClickAndSendKeysOnElement(inputFirstName,"Het");
        doubleClickAndSendKeysOnElement(inputLastName,"Tripathi");
        doubleClickAndSendKeysOnElement(inputEMailAddress,"het123@yahoo.com");
        doubleClickAndSendKeysOnElement(inputCompanyName,"Jira Automate");
        selectByValueFromDropDown(inputCountyName,"133");
        clickOnElement(inputStateName);
        doubleClickAndSendKeysOnElement(inputCityName,"London");
        doubleClickAndSendKeysOnElement(inputAddressLineOne,"164-B, Kenton Road");
        doubleClickAndSendKeysOnElement(inputAddressLineTwo,"Nr.Pradip's");
        doubleClickAndSendKeysOnElement(inputZipPostalCode,"HA3 8BL");
        doubleClickAndSendKeysOnElement(inputPhoneNumber,"07447588094");
        doubleClickAndSendKeysOnElement(inputFaxNumber,"028085704851");
        clickOnElement(clickSaveButton);
    }
    public void setShippingMethodSelect(){
        clickOnElement(shippingMethodSelect);
        clickOnElement(clickOnContinueButton);
    }
    public void selectCreditCardOption(){
        clickOnElement(selectCreditCardOption);
        clickOnElement(clickOnCreditCardContinueButton);
    }
    public void fillCreditCardDetails(){
        selectByValueFromDropDown(creditCardDropDownList,"MasterCard");
        doubleClickAndSendKeysOnElement(cardHolderName,"MR H A TRIPATHI");
        doubleClickAndSendKeysOnElement(cardHolderNumber,"5105105105105100");
        selectByValueFromDropDown(cardHolderExpMonthDropDown,"7");
        selectByValueFromDropDown(cardHolderExpYearDropDown,"2025");
        doubleClickAndSendKeysOnElement(cardHolderCVVCode,"123");
        clickOnElement(confirmCreditCardButton);
    }
    public String setVerifyCreditCardPayment(){
        return getTextFromElement(verifyCreditCardPayment);
    }
    public String setVerifyAirShippingMethod(){
        return getTextFromElement(verifyAirShippingMethod);
    }
    public String setVerifyTotalAmount(){
        return getTextFromElement(verifyTotalAmount);
    }
    public void setClickOnConfirmOrder(){
        clickOnElement(clickOnConfirmOrder);
    }
    public String setVerifyThankyou(){
        return getTextFromElement(verifyThankYou);
    }
    public String setVerifyOrderSuccessfulMessage(){
        return getTextFromElement(verifyOrderSuccessfulMessage);
    }
    public void finalContinueButton(){
        clickOnElement(clickOnFinalContinueButton);
    }
    public String setVerifyWelcomeMessage(){
        return getTextFromElement(verifyWelcomeMessage);
    }
}
