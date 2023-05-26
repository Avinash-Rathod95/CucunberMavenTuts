package com.W3SchoolPages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.ht.E;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;
    By logo = By.xpath("/html/body/div[3]/a[1]/i");
    By Tutorials = By.xpath("//*[@id=\"navbtn_tutorials\"]");
    By References = By.xpath("//*[@id=\"navbtn_references\"]");
    By Exercises = By.xpath("//*[@id=\"navbtn_exercises\"]");
    By Bootcamp = By.xpath("/html/body/div[3]/a[5]");
    By Upgrade = By.xpath("/html/body/div[3]/div[2]/a[5]");
    By GetCertified = By.xpath("//*[@id=\"cert_navbtn\"]");
    By CreateWebsite = By.xpath("/html/body/div[3]/div[2]/a[3]");
    By SignUp = By.xpath("//*[@id=\"signupbtn_topnav\"]");
    By Login = By.xpath("//*[@id=\"w3loginbtn\"]");
    By Modes = By.xpath("//*[@id=\"main\"]/div[1]/div/a[3]/i");
    By Translate = By.xpath("//*[@id=\"nav_translate_btn\"]/i");
    By Search = By.xpath("//*[@id=\"nav_search_btn\"]/i");
    By SearchTextBox = By.xpath("//*[@id=\"search2\"]");
    By SearchButton = By.xpath("//*[@id=\"learntocode_searchbtn\"]");
    By Title = By.xpath("//*[@id=\"main\"]/div[2]/div/h1");
    By SubTitle = By.xpath("//*[@id=\"main\"]/div[2]/div/h3");
    //======================Constructor========================
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }
    //=================Methods=================================

    //@Given("user on W3School Web Page")
    public void user_on_w3school_web_page() {
        driver.get("https://www.w3schools.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@When("User validate the logo on Web Page")
    public void user_validate_the_logo_on_web_page() {
        WebElement LogoPresent = driver.findElement(logo);
        Boolean logoStatus= LogoPresent.isDisplayed();
        System.out.println(logoStatus);
        //Assert.assertTrue(LogoPresent.isDisplayed(LogoPresent),true);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    //@And("user validate Tutorials web Element on web Page")
    public void user_validate_tutorials_web_element_on_web_page() {
        WebElement TutorialsPresent = driver.findElement(Tutorials);
        Boolean TutsStatus= TutorialsPresent.isDisplayed();
        System.out.println(TutsStatus);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    //@And("user validate References web Element on web Page")
    public void user_validate_references_web_element_on_web_page() {
        WebElement RefPresent = driver.findElement(References);
        Boolean refStatus= RefPresent.isDisplayed();
        System.out.println(refStatus);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@And("user validate Exercises web Element on web Page")
    public void user_validate_exercises_web_element_on_web_page() {
        WebElement exePresent = driver.findElement(Exercises);
        Boolean exeStatus= exePresent.isDisplayed();
        System.out.println(exeStatus);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@And("user validate Bootcamp web Element on web Page")
    public void user_validate_bootcamp_web_element_on_web_page() {
        WebElement BootPresent = driver.findElement(Bootcamp);
        Boolean bootStatus= BootPresent.isDisplayed();
        System.out.println(bootStatus);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@And("user validate Upgrade web Element on web Page")
    public void user_validate_upgrade_web_element_on_web_page() {
        WebElement ugPresent = driver.findElement(Upgrade);
        Boolean ugStatus= ugPresent.isDisplayed();
        System.out.println(ugStatus);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@And("user validate GetCertified web Element on web Page")
    public void user_validate_get_certified_web_element_on_web_page() {
        WebElement gcPresent = driver.findElement(GetCertified);
        Boolean gcStatus= gcPresent.isDisplayed();
        System.out.println(gcStatus);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@And("user validate SignUp web Element on web Page")
    public void user_validate_sign_up_web_element_on_web_page() {
        WebElement signUpPresent = driver.findElement(SignUp);
        Boolean signUpStatus= signUpPresent.isDisplayed();
        System.out.println(signUpStatus);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@And("user validate Login web Element on web Page")
    public void user_validate_login_web_element_on_web_page() {
        WebElement loginPresent = driver.findElement(Login);
        Boolean loginStatus= loginPresent.isDisplayed();
        System.out.println(loginStatus);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@And("user validate modes web Element on web Page")
    public void user_validate_modes_web_element_on_web_page() {
        WebElement modesPresent = driver.findElement(Modes);
        Boolean modeStatus= modesPresent.isDisplayed();
        System.out.println(modeStatus);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@And("user validate Translate web Element on web Page")
    public void user_validate_translate_web_element_on_web_page() {
        WebElement transPresent = driver.findElement(Translate);
        Boolean transStatus= transPresent.isDisplayed();
        System.out.println(transStatus);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@And("user validate Search web Element on web Page")
    public void user_validate_search_web_element_on_web_page() {
        WebElement searchPresent = driver.findElement(Search);
        Boolean searchStatus= searchPresent.isDisplayed();
        System.out.println(searchStatus);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@And("user validate SearchTextBox web Element on web Page")
    public void user_validate_search_text_box_web_element_on_web_page() {
        WebElement textPresent = driver.findElement(SearchTextBox);
        Boolean textStatus= textPresent.isDisplayed();
        Boolean Actual = true;
        Assert.assertEquals(textStatus,Actual);
        System.out.println(textStatus);
        textPresent.sendKeys("Automation with Selenium...");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@And("user validate SearchButton web Element on web Page")
    public void user_validate_search_button_web_element_on_web_page() {
        WebElement sBtnPresent = driver.findElement(SearchButton);
        Boolean sBtnStatus= sBtnPresent.isDisplayed();
        System.out.println(sBtnStatus);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@And("user validate Title web Element on web Page")
    public void user_validate_title_web_element_on_web_page() {
        WebElement titlePresent = driver.findElement(Title);
        Boolean titleStatus= titlePresent.isDisplayed();
        System.out.println(titleStatus);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@And("user validate SubTitle web Element on web Page")
    public void user_validate_sub_title_web_element_on_web_page() {
        WebElement sTtlPresent = driver.findElement(SubTitle);
        Boolean sTtlStatus= sTtlPresent.isDisplayed();
        System.out.println(sTtlStatus);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}

