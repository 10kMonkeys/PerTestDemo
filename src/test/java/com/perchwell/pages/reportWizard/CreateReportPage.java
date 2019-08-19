package com.perchwell.pages.reportWizard;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.CurrentYear;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class CreateReportPage extends TechHelper {

    public static List<String> orderListing = new ArrayList<>();

    @AndroidFindBy(accessibility = "CMA")
    @iOSXCUITFindBy(accessibility = "CMA")
    private WebElement cmaButton;

    @AndroidFindBy(accessibility = "Extended CMA")
    @iOSXCUITFindBy(accessibility = "Extended CMA")
    private WebElement extendedCmaButton;

    @AndroidFindBy(accessibility = "Listing Report")
    @iOSXCUITFindBy(accessibility = "Listing Report")
    private WebElement listingReportButton;

    @AndroidFindBy(accessibility = "Show Sheet")
    @iOSXCUITFindBy(accessibility = "Show Sheet")
    private WebElement showSheetButton;

    @AndroidFindBy(accessibility = "Export To Excel")
    @iOSXCUITFindBy(accessibility = "Export To Excel")
    private WebElement exportToExcelButton;

    @AndroidFindBy(accessibility = "Itinerary")
    @iOSXCUITFindBy(accessibility = "Itinerary")
    private WebElement itineraryButton;

    @AndroidFindBy(accessibility = "Media Report")
    @iOSXCUITFindBy(accessibility = "Media Report")
    private WebElement mediaReportButton;

    @AndroidFindBy(accessibility = "Short")
    @iOSXCUITFindBy(accessibility = "Short")
    private WebElement shortButton;

    @AndroidFindBy(accessibility = "Medium")
    @iOSXCUITFindBy(accessibility = "Medium")
    private WebElement mediumButton;

    @AndroidFindBy(accessibility = "Default")
    @iOSXCUITFindBy(accessibility = "Default")
    private WebElement defaultButton;

    @AndroidFindBy(accessibility = "Default (Includes Buildings)")
    @iOSXCUITFindBy(accessibility = "Default (Includes Buildings)")
    private WebElement defaultIncludesBuildingButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
    @iOSXCUITFindBy(accessibility = "iconChevronLeft")
    private WebElement backButton;

    @AndroidFindBy(accessibility = "Detailed ")
    @iOSXCUITFindBy(accessibility = "Detailed ")
    private WebElement detailedButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/action_button")
    @iOSXCUITFindBy(accessibility = "Next")
    private WebElement nextButton;

    @AndroidFindBy(accessibility = "Email textField color:#ea6656")
    @iOSXCUITFindBy(accessibility = "Tag Cell: Search Text Field")
    private WebElement emailField;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/email_report")
    @iOSXCUITFindBy(accessibility = "EMAIL REPORT")
    private WebElement emailReportButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='tag color: #37d2be']/android.widget.TextView")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$value == 'tag color: #37d2be'$]")
    private WebElement emailPill;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@content-desc, 'Subject textField ')]")
    @iOSXCUITFindBy(accessibility = "Subject textField")
    private WebElement subjectField;

    @iOSXCUITFindBy(accessibility = "Return")
    private WebElement returnButtonOnKeyboard;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'REPORT SUCCESSFULLY SENT')]")
    @iOSXCUITFindBy(accessibility = "REPORT SUCCESSFULLY SENT")
    private WebElement emailReportPopUp;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/negative_button")
    @iOSXCUITFindBy(accessibility = "EXIT")
    private WebElement popUpExitButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/positive_button")
    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement popUpOkButton;

    @AndroidFindBy(accessibility = "Message textField color:#606060")
    @iOSXCUITFindBy(accessibility = "textView")
    private WebElement messageField;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/edit_text")
    private WebElement messageFieldExpanded;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/shrink_button")
    @iOSXCUITFindBy(accessibility = "shrink")
    private WebElement shrinkButton;

    @AndroidFindBy(accessibility = "RemoveButton")
    @iOSXCUITFindBy(iOSNsPredicate = "name = 'Remove Button:'")
    private WebElement removeBubble;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'STUDIO']")
    @iOSXCUITFindBy(accessibility = "STUDIO")
    private WebElement studioBedroom;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/sqft")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value CONTAINS 'FT2'")
    private WebElement squareFeetLabel;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/listing_price")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value CONTAINS '$'")
    private WebElement priceLabel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = '1½ BA']")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value CONTAINS '1½'")
    private WebElement oneAndHalfBathroomLabel;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/foreground_layout")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell")
    private List<WebElement> listingsList;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/listing_address")
    private List<WebElement> addressList;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/delete_button")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'cross16' AND visible == 1")
    private WebElement deleteButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/dragger_icon")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'iosReorder'")
    private List<WebElement> reorderButtonList;

    @AndroidFindBy(accessibility = "Sales")
    @iOSXCUITFindBy(accessibility = "Sales")
    private WebElement salesButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/plus_button")
    @iOSXCUITFindBy(accessibility = "addTag")
    private WebElement subjectPropertyButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/remove_icon")
    @iOSXCUITFindBy(accessibility = "Remove Button: TAGNAMEREPORTWIZARD")
    private WebElement reportWizardDeleteButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/listing_address")
    private WebElement addressPlaceholder;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/listing_unit")
    private WebElement unitPlaceholder;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/listing_price")
    private WebElement pricePlaceholder;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/listing_type")
    private WebElement propertyTypePlaceholder;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/beds")
    private WebElement bedroomsPlaceholder;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/baths")
    private WebElement bathroomsPlaceholder;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/sqft")
    private WebElement sqrFootagePlaceholder;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc='Subject Property Cell']")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[1]")
    private WebElement subjectPropertyCell;

    @AndroidFindBy(accessibility = "Rentals")
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

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Report Label-'")
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

    @iOSXCUITFindBy(accessibility = "(10/11)")
    private WebElement tenOfElevenCounter;

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

    @iOSXCUITFindBy(accessibility = " Suboption Selected: DOM")
    private WebElement selectedDOMSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption: DOM")
    private WebElement unselectedDOMSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption Selected: List Date")
    private WebElement selectedListDateSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption: List Date")
    private WebElement unselectedListDateSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption Selected: Subway Info")
    private WebElement selectedSubwayInfoSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption: Subway Info")
    private WebElement unselectedSubwayInfoSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption Selected: Include Map")
    private WebElement selectedIncludeMapSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption: Include Map")
    private WebElement unselectedIncludeMapSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption Selected: Floorplan")
    private WebElement selectedFloorplanSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption: Floorplan")
    private WebElement unselectedFloorplanSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption: Floor Plans")
    private WebElement unselectedFloorplansSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption: Include Exact Address")
    private WebElement unselectedIncludeExactAddressSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption Selected: Open House")
    private WebElement selectedOpenHouseSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption: Open House")
    private WebElement unselectedOpenHouseOption;

    @iOSXCUITFindBy(accessibility = " Suboption Selected: Neighborhood")
    private WebElement selectedNeighborhoodSuboption;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Suboption:'")
    private List<WebElement> unselectedSuboptions;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/tags_container")
    @iOSXCUITFindBy(accessibility = "Add Listings From Tags")
    private WebElement tagsField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'ACTIVE']")
    @iOSXCUITFindBy(accessibility = "ACTIVE")
    private WebElement activeSection;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'IN CONTRACT']")
    @iOSXCUITFindBy(accessibility = "IN CONTRACT")
    private WebElement inContractSection;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'OFF MARKET']")
    @iOSXCUITFindBy(accessibility = "OFF MARKET")
    private WebElement offMarketSection;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'SOLD']")
    @iOSXCUITFindBy(accessibility = "SOLD")
    private WebElement soldSection;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'RENTED']")
    @iOSXCUITFindBy(accessibility = "RENTED")
    private WebElement rentedSection;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'LISTINGS']")
    @iOSXCUITFindBy(accessibility = "LISTINGS")
    private WebElement listingSection;

    @iOSXCUITFindBy(accessibility = " Suboption Selected: Include Exact Address")
    private WebElement selectedIncludeExactAddressOption;

    @iOSXCUITFindBy(accessibility = " Suboption: Listing Agent Info")
    private WebElement unselectedListingAgentInfoOption;

    @iOSXCUITFindBy(accessibility = " Suboption: Listing Agent/Commission")
    private WebElement unselectedListingAgentCommission;

    @iOSXCUITFindBy(accessibility = "textView")
    private WebElement descriptionField;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Appointment Date-'")
    private WebElement appointmentDateField;

    @iOSXCUITFindBy(accessibility = "chevronRight")
    private WebElement nextMonthButton;

    @iOSXCUITFindBy(accessibility = "SELECT A DATE")
    private WebElement calendarLabel;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Appointment Time-'")
    private WebElement appointmentTimeField;

    @iOSXCUITFindBy(iOSNsPredicate = "value CONTAINS 'o’clock'")
    private WebElement hourWheel;

    @iOSXCUITFindBy(iOSNsPredicate = "value CONTAINS 'minutes'")
    private WebElement minuteWheel;

    @iOSXCUITFindBy(iOSNsPredicate = "value CONTAINS 'AM' OR value CONTAINS 'PM' AND visible == 1")
    private WebElement meridiemWheel;

    @iOSXCUITFindBy(accessibility = "refresh14")
    private WebElement revertIcon;

    @iOSXCUITFindBy(accessibility = "Save")
    private WebElement saveButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[$name='edit'$][1]")
    private WebElement floorplanEditIcon;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[$name='edit'$][2]")
    private WebElement photosEditIcon;

    @iOSXCUITFindBy(accessibility = "Done")
    private WebElement doneButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[$name=='edit'$][1]")
    private WebElement floorplanEditButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[$name=='edit'$][2]")
    private WebElement photosEditButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name=='1'$]")
    private WebElement selectedOneLabel;

    @iOSXCUITFindBy(accessibility = "1/1")
    private WebElement oneAndOneSelectedLabel;

    @iOSXCUITFindBy(accessibility = "0/1")
    private WebElement zeroPerOneLabel;

    @iOSXCUITFindBy(accessibility = "4/4")
    private WebElement fourPerFourLabel;

    @iOSXCUITFindBy(accessibility = "0/4")
    private WebElement zeroPerFourSelectedLabel;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
    private WebElement firstFloorplan;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name=='1'$]")
    private WebElement firstPhotoSelectedLabel;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name=='2'$]")
    private WebElement secondPhotoSelectedLabel;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name=='3'$]")
    private WebElement thirdPhotoSelectedLabel;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name=='4'$]")
    private WebElement fourthPhotoSelectedLabel;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell[5]/XCUIElementTypeOther/XCUIElementTypeStaticText[$name=='5'$]")
    private WebElement fifthPhotoSelectedLabel;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell")
    private List<WebElement> photosList;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeStaticText")
    private List<WebElement> selectedPhotosList;

    @iOSXCUITFindBy(accessibility = "BUILDINGS")
    private WebElement buildingSection;

    @iOSXCUITFindBy(accessibility = "delete")
    private WebElement keyboardDeleteButton;

    @iOSXCUITFindBy(accessibility = "Comments")
    private WebElement commentsField;

    @iOSXCUITFindBy(accessibility = " Suboption: Photos")
    private WebElement unselectedPhotosSuboption;

    @iOSXCUITFindBy(accessibility = " Suboption: Internal Information")
    private WebElement unselectedInternalInformationOption;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'edit' AND visible == true")
    private WebElement editButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeStaticText")
    private WebElement currentYear;

    @iOSXCUITFindBy(accessibility = "chevronLeft")
    private WebElement previousMonthButton;

    @iOSXCUITFindBy(accessibility = "x")
    private WebElement closeButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Start Time-'")
    private WebElement startTimeField;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'End Time-'")
    private WebElement endTimeField;

    @iOSXCUITFindBy(accessibility = "Meeting Location textField")
    private WebElement meetingLocationField;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Prepared For-'")
    private WebElement preparedForField;

    @iOSXCUITFindBy(accessibility = " Suboption: Brokerage")
    private WebElement unselectedBrokerageOption;

    @iOSXCUITFindBy(accessibility = " Suboption: Agent Name")
    private WebElement unselectedAgentNameOption;

    @iOSXCUITFindBy(accessibility = " Suboption: Agent Phone Number")
    private WebElement unselectedAgentPhoneNumberOption;

    @iOSXCUITFindBy(accessibility = " Suboption: Large Map")
    private WebElement unselectedLargeMapOption;

    @iOSXCUITFindBy(accessibility = " Suboption: Neighborhood")
    private WebElement unselectedNeightborhoodOption;

    @iOSXCUITFindBy(accessibility = " Suboption: Include Cross Streets")
    private WebElement unselectedIncludeCrossStreetsOption;

    @iOSXCUITFindBy(accessibility = " Suboption Selected: Transit Info")
    private WebElement selectedTransitInfoSuboption;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther/*[2]/*/*[2]/*[2]/*/XCUIElementTypeStaticText[1]")
    private WebElement amountPhotosSelected;

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
        if (Config.isAndroid()) {
            element(emailField).click();
            element(emailField).sendKeys(email);
            hideKeyboard();
            SessionVariables.addValueInSessionVariable("emailAddress", email);
        } else {
            element(emailField).sendKeys(email);
            SessionVariables.addValueInSessionVariable("emailAddress", email);
        }
    }

    public void checkEmailReportButtonIsDisabled() {
        element(emailReportButton).shouldNotBeEnabled();
    }

    public void checkEmailReportButtonIsEnabled() {
        element(emailReportButton).shouldBeEnabled();
    }

    public void fillSubjectField(String message) {
        element(subjectField).sendKeys(message);
        SessionVariables.addValueInSessionVariable("Report_subject", message);
    }

    public void clickOnReturnButtonOnKeyboard() {
        if (!Config.isAndroid()) {
            element(returnButtonOnKeyboard).click();
        }
    }

    public void clearEmailField() {
        element(emailField).clear();
    }

    public void checkEmailFieldValueIsShownAsText() {
        if (Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("emailAddress"), element(emailField).getAttribute("text"));
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("emailAddress"), element(emailField).getAttribute("value"));
        }
    }

    public void checkEmailFieldIsShownAsGreenPill() {
        if (Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("emailAddress"), element(emailPill).getAttribute("text"));
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("emailAddress"), element(emailPill).getAttribute("name"));
        }
    }

    public void fillInMessageField(String message) {
        if (Config.isAndroid()) {
            element(messageField).click();
            element(messageFieldExpanded).sendKeys(message);
            hideKeyboard();
            SessionVariables.addValueInSessionVariable("Report_message", message);
        } else {
            element(messageField).sendKeys(message);
            SessionVariables.addValueInSessionVariable("Report_message", message);
        }
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
        if (Config.isAndroid()) {
            Assert.assertEquals(element(subjectField).getText(), SessionVariables.getValueFromSessionVariable("Report_subject"));
        } else {
            Assert.assertEquals(element(subjectField).getText(), SessionVariables.getValueFromSessionVariable("Report_subject"));
        }
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
        if (Config.isAndroid()) {
            element(MobileBy.xpath("//android.widget.TextView[@text = '" + property + "']")).shouldBeVisible();
        } else {
            element(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value = '" + property + "'")).shouldBeVisible();
        }
    }

    public void checkStudioIsDisplayed() {
        element(studioBedroom).shouldBeVisible();
    }

    public void checkSquareFeetValueWithoutApproxLabel() {
        if (Config.isAndroid()) {
            Assert.assertEquals(element(squareFeetLabel).getText().replaceAll("[, FT2]", ""), SessionVariables.getValueFromSessionVariable("sqrFootageValue"));
        } else {
            Assert.assertEquals(element(squareFeetLabel).getValue().replaceAll("[, FT2]", ""), SessionVariables.getValueFromSessionVariable("sqrFootageValue"));
        }
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
        if (Config.isAndroid()) {
            element(MobileBy.xpath("//android.widget.TextView[@text = '" + SessionVariables.getValueFromSessionVariable("openHouseDate") + "']")).shouldBeVisible();
        } else {
            element(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value = '" + SessionVariables.getValueFromSessionVariable("openHouseDate") + "'")).shouldBeVisible();
        }
    }

    public void swipeLeftByAddress(String address) {
        WebElement listingAddress;
        if (Config.isAndroid()) {
            listingAddress = element(MobileBy.xpath("//android.widget.TextView[@text = '" + address + "']"));
        } else {
            listingAddress = element(MobileBy.iOSNsPredicateString("value == '" + address + "' AND visible == true"));
        }
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
        setImplicitTimeout(3, TimeUnit.SECONDS);
        if (Config.isAndroid()) {
            element(MobileBy.xpath("//android.widget.TextView[@text = '" + SessionVariables.getValueFromSessionVariable("listingAddress1") + "']")).shouldNotBeVisible();
        } else {
            element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("listingAddress1"))).shouldNotBePresent();
        }
        resetImplicitTimeout();
    }

    public void checkFirstBuildingIsDeleted() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        if (Config.isAndroid()) {
            element(MobileBy.xpath("//android.widget.TextView[@text = '" + SessionVariables.getValueFromSessionVariable("buildingAddress1") + "']")).shouldNotBeVisible();
        } else {
            element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("buildingAddress1"))).shouldNotBePresent();
        }
        resetImplicitTimeout();
    }

    public void moveFirstBuildingToSecondBuildingByDragging() {
        int longPressX;
        int longPressY;
        int moveToX;
        int moveToY;

        if (Config.isAndroid()) {
            universalSingleSwipe();
            longPressX = reorderButtonList.get(2).getLocation().getX();
            longPressY = reorderButtonList.get(2).getLocation().getY();
            moveToX = reorderButtonList.get(3).getLocation().getX();
            moveToY = reorderButtonList.get(3).getLocation().getY();
        } else {
            longPressX = reorderButtonList.get(4).getLocation().getX();
            longPressY = reorderButtonList.get(4).getLocation().getY();
            moveToX = reorderButtonList.get(5).getLocation().getX();
            moveToY = reorderButtonList.get(5).getLocation().getY();

            universalVerticalSwipe(reorderButtonList.get(5));
        }

        reorderListingByDraggingAtCreateReportPage(longPressX, longPressY, moveToX, moveToY);
    }

    public void getListingsAndBuildingsOrder() {
        if (Config.isAndroid()) {
            if (listingsList.size() > 3) {
                for (int i = 0; i < listingsList.size(); i++) {
                    if (i == 3) {
                        universalSingleSwipe();
                        universalSingleSwipe();
                        for (i = 0; i < addressList.size(); i++) {
                            orderListing.add(addressList.get(i).getText());
                        }
                    } else {
                        orderListing.add(addressList.get(i).getText());
                    }
                }
            } else {
                for (WebElement address : addressList) {
                    orderListing.add(address.getText());
                }
            }
        } else {
            for (int i = 0; i < listingsList.size(); i++) {
                orderListing.add(element(MobileBy.iOSClassChain("**/XCUIElementTypeCell[" + (i + 1) + "]/*/*/*[1]/*[2]/*/*/*[1]/*/XCUIElementTypeStaticText[1]")).getValue());
            }
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
        element(bathroomsPlaceholder).shouldBeVisible();
    }

    public void checkSqrFootagePlaceholderIsShown() {
        element(sqrFootagePlaceholder).shouldBeVisible();
    }

    public void clickOnSubjectPropertyCell() {
        element(subjectPropertyCell).click();
    }

    public void checkAddressPlaceholderWithValue() {
        if (Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("addressValue"), element(addressPlaceholder).getText());
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("addressValue"), element(addressPlaceholder).getValue());
        }

    }

    public void checkUnitPlaceholderWithValue() {
        if (Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("unitValue"), element(unitPlaceholder).getText());
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("unitValue"), element(unitPlaceholder).getValue());
        }
    }

    public void checkPricePlaceholderWithValue() {
        if (Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("priceValue"), element(pricePlaceholder).getText().replaceAll("[$,/MO]", ""));
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("priceValue"), element(pricePlaceholder).getValue().replaceAll("[$,/MO]", ""));
        }
    }

    public void checkPropertyTypePlaceholderWithValue() {
        if (Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("propertyTypeValue"), element(propertyTypePlaceholder).getText().replace(" Rental", ""));
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("propertyTypeValue"), element(propertyTypePlaceholder).getValue().replace(" Rental", ""));
        }
    }

    public void checkBedroomsPlaceholderWithValue() {
        if (Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("bedsValue") + " BD", element(bedroomsPlaceholder).getText());
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("bedsValue") + " BD", element(bedroomsPlaceholder).getValue());
        }
    }

    public void checkBathroomsPlaceholderWithValue() {
        if (Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("bathsValue").replace(".5", "½") + " BA", element(bathroomsPlaceholder).getText());
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("bathsValue").replace(".5", "½") + " BA", element(bathroomsPlaceholder).getValue());
        }
    }

    public void checkSqrFootagePlaceholderWithValue() {
        if (Config.isAndroid()) {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("sqrFootageValue"), element(sqrFootagePlaceholder).getText().replaceAll("[Aprox., FT2]", ""));
        } else {
            Assert.assertEquals(SessionVariables.getValueFromSessionVariable("sqrFootageValue"), element(sqrFootagePlaceholder).getValue().replaceAll("[Aprox., FT2]", ""));
        }
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
        Assert.assertEquals(amount, subOptions.size());
    }

    public void checkUnselectedCCMaintenanceSubpoptionIsVisible() {
        element(unselectedCcMaintSuboption).shouldBeVisible();
    }

    public void checkUnselectedRETaxedSuboptionIsVisible() {
        element(unselectedReTaxesSuboption).shouldBeVisible();
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
        universalVerticalSwipe(unselectedPerchwellLinkOption);
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

        if (Config.isAndroid()) {
            listingCell = element(MobileBy.xpath("//android.widget.TextView[@text = '" + address3 + "']"));
            listingCell2 = element(MobileBy.xpath("//android.widget.TextView[@text = '" + address4 + "']"));

            Assert.assertEquals(getYPositionOfElement(offMarketSection) + 566, getYPositionOfElement(listingCell));
            Assert.assertEquals(getYPositionOfElement(offMarketSection) + 241, getYPositionOfElement(listingCell2));
        } else {
            listingCell = element(MobileBy.AccessibilityId(address3));
            listingCell2 = element(MobileBy.AccessibilityId(address4));

            Assert.assertEquals(getYPositionOfElement(offMarketSection) + 144, getYPositionOfElement(listingCell));
            Assert.assertEquals(getYPositionOfElement(offMarketSection) + 51, getYPositionOfElement(listingCell2));
        }
    }

    public void checkFifthListingInSoldSection() {
        universalSingleSwipe();
        checkOneListingAddressBelowSection(soldSection, SessionVariables.getValueFromSessionVariable("reportWizardAddress5"));
    }

    private void checkOneListingAddressBelowSection(WebElement section, String address) {
        WebElement listingCell;
        if (Config.isAndroid()) {
            listingCell = element(MobileBy.xpath("//android.widget.TextView[@text = '" + address + "']"));
            Assert.assertEquals(getYPositionOfElement(section) + 241, getYPositionOfElement(listingCell));
        } else {
            listingCell = element(MobileBy.AccessibilityId(address));
            Assert.assertEquals(getYPositionOfElement(section) + 51, getYPositionOfElement(listingCell));
        }
    }

    private void checkOneListingAddressIsNotShown(String address) {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        WebElement listingCell;
        if (Config.isAndroid()) {
            listingCell = element(MobileBy.xpath("//android.widget.TextView[@text = '" + address + "']"));
        } else {
            listingCell = element(MobileBy.AccessibilityId(address));
        }
        element(listingCell).shouldNotBePresent();
        resetImplicitTimeout();
    }


    public void checkBathroomsIsHidden() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(bathroomsPlaceholder).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void checkEighthListingInActiveSection() {
        checkOneListingAddressBelowSection(activeSection, SessionVariables.getValueFromSessionVariable("reportWizardAddress8"));
    }

    public void checkNinthListingInRentedSection() {
        checkOneListingAddressBelowSection(rentedSection, SessionVariables.getValueFromSessionVariable("reportWizardAddress9"));
    }

    public void checkSixPerEightListingIsNotShown() {
        checkOneListingAddressIsNotShown(SessionVariables.getValueFromSessionVariable("reportWizardAddress6"));
        checkOneListingAddressIsNotShown(SessionVariables.getValueFromSessionVariable("reportWizardAddress7"));
        checkOneListingAddressIsNotShown(SessionVariables.getValueFromSessionVariable("reportWizardAddress8"));
    }

    public void checkBuildingIsNotShown() {
        checkOneListingAddressIsNotShown(SessionVariables.getValueFromSessionVariable("reportWizardAddress10"));
    }

    private void checkOneListingAddressIsShown(String address) {
        WebElement listingCell;
        if (Config.isAndroid()) {
            listingCell = element(MobileBy.xpath("//android.widget.TextView[@text = '" + address + "']"));
        } else {
            listingCell = element(MobileBy.AccessibilityId(address));
        }

        element(listingCell).shouldBePresent();
    }

    public void checkEightAndNineListingsIsShown() {
        checkOneListingAddressIsShown(SessionVariables.getValueFromSessionVariable("reportWizardAddress8"));
        checkOneListingAddressIsShown(SessionVariables.getValueFromSessionVariable("reportWizardAddress9"));
    }

    public void checkRentalSectionIsShown() {
        element(rentedSection).shouldBeVisible();
    }

    public void checkFirstListingIsShown() {
        checkOneListingAddressIsShown(SessionVariables.getValueFromSessionVariable("reportWizardAddress1"));
    }

    public void deleteReportWizardTag() {
        element(reportWizardDeleteButton).click();
    }

    public void checkFirstAddressInActiveSectionAfterFirstListing(String address) {
        WebElement listingCell;

        if (Config.isAndroid()) {
            listingCell = element(MobileBy.xpath("//android.widget.TextView[@text = '" + address + "']"));
            Assert.assertEquals(getYPositionOfElement(activeSection) + 566, getYPositionOfElement(listingCell));
        } else {
            listingCell = element(MobileBy.AccessibilityId(address));
            Assert.assertEquals(getYPositionOfElement(activeSection) + 144, getYPositionOfElement(listingCell));
        }
    }

    public void checkListingsAmount(int amount) {
        Assert.assertEquals(amount, listingsList.size());
    }

    public void checkUnitForListing() {
        String unit = element(addressPlaceholder).getValue().substring(element(addressPlaceholder).getValue().indexOf("#"));
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("unitValue"), unit);
    }

    public void openSecondListing() {
        element(listingsList.get(1)).click();
    }

    public void clickOnExtendedCMAButton() {
        element(extendedCmaButton).click();
    }

    public void checkFirstListingIsShownOnce() {
        List<WebElement> firstListing;
        if (Config.isAndroid()) {
            firstListing = getDriver().findElements(MobileBy.xpath("//android.widget.TextView[@text = '" + SessionVariables.getValueFromSessionVariable("reportWizardAddress1") + "']"));
        } else {
            firstListing = getDriver().findElements(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("reportWizardAddress1")));
        }
        Assert.assertEquals(firstListing.size(), 1);
    }

    public void checkRentalListingIsShownOnce() {
        List<WebElement> rentalListing;
        if (Config.isAndroid()) {
            rentalListing = getDriver().findElements(MobileBy.xpath("//android.widget.TextView[@text = '" + SessionVariables.getValueFromSessionVariable("rentalListing") + "']"));
        } else {
            rentalListing = getDriver().findElements(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("rentalListing")));
        }
        Assert.assertEquals(rentalListing.size(), 1);
    }

    public void fillInReportLabelField(int length) {
        String message = StringUtils.repeat("a", length);
        waitFor(reportLabelTextField).shouldBeVisible();
        element(reportLabelTextField).sendKeys(message);
        hideKeyboard();
    }

    public void checkOnlySeventySymbolsAllowed() {
        Assert.assertEquals(70, element(reportLabelTextField).getAttribute("value").length());
    }

    public void checkFirstAndSecondListingsInListingsSection(String address1, String address2) {
        WebElement listingCell;
        WebElement listingCell2;

        listingCell = element(MobileBy.AccessibilityId(address1));
        listingCell2 = element(MobileBy.AccessibilityId(address2));

        System.out.println(getYPositionOfElement(listingSection));
        System.out.println(getYPositionOfElement(listingCell));
        System.out.println(getYPositionOfElement(listingCell2));

        Assert.assertEquals(getYPositionOfElement(listingSection) + 144, getYPositionOfElement(listingCell));
        Assert.assertEquals(getYPositionOfElement(listingSection) + 166, getYPositionOfElement(listingCell2));
    }

    public void checkThirdListingIsNotShown() {
        checkOneListingAddressIsNotShown(SessionVariables.getValueFromSessionVariable("reportWizardAddress3"));
    }

    public void checkIncludeExactAddressOptionIsSelected() {
        element(selectedIncludeExactAddressOption).shouldBeVisible();
    }

    public void checkListingAgentInfoOptionIsUnselected() {
        element(unselectedListingAgentInfoOption).shouldBeVisible();
    }

    public void selectListingAgentInfoOption() {
        element(unselectedListingAgentInfoOption).click();
    }

    public void deselectIncludeExactAddressOption() {
        element(selectedIncludeExactAddressOption).click();
    }

    public void clearSubjectField() {
        element(subjectField).clear();
    }

    public void fillInDescriptionField(String description) {
        element(descriptionField).sendKeys(description);
    }

    public void clickOnAppointmentDate() {
        element(appointmentDateField).click();
    }

    public void checkTodayMonthAndYearCalendarAreShown() {
        waitABit(2000);
        DateFormat month = new SimpleDateFormat("MMMM");
        DateFormat year = new SimpleDateFormat("YYYY");

        element(MobileBy.AccessibilityId(month.format(new Date()).toUpperCase())).shouldBeVisible();
        element(MobileBy.AccessibilityId(" " + year.format(new Date()) + " ")).shouldBeVisible();
    }

    public void setDateForNextMonth(String date) {
        element(nextMonthButton).click();
        element(MobileBy.AccessibilityId(date)).click();
        SessionVariables.addValueInSessionVariable("selectedDay", date);
    }

    public void checkCalendarIsClosed() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(calendarLabel).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void checkSelectedDateIsShown() {
        DateFormat monthFormat = new SimpleDateFormat("MM");
        DateFormat yearFormat = new SimpleDateFormat("YYYY");
        String selectedMonth;
        int nextMonth = Integer.parseInt(monthFormat.format(new Date())) + 1;
        int currentYear = Integer.parseInt(yearFormat.format(new Date()));

        if (String.valueOf(nextMonth).length() < 2)
            selectedMonth = "0" + nextMonth;
        else if (nextMonth == 13) {
            selectedMonth = "01";
            currentYear += 1;
        } else
            selectedMonth = String.valueOf(nextMonth);

        String selectedDate = selectedMonth + "/"
                + SessionVariables.getValueFromSessionVariable("selectedDay")
                + "/" + currentYear;

        Assert.assertEquals(selectedDate, element(appointmentDateField).getValue());
    }

    public void checkTodayDateIsSelected() {
        //TODO: need to implement, cause selected date doesn't differ from non-selected date
    }

    public void clickOnAppointmentTime() {
        element(appointmentTimeField).click();
    }

    public void changeTime() {
        swipeDownDateWheel(hourWheel);
        SessionVariables.addValueInSessionVariable("hourWheelValue", element(hourWheel).getValue());
        swipeDownDateWheel(minuteWheel);
        SessionVariables.addValueInSessionVariable("minuteWheelValue", element(minuteWheel).getValue());
        swipeDownDateWheel(meridiemWheel);
        SessionVariables.addValueInSessionVariable("meridiemWheelValue", element(meridiemWheel).getValue());
    }

    public void clickOnRevertIcon() {
        element(revertIcon).click();
    }

    public void checkTimeIsReset() {
        Assert.assertEquals("10 o’clock", element(hourWheel).getValue());
        Assert.assertEquals("00 minutes", element(minuteWheel).getValue());
        Assert.assertEquals("AM", element(meridiemWheel).getValue());
    }

    public void clickOnSaveButton() {
        element(saveButton).click();
    }

    public void checkTimeSelectorIsShown() {
        element(hourWheel).shouldBeVisible();
        element(minuteWheel).shouldBeVisible();
        element(meridiemWheel).shouldBeVisible();
    }

    public void checkSelectedTimeIsShown() {
        Assert.assertEquals(getSelectedTimeToString(), element(appointmentTimeField).getValue());
    }

    public void clickOnFloorplanEditIcon() {
        element(floorplanEditIcon).click();
    }

    public void clickOnPhotosEditIcon() {
        element(photosEditIcon).click();
    }

    public void clearDescriptionField() {
        element(descriptionField).clear();
    }

    public void clickOnShowSheetButton() {
        element(showSheetButton).click();
    }

    public void checkDomSuboptionSelected() {
        element(selectedDOMSuboption).shouldBeVisible();
    }

    public void checkListDateSuboptionSelected() {
        element(selectedListDateSuboption).shouldBeVisible();
    }

    public void checkSubwayInfoSuboptionSelected() {
        element(selectedSubwayInfoSuboption).shouldBeVisible();
    }

    public void checkIncludeMapSuboptionSelected() {
        element(selectedIncludeMapSuboption).shouldBeVisible();
    }

    public void checkFloorplanSuboptionSelected() {
        element(selectedFloorplanSuboption).shouldBeVisible();
    }

    public void checkOpenHouseSuboptionSelected() {
        element(selectedOpenHouseSuboption).shouldBeVisible();
    }

    public void checkNeighborhoodSuboptionSelected() {
        element(selectedNeighborhoodSuboption).shouldBeVisible();
    }

    public void deselectAllOptions() {
        for (WebElement subOption : subOptions) {
            element(subOption).click();
        }
    }

    public void checkAllOptionsDeselected() {
        Assert.assertEquals(9, unselectedSuboptions.size());
    }

    public void selectAllOptions() {
        for (WebElement i : unselectedSuboptions) {
            element(i).click();
        }
    }

    public void checkAllOptionsAreSelected(int amount) {
        Assert.assertEquals(amount, subOptions.size());
    }

    public void checkNextButtonIsDisabled() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(nextButton).shouldNotBeEnabled();
        resetImplicitTimeout();
    }

    public void clickOnDescriptionField() {
        element(descriptionField).click();
    }

    public void clickOnDoneButton() {
        element(doneButton).click();
    }

    public void checkOnePerOneSelectedLabelIsShown() {
        element(oneAndOneSelectedLabel).shouldBeVisible();
    }

    public void checkOneIsShownOnFirstFloorplan() {
        element(selectedOneLabel).shouldBeVisible();
    }

    public void clickOnFirstFloorplan() {
        element(firstFloorplan).click();
    }

    public void checkZeroPerOneSelectedLabelIsShown() {
        element(zeroPerOneLabel).shouldBeVisible();
    }

    public void oneSelectedLabelRemovedFromFirstFloorplan() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(selectedOneLabel).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void checkNextButtonIsEnabled() {
        element(nextButton).shouldBeEnabled();
    }

    public void checkFourPerFourSelectedLabelIsShown() {
        element(fourPerFourLabel).shouldBeVisible();
    }

    public void checkFirstPhotoSelected() {
        element(firstPhotoSelectedLabel).shouldBeVisible();
    }

    public void checkSecondPhotoSelected() {
        element(secondPhotoSelectedLabel).shouldBeVisible();
    }

    public void checkThirdPhotoSelected() {
        element(thirdPhotoSelectedLabel).shouldBeVisible();
    }

    public void checkFourthPhotoSelected() {
        element(fourthPhotoSelectedLabel).shouldBeVisible();
    }

    public void selectFithPhoto() {
        element(photosList.get(5)).click();
    }

    public void checkFifthPhotoIsNotSelected() {
        setImplicitTimeout(3, TimeUnit.SECONDS);
        element(fifthPhotoSelectedLabel).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void deselectAllPhotos() {
        for (WebElement i : selectedPhotosList) {
            element(i).click();
        }
    }

    public void zeroPerFourSelectedLabelIsShown() {
        element(zeroPerFourSelectedLabel).shouldBeVisible();
    }

    public void checkPhotosRemovedFromReportScreen() {
    }

    public void checkListingAgentCommissionIsUnselected() {
        element(unselectedListingAgentCommission).shouldBeVisible();
    }

    public void selectListingAgentCommissionOption() {
        element(unselectedListingAgentCommission).click();
    }

    public void clickOnMediumButton() {
        element(mediumButton).click();
    }

    public void clickDefaultIncludesBuildingsButton() {
        element(defaultIncludesBuildingButton).click();
    }

    public void checkBuildingInBuildingsSection() {
        WebElement listingCell;
        listingCell = element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("reportWizardAddress3")));
        Assert.assertEquals(getYPositionOfElement(buildingSection) + 59, getYPositionOfElement(listingCell));
    }

    public void clickOnExportToExcelButton() {
        element(exportToExcelButton).click();
    }

    public void clickOnDetailedButton() {
        element(detailedButton).click();
    }

    public void fillInDescriptionFieldWithCountSymbols(int length) {
        String message = StringUtils.repeat("a", length);
        waitFor(descriptionField).shouldBeVisible();
        element(descriptionField).sendKeys(message);
        hideKeyboard();

    }

    public void removeOneSymboldFromDescriptionField() {
        element(keyboardDeleteButton).click();
    }

    public void clickOnCommentsField() {
        element(commentsField).click();
    }

    public void fillCommentsField(int length) {

    }

    public void checkBuildingSectionIsNotShown() {
        element(buildingSection).shouldNotBeVisible();
    }

    public void selectPhotosSuboption() {
        element(unselectedPhotosSuboption).click();
    }

    public void switchToFloorplanSuboption() {
        element(unselectedFloorplansSuboption).click();
    }

    public void selectIncludeExactAddressOption() {
        element(unselectedIncludeExactAddressSuboption).click();
    }

    public void moveFirstListingToSecondListingByDragging() {
        int longPressX = reorderButtonList.get(0).getLocation().getX();
        int longPressY = reorderButtonList.get(0).getLocation().getY();
        int moveToX = reorderButtonList.get(1).getLocation().getX();
        int moveToY = reorderButtonList.get(1).getLocation().getY();

        reorderListingByDraggingAtCreateReportPage(longPressX, longPressY, moveToX, moveToY);
    }

    public void checkFirstAndSecondListingsAreReordered() {
        WebElement listingCell;
        WebElement listingCell2;

        listingCell = element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("listingAddress1")));
        listingCell2 = element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("listingAddress2")));

        System.out.println(getYPositionOfElement(listingSection));
        System.out.println(getYPositionOfElement(listingCell));
        System.out.println(getYPositionOfElement(listingCell2));

        waitABit(1000);
        Assert.assertEquals(getYPositionOfElement(listingSection) + 51, getYPositionOfElement(listingCell2));
        Assert.assertEquals(getYPositionOfElement(listingSection) + 144, getYPositionOfElement(listingCell));
    }

    public void selectInternalInformationOption() {
        element(unselectedInternalInformationOption).click();
    }

    public void clickOnItineraryButton() {
        element(itineraryButton).click();
    }

    public void swipeLeftSecondListing() {
        swipeLeftByAddress(SessionVariables.getValueFromSessionVariable("listingAddress2"));
    }

    public void clickOnEditButton() {
        element(editButton).click();
    }

    public void swipeLeftThirdListing() {
        swipeLeftByAddress(SessionVariables.getValueFromSessionVariable("listingAddress3"));
    }

    public void checkAppointmentTimeIsShownForListing() {
        element(MobileBy.AccessibilityId(getSelectedTimeToString())).shouldBeVisible();
    }

    public void swipeLeftFourthListing() {
        swipeLeftByAddress(SessionVariables.getValueFromSessionVariable("listingAddress4"));
    }

    public void checkAppointmentDateFieldIsRed() {
        // TODO: no color diff attributes
    }

    public void clickOnNextYear() {
        int nextYear = CurrentYear.getCurrentYear() + 1;
        element(MobileBy.AccessibilityId(" " + nextYear + " ")).click();
    }

    public void checkYearIsSwitched() {
        int nextYear = CurrentYear.getCurrentYear() + 1;
        Assert.assertEquals(nextYear, Integer.parseInt(element(currentYear).getValue().replace(" ", "")));
    }

    public void clickOnPreviousMonth() {
        element(previousMonthButton).click();
    }

    public void clickOnNextMonth() {
        element(nextMonthButton).click();
    }

    public void checkPreviousMonthIsShown() {
        String month = new DateFormatSymbols().getMonths()[Calendar.getInstance().get(Calendar.MONTH) - 1];

        element(MobileBy.AccessibilityId(month.toUpperCase())).shouldBeVisible();
    }

    public void checkNextMonthIsShown() {
        String month = new DateFormatSymbols().getMonths()[Calendar.getInstance().get(Calendar.MONTH) + 1];

        element(MobileBy.AccessibilityId(month.toUpperCase())).shouldBeVisible();
    }

    public void clickOnCloseButton() {
        element(closeButton).click();
    }

    public void checkAppointmentDateFieldIsEmpty() {
        Assert.assertEquals("Appointment Date", element(appointmentDateField).getValue());
    }

    public void clickOnStartTimeField() {
        element(startTimeField).click();
    }

    public void clickOnEndTimeField() {
        element(endTimeField).click();
    }

    public void checkStartTimeFieldIsFilled() {
        Assert.assertEquals(getSelectedTimeToString(), element(startTimeField).getValue());
    }

    public void checkEndTimeFieldIsFilled() {
        Assert.assertEquals(getSelectedTimeToString(), element(endTimeField).getValue());
    }

    private String getSelectedTimeToString() {
        return SessionVariables.getValueFromSessionVariable("hourWheelValue").replace(" o’clock", "")
                + ":"
                + SessionVariables.getValueFromSessionVariable("minuteWheelValue").replace("minutes", "")
                + SessionVariables.getValueFromSessionVariable("meridiemWheelValue");
    }

    public void fillInMeetingLocationField(String meetingLocation) {
        element(meetingLocationField).sendKeys(meetingLocation);
        hideKeyboard();
    }

    public void fillInPreparedForField(String preparedFor) {
        element(preparedForField).sendKeys(preparedFor);
        hideKeyboard();
    }

    public void selectBrokerageOption() {
        element(unselectedBrokerageOption).click();
    }

    public void selectAgentNameOption() {
        element(unselectedAgentNameOption).click();
    }

    public void selectAgentPhoneNumberOption() {
        element(unselectedAgentPhoneNumberOption).click();
    }

    public void selectOpenHouseOption() {
        element(unselectedOpenHouseOption).click();
    }

    public void selectLargeMapOption() {
        element(unselectedLargeMapOption).click();
    }

    public void selectNeighborhoodOption() {
        element(unselectedNeightborhoodOption).click();
    }

    public void selectIncludeCrossStreetsOption() {
        element(unselectedIncludeCrossStreetsOption).click();
    }

    public void deselectFirstPhoto() {
        element(firstPhotoSelectedLabel).click();
    }

    public void checkPhotosCountIsChanged(int amount) {
        Assert.assertEquals(Integer.parseInt(SessionVariables.getValueFromSessionVariable("amountSelectedPhotos")) + amount,
                Integer.parseInt(element(amountPhotosSelected).getValue()));
    }

    public void moveFirstPhotoToSecondPhotoByDragging() {
        int longPressX = selectedPhotosList.get(0).getLocation().getX();
        int longPressY = selectedPhotosList.get(0).getLocation().getY();
        int moveToX = selectedPhotosList.get(1).getLocation().getX();
        int moveToY = selectedPhotosList.get(1).getLocation().getY();

        reorderListingByDraggingAtCreateReportPage(longPressX, longPressY, moveToX, moveToY);
    }

    public void getAmountSelectedPhotos() {
        SessionVariables.addValueInSessionVariable("amountSelectedPhotos", element(amountPhotosSelected).getValue());
    }

    public void swipeToReportLabelField() {
        singleUpShortSwipeIOS();
    }

    public void checkSelectedCCMaintananceSuboptionIsVisible() {
        element(selectedCcMaintSuboption).shouldBeVisible();
    }

    public void checkTransitInfoSuboptionSelected() {
        element(selectedTransitInfoSuboption).shouldBeVisible();
    }

    public void checkTenOfElevenCounterIsShown() {
        element(tenOfElevenCounter).shouldBeVisible();
    }

    public void checkSuboptionCounterIsEquals(String counter) {
        element(MobileBy.AccessibilityId("(" + counter + ")")).shouldBeVisible();

    }

    public void checkSelectedCCMaintenanceSubpoptionIsVisible() {
        element(selectedCcMaintSuboption).shouldBeVisible();
    }
}
