package com.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import com.sconto.pages.HomePage;
import com.sconto.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps {

    HomePage home;
    LoginPage login;


    @And("User enters valid data")
    public void enters_valid_data() {
        login = Selenide.page(LoginPage.class);
        login.enterData("pinkman@gmail.com", "Qwerty123!");
    }

    @And("User clicks on Anmelden button")
    public void clicks_on_Anmelden_button() {
        login.clickOnAnmelden();
    }

//    @And("User clicks on User icon")
//    public void clicks_on_User_icon() {
//        home = Selenide.page(HomePage.class);
//        home.clickOnUserLogin();
//    }
//
//    @Then("User verifies his name")
//    public void verify_User_name() {
//        login.verifyName("Jesse Pinkman");
    //    }


    @And("User enters wrong email and valid password")
    public void enters_wrong_email_and_valid_password() {
        login = Selenide.page(LoginPage.class);
        login.enterData("inkman@gmail.com", "Qwerty123!");

    }


    @And("User should see the Error message")
    public void should_see_the_Error_message() {
        login = Selenide.page(LoginPage.class);
        login.verifyLoginErrorTitle("Benutzername nicht gefunden oder Passwort falsch.");

    }


}
