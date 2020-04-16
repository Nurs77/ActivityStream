package com.Bitrix24.tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import com.Bitrix24.pages.TestCase_11_Page;
import tests.AbstractTestBase;

public class TestCase_11_PageTest extends AbstractTestBase {

    @Test
    public void test() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        TestCase_11_Page tc = new TestCase_11_Page();
        tc.clickOnMacOS();
    }

    @Test
    public void test1() {
        // LoginPage loginPage = new LoginPage();
        //  loginPage.login();

        TestCase_11_Page tc1 = new TestCase_11_Page();
        tc1.clickOnWindows();
    }

    @Test
    public void test2()   {
        // LoginPage loginPage = new LoginPage();
        // loginPage.login();

        TestCase_11_Page tc2 =new TestCase_11_Page();
        tc2.clickOnLinux();

    }
}




