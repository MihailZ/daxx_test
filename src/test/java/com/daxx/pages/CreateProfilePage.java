package com.daxx.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by mikhail_z on 6/1/17.
 */
public class CreateProfilePage {

    public SelenideElement passToCreateProfileBtn = $("aside > a[href=\"/mijn/account\"]");

    public SelenideElement avatarSection = $(".dash-block .mp-pass-avatar-edit");

    public SelenideElement maleRadioBut = $("input[id=geslacht-m]");
    public SelenideElement femaleRadioBut = $("input[id=geslacht-v]");

    public SelenideElement firstNameInput = $("#voornaam");
    public SelenideElement lastNameInput = $("#achternaam");

    public SelenideElement birthDaySelect = $("#birthdayDay");
    public SelenideElement birthMnthSelect = $("#selw-birthdayMonth");
    public SelenideElement birthYearSelect = $("#selw-birthdayYear");

    public SelenideElement emailInput = $("#email");
    public SelenideElement phoneInput = $("#telefoon");
    public SelenideElement gsmInput = $("#gsm");

    public SelenideElement usernameInput = $("#username");
    public SelenideElement pswInput = $("#psw");
    public SelenideElement pswConfirmInput = $("#psw2");

    public SelenideElement submitBtn = $("#submitBtn");
}
