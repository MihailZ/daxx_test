package com.daxx.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by mikhail_z on 6/1/17.
 */
public class LoginPage {

    //better to use here @Getter from lombok plugin, to hide data
    public SelenideElement emailInput = $("#login");
    public SelenideElement passwordInput = $("#password");
    public SelenideElement errorMsgLabel = $("div.errorMessage");
    public SelenideElement submitBtn = $("#submit");

}
