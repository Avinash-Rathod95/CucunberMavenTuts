package StepDefinations;

import com.W3SchoolPages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Steps {
    WebDriver driver;
    @Test
    @Given("the user is on page")
    public void the_user_is_on_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        username.sendKeys("Admin");
        username.isDisplayed();
        Assert.assertTrue("username", true);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        password.sendKeys("admin123");
        Assert.assertTrue("password", true);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    @When("the user enters valid username")
    public void the_user_enters_valid_username() {
        WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        username.sendKeys("Admin");
        username.isDisplayed();
        Assert.assertTrue("username", true);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    @When("user enter the valid pasword")
    public void user_enter_the_valid_pasword() {
        WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        password.sendKeys("admin123");
        Assert.assertTrue("password", true);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    @And("hits submit button")
    public void hits_submit_button() {
        WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        login.isDisplayed();
        Assert.assertTrue("login", true);
        login.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    @Then("the user should be logged in Successfully")
    public void the_user_should_be_logged_in_successfully() {
        driver.close();
    }

    //==================================================================================
    @Given("user is on Orange HRM login page")
    public void user_is_on_orange_hrm_login_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("user enter the username in username field")
    public void user_enter_the_username_in_username_field() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        username.sendKeys("Admin");
        username.isDisplayed();
        Assert.assertTrue("username", true);
    }

    @When("user enter the password in password field")
    public void user_enter_the_password_in_password_field() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        password.sendKeys("admin123");
        Assert.assertTrue("password", true);
    }

    @Then("login should be successful for Orange HRM site")
    public void login_should_be_successful_for_orange_hrm_site() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        login.isDisplayed();
        Assert.assertTrue("login", true);
        login.click();
    }

    @When("hits the login button")
    public void hits_the_login_button() {

    }
    //---------------------------------------Radio Button------------------------------------------
    @Test
    @Given("the user is on facebook login page")
    public void the_user_is_on_facebook_login_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://www.facebook.com/");
    }

    @Test
    @When("the user click on create new account page")
    public void the_user_click_on_create_new_account_page() {
        WebElement createNewAccount = driver.findElement(By.xpath("//*[@id=\"u_0_0_XF\"]"));
        createNewAccount.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    @When("user should click on male radio button")
    public void user_should_click_on_male_radio_button() {
        WebElement radioButtonOfMale = driver.findElement(By.xpath("//*[@id=\"u_9_5_dI\"]"));
        radioButtonOfMale.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //------------------W3School---------------------------------
    @Test
    @Given("user on W3Schools page")
    public void user_on_w3schools_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://www.w3schools.com/");
    }
    @Test
    @When("user click on signUp page")
    public void user_click_on_sign_up_page() {
        WebElement SignUp = driver.findElement(By.xpath("//*[@id=\"signupbtn_topnav\"]"));
        SignUp.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    @Then("user redirect to the signUp page")
    public void user_redirect_to_the_sign_up_page() {
        driver.navigate().to("https://www.w3schools.com/signup/index.html");
    }
    @Test
    @And("User click on signUp for free button")
    public void user_click_on_sign_up_for_free_button() {
        WebElement SignUpForFreeButton = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[1]/div/a"));
        SignUpForFreeButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    @Then("user navigate to signUp Page")
    public void user_navigate_to_sign_up_page() {
        driver.navigate().to("https://profile.w3schools.com/sign-up?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com%2F");
    }
    @Test
    @Then("user enter the email Id")
    public void user_enter_the_email_id() {
        WebElement username = driver.findElement(By.xpath("//*[@id=\"modalusername\"]"));
        username.sendKeys("rathodavi95@gmail.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    @And("user enter the password")
    public void user_enter_the_password() {
        WebElement password = driver.findElement(By.xpath("//*[@id=\"new-password\"]"));
        password.sendKeys("Avee@7595");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    @Then("hits the signUp for free button")
    public void hits_the_sign_up_for_free_button() {
        WebElement suff = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[5]/div[1]/button/span"));
        suff.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    @Then("user navigate to another page")
    public void user_navigate_to_another_page() {
        driver.navigate().to("https://profile.w3schools.com/sign-up?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com%2F");
    }
    @Test
    @When("user enter the first name")
    public void user_enter_the_first_name() {
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"modal_first_name\"]"));
        firstName.sendKeys("Avinash");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    @When("user enter the Last name")
    public void user_enter_the_last_name() {
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"modal_last_name\"]"));
        lastName.sendKeys("Rathod");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    @Then("hit on continue button")
    public void hit_on_continue_button() {
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[3]/div[1]/button/span"));
        continueButton.click();
    }
//-----------------------------------------------------------------------------------------------

    @Test
    public void VerifyHomePage()
    {
        //WebElement driver = new ChromeDriver();
        HomePage hp = new HomePage(driver);


    }

}