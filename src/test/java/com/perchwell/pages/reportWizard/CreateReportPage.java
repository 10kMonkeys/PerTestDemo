package com.perchwell.pages.reportWizard;

import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
    private WebElement deleteButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'iosReorder'")
    private List<WebElement> reorderButtonList;

    @iOSXCUITFindBy(accessibility = "Sales")
    private WebElement salesButton;

    @iOSXCUITFindBy(accessibility = "addTag")
    private WebElement subjectPropertyButton;

    private WebElement addressPlaceholder;

    private WebElement unitPlaceholder;

    private WebElement pricePlaceholder;

    private WebElement propertyTypePlaceholder;

    private WebElement bedroomsPlaceholder;

    private WebElement bathtoomsPlaceholder;

    private WebElement sqrFootagePlaceholder;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[1]")
    private WebElement subjectPropertyCell;

    @iOSXCUITFindBy(accessibility = "Rentals")
    private WebElement rentalsButton;

    @iOSXCUITFindBy(accessibility = " Option Selected: Landscape")
    private WebElement selectedLandscapeButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value CONTAINS 'Suboption Selected:' AND visible == 1")
    private List<WebElement> subOptions;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value CONTAINS 'CC/Maintenance' AND visible == 1")
    private WebElement ccMaintSuboption;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value CONTAINS 'RE Taxes' AND visible == 1")
    private WebElement reTaxesSuboption;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value CONTAINS 'Total Monthlies' AND visible == 1")
    private WebElement totalMonthliesSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption Selected: CC/Maintenance")
    private WebElement selectedCcMaintSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption: CC/Maintenance")
    private WebElement unselectedCcMaintSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption Selected: RE Taxes")
    private WebElement selectedReTaxesSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption: RE Taxes")
    private WebElement unselectedReTaxesSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption Selected: External Page")
    private WebElement selectedExternalPageOption;

    @iOSXCUITFindBy(accessibility = " Suboption: External Page")
    private WebElement unselectedExternalPageOption;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell/XCUIElementTypeTextField[1]")
    private WebElement reportLabelTextField;

    @iOSXCUITFindBy(accessibility = " Option: Portrait")
    private WebElement unselectedPortraitButton;

    @iOSXCUITFindBy(accessibility = " Option: Landscape")
    private WebElement unselectedLandscapeButton;

    @iOSXCUITFindBy(accessibility = " Suboption: Price Change")
    private WebElement unselectedPriceChangeSubption;

    @iOSXCUITFindBy(accessibility = " Suboption Selected: Original Price")
    private WebElement selectedOriginalPriceSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption: Contract Date")
    private WebElement unselectedContractDateOption;

    @iOSXCUITFindBy(accessibility = "(12/12)")
    private WebElement twelveOfTwelveFieldsCounter;

    @iOSXCUITFindBy(accessibility = "(11/12)")
    private WebElement elevenOfTwelveFieldsCounter;

    @iOSXCUITFindBy(accessibility = "(9/9)")
    private WebElement nineOfNineFieldsCounter;

    @iOSXCUITFindBy(accessibility = "(8/9)")
    private WebElement eightOfNiveFieldsCounter;

    @iOSXCUITFindBy(accessibility = " Suboption: Perchwell")
    private WebElement unselectedPerchwellLinkOption;

    @iOSXCUITFindBy(accessibility = " Suboption Selected: Perchwell")
    private WebElement selectedPerchwellLinkOption;

    @iOSXCUITFindBy(accessibility = " Suboption Selected: Beds")
    private WebElement selectedBedsSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption: Beds")
    private WebElement unselectedBedsSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption: Rooms")
    private WebElement unselectedRoomsSuboption;


    @iOSXCUITFindBy(accessibility = "Add Listings From Tags")
    private WebElement tagsField;

    @iOSXCUITFindBy(accessibility = "ACTIVE")
    private WebElement activeSection;

    @iOSXCUITFindBy(accessibility = "IN CONTRACT")
    private WebElement inContractSection;

    @iOSXCUITFindBy(accessibility = "OFF MARKET")
    private WebElement offMarketSection;

    @iOSXCUITFindBy(accessibility = "SOLD")
    private WebElement soldSection;

    @iOSXCUITFindBy(accessibility = "RENTED")
    private WebElement rentedSection;

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
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(emailReportPopUp).shouldNotBeVisible();
        resetImplicitTimeout();
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
        Assert.assertEquals(element(squareFeetLabel).getAttribute("value"), SessionVariables.getValueFromSessionVariable("sqrFootageValue"));
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

    public void clickOnDeleteButton() {
        element(deleteButton).click();
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

    public void clickOnSubjectPropertyButton() {
        element(subjectPropertyButton).click();
    }

    public void checkAddressPlaceholderIsShown() {
        element(addressPlaceholder).shouldBeVisible();
    }

    public void checkUnitPlaceholderIsShown() {
        element(unitPlaceholder).shouldBeVisible();
    }

    public void checkPropertyTypePlaceholderIsShown() {
        element(propertyTypePlaceholder).shouldBeVisible();
    }

    public void checkPricePlaceholderIsShown() {
        element(pricePlaceholder).shouldBeVisible();
    }

    public void checkBedroomsPlaceholderIsShown() {
        element(bedroomsPlaceholder).shouldBeVisible();
    }

    public void checkBathroomsPlaceholderIsShown() {
        element(bathtoomsPlaceholder).shouldBeVisible();
    }

    public void checkSqrFootagePlaceholderIsShown() {
        element(sqrFootagePlaceholder).shouldBeVisible();
    }

    public void clickOnSubjectPropertyCell() {
        element(subjectPropertyCell).click();
    }

    public void checkAddressPlaceholderWithValue() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("addressValue"), element(addressPlaceholder).getValue());
    }

    public void checkUnitPlaceholderWithValue() {
        if(element(unitPlaceholder).isVisible()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("unitValue"), element(unitPlaceholder).getValue());
        }
    }

    public void checkPricePlaceholderWithValue() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("priceValue"), element(pricePlaceholder).getValue());
    }

    public void checkPropertyTypePlaceholderWithValue() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("propertyTypeValue"), element(propertyTypePlaceholder).getValue());
    }

    public void checkBedroomsPlaceholderWithValue() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("bedsValue"), element(bedroomsPlaceholder).getValue());
    }

    public void checkBathroomsPlaceholderWithValue() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("bathsValue"), element(bathtoomsPlaceholder).getValue());
    }

    public void checkSqrFootagePlaceholderWithValue() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("sqrFootageValue"), element(sqrFootagePlaceholder).getValue());
    }

    public void clickOnRentalsButton() {
        element(rentalsButton).click();
    }

    public void swipeLeftSubjectPropertyCell() {
        int y = subjectPropertyCell.getLocation().getY();
        universalHorizontalSwipe(subjectPropertyCell, y + 1);
    }

    public void checkSubjectPropertyPlusIconIsShown() {
        element(subjectPropertyButton).shouldBeVisible();
    }

    public void checkSubjectPropertyFieldIsNotShown() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(subjectPropertyCell).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void checkLayoutIsLandscape() {
        element(selectedLandscapeButton).shouldBeVisible();
    }

    public void checkSelectedFieldsAmount(int amount) {
        Assert.assertEquals(amount,subOptions.size());
    }

    public void checkCCMaintIsVisible() {
        element(selectedCcMaintSuboption).shouldBeVisible();
    }

    public void checkRETaxedIsVisible() {
        element(selectedReTaxesSuboption).shouldBeVisible();
    }

    public void checkTotalMonthliesIsVisible() {
        element(totalMonthliesSuboption).shouldBeVisible();
    }

    public void checkExternalPageOptionIsSelected() {
        universalVerticalSwipe(selectedExternalPageOption);
        element(selectedExternalPageOption).shouldBeVisible();
    }

    public void switchToPortrait() {
        element(unselectedPortraitButton).click();
    }

    public void switchToLandscape() {
        element(unselectedLandscapeButton).click();
    }

    public void deselectOriginalPriceSuboption() {
        element(selectedOriginalPriceSuboption).click();
    }

    public void selectPriceChangeSuboption() {
        element(unselectedPriceChangeSubption).click();
    }

    public void checkElevenFieldsCounterIsVisible() {
        element(elevenOfTwelveFieldsCounter).shouldBeVisible();
    }

    public void checkTwelveFieldsCounterIsVisible() {
        element(twelveOfTwelveFieldsCounter).shouldBeVisible();
    }

    public void selectContractDateSuboption() {
        element(unselectedContractDateOption).click();
    }

    public void checkUnselectedContractDateSuboptionIsVisible() {
        element(unselectedContractDateOption).shouldBeVisible();
    }

    public void checkUnselectedCCMaintIsVisible() {
        element(unselectedCcMaintSuboption).shouldBeVisible();
    }

    public void checkUnselectedRETaxedIsVisible() {
        element(unselectedReTaxesSuboption).shouldBeVisible();
    }

    public void swipeToPortrait() {
        swipeUpElementIOS(unselectedPortraitButton, 500);
        waitABit(10000);
    }

    public void checkCCMaintIsNotPresented() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(ccMaintSuboption).shouldNotBePresent();
        resetImplicitTimeout();
    }

    public void checkRETaxedIsNotPresented() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(reTaxesSuboption).shouldNotBePresent();
        resetImplicitTimeout();
    }

    public void checkTotalMonthliesIsNotPresented() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(totalMonthliesSuboption).shouldNotBePresent();
        resetImplicitTimeout();
    }

    public void selectPerchwellLinkOption() {
        element(unselectedPerchwellLinkOption).click();
    }

    public void checkExternalPageOptionUnselected() {
        element(unselectedExternalPageOption).shouldBeVisible();
    }

    public void checkPerchwellLinkOptionSelected() {
        element(selectedPerchwellLinkOption).shouldBeVisible();
    }

    public void deselectBedsSuboption() {
        element(selectedBedsSuboption).click();
    }

    public void checkEightFieldsCounterIsVisible() {
        element(eightOfNiveFieldsCounter).shouldBeVisible();
    }

    public void selectBedsSuboption() {
        element(unselectedBedsSuboption).click();
    }

    public void selectRoomsSuboption() {
        element(unselectedRoomsSuboption).click();
    }

    public void checkUnselectedRoomsSuboptionIsVisible() {
        element(unselectedRoomsSuboption).shouldBeVisible();
    }

    public void checkNineFieldsCounterIsVisible() {
        element(nineOfNineFieldsCounter).shouldBeVisible();
    }

    public void checkDeleteButtonIsNotDisplayed() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(deleteButton).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void clickOnTagsField() {
        element(tagsField).click();
    }

    public void checkFirstListingInActiveSection() {
        checkOneListingAddressBelowSection(activeSection, SessionVariables.getValueFromSessionVariable("reportWizardAddress1"));
    }

    public void checkSecondListingInContractSection() {
        checkOneListingAddressBelowSection(inContractSection, SessionVariables.getValueFromSessionVariable("reportWizardAddress2"));
    }

    public void checkThirdAndFourthListingsInOffMarketSection(String address3, String address4) {
        universalSingleSwipe();

        WebElement listingCell;
        WebElement listingCell2;

        listingCell = element(MobileBy.AccessibilityId(address3));
        listingCell2 = element(MobileBy.AccessibilityId(address4));

        System.out.println(getYPositionOfElement(offMarketSection));
        System.out.println(getYPositionOfElement(listingCell));
        System.out.println(getYPositionOfElement(listingCell2));

        Assert.assertEquals(getYPositionOfElement(offMarketSection) + 144, getYPositionOfElement(listingCell));
        Assert.assertEquals(getYPositionOfElement(offMarketSection) + 51, getYPositionOfElement(listingCell2));
    }

    public void checkFifthListingInSoldSection() {
        universalSingleSwipe();
        checkOneListingAddressBelowSection(soldSection, SessionVariables.getValueFromSessionVariable("reportWizardAddress5"));
    }

    private void checkOneListingAddressBelowSection(WebElement section, String address) {
        WebElement listingCell;
        listingCell = element(MobileBy.AccessibilityId(address));
        Assert.assertEquals(getYPositionOfElement(section) + 51, getYPositionOfElement(listingCell));
    }
}
