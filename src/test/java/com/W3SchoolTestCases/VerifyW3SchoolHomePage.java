package com.W3SchoolTestCases;

import com.W3SchoolPages.HomePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VerifyW3SchoolHomePage {
    @Test
    public void verifyValidateHomePage()
    {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        HomePage hp = new HomePage(driver);
        //hp.user_on_w3school_web_page();
        hp.user_validate_the_logo_on_web_page();
        hp.user_validate_tutorials_web_element_on_web_page();
        hp.user_validate_references_web_element_on_web_page();
        hp.user_validate_exercises_web_element_on_web_page();
        hp.user_validate_bootcamp_web_element_on_web_page();
        hp.user_validate_upgrade_web_element_on_web_page();
        hp.user_validate_get_certified_web_element_on_web_page();
        hp.user_validate_sign_up_web_element_on_web_page();
        hp.user_validate_login_web_element_on_web_page();
        hp.user_validate_modes_web_element_on_web_page();
        hp.user_validate_translate_web_element_on_web_page();
        hp.user_validate_search_web_element_on_web_page();
        hp.user_validate_search_text_box_web_element_on_web_page();
        hp.user_validate_search_button_web_element_on_web_page();
        hp.user_validate_title_web_element_on_web_page();
        hp.user_validate_sub_title_web_element_on_web_page();
    }
}
