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

public void StudioButton (){
    this.waitElement(studioButton);
    driver.findElements(studioButton).get(1).click();
}

public WebElement StudioSearchField(){
    this.waitElement(locationSearch);
    return  driver.findElement(locationSearch);
}
public WebElement StudioSubmit(){
    this.waitElement(studioSubmit);
    return  driver.findElement(studioSubmit);
}

    public WebElement FirstResultSearchHeading (){
        this.waitElement(firstResult);
        return  driver.findElement(firstResult);
    }
    public WebElement FirstResultSearchDistance (){
        this.waitElement(resultDistance);
        return  driver.findElement(resultDistance);
    }

    public WebElement WorkshopInformationPage (){
        this.waitElement(workshopInfoHeader);
        return  driver.findElement(workshopInfoHeader);
    }

    public WebElement WorkshopInformationHoursTitle (){
        this.waitElement(workshopTitle);
        return  driver.findElement(workshopTitle);
    }
    public List<WebElement> WorkshopInformationDays (){
        this.waitElement(workshopHours);
        return  driver.findElements(workshopDays);
    }
    public List<WebElement> WorkshopInformationHours (){
        this.waitElement(workshopHours);
        return  driver.findElements(workshopHours);
    }

   public void  PrintHours (){

    List<WebElement> day = WorkshopInformationDays();
    List<WebElement> hours = WorkshopInformationHours();

    for(int x=0; x<day.size(); x++ ) {
        System.out.print(day.get(x).getText()+" ");
        System.out.println(hours.get(x).getText() + ",");
   }


}




}
