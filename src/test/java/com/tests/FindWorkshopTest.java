package com.tests;

import com.pages.FindWorkshopPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import static org.junit.Assert.assertEquals;


public class FindWorkshopTest {
WebDriver driver;
FindWorkshopPage findWorkshopPage;

@Before
public void setup(){
    driver = new SafariDriver();
    findWorkshopPage=new FindWorkshopPage(driver);

    driver.get("https://www.weightwatchers.com/us/find-a-workshop/");
    driver.manage().window().maximize();

}


@Test
public void MainPageHeaderTest(){

    /*fails because the title contains a NBSP non-breaking space (&nbsp).
    This is a line formatting difference between formats.
    we could manually remove the nbsp from expected (as shown commented below) and that would cause the assert to work.
    Or we can remove all spaces from both lines and that should also fix the issue.

        String expected = "Find WW Studios & Meetings Near You | WW USA";
     */

    String expected = "Find WW Studios & Meetings Near You | WW USA";
    String actual = driver.getTitle();
    assertEquals(expected,actual);
}

@Test
public void WorkshopSearchTest(){

    findWorkshopPage.StudioButton();
    findWorkshopPage.StudioSearchField().sendKeys("10011");
    findWorkshopPage.StudioSubmit().submit();

    String searchResult = findWorkshopPage.FirstResultSearchHeading().getText();
    String distanceResult =findWorkshopPage.FirstResultSearchDistance().getText();

    System.out.println("Search Result: " + searchResult);
    System.out.println("Distance: " + distanceResult);



    findWorkshopPage.FirstResultSearchHeading().click();

    String WorkshopMainPage= findWorkshopPage.WorkshopInformationPage().getText();
    System.out.println("Workshop Page Heading: " + WorkshopMainPage);
    assertEquals(searchResult,WorkshopMainPage);
    findWorkshopPage.WorkshopInformationHoursTitle().click();
    findWorkshopPage.PrintHours();




}





    @After
    public void teardown(){
       driver.quit();
    }







}
