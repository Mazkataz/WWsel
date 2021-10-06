package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FindWorkshopPage extends Page {
    public FindWorkshopPage(WebDriver driver) {
        super(driver);
    }


By studioButton = By.cssSelector(".buttonText-3DCCO");
By locationSearch =By.id("location-search");
By studioSubmit = By.id("location-search-cta");
By firstResult = By.cssSelector(".linkUnderline-1_h4g");
By resultDistance = By.cssSelector(".distance-OhP63");
By workshopInfoHeader = By.cssSelector(".locationName-1jro_");
By workshopTitle =By.cssSelector(".title-3o8Pv");
By workshopHours =By.cssSelector(".times-fms3v");
By workshopDays =By.cssSelector(".dayName-CTNC6");


@Override
 String getTitle(){
        return driver.getTitle();
    }

public void clickStudioMenuButton (){
    this.waitElement(studioButton);
    driver.findElements(studioButton).get(1).click();
}

public void typeStudioSearchField(String zip){
    this.waitElement(locationSearch);
      driver.findElement(locationSearch).sendKeys(zip);
}
public void clickStudioSubmit(){
    this.waitElement(studioSubmit);
      driver.findElement(studioSubmit).click();
}

    public String FirstResultSearchHeading (){
        this.waitElement(firstResult);
        return  driver.findElement(firstResult).getText();
    }
    public String FirstResultSearchDistance (){
        this.waitElement(resultDistance);
        return  driver.findElement(resultDistance).getText();
    }
    public void clickFirstResultSearchHeading (){
        this.waitElement(firstResult);
          driver.findElement(firstResult).click();
    }
    public String WorkshopInformationPage (){
        this.waitElement(workshopInfoHeader);
        return  driver.findElement(workshopInfoHeader).getText();
    }

    public WebElement WorkshopInformationHoursTitle (){
        this.waitElement(workshopTitle);
        return  driver.findElement(workshopTitle);
    }
    public List<WebElement> listWorkshopInformationDays (){
        this.waitElement(workshopHours);
        return  driver.findElements(workshopDays);
    }
    public List<WebElement> listWorkshopInformationHours (){
        this.waitElement(workshopHours);
        return  driver.findElements(workshopHours);
    }

   public void  PrintHours (){

    List<WebElement> day = listWorkshopInformationDays();
    List<WebElement> hours = listWorkshopInformationHours();

    for(int x=0; x<day.size(); x++ ) {
        System.out.print(day.get(x).getText()+" ");
        System.out.println(hours.get(x).getText() + ",");
   }


}




}
