package com.perchwell.pages.perchwell;

import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CreateReportPage extends TechHelper {

    public static List<String> orderListing = new ArrayList<>();

    @iOSXCUITFindBy(accessibility = "CMA")
    private WebElement cmaButton;

    @iOSXCUITFindBy(accessibility = "Extended CMA")
    private WebElement extendedCmaButton;

    @iOSXCUITFindBy(accessibility = "Listing Report")
    private WebElement listingReportButton;

    @iOSXCUITFindBy(accessibility = "Show Sheet")
    private WebElement showSheetButton;

    @iOSXCUITFindBy(accessibility = "Export To Excel")
    private WebElement exportToExcelButton;

    @iOSXCUITFindBy(accessibility = "Itinerary")
    private WebElement itineraryButton;

    @iOSXCUITFindBy(accessibility = "Media Report")
    private WebElement mediaReportButton;

    @iOSXCUITFindBy(accessibility = "Short")
    private WebElement shortButton;

    @iOSXCUITFindBy(accessibility = "Medium")
    private WebElement mediumButton;

    @iOSXCUITFindBy(accessibility = "Default")
    private WebElement defaultButton;

    @iOSXCUITFindBy(accessibility = "Default (Includes Buildings)")
    private WebElement defaultIncludesBuildingButton;

    @iOSXCUITFindBy(accessibility = "iconChevronLeft")
    private WebElement backButton;

    @iOSXCUITFindBy(accessibility = "Detailed ")
    private WebElement detailedButton;

    @iOSXCUITFindBy(accessibility = "Next")
    private WebElement nextButton;

    @iOSXCUITFindBy(accessibility = "Tag Cell: Search Text Field")
    private WebElement emailField;

    @iOSXCUITFindBy(accessibility = "EMAIL REPORT")
    private WebElement emailReportButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$value == 'tag color: #37d2be'$]")
    private WebElement emailPill;

    @iOSXCUITFindBy(accessibility = "Subject textField")
    private WebElement subjectField;

    @iOSXCUITFindBy(accessibility = "Return")
    private WebElement returnButtonOnKeyboard;

    @iOSXCUITFindBy(accessibility = "REPORT SUCCESSFULLY SENT")
    private WebElement emailReportPopUp;

    @iOSXCUITFindBy(accessibility = "EXIT")
    private WebElement popUpExitButton;

    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement popUpOkButton;

    @iOSXCUITFindBy(accessibility = "textView")
    private WebElement messageField;

    @iOSXCUITFindBy(accessibility = "shrink")
    private WebElement shrinkButton;

    @iOSXCUITFindBy(iOSNsPredicate = "label = 'removeBubble'")
    private WebElement removeBubble;

    @iOSXCUITFindBy(accessibility = "STUDIO")
    private WebElement studioBedroom;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value CONTAINS 'FT2'")
    private WebElement squareFeetLabel;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value CONTAINS '$'")
    private WebElement priceLabel;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value CONTAINS '1½'")
    private WebElement oneAndHalfBathroomLabel;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell")
    private List<WebElement> listingsList;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'cross16' AND visible == 1")
    private WebElement firstListingDeleteButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'iosReorder'")
    private List<WebElement> reorderButtonList;

    @iOSXCUITFindBy(accessibility = "Sales")
    private WebElement salesButton;

    public CreateReportPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnListingReportButton() {
        element(listingReportButton).click();
    }

    public void cmaOptionButtonIsShown() {
        element(cmaButton).shouldBeVisible();
    }

    public void clickOnCmaButton() {
        element(cmaButton).click();
    }

    public void extendedCmaOptionButtonIsShown() {
        element(extendedCmaButton).shouldBeVisible();
    }

    public void listingReportOptionButtonIsShown() {
        element(listingReportButton).shouldBeVisible();
    }

    public void showSheetOptionButtonIsShown() {
        element(showSheetButton).shouldBeVisible();
    }

    public void exportToExcelOptionButtonIsShown() {
        element(exportToExcelButton).shouldBeVisible();
    }

    public void shortOptionButtonIsShown() {
        element(shortButton).shouldBeVisible();
    }

    public void itineraryOptionButtonIsShown() {
        element(itineraryButton).shouldBeVisible();
    }

    public void mediaReportOptionButtonIsShown() {
        element(mediaReportButton).shouldBeVisible();
    }

    public void mediumButtonIsShown() {
        element(mediumButton).shouldBeVisible();
    }

    public void defaultOptionButtonIsShown() {
        element(defaultButton).shouldBeVisible();
    }

    public void defaultIncludesBuildingButtonIsShown() {
        element(defaultIncludesBuildingButton).shouldBeVisible();
    }

    public void clickOnBackButton() {
        element(backButton).click();
    }

    public void detailedOptionButtonIsShown() {
        element(detailedButton).shouldBeVisible();
    }

    public void clickOnDefaultButton() {
        element(defaultButton).click();
    }

    public void clickOnNextButton() {
        element(nextButton).click();
    }

    public void fillEmailField(String email) {
        element(emailField).sendKeys(email);
        SessionVariables.addValueInSessionVariable("emailAddress", email);
    }

    public void checkEmailReportButtonIsDisabled() {
        element(emailReportButton).shouldNotBeEnabled();
    }

    public void checkEmailReportButtonIsEnabled() {
        element(emailReportButton).shouldBeEnabled();
    }

    public void fillSubjectField(String message) {
        element(subjectField).typeAndEnter(message);
        SessionVariables.addValueInSessionVariable("Report_subject", message);
    }

    public void clickOnReturnButtonOnKeyboard() {
        element(returnButtonOnKeyboard).click();
    }

    public void clearEmailField() {
        element(emailField).clear();
    }

    public void checkEmailFieldValueIsShownAsText() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("emailAddress"), element(emailField).getAttribute("value"));

    }

    public void checkEmailFieldIsShownAsGreenPill() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("emailAddress"), element(emailPill).getAttribute("name"));
    }

    public void fillInMessageField(String message) {
        element(messageField).sendKeys(message);
        SessionVariables.addValueInSessionVariable("Report_message", message);
    }

    public void clickOnEmailReportButton() {
        element(emailReportButton).click();
    }

    public void checkEmailReportPopUpIsShown() {
        element(emailReportPopUp).shouldBeVisible();
    }

    public void checkPopUpExitButtonIsShown() {
        element(popUpExitButton).shouldBeVisible();
    }

    public void checkPopUpOkButtonIsShown() {
        element(popUpOkButton).shouldBeVisible();
    }

    public void clickOnPopUpOkButton() {
        element(popUpOkButton).click();
    }

    public void checkPopUpMessageIsClosed() {
        element(emailReportPopUp).shouldNotBeVisible();
    }

    public void checkSubjectFieldIsFilledOut() {
        Assert.assertEquals(element(subjectField).getText(), SessionVariables.getValueFromSessionVariable("Contact_subject"));
    }

    public void clickOnPopUpExitButton() {
        element(popUpExitButton).click();
    }

    public void clickOnMediaReportButton() {
        element(mediaReportButton).click();
    }

    public void clickOnShrinkButton() {
        element(shrinkButton).click();
    }

    public void removeValidEmail() {
        element(removeBubble).click();
    }

    public void clickOnShortButton() {
        element(shortButton).click();
    }

    public void checkListingType(String property) {
        element(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value = '" + property + "'")).shouldBeVisible();
    }

    public void checkStudioIsDisplayed() {
        element(studioBedroom).shouldBeVisible();
    }

    public void checkSquareFeetValueWithoutApproxLabel() {
        Assert.assertEquals(element(squareFeetLabel).getAttribute("value"), SessionVariables.getValueFromSessionVariable("squareFeetListing1"));
        element(squareFeetLabel).shouldNotContainText("Approx.");
    }

    public void checkPriceWithoutMO() {
        element(priceLabel).shouldNotContainText("/MO");
    }

    public void checkOneAndHalfBathroomIsShown() {
        element(oneAndHalfBathroomLabel).shouldBeVisible();
    }

    public void checkOnlySquareFeetWithApproxLabel() {
        element(squareFeetLabel).shouldContainText("Approx.");
    }

    public void checkPriceWithMO() {
        element(priceLabel).shouldContainText("/MO");
    }

    public void checkOpenHouseInfoIsShown() {
        element(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value = '" + SessionVariables.getValueFromSessionVariable("openHouseDate") + "'")).shouldBeVisible();
    }

    public void swipeLeftByAddress(String address) {
        WebElement listingAddress = element(MobileBy.iOSNsPredicateString("value == '" + address + "' AND visible == true"));
        int y = listingAddress.getLocation().getY();
        universalVerticalSwipe(listingAddress);
        universalHorizontalSwipe(listingAddress, y + 1);
    }

    public void deleteFirstListing() {
        element(firstListingDeleteButton).click();
    }

    public void moveFirstListingToThirdListingByDragging() {
        int longPressX = reorderButtonList.get(0).getLocation().getX();
        int longPressY = reorderButtonList.get(0).getLocation().getY();
        int moveToX = reorderButtonList.get(2).getLocation().getX();
        int moveToY = reorderButtonList.get(2).getLocation().getY();

        reorderListingByDraggingAtCreateReportPage(longPressX, longPressY, moveToX, moveToY);
    }

    public void checkFirstListingIsDeleted() {
        element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("listingAddress1"))).shouldNotBePresent();
    }

    public void checkFirstBuildingIsDeleted() {
        element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("buildingAddress1"))).shouldNotBePresent();
    }

    public void moveFirstBuildingToSecondBuildingByDragging() {
        int longPressX = reorderButtonList.get(4).getLocation().getX();
        int longPressY = reorderButtonList.get(4).getLocation().getY();
        int moveToX = reorderButtonList.get(5).getLocation().getX();
        int moveToY = reorderButtonList.get(5).getLocation().getY();

        universalVerticalSwipe(reorderButtonList.get(5));
        reorderListingByDraggingAtCreateReportPage(longPressX, longPressY, moveToX, moveToY);
    }

    public void getListingsAndBuildingsOrder() {
        for (int i = 0; i < listingsList.size(); i++) {
            orderListing.add(element(MobileBy.iOSClassChain("**/XCUIElementTypeCell[" + (i + 1) + "]/*/*/*[1]/*[2]/*/*/*[1]/*/XCUIElementTypeStaticText[1]")).getValue());
        }
    }

    public void clickOnSalesButton() {
        element(salesButton).click();
    }
}
