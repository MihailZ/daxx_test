package com.daxx.tests;

import com.daxx.MainTest;
import com.daxx.pages.CreateProfilePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by mikhail_z on 6/1/17.
 */
public class CreateProfileTest extends MainTest{

    private CreateProfilePage createProfilePage = new CreateProfilePage();

    @BeforeMethod
    public void setUp(){
        open(baseUrl + "/account");
    }

    @Test
    public void passToCreateProfilePage(){
        open(baseUrl);
        createProfilePage.passToCreateProfileBtn.click();
        Assert.assertTrue(createProfilePage.avatarSection.isDisplayed(), "We are not on create profile page!");
    }

    @Test
    public void emptySubmit(){
        createProfilePage.submitBtn.click();
        //asserts of all errors
        //...
    }

    @Test
    public void validFilledReqInputs(){
        //clear to all inputs and send valid data
        //asserts to new page after successfully login
    }
}
