package com.example.test;

import static com.example.setup.SeleniumDriver.getEyes;

import com.example.pageobjects.GitHubHomePage;
import com.example.pageobjects.GitHubLoginPage;
import com.example.setup.SeleniumBaseTest;
import org.testng.annotations.Test;


public class GitHubLoginTest extends SeleniumBaseTest {

    @Test
    public void shouldNotLoginWithWrongCredentials() {
        //navigate to login page
        GitHubHomePage homePage = new GitHubHomePage().open();
        GitHubLoginPage loginPage = homePage.goToLoginPage();

        //assert there is an error message
        getEyes().checkWindow();
    }

}
