package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    Homepage homePage = new Homepage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ShoppingPage shoppingPage = new ShoppingPage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void textVerified() {
        //1.1 Mouse Hover on “Electronics” Tab
        homePage.hoverElectronics();
        //1.2 Mouse Hover on “Cell phones” and click
        homePage.clickCellPhones();
        //1.3 Verify the text “Cell phones”
        Assert.assertEquals(cellPhonesPage.getVerifyCellPhones(),"Cell phones");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse Hover on “Electronics” Tab
        homePage.hoverElectronics();
        //2.2 Mouse Hover on “Cell phones” and click
        homePage.clickCellPhones();
        Thread.sleep(1000);
        //2.3 Verify the text “Cell phones”
        Assert.assertEquals(cellPhonesPage.getVerifyCellPhones(), "Cell phones");
        //2.4 Click on List View Tab
        Thread.sleep(1000);
        cellPhonesPage.clickListView();
        //2.5 Click on product name “Nokia Lumia 1020” link
        Thread.sleep(2000);
        cellPhonesPage.clickOnNokiaLumia();
        //2.6 Verify the text “Nokia Lumia 1020”
        Thread.sleep(1000);
        Assert.assertEquals(nokiaLumiaPage.getVerifyNokiaLumia(), "Nokia Lumia 1020");
        //2.7 Verify the price “$349.00”
        Thread.sleep(1000);
        Assert.assertEquals(nokiaLumiaPage.getVerifyPrice(), "$349.00");
        //2.8 Change quantity to 2
        nokiaLumiaPage.sendChangeQuantity2();
        //2.9 Click on “ADD TO CART” tab
        nokiaLumiaPage.clickAddToCart();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        //After that close the bar clicking on the cross button.
        Thread.sleep(1000);
        Assert.assertEquals(nokiaLumiaPage.getVerifyProductAdded(), "The product has been added to your shopping cart");
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumiaPage.clickCloseAlert();
        //2.12 Verify the message "Shopping cart"
        Thread.sleep(1000);
        nokiaLumiaPage.clickShoppingCart();
        //2.13 Verify the quantity is 2
        Thread.sleep(1000);
        Assert.assertEquals(shoppingPage.getVerifyShoppingCart(), "Shopping cart");
        //2.14 Verify the Total $698.00
        Thread.sleep(1000);
        Assert.assertEquals(shoppingPage.getVerifyQuantity2(), "(2)");
        //2.15 click on checkbox “I agree with the terms of service”
        Thread.sleep(1000);
        Assert.assertEquals(shoppingPage.getVerifyNokiaSubTotal(), "$698.00");
        //2.16 Click on checkout
        shoppingPage.clickTermsOfService();
        Thread.sleep(1000);
        //2.17 Verify the Text “Welcome, Please Sign In!”
        shoppingPage.clickCheckOutNokia();
        //2.18 Click on “REGISTER” tab
        Thread.sleep(1000);
        Assert.assertEquals(registerPage.getVerifyWelcomeMessage(), "Welcome, Please Sign In!");
        //2.19 Verify the text “Register”
        registerPage.clickRegister();
        //2.20 Fill the mandatory fields
        Thread.sleep(1000);
        Assert.assertEquals(registerPage.getVerifyRegister(), "Register");
        registerPage.enterFirstName();
        registerPage.enterLastName();
        registerPage.enterEmail();
        registerPage.enterPassword();
        registerPage.enterConfirmPassword();
        //2.21 Click on “REGISTER” Button
        registerPage.clickRegisterButton();
        //2.22 Verify the message “Your registration completed”
        Thread.sleep(1000);
        Assert.assertEquals(registerPage.getVerifyRegistrationCompleted(), "Your registration completed");
        //2.23 Click on “CONTINUE” tab
        registerPage.clickContinueShopping();
        //2.24 Verify the text “Shopping cart”
        Thread.sleep(1000);
        Assert.assertEquals(shoppingPage.getVerifyNokiaShoppingCart(), "Shopping cart");
        //2.25 click on checkbox “I agree with the terms of service”
        shoppingPage.clickTermsOfServiceNokia();
        shoppingPage.clickCheckOutNokiaShopping();
        //2.27 Fill the Mandatory fields
        Thread.sleep(1000);
        checkoutPage.selectCountryIdFieldNokia();
        checkoutPage.enterCityFieldNokia();
        checkoutPage.enterAddressField1Nokia();
        checkoutPage.enterZipCodeNokia();
        checkoutPage.enterPhoneNumberNokia();
        //2.28 Click on “CONTINUE”
        Thread.sleep(1000);
        checkoutPage.clickContinueAirNokia();
        checkoutPage.clickDayAir2nd();
        checkoutPage.clickContinueCardNokia();
        checkoutPage.clickCreditCardNokia();
        checkoutPage.clickContinueCardDetailsNokia();
        checkoutPage.selectVisa();
        Thread.sleep(1000);
        //2.33 Fill all the details
        checkoutPage.enterCardHolderNameNokia();
        checkoutPage.enterCardNumberNokia();
        checkoutPage.enterExpiryMonthNokia();
        checkoutPage.enterExpiryMonthNokia();
        checkoutPage.enterExpiryYearNokia();
        checkoutPage.enterCardCodeNokia();
        //2.34 Click on “CONTINUE”CHECKOUT”
        Thread.sleep(1000);
        checkoutPage.clickOnContinueCheckoutNokia();
        //2.35 Verify “Payment Method” is “Credit Card”
        Thread.sleep(1000);
        Assert.assertEquals(checkoutPage.getVerifyCreditCardMethodNokia(), "Credit Card");
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        Thread.sleep(1000);
        Assert.assertEquals(checkoutPage.getVerifyShippingMethodNokia(), "2nd Day Air");
        //2.37 Verify Total is “$698.00”
        Thread.sleep(1000);
        Assert.assertEquals(checkoutPage.getVerifyTotalNokia(), "$698.00");
        //2.38 Click on “CONFIRM”
        checkoutPage.clickOnConfirmNokia();
        //2.39 Verify the Text “Thank You”
        Thread.sleep(1000);
        Assert.assertEquals(checkoutPage.getVerifyThankYouNokia(), "Thank you");
        //  2.40 Verify the message “Your order has been successfully processed!”
        Thread.sleep(1000);
        Assert.assertEquals(checkoutPage.getVerifySuccessMessageNokia(), "Your order has been successfully processed!");
        //  2.41 Click on “CONTINUE”
        checkoutPage.clickOnContinueHomepageNokia();
        //2.42 Verify the text “Welcome to our store”
        Thread.sleep(1000);
        Assert.assertEquals(homePage.getVerifyWelcomeToStore(), "Welcome to our store");
        //2.43 Click on “Logout” link
        homePage.clickOnLogOut();
        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
        Assert.assertEquals(homePage.getUrl(),"https://demo.nopcommerce.com/");
    }
}