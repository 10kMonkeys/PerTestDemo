package com.perchwell.pages.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.util.concurrent.TimeUnit.SECONDS;

public class DiscussThisListingPage extends TechHelper {

    //region WebElements

    @AndroidFindBy(xpath = "//*[contains(@text,'CLIENT TEST+CLIENT0')]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'CLIENT TEST+CLIENT0'")
    private WebElement clientWithDiscussion;

    @AndroidFindBy(xpath = "//*[contains(@text,'TEST TEST-IOS+MGMT-CORE@PERCHWELL.COM')]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'TEST TEST-IOS+MGMT-STRIBLING@PERCHWELL.COM'")
    private WebElement agentWithDiscussion;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/delete_button")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell/XCUIElementTypeButton")
    private WebElement deleteButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
    @iOSXCUITFindBy(accessibility = "DiscussionsCancelButton")
    private WebElement closeButton;

    //endregion

    public DiscussThisListingPage(WebDriver driver) {
        super(driver);
    }

    public void deleteClientsWithDiscussion() {
        waitFor(ExpectedConditions.visibilityOf(clientWithDiscussion));
        if(Config.isAndroid()) {
            setImplicitTimeout(3, SECONDS);
            if (isElementDisplayed(element(MobileBy.xpath("//*[contains(@text,'CLIENT TEST+CLIENT0')]")))) {
                waitABit(1000);
                int y = clientWithDiscussion.getLocation().getY();
                universalHorizontalSwipe(clientWithDiscussion, y + 1);
                clickOnDeleteButton();
            }
            resetImplicitTimeout();
        } else {
            setImplicitTimeout(3, SECONDS);
            while (isElementDisplayed(element(MobileBy.iOSNsPredicateString("type=='XCUIElementTypeStaticText' AND name == 'CLIENT TEST+CLIENT0'")))) {
                waitABit(1000);
                int y = clientWithDiscussion.getLocation().getY();
                universalHorizontalSwipe(clientWithDiscussion, y + 1);
                clickOnDeleteButton();
            }
            resetImplicitTimeout();
        }
    }

    public void deleteAgentsWithDiscussion() {
        waitFor(ExpectedConditions.visibilityOf(agentWithDiscussion));
        if(Config.isAndroid()) {
            setImplicitTimeout(3, SECONDS);
            if (isElementDisplayed(element(MobileBy.xpath("//*[contains(@text,'TEST TEST-IOS+MGMT-CORE@PERCHWELL.COM')]")))) {
                waitABit(1000);
                int y = agentWithDiscussion.getLocation().getY();
                universalHorizontalSwipe(agentWithDiscussion, y + 1);
                clickOnDeleteButton();
            }
            resetImplicitTimeout();
        } else {
            setImplicitTimeout(3, SECONDS);
            while (isElementDisplayed(element(MobileBy.iOSNsPredicateString("type=='XCUIElementTypeStaticText' AND name == 'TEST TEST-IOS+MGMT-STRIBLING@PERCHWELL.COM'")))) {
                waitABit(1000);
                int y = agentWithDiscussion.getLocation().getY();
                universalHorizontalSwipe(agentWithDiscussion, y + 1);
                clickOnDeleteButton();
            }
            resetImplicitTimeout();
        }
    }

    public void clickOnDeleteButton() {
        element(deleteButton).click();
    }

    public void clickOnClosePageButton() {
        element(closeButton).click();
    }
}
