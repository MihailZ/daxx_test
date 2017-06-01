package com.daxx.tests;

import com.codeborne.selenide.Condition;
import com.daxx.MainTest;
import com.daxx.pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.Wait;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by mikhail_z on 6/1/17.
 */
public class LoginTest extends MainTest{

    private LoginPage loginPage = new LoginPage();

    private String invalidEmail = "ololo";
    private String validEmail = "ololo@ololo.ua";
    private String invalidPass = "ololo";
    private String validPass = "ololO123_";


    @Test
    public void invalidLogin(){
        loginPage.emailInput.sendKeys(invalidEmail);
        loginPage.passwordInput.sendKeys(invalidPass);
        loginPage.submitBtn.click();
//        Wait().withTimeout(5, SECONDS)
//                .pollingEvery(1, SECONDS)
//                .until(ExpectedConditions.visibilityOf(loginPage.errorMsgLabel)).;
        loginPage.errorMsgLabel.waitUntil(Condition.exist,5);
        Assert.assertTrue(loginPage.errorMsgLabel.isDisplayed(), "No error message for invalid login!");
    }

    @Test
    public void validLogin(){
        //valid input and check that we on correct pages

    }
}
