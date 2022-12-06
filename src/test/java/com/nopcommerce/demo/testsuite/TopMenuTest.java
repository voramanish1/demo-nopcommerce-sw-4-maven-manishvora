package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    TopMenuPage topMenu = new TopMenuPage();

    @Test
    public void VerifyPageNavigation() {
        topMenu.clickOnComputerTab();
        Assert.assertEquals(topMenu.getVerifyComputerTab(),"Computers");
        topMenu.clickOnElectronicsTab();
        Assert.assertEquals(topMenu.getVerifyElectronicsTab(),"Electronics");
        topMenu.clickOnApparelTab();
        Assert.assertEquals(topMenu.getVerifyApparelTab(),"Apparel");
        topMenu.clickOnDigitalDownloadsTab();
        Assert.assertEquals(topMenu.getVerifyDigitalDownloadsTab(),"Digital downloads");
        topMenu.clickOnBooksTab();
        Assert.assertEquals(topMenu.getVerifyBooksTab(),"Books");
        topMenu.clickOnJewelryTab();
        Assert.assertEquals(topMenu.getVerifyJewelryTab(),"Jewelry");
        topMenu.clickOnGiftCardTab();
        Assert.assertEquals(topMenu.getVerifyGiftCardTab(),"Gift Cards");
    }
}