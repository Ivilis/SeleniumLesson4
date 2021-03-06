package autotests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelInsurance1step extends BasePage{

        @FindBy(xpath = "//section[contains(@class,'b-active-tab')]")
        WebElement formOne;

        @FindBy(xpath = "//SPAN[@ng-click='save()'][text()='Оформить']")
        public WebElement acceptButton;

        public TravelInsurance1step(WebDriver driver){
            PageFactory.initElements(driver, this);
        }


        public void selectInsurance(String menuItem){
                formOne.findElement(By.xpath(".//*[contains(text(),'"+menuItem+"')]")).click();

        }
        public void waitElements () {
            Wait<WebDriver> wait = new WebDriverWait(driver,30, 2000);
            wait.until(ExpectedConditions.visibilityOf(formOne));
            wait.until(ExpectedConditions.visibilityOf(acceptButton));
        }


    }


