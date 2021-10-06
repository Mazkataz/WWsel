package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
    WebDriver driver;
WebDriverWait wait;

    public Page(WebDriver driver){
        this.driver =driver;
        this.wait = new WebDriverWait(this.driver,10);
    }


     String getTitle(){
        return driver.getTitle();
    }

    public void waitElement(By loadingElement){
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(loadingElement));
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }

}
