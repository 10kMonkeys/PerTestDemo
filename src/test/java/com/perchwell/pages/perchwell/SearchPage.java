package com.perchwell.pages.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.TechHelper;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.helpers.SessionVariables;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class SearchPage extends TechHelper {

    public static List<String> listOfBuildingAddresses = new ArrayList<>();
    public static String neighborhoodAndBuilding;

    //region WebElements

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
    private WebElement firstLocation;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton")
    private WebElement deleteFirstLocationButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/show_listings")
    @iOSXCUITFindBy(accessibility = "ApplySearchButton")
    private WebElement applySearchButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton")
    private WebElement deleteSecondLocationButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
    private WebElement itemListView;

    @AndroidFindBy(accessibility = "Bathrooms: 3")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 3")
    private WebElement filterFor3Baths;

    @AndroidFindBy(accessibility = "Bedrooms: 2")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 2")
    private WebElement filterFor2Beds;

    @AndroidFindBy(accessibility = "Bedrooms: Studio")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: Studio")
    private WebElement filterForStudioBeds;

    @iOSXCUITFindBy(accessibility = "BATHS")
    private WebElement baths;

    @iOSXCUITFindBy(accessibility = "Working Fireplace")
    private WebElement fireplaceFilter;

    @AndroidFindBy(accessibility = "LoadSavedSearchesButton")
    @iOSXCUITFindBy(accessibility = "LoadSavedSearchButton")
    private WebElement loadSavedSearchButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/save")
    @iOSXCUITFindBy(accessibility = "SAVE")
    private WebElement searchSavebutton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/rename_group_edit_text")
    @iOSXCUITFindBy(accessibility = "generic_text_input_field")
    private WebElement searchName;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/positive_button")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[$name='SAVE'$][2]")
    private WebElement saveButton;

    @AndroidFindBy(accessibility = "Asking Price Minimum Value Input")
    @iOSXCUITFindBy(accessibility = "Asking Price Minimum Value Input")
    private WebElement minimumPriceTextBox;

    @AndroidFindBy(accessibility = "Asking Price Maximum Value Input")
    @iOSXCUITFindBy(accessibility = "Asking Price Maximum Value Input")
    private WebElement maximumPriceTextBox;

    @AndroidFindBy(accessibility = "Bathrooms: 1")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 1")
    private WebElement filterFor1Bath;

    @AndroidFindBy(accessibility = "In Contract")
    @iOSXCUITFindBy(accessibility = "Listing Status Suboption: In Contract")
    private WebElement inContractFilter;

    @AndroidFindBy(accessibility = "Off Market")
    @iOSXCUITFindBy(accessibility = "Listing Status Suboption: Off Market")
    private WebElement offMKTButton;

    @AndroidFindBy(accessibility = "Sold/Rented")
    @iOSXCUITFindBy(accessibility = "Listing Status Suboption: Sold/Rented")
    private WebElement soldOrRentedButton;

    @iOSXCUITFindBy(accessibility = "Listing Status Suboption: Expired")
    private WebElement expiredButton;

    @iOSXCUITFindBy(accessibility = "Listing Status Suboption: Active")
    private WebElement activeButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[not(contains(@name,'LISTING STATUS'))]")
    private List<WebElement> statusFilterList;

    @iOSXCUITFindBy(accessibility = "Remove Button: BROOKLYN")
    private WebElement deleteTagButtonBROOKLYN;

    @iOSXCUITFindBy(accessibility = "deleteTagButtonMANHATTAN")
    private WebElement deleteTagButtonMANHATTAN;

    @iOSXCUITFindBy(accessibility = "Remove Button: QUEENS")
    private WebElement deleteTagButtonQUEENS;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name=='Add Button: Bar'`][1]")
    private WebElement searchNeihborhoods;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "*//XCUIElementTypeTable/XCUIElementTypeCell[3]")
    private WebElement thirdSearchInList;

    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.TextView[1]")
//	@iOSXCUITFindBy(xpath = "*//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    private WebElement firstSearchInList;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
    @iOSXCUITFindBy(accessibility = "SavedSearchCancelButton")
    private WebElement savedSearchCancelButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/first_option")
    @iOSXCUITFindBy(accessibility = "OVERWRITE")
    private WebElement overwrite;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/second_option")
    @iOSXCUITFindBy(accessibility = "SAVE AS...")
    private WebElement save;

    @AndroidFindBy(accessibility = "Rentals")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Option: Rentals'")
    private WebElement rentalsButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/create_new_search")
    @iOSXCUITFindBy(accessibility = "CreateNewSearchButton")
    private WebElement createNewSearchButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/reset_filters")
    @iOSXCUITFindBy(accessibility = "Reset Filters")
    private WebElement resetFiltersButton;

    @AndroidFindBy(accessibility = "Bedrooms: 1")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 1")
    private WebElement filterFor1Bed;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@content-desc, 'Bedrooms: 1')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name BEGINSWITH 'BEDROOMS Suboption' AND name ENDSWITH ': 1'$]")
    private WebElement filter1BedSelectedOrNot;

    @AndroidFindBy(accessibility = "Bedrooms: 3")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 3")
    private WebElement filterFor3Beds;

    @AndroidFindBy(accessibility = "Bedrooms: 4+")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 4+")
    private WebElement filterFor4PlusBeds;

    @AndroidFindBy(accessibility = "Bathrooms: 1½")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 1½")
    private WebElement filterFor1AndHalfBath;

    @AndroidFindBy(accessibility = "Bathrooms: 2")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 2")
    private WebElement filterFor2Baths;

    @AndroidFindBy(accessibility = "Bathrooms: 4+")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 4+")
    private WebElement filterFor4PlusBaths;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/delete")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell/XCUIElementTypeButton[2]")
    private WebElement deleteSearchButton;

    @AndroidFindBy(accessibility = "Bedrooms: Studio-SELECTED")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption Selected: Studio")
    private WebElement selectedFilterForStudioBeds;

    @AndroidFindBy(accessibility = "Bedrooms: 1-SELECTED")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption Selected: 1")
    private WebElement selectedFilterFor1Bed;

    @AndroidFindBy(accessibility = "Bedrooms: 2-SELECTED")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption Selected: 2")
    private WebElement selectedFilterFor2Beds;

    @AndroidFindBy(accessibility = "Bedrooms: 3-SELECTED")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption Selected: 3")
    private WebElement selectedFilterFor3Beds;

    @AndroidFindBy(accessibility = "Bedrooms: 4+-SELECTED")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption Selected: 4+")
    private WebElement selectedFilterFor4PlusBeds;

    @AndroidFindBy(accessibility = "Bathrooms: 1-SELECTED")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption Selected: 1")
    private WebElement selectedFilterFor1Bath;

    @AndroidFindBy(accessibility = "Bathrooms: 1½-SELECTED")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption Selected: 1½")
    private WebElement selectedFilterFor1AndHalfBath;

    @AndroidFindBy(accessibility = "Bathrooms: 2-SELECTED")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption Selected: 2")
    private WebElement selectedFilter2Baths;

    @AndroidFindBy(accessibility = "Bathrooms: 3-SELECTED")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption Selected: 3")
    private WebElement selectedFilterFor3Baths;

    @AndroidFindBy(accessibility = "Active-selected")
    @iOSXCUITFindBy(accessibility = "Listing Status Suboption Selected: Active")
    private WebElement selectedActiveFilter;

    @AndroidFindBy(accessibility = "In Contract-selected")
    @iOSXCUITFindBy(accessibility = "Listing Status Suboption Selected: In Contract")
    private WebElement selectedContractFilter;

    @AndroidFindBy(accessibility = "Off Market-selected")
    @iOSXCUITFindBy(accessibility = "Listing Status Suboption Selected: Off Market")
    private WebElement selectedOffMktFilter;

    @AndroidFindBy(accessibility = "Sales-SELECTED")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Option Selected: Sales'")
    private WebElement selectedSalesProperty;

    @iOSXCUITFindBy(accessibility = "Fireplace-SELECTED")
    private WebElement selectedFireplaceFilter;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText[1]")
    private WebElement universalNewSearchButton;

    @AndroidFindBy(accessibility = "Building Laundry-checkmark")
    @iOSXCUITFindBy(accessibility = "Building Laundry-checkmark")
    private WebElement laundryBLDGFilterButton;

    @AndroidFindBy(accessibility = "Building Laundry-checkmark-SELECTED")
    @iOSXCUITFindBy(accessibility = "Building Laundry-checkmark-SELECTED")
    private WebElement selectedLaundryBLDGFilter;

    @AndroidFindBy(accessibility = "CONDO")
    @iOSXCUITFindBy(accessibility = "Condo")
    private WebElement condoFilter;

    @iOSXCUITFindBy(accessibility = "Outdoor Space")
    private WebElement outdoorSpaceFilter;

    @iOSXCUITFindBy(accessibility = "Prewar")
    private WebElement prewarFilter;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name CONTAINS[cd] \"knob_upd\"`][3]")
    private WebElement squareFeetMinControl;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name CONTAINS[cd] \"knob_upd\"`][4]")
    private WebElement squareFeetMaxControl;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name CONTAINS[cd] \"knob_upd\"`][4]")
    private WebElement waitElement;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Perchwell\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeOther[2]")
    private WebElement squareFeetSlider;

    @iOSXCUITFindBy(accessibility = "Doorman")
    private WebElement doormanFilter;

    @iOSXCUITFindBy(accessibility = "Elevator")
    private WebElement elevatorFilter;

    @iOSXCUITFindBy(accessibility = "New Development")
    private WebElement developmentFilter;

    @iOSXCUITFindBy(accessibility = "Pets")
    private WebElement petsFilter;

    @iOSXCUITFindBy(accessibility = "Pool")
    private WebElement poolFilter;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'NO MIN'")
    private WebElement squareFeetMinimumValue;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS '10,000+'")
    private WebElement squareFeetMaximumValue;

    @iOSXCUITFindBy(accessibility = "Washer Dryer")
    private WebElement laundryUnitFilter;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/add_neighborhood_tag")
    @iOSXCUITFindBy(accessibility = "Add Button: NEIGHBORHOODS")
    private WebElement neighborhoodsPlusButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
    @iOSXCUITFindBy(accessibility = "MY NEW SEARCH")
    private WebElement backButtonFromNeighborhoods;

    @AndroidFindBy(accessibility = "Remove Button: Manhattan")
    @iOSXCUITFindBy(accessibility = "Remove Button: Manhattan")
    private WebElement manhattanCheckedCheckbox;

    @AndroidFindBy(accessibility = "Remove Button: Brooklyn")
    @iOSXCUITFindBy(accessibility = "Remove Button: Brooklyn")
    private WebElement brooklynRemoveIcon;

    @AndroidFindBy(accessibility = "Remove Button: Queens")
    @iOSXCUITFindBy(accessibility = "Remove Button: Queens")
    private WebElement queensRemoveIcon;

    @AndroidFindBy(accessibility = "Alphabet City")
    @iOSXCUITFindBy(accessibility = "Neighborhood-Alphabet City")
    private WebElement alphabetCityCheckbox;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/search_src_text")
    @iOSXCUITFindBy(accessibility = "Tag Cell: Search Text Field")
    private WebElement searchNeihborhoodsSearchField;

    @AndroidFindBy(accessibility = "Remove Button: Midwood")
    @iOSXCUITFindBy(accessibility = "Remove Button: Midwood")
    private WebElement midwoodRemoveIcon;

    @AndroidFindBy(accessibility = "Remove Button: All Upper East Side")
    @iOSXCUITFindBy(accessibility = "Remove Button: All Upper East Side")
    private WebElement allUpperEastSideRemoveIcon;

    @AndroidFindBy(accessibility = "Remove Button: Carnegie Hill")
    @iOSXCUITFindBy(accessibility = "Remove Button: Carnegie Hill")
    private WebElement carnegieHillsRemoveIcon;

    @AndroidFindBy(accessibility = "Remove Button: Upper East Side")
    @iOSXCUITFindBy(accessibility = "Remove Button: Upper East Side")
    private WebElement upperEastSideRemoveIcon;

    @AndroidFindBy(accessibility = "Remove Button: Yorkville")
    @iOSXCUITFindBy(accessibility = "Remove Button: Yorkville")
    private WebElement yorkvilleRemoveIcon;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/add_building_tag")
    @iOSXCUITFindBy(accessibility = "Add Button: BUILDINGS")
    private WebElement searchByAddressButton;

    @iOSXCUITFindBy(accessibility = "Tag Cell: Search Text Field")
    private WebElement addressSearchField;

    @iOSXCUITFindBy(accessibility = "THE MURRAY HILL, 240 EAST 35TH STREET")
    private WebElement testBuilding;

    @iOSXCUITFindBy(accessibility = "AddressSearchCancelButton")
    private WebElement addressSearchCancelButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/show_more_features_and_amenities_button")
    @iOSXCUITFindBy(accessibility = "Show more features & amenities")
    private WebElement showMoreFeaturesAndAmenitiesButton;

    @iOSXCUITFindBy(accessibility = "CURRENT STATUS")
    private WebElement currentStatusSection;

    @iOSXCUITFindBy(accessibility = "PROPERTY TYPE")
    private WebElement propertyTypeSection;

    @AndroidFindBy(accessibility = "Bedrooms: Range")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Option: Range")
    private WebElement bedroomsRangeOption;

    @AndroidFindBy(accessibility = "Bathrooms: Range")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Option: Range")
    private WebElement bathroomsRangeOption;

    @AndroidFindBy(accessibility = "SQUARE FEET Minimum Value Input")
    @iOSXCUITFindBy(accessibility = "SQUARE FEET Minimum Value Input")
    private WebElement squareFeetMinValueField;

    @AndroidFindBy(accessibility = "SQUARE FEET Maximum Value Input")
    @iOSXCUITFindBy(accessibility = "SQUARE FEET Maximum Value Input")
    private WebElement squareFeetMaxValueField;

    @AndroidFindBy(accessibility = "Option: Exclude Unknown")
    @iOSXCUITFindBy(accessibility = "% FINANCING Option: Exclude Unknown")
    private WebElement excludeUnknownButton;

    @AndroidFindBy(accessibility = "Bedrooms: Studio +")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: Studio +")
    private WebElement studioBedsMinimumFilter;

    @AndroidFindBy(accessibility = "Bedrooms: 1+")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 1+")
    private WebElement oneBedMinimumFilter;

    @AndroidFindBy(accessibility = "Bedrooms: 2+")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 2+")
    private WebElement twoBedsMinimumFilter;

    @AndroidFindBy(accessibility = "Bedrooms: 2+-selected")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption Selected: 2+")
    private WebElement selectedTwoBedsMinimumFilter;

    @AndroidFindBy(accessibility = "Bedrooms: 3+")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 3+")
    private WebElement threeBedsMinimumFilter;

    @AndroidFindBy(accessibility = "Bedrooms: 4+")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption: 4+")
    private WebElement fourBedsMinimumFilter;

    @AndroidFindBy(accessibility = "Bathrooms: 1+")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 1+")
    private WebElement oneBathMinimumFilter;

    @AndroidFindBy(accessibility = "Bathrooms: 1½+")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 1½+")
    private WebElement oneAndHalfBathsMinimumFilter;

    @AndroidFindBy(accessibility = "Bathrooms: 2+")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 2+")
    private WebElement twoBathsMinimumFilter;

    @AndroidFindBy(accessibility = "Bathrooms: 2+-selected")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption Selected: 2+")
    private WebElement selectedTwoBathsMinFilter;

    @AndroidFindBy(accessibility = "Bathrooms: 3+")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 3+")
    private WebElement threeBathsMinimumFilter;

    @AndroidFindBy(accessibility = "Bathrooms: 4+")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption: 4+")
    private WebElement fourBathsMinimumFilter;

    @AndroidFindBy(xpath = "//*[@text = 'TOTAL ROOMS']")
    @iOSXCUITFindBy(accessibility = "TOTAL ROOMS")
    private WebElement totalRoomsSection;

    @AndroidFindBy(accessibility = "Bathrooms: 4+-selected")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption Selected: 4+")
    private WebElement selectedFilterFor4PlusBaths;

    @AndroidFindBy(accessibility = "Bedrooms: Minimum")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Option: Minimum")
    private WebElement bedroomsMinimumOption;

    @AndroidFindBy(accessibility = "Bathrooms: Minimum")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Option: Minimum")
    private WebElement bathroomsMinimumOption;

    @AndroidFindBy(xpath = "*//android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.ImageView")
    @iOSXCUITFindBy(accessibility = "Cell Collapsible Button: BEDROOMS")
    private WebElement bedroomsCollapseButton;

    @AndroidFindBy(xpath = "*//android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.ImageView")
    @iOSXCUITFindBy(accessibility = "Cell Collapsible Button: BATHROOMS")
    private WebElement bathroomsCollapseButton;

    @AndroidFindBy(accessibility = "Bedrooms: Range-selected")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Option Selected: Range")
    private WebElement selectedBedroomsRangeOption;

    @AndroidFindBy(accessibility = "Bathrooms: Range-selected")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Option Selected: Range")
    private WebElement selectedBathroomsRangeOption;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Manhattan\"]/android.widget.RelativeLayout/android.widget.ImageView")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[$name CONTAINS 'City-Manhattan'$]/XCUIElementTypeButton")
    private WebElement manhattanSection;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"All Downtown\"]/android.widget.RelativeLayout/android.widget.ImageView")
    private WebElement allDownTownSection;

    @iOSXCUITFindBy(accessibility = "Add Button: CUSTOM BOUNDARIES")
    private WebElement customBoundariesPlusButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/listing_activity")
    private WebElement listingActivitySection;

    @AndroidFindBy(accessibility = "CONDO-SELECTED")
    @iOSXCUITFindBy(accessibility = "Condo-selected")
    private WebElement selectedCondoFilter;

    @iOSXCUITFindBy(accessibility = "Co-op")
    private WebElement coopFilter;

    @iOSXCUITFindBy(accessibility = "Townhouse")
    private WebElement townhouseFilter;

    @iOSXCUITFindBy(accessibility = "Co-op-selected")
    private WebElement selectedCoopFilter;

    @iOSXCUITFindBy(accessibility = "Townhouse-selected")
    private WebElement selectedTownhouseFilter;

    @iOSXCUITFindBy(accessibility = "Rental")
    private WebElement rentalFilter;

    @iOSXCUITFindBy(accessibility = "Rental-selected")
    private WebElement selectedRentalFilter;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Option: Sales'")
    private WebElement salesProperty;

    @AndroidFindBy(accessibility = "Rentals-SELECTED")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Option Selected: Rentals'")
    private WebElement selectedRentalsProperty;

    @iOSXCUITFindBy(accessibility = "Cell Collapsible Button: PROPERTY TYPE")
    private WebElement propertyTypeCollapseButton;

    @iOSXCUITFindBy(accessibility = "AddressSearchBar")
    private WebElement searchAddressField;

    @AndroidFindBy(accessibility = "Close Search Filters Button")
    @iOSXCUITFindBy(accessibility = "bar button: close search view")
    private WebElement closeSearchButton;

    @iOSXCUITFindBy(accessibility = "Add Button: BUILDINGS")
    private WebElement addBuildingFilterButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeCell' AND visible = 1")
    private List<WebElement> buildingsList;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/remove_icon")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'Remove Button: '")
    private List<WebElement> removeButtonList;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    private WebElement firstBuilding;

    @AndroidFindBy(accessibility = "Bedrooms: 3+-SELECTED")
    @iOSXCUITFindBy(accessibility = "BEDROOMS Suboption Selected: 3+")
    private WebElement selectedThreeBedsMinimumFilter;

    @AndroidFindBy(accessibility = "Bathrooms: 3+-SELECTED")
    @iOSXCUITFindBy(accessibility = "BATHROOMS Suboption Selected: 3+")
    private WebElement selectedThreeBathsMinimumFilter;

    @AndroidFindBy(accessibility = "TOTAL ROOMS Minimum Value Input")
    @iOSXCUITFindBy(accessibility = "TOTAL ROOMS Minimum Value Input")
    private WebElement totalRoomsMinValueField;

    @AndroidFindBy(accessibility = "Prewar-checkmark")
    @iOSXCUITFindBy(accessibility = "Prewar-checkmark")
    private WebElement prewarCheckmarkFilter;

    @AndroidFindBy(accessibility = "Outdoor Space-checkmark")
    @iOSXCUITFindBy(accessibility = "Outdoor Space-checkmark")
    private WebElement outdoorSpaceCheckmarkFiler;

    @AndroidFindBy(accessibility = "Prewar-checkmark-SELECTED")
    @iOSXCUITFindBy(accessibility = "Prewar-checkmark-SELECTED")
    private WebElement selectedPrewarCheckmarkFilter;

    @AndroidFindBy(accessibility = "Outdoor Space-checkmark-SELECTED")
    @iOSXCUITFindBy(accessibility = "Outdoor Space-checkmark-SELECTED")
    private WebElement selectedOutdoorSpaceCheckmarkFilter;

    @AndroidFindBy(accessibility = "Option: Sponsor")
    @iOSXCUITFindBy(accessibility = " Option: Sponsor")
    private WebElement sponsorOption;

    @AndroidFindBy(accessibility = "Option Selected: Sponsor")
    @iOSXCUITFindBy(accessibility = " Option Selected: Sponsor")
    private WebElement selectedSponsorOption;

    @AndroidFindBy(xpath = "//*[@text = 'RESALE/SPONSOR']")
    @iOSXCUITFindBy(accessibility = "RESALE/SPONSOR")
    private WebElement resaleSponsorSection;

    @AndroidFindBy(accessibility = "Option: Resale")
    @iOSXCUITFindBy(accessibility = " Option: Resale")
    private WebElement resaleOption;

    @iOSXCUITFindBy(accessibility = "Asking Price Per FT² Minimum Value Input")
    private WebElement minPricePerFTField;

    @iOSXCUITFindBy(accessibility = "Asking Price Per FT² Maximum Value Input")
    private WebElement maxPricePerFTField;

    @AndroidFindBy(accessibility = "Monthlies Minimum Value Input")
    @iOSXCUITFindBy(accessibility = "Monthlies Minimum Value Input")
    private WebElement minMonthliesInputFiled;

    @AndroidFindBy(accessibility = "Monthlies Maximum Value Input")
    @iOSXCUITFindBy(accessibility = "Monthlies Maximum Value Input")
    private WebElement maxMonthliesInputFiled;

    @AndroidFindBy(accessibility = "% Financing Minimum Value Input")
    @iOSXCUITFindBy(accessibility = "% Financing Minimum Value Input")
    private WebElement financingMinValueField;

    @AndroidFindBy(accessibility = "% Financing Maximum Value Input")
    @iOSXCUITFindBy(accessibility = "% Financing Maximum Value Input")
    private WebElement financingMaxValueField;

    @AndroidFindBy(accessibility = "Brokerage Suboption: CORE Public")
    @iOSXCUITFindBy(accessibility = "brokerage: deselected STRI Public")
    private WebElement corePublicOption;

    @AndroidFindBy(accessibility = "Brokerage Suboption: Other Public")
    @iOSXCUITFindBy(accessibility = "brokerage: deselected Other Public")
    private WebElement otherPublicOption;

    @AndroidFindBy(accessibility = "Option Selected: Any of these terms")
    @iOSXCUITFindBy(accessibility = " Option Selected: Any of these terms")
    private WebElement selectedAnyOfTheseTermsButton;

    @AndroidFindBy(accessibility = "Option: Any of these terms")
    @iOSXCUITFindBy(accessibility = " Option: Any of these terms")
    private WebElement anyOfTheseTermsButton;

    @AndroidFindBy(accessibility = "Option Selected: All of these terms")
    @iOSXCUITFindBy(accessibility = " Option Selected: All of these terms")
    private WebElement selectedAllOfTheseTermsButton;

    @AndroidFindBy(accessibility = "Option: All of these terms")
    @iOSXCUITFindBy(accessibility = " Option: All of these terms")
    private WebElement allOfTheseTermsButton;

    @AndroidFindBy(accessibility = "Text field: search bar")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[11]/XCUIElementTypeTextField")
    private WebElement textSearchField;

    @iOSXCUITFindBy(accessibility = "Return")
    private WebElement returnButtonOnKeyboard;

    @iOSXCUITFindBy(accessibility = "BUILDING WIDTH")
    private WebElement bldgWidthSection;

    @AndroidFindBy(accessibility = "OPEN_HOUSES Minimum Value Input")
    @iOSXCUITFindBy(accessibility = "Open Houses Minimum Value Input")
    private WebElement openHouseMinValueInput;

    @AndroidFindBy(accessibility = "OPEN_HOUSES Maximum Value Input")
    @iOSXCUITFindBy(accessibility = "Open Houses Maximum Value Input")
    private WebElement openHouseMaxValueInput;

    @AndroidFindBy(accessibility = "Go to next")
    @iOSXCUITFindBy(accessibility = "chevronRight")
    private WebElement nextMonthPageButton;

    @AndroidFindBy(accessibility = "Listing Activity Minimum Value Input")
    @iOSXCUITFindBy(accessibility = "Listing Activity Minimum Value Input")
    private WebElement listingActivityMinValueInput;

    @AndroidFindBy(accessibility = "Listing Activity Maximum Value Input")
    @iOSXCUITFindBy(accessibility = "Listing Activity Maximum Value Input")
    private WebElement listingActivityMaxValueInput;

    @AndroidFindBy(accessibility = "Go to previous")
    @iOSXCUITFindBy(accessibility = "chevronLeft")
    private WebElement previousMonthPageButton;

    @AndroidFindBy(accessibility = "Listing Activity Suboption: Listed")
    @iOSXCUITFindBy(accessibility = "Listing Activity Suboption: Listed")
    private WebElement listedOption;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/action_button")
    @iOSXCUITFindBy(accessibility = "refresh")
    private WebElement resetDateButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
    @iOSXCUITFindBy(accessibility = "x")
    private WebElement closeCalendarButton;

    @AndroidFindBy(accessibility = "Brokerage Suboption Selected: CORE Public")
    @iOSXCUITFindBy(accessibility = "brokerage: selected CORE Public")
    private String selectedCorePublicButton;

    @iOSXCUITFindBy(accessibility = "Cell Collapsible Button: RESALE/SPONSOR")
    private WebElement collapseReleaseSponsorArrow;

    @iOSXCUITFindBy(accessibility = "Cell Collapsible Button: LOCATION")
    private WebElement collapseLocationArrow;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeImage' AND name CONTAINS 'slider max:'")
    private WebElement buildWightMaxControl;

    @iOSXCUITFindBy(accessibility = "Cell Collapsible Button: BEDROOMS")
    private WebElement collapseBedroomsArrow;

    @AndroidFindBy(accessibility = "TOTAL ROOMS Maximum Value Input")
    @iOSXCUITFindBy(accessibility = "TOTAL ROOMS Maximum Value Input")
    private WebElement totalRoomsMaxValueField;

    @AndroidFindBy(accessibility = "Listing Activity Suboption: Price Drop")
    @iOSXCUITFindBy(accessibility = "Listing Activity Suboption: Price Drop")
    private WebElement priceDropOption;

    @iOSXCUITFindBy(accessibility = "BUILDING WIDTH")
    @AndroidFindBy(xpath = "//*[@text = 'BUILDING WIDTH']")
    private WebElement buildingWidthTitle;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    private WebElement firstBuildingInSearch;

    @iOSXCUITFindBy(accessibility = "AddressSearchCancelButton")
    private WebElement closeSearchAddressButton;

    @iOSXCUITFindBy(accessibility = "SavedSearchCancelButton")
    private WebElement closeSavedSearchesButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[$name == 'alert icon'$][1]")
    private WebElement firstBellIcon;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeImage[$name CONTAINS 'buildingSelectionIndicator'$][1]")
    private WebElement firstSelectedBuildingIcon;

    @iOSXCUITFindBy(accessibility = "BUILDINGS")
    private WebElement buildingsTitle;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name CONTAINS 'MURRAY HILL CO-OP BUILDING'$][1]")
    private WebElement neighborhoodAndBuildingType;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[$name CONTAINS 'ACTIVE'$][1]")
    private WebElement activeSalesAndRentals;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Remove Button: '")
    private List<WebElement> removePillsIconList;

    @iOSXCUITFindBy(accessibility = "Cell Collapsible Button: LOCATION")
    private WebElement collapseExpandLocationButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'BUILDING ADDRESS: '")
    private List<WebElement> buildingAddressesList;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnUniversalNewSearchButton() {
        element(universalNewSearchButton).click();
    }

    public void clickOnApplyButton() {
//		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
//		WebDriver webDriver = webDriverFacade.getProxiedDriver();
//		AppiumDriver appiumDriver = (AppiumDriver) webDriver;
//		if(!Config.isAndroid()) {
//			appiumDriver.hideKeyboard();
//		}
        element(applySearchButton).click();
    }

    public void clickOnDeleteSecondLocation() {
        deleteSecondLocationButton.click();
    }

    public void selectFilterFor3Baths() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(filterFor3Baths).click();
    }

    public void selectFilterFor2Beds() {
        element(filterFor2Beds).click();
    }

    public void clickLoadSavedSearchButton() {
        element(loadSavedSearchButton).click();
    }

    public void clickOnSaveSearchButton() {
        element(searchSavebutton).click();
    }

    public void clickOnSaveButton() {
        element(saveButton).click();
    }

    public void setSearchName(String search) {
        element(searchName).sendKeys(search);
    }

    public String generateRandomString(String str) {
        return RandomGenerator.getRandomString(str);
    }

    public void clickOnPreviouslyCreatedSearch(String search) {
        if (Config.isAndroid()) {
            getDriver().findElement(By.xpath("//*[@text='" + search.toUpperCase() + "']")).click();
        } else {
            getDriver().findElement(By.name(search.toUpperCase())).click();
        }
    }

    public void shouldSeePreviouslyCreatedSearch(String search) {
        WebElement previouslyCreatedSearch;

        if (Config.isAndroid()) {
            previouslyCreatedSearch = element(By.xpath("//*[@text='" + search.toUpperCase() + "']"));
        } else {
            previouslyCreatedSearch = element(By.name(search.toUpperCase()));
        }
        element(previouslyCreatedSearch).shouldBeVisible();
    }

    public void setMinimumPriceFilter(String price) {
        element(minimumPriceTextBox).sendKeys(price);
        if (!Config.isAndroid()) {
            getDriver().findElement(By.name("Done")).click();
        }
    }

    public void selectFilterStudioBeds() {
        universalVerticalSwipe(filterForStudioBeds);
        element(filterForStudioBeds).click();
    }

    public void clickOnFilterStudioBeds() {
        element(filterForStudioBeds).click();
    }

    public void selectFilter1Bath() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(filterFor1Bath).click();
    }

    public void setFilterActive() {
        element(activeButton).click();
    }

    public void selectOffMktFilter() {
        universalVerticalSwipe(offMKTButton);
        element(offMKTButton).click();
    }

    public void selectSoldOrRentFilter() {
        universalVerticalSwipe(soldOrRentedButton);
        element(soldOrRentedButton).click();
    }

    public void selectContractFilter() {
        universalVerticalSwipe(inContractFilter);
        element(inContractFilter).click();
    }

    public void clickDeleteTagButtonQUEENS() {
        element(deleteTagButtonQUEENS).click();
    }

    public void clickDeleteTagButtonBROOKLYN() {
        element(deleteTagButtonBROOKLYN).click();
    }

    public void clickDeleteTagButtonMANHATTAN() {
        element(deleteTagButtonMANHATTAN).click();
    }

    public void clickOnLocationFilter() {
        element(searchNeihborhoods).click();
    }

    public void clickOnThirdSearchInList() {
        element(thirdSearchInList).click();
    }

    public boolean isAnySearchExist() {
        return Helper.isElementDisplayed(firstSearchInList);
    }

    public void selectFirstSearchAndSaveName() {
        String searchName;
        if (Config.isAndroid()) {
            searchName = firstSearchInList.getAttribute("text");
        } else {
            searchName = firstSearchInList.getAttribute("name");
        }
        SessionVariables.addValueInSessionVariable("SearchName", searchName);
        firstSearchInList.click();
    }

    public void savedSearchCancelButtonClick() {
        element(savedSearchCancelButton).click();
    }

    public void overwriteOptionSelect() {
        element(overwrite).click();
    }

    public void saveAsOptionSelect() {
        element(save).click();
    }

    public boolean isElementExistsInEachCell(String filterName) {
        boolean isAllCellsContain = true;
        WebElement table = getDriver().findElements(By.className("XCUIElementTypeTable")).get(0);
        List<WebElement> listCells = table.findElements(By.className("XCUIElementTypeCell"));
        if (listCells.size() > 0) {
            for (int i = 0; (i < 10 || i < listCells.size()); i++) {
                if (listCells.get(i).findElements(By.name(filterName)).size() == 0) {
                    isAllCellsContain = false;
                    break;
                }
            }
        }
        return isAllCellsContain;
    }

    public void selectRentalsProperty() {
        universalVerticalSwipe(rentalsButton);
        element(rentalsButton).click();
    }

    public void createNewSearchButtonClick() {
        element(createNewSearchButton).click();
    }

    public void selectFilter1Bed() {
        element(filterFor1Bed).click();
    }

    public void clickOnFilter1Bed() {
        element(filter1BedSelectedOrNot).click();
    }

    public void selectFilter3Beds() {
        element(filterFor3Beds).click();
    }

    public void selectFilter4PlusBeds() {
        element(filterFor4PlusBeds).click();
    }

    public void clickOnResetFilters() {
        element(resetFiltersButton).click();
    }

    public void selectFilter1AndHalfBath() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(filterFor1AndHalfBath).click();
    }

    public void selectFilter2Baths() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(filterFor2Baths).click();
    }

    public void selectFilter3Baths() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(filterFor3Baths).click();
    }

    public void selectFilter4PlusBaths() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(filterFor4PlusBaths).click();
    }

    public void swipeCreatedSearch(String name) throws Exception {
        WebElement search;

        if (Config.isAndroid()) {
            search = element(MobileBy.xpath("//*[@text = '" + name + "']"));
        } else {
            search = getDriver().findElement(MobileBy.AccessibilityId(name));
        }
        int y = search.getLocation().getY();
        Helper.swipeRightElementWithSetY(search, y + 1);
    }

    public void clickOnDeleteSearchButton() {
        element(deleteSearchButton).click();
    }

    public void shouldDeleteSearch() {
        String search = SessionVariables.getValueFromSessionVariable("Search");
        if (Config.isAndroid()) {
            element(MobileBy.xpath("//*[@text = '" + search + "']")).shouldNotBeVisible();
        } else {
            element(MobileBy.AccessibilityId(search)).shouldNotBeVisible();
        }
    }

    public void setUpSessionVariableForStatusFilter(WebElement name) {
        String selected;

        if (Config.isAndroid()) {
            selected = name.getAttribute("text");
        } else {
            selected = name.getAttribute("value");
        }

        if (!selected.contains("selected")) {
            SessionVariables.addValueInSessionVariable("status filter", "not selected");
            return;
        }
        SessionVariables.addValueInSessionVariable("status filter", "selected");
    }

    public WebElement getFilterFor1Bed() {
        return filter1BedSelectedOrNot;
    }

    private String getValueFromMinPriceFilter() {
        String minPrice;

        if (Config.isAndroid()) {
            minPrice = minimumPriceTextBox.getAttribute("text");
        } else {
            minPrice = minimumPriceTextBox.getAttribute("value");
        }

        minPrice = Helper.removeChar(minPrice, '$');
        minPrice = Helper.removeChar(minPrice, ',');
        return minPrice;
    }

    private boolean isMinPriceSaved() {
        boolean minPriceSaved = false;
        String minPriceEnteredPreviously = SessionVariables.getValueFromSessionVariable("min_price");
        String minPriceInFilter = getValueFromMinPriceFilter();

        if (minPriceEnteredPreviously.equalsIgnoreCase(minPriceInFilter)) {
            minPriceSaved = true;
        }
        return minPriceSaved;
    }

    public void shouldMinPriceHaveTheSameValue() {
        Assert.assertTrue(isMinPriceSaved());
    }

    private boolean isFilterFor1BedSaved() {
        boolean filterFor1BedSaved = false;
        String statusFilterPreviously = SessionVariables.getValueFromSessionVariable("status filter");
        String statusFilter;

        if (Config.isAndroid()) {
            statusFilter = filter1BedSelectedOrNot.getAttribute("text");
        } else {
            statusFilter = filter1BedSelectedOrNot.getAttribute("name");
        }

        if ((statusFilterPreviously.equals("selected") && statusFilter.contains("selected"))
                || (statusFilterPreviously.equals("not selected") && !statusFilter.contains("selected"))) {
            filterFor1BedSaved = true;
        }

        return filterFor1BedSaved;
    }

    public void shouldFilter1BedBeOfTheSameStatus() {
        Assert.assertTrue(isFilterFor1BedSaved());
    }

    public void deselectFilterStudioBeds() {
        element(selectedFilterForStudioBeds).click();
    }

    public void deselectFilter1Bed() {
        element(selectedFilterFor1Bed).click();
    }

    public void deselectFilter2Beds() {
        element(selectedFilterFor2Beds).click();
    }

    public void deselectFilter3Beds() {
        element(selectedFilterFor3Beds).click();
    }

    public void checkNoOneBedsRangeFilterSelected() {
        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(Helper.isElementDisplayed(element(filterForStudioBeds))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(filterFor1Bed))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(filterFor2Beds))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(filterFor3Beds))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(filterFor4PlusBeds))).isTrue();
        softAssert.assertAll();
    }

    public void deselectFilter1Bath() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(selectedFilterFor1Bath).click();
    }

    public void deselectFilter1AndHalfBath() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(selectedFilterFor1AndHalfBath).click();
    }

    public void deselectFilter2Baths() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(selectedFilter2Baths).click();
    }

    public void deselectFilter3Baths() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(selectedFilterFor3Baths).click();
    }

    public void checkNoOneBathsRangeFilterSelected() {
        universalVerticalShortSwipe(totalRoomsSection);
        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(Helper.isElementDisplayed(element(filterFor1Bath))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(filterFor1AndHalfBath))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(filterFor2Baths))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(filterFor3Baths))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(filterFor4PlusBaths))).isTrue();
        softAssert.assertAll();
    }

    public void setMaximumPriceFilter(String price) {
        if (Config.isAndroid()) {
            element(maximumPriceTextBox).sendKeys(price);
        } else {
            element(maximumPriceTextBox).typeAndEnter(price);
        }
    }

    public void clearPriceFilterValue(String typePrice) {
        switch (typePrice) {
            case "minPrice":
                element(minimumPriceTextBox).clear();
                break;

            case "maxPrice":
                element(maximumPriceTextBox).clear();
                break;
        }
    }

    private boolean isMinAndMaxPricesNotSet() {
        boolean emptyPricesFilters = true;
        String maxPriceFilter;
        String minPriceFilter;

        if(Config.isAndroid()) {
            maxPriceFilter = element(maximumPriceTextBox).getAttribute("text");
            minPriceFilter = element(minimumPriceTextBox).getAttribute("text");
        } else {
            maxPriceFilter = element(maximumPriceTextBox).getAttribute("value");
            minPriceFilter = element(minimumPriceTextBox).getAttribute("value");
        }

        if (!maxPriceFilter.contains("Max") || !minPriceFilter.contains("Min")) {
            emptyPricesFilters = false;
        }
        return emptyPricesFilters;
    }

    public void shouldNoOnePriceFilterBeSelected() {
        Assert.assertTrue(isMinAndMaxPricesNotSet());
    }

    public void deselectActiveFilter() {
        if (Config.isAndroid()) {
            setImplicitTimeout(1, SECONDS);
            Helper.universalVerticalSwipe(listingActivitySection);
            resetImplicitTimeout();
        } else {
            Helper.universalVerticalSwipe(selectedActiveFilter);
        }
        element(selectedActiveFilter).click();
    }

    public void deselectContractFilter() {
        Helper.universalVerticalSwipe(selectedContractFilter);
        element(selectedContractFilter).click();
    }

    public void deselectOffMktFilter() {
        Helper.universalVerticalSwipe(selectedOffMktFilter);
        element(selectedOffMktFilter).click();
    }

    public void checkSalesAndActiveFiltersSelected() {
        SoftAssertions softAssertions = new SoftAssertions();
        Helper.universalVerticalSwipe(propertyTypeSection);
        softAssertions.assertThat(element(selectedSalesProperty).isDisplayed());
        Helper.universalVerticalSwipe(currentStatusSection);
        softAssertions.assertThat(element(selectedActiveFilter).isDisplayed());
        softAssertions.assertAll();
    }

    public void shouldFireplaceFilterBeSelected() {
        element(selectedFireplaceFilter).shouldBePresent();
    }

    public void should1BedFilterBeApplied() {
        element(selectedFilterFor1Bed).shouldBeVisible();
    }

    public void should1AndHalfBathFilterBeApplied() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(selectedFilterFor1AndHalfBath).shouldBeVisible();
    }

    public void setUpFilterLaundryBLDG() {
        element(laundryBLDGFilterButton).click();
    }

    public void scrollToLaundryBLDG() {
        if (Config.isAndroid()) {
            setImplicitTimeout(1, SECONDS);
            Helper.universalVerticalSwipe(laundryBLDGFilterButton);
            resetImplicitTimeout();
        } else {
            Helper.universalVerticalSwipe(laundryBLDGFilterButton);
        }
    }

    public void shouldLaundryBLDGFilterBeApplied() {
        if (Config.isAndroid()) {
            setImplicitTimeout(1, SECONDS);
//			Helper.androidSwipeDownUntilElementVisible("LAUNDRY BLDG");
            Helper.androidSwipeDownUntilElementVisible(selectedLaundryBLDGFilter);
            resetImplicitTimeout();
            element(selectedLaundryBLDGFilter).shouldBeVisible();
        } else {
            element(selectedLaundryBLDGFilter).shouldBePresent();
        }
    }

    public void selectCondoFilter() {
        universalVerticalSwipe(condoFilter);
        element(condoFilter).click();
    }

    public void selectOutdoorSpaceFilter() {
        Helper.swipeDownUntilElementVisible(outdoorSpaceFilter);
        element(outdoorSpaceFilter).click();
    }

    public void selectPrewarFilter() {
        Helper.swipeDownUntilElementVisible(prewarFilter);
        element(prewarFilter).click();
    }

    public void setSquareFeetMinFilter(String value) {
        universalVerticalSwipe(collapseReleaseSponsorArrow);

        if(Config.isAndroid()) {
            element(squareFeetMinValueField).sendKeys(value);
        }
        else {
            element(squareFeetMinValueField).typeAndEnter(value);
        }
    }

    private int getXCoordinateForSixK() {
        Dimension size = getDriver().manage().window().getSize();
        int deviceWidth = size.width;
        int sliderStartPositionX = squareFeetSlider.getLocation().getX();
        int sliderWidth = deviceWidth - (sliderStartPositionX * 2);

        return (sliderStartPositionX + ((sliderWidth / 20) * 11));
    }

    public void clickOnDoormanFilter() {
        Helper.swipeDownUntilElementVisible(doormanFilter);
        element(doormanFilter).click();
    }

    public void addElevatorFilter() {
        Helper.swipeDownUntilElementVisible(elevatorFilter);
        element(elevatorFilter).click();
    }

    public void clickOnLaundryBuildingFilter() {
        swipeDownUntilElementVisible(laundryBLDGFilterButton);
        element(laundryBLDGFilterButton).click();
    }

    public void clickOnPetsFilter() {
        Helper.swipeDownUntilElementVisible(petsFilter);
        element(petsFilter).click();
    }

    public void clickOnDevelopmentFilter() {
        Helper.swipeDownUntilElementVisible(developmentFilter);
        element(developmentFilter).click();
    }

    public void clickOnPoolFilter() {
        Helper.swipeDownUntilElementVisible(poolFilter);
        element(poolFilter).click();
    }

    public void clickOnFireplaceFilter() {
        Helper.swipeDownUntilElementVisible(fireplaceFilter);
        element(fireplaceFilter).click();
    }

    public void setMinimumSquareFeet(String value) {
        Helper.swipeDownUntilElementVisible(squareFeetMinimumValue);
        withAction().dragAndDrop(squareFeetMinimumValue, squareFeetMaximumValue).perform();

    }

    public void clickOnLaundryUnitFilter() {
        Helper.swipeDownUntilElementVisible(laundryUnitFilter);
        element(laundryUnitFilter).click();
    }

    public void clickOnNeighborhoodsPlusButton() {
        element(neighborhoodsPlusButton).click();
    }

    public void uncheckManhattan() {
        element(manhattanCheckedCheckbox).click();
    }

    public void clickOnBackFromNeighborhoodsPage() {
        element(backButtonFromNeighborhoods).click();
    }

    public void clickOnApplyButtonWithoutKeyboard() {
        element(applySearchButton).click();
    }

    public void uncheckBrooklyn() {
        element(brooklynRemoveIcon).click();
    }

    public void uncheckQueens() {
        element(queensRemoveIcon).click();
    }

    public void clickOnAlphabetCityCheckbox() {
        element(alphabetCityCheckbox).click();
    }

    public void searchDistrict(String district) {
        element(searchNeihborhoodsSearchField).sendKeys(district);
    }

    public void selectDistrict(String districtID) {
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;
        if (!Config.isAndroid()) {
            appiumDriver.hideKeyboard();
            element(MobileBy.AccessibilityId(districtID)).click();
        } else {
            element(By.xpath("//*[@text = '" + districtID.replaceAll("District-", "").replaceAll("Neighborhood-", "") + "']")).click();
        }

    }

    public void uncheckMidwoodFromFilter() {
        element(midwoodRemoveIcon).click();
    }

    public void uncheckAllUpperEastSideFromFilter() {
        element(allUpperEastSideRemoveIcon).click();
    }

    public void uncheckCarnegieHillsFromFilter() {
        element(carnegieHillsRemoveIcon).click();
    }

    public void uncheckUpperEastSideFromFilter() {
        element(upperEastSideRemoveIcon).click();
    }

    public void uncheckYorkvilleFromFilter() {
        element(yorkvilleRemoveIcon).click();
    }

    public void clickOnSearchByAddressButton() {
        element(searchByAddressButton).click();
    }

    public void fillInSearchField(String value) {
        element(addressSearchField).sendKeys(value);
    }

    public void clickOnTestBuilding() {
        element(testBuilding).click();
    }

    public void clickOnShowMoreFeaturesAndAmenitiesButton() {
        universalVerticalSwipe(openHouseMinValueInput);
        element(showMoreFeaturesAndAmenitiesButton).click();
        if(Config.isAndroid()) {
            singleUpShortSwipeAndroid();
        }
    }

    public void selectBathroomsRangeOption() {
//        Helper.universalVerticalShortSwipe(bathroomsRangeOption);
        universalVerticalShortSwipe(totalRoomsSection);
        element(bathroomsRangeOption).click();
    }

    public void selectBedroomsRangeOption() {
        waitFor(ExpectedConditions.visibilityOf(bedroomsRangeOption));
        element(bedroomsRangeOption).click();
    }

    public void selectBedroomsRangeOptionIfNotSelected() {
        if (element(bedroomsRangeOption).isVisible()) {
            element(bedroomsRangeOption).click();
        }
    }

    public void selectStudioBedsMinimumFilter() {
        element(studioBedsMinimumFilter).click();
    }

    public void checkIfStudioBedsFilterIsDeselected() {
        element(studioBedsMinimumFilter).shouldBeVisible();
    }

    public void selectOneBedMinimumFilter() {
        element(oneBedMinimumFilter).click();
    }

    public void selectTwoBedsMinimumFilter() {
        element(twoBedsMinimumFilter).click();
    }

    public void selectThreeBedsMinimumFilter() {
        element(threeBedsMinimumFilter).click();
    }

    public void selectFourBedsMinimumFilter() {
        element(fourBedsMinimumFilter).click();
    }

    public void selectOneBathMinimumFilter() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(oneBathMinimumFilter).click();
    }

    public void selectOneAndHalfBathroomsFilter() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(oneAndHalfBathsMinimumFilter).click();
    }

    public void selectTwoBathsMinimumFilter() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(twoBathsMinimumFilter).click();
    }

    public void selectThreeBathsMinimumFilter() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(threeBathsMinimumFilter).click();
    }

    public void selectFourBathsMinimumFilter() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(fourBathsMinimumFilter).click();
    }

    public void checkIfOneBathMinimumFilterIsDeselected() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(oneBathMinimumFilter).shouldBeVisible();
    }

    public void deselectFilter4Beds() {
        element(selectedFilterFor4PlusBeds).click();
    }

    public void deselectFilter4Baths() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(selectedFilterFor4PlusBaths).click();
    }

    public void selectBedroomsMinimumOption() {
        element(bedroomsMinimumOption).click();
    }

    public void checkNoOneBedsMinimumFilterSelected() {
        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(Helper.isElementDisplayed(element(studioBedsMinimumFilter))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(oneBedMinimumFilter))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(twoBedsMinimumFilter))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(threeBedsMinimumFilter))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(fourBedsMinimumFilter))).isTrue();
        softAssert.assertAll();
    }

    public void checkNoOneBathsMinimumFilterSelected() {
        universalVerticalShortSwipe(totalRoomsSection);
        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(element(oneBathMinimumFilter).isPresent());
        softAssert.assertThat(Helper.isElementDisplayed(element(oneAndHalfBathsMinimumFilter))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(twoBathsMinimumFilter))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(threeBathsMinimumFilter))).isTrue();
        softAssert.assertThat(Helper.isElementDisplayed(element(fourBathsMinimumFilter))).isTrue();
        softAssert.assertAll();
    }

    public void selectBathroomsMinimumOption() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(bathroomsMinimumOption).click();
    }

    public void check2BedsMinFilterSelected() {
        element(selectedTwoBedsMinimumFilter).shouldBeVisible();
    }

    public void check2BedsRangeFilterSelected() {
        element(selectedFilterFor2Beds).shouldBeVisible();
    }

    public void checkMultiBedroomsFiltersSelected() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(element(selectedFilterFor2Beds).isDisplayed());
        softAssertions.assertThat(element(selectedFilterFor3Beds).isDisplayed());
        softAssertions.assertThat(element(selectedFilterFor4PlusBeds).isDisplayed());
        softAssertions.assertAll();
    }

    public void check2BathsMinFilterSelected() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(selectedTwoBathsMinFilter).shouldBeVisible();
    }

    public void check2BathsRangeFilterSelected() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(selectedFilter2Baths).shouldBeVisible();
    }

    public void checkMultiBathroomsFiltersSelected() {
        universalVerticalShortSwipe(totalRoomsSection);
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(element(selectedFilter2Baths).isDisplayed());
        softAssertions.assertThat(element(selectedFilterFor3Baths).isDisplayed());
        softAssertions.assertThat(element(selectedFilterFor4PlusBaths).isDisplayed());
        softAssertions.assertAll();
    }

    public void checkBedroomsRangeButtonIsNotSelected() {
        element(bedroomsRangeOption).shouldBeVisible();
    }

    public void checkBathroomsRangeButtonIsNotSelected() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(bathroomsRangeOption).shouldBeVisible();
    }

    public void collapseBedroomsFilters() {
        element(bedroomsCollapseButton).click();
    }

    public void collapseBathroomsFilters() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(bathroomsCollapseButton).click();
    }

    public void checkBedroomsRangeButtonSelected() {
        element(selectedBedroomsRangeOption).shouldBeVisible();
    }

    public void checkBathroomsRangeButtonSelected() {
        universalVerticalShortSwipe(totalRoomsSection);
        element(selectedBathroomsRangeOption).shouldBeVisible();
    }

    public void expandManhattanSection() {
        element(manhattanSection).click();
    }

    public void expandAllDownTownSection() {
        element(allDownTownSection).click();
    }

    public void openCustomBoundariesPage() {
        element(customBoundariesPlusButton).click();
    }

    public void checkMultiBathroomsFiltersSelected1To3() {
        universalVerticalShortSwipe(totalRoomsSection);
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(element(selectedFilterFor1Bath).isDisplayed());
        softAssertions.assertThat(element(selectedFilterFor1AndHalfBath).isDisplayed());
        softAssertions.assertThat(element(selectedFilter2Baths).isDisplayed());
        softAssertions.assertThat(element(selectedFilterFor3Baths).isDisplayed());
        softAssertions.assertAll();
    }

    public void checkMultiBedroomsFiltersSelectedFrom1To3() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(element(selectedFilterFor1Bed).isDisplayed());
        softAssertions.assertThat(element(selectedFilterFor2Beds).isDisplayed());
        softAssertions.assertThat(element(selectedFilterFor3Beds).isDisplayed());
        softAssertions.assertAll();
    }

    public void clearSquareFeetMinFilter() {
        universalVerticalSwipe(collapseReleaseSponsorArrow);

        element(squareFeetMinValueField).clear();
    }

    public void setSquareFeetMaxFilter(String value) {
        universalVerticalSwipe(collapseReleaseSponsorArrow);

        if(Config.isAndroid()) {
            element(squareFeetMaxValueField).sendKeys(value);
        }
        else {
            element(squareFeetMaxValueField).typeAndEnter(value);
        }
    }

    public void checkSqFeetMinFieldIsEmpty() {
        String valueToCheck;

        universalVerticalSwipe(squareFeetMinValueField);
        if (Config.isAndroid()) {
            valueToCheck = squareFeetMinValueField.getAttribute("text");
        } else {
            valueToCheck = squareFeetMinValueField.getAttribute("value");
        }
        Assert.assertEquals("Min", valueToCheck);
    }

    public void checkSqFeetMaxFieldIsEmpty() {
        String valueToCheck;

        Helper.universalVerticalSwipe(squareFeetMaxValueField);
        if (Config.isAndroid()) {
            valueToCheck = squareFeetMaxValueField.getAttribute("text");
        } else {
            valueToCheck = squareFeetMaxValueField.getAttribute("value");
        }
        Assert.assertEquals("Max", valueToCheck);
    }

    public void deselectCondoFilter() {
        universalVerticalSwipe(selectedCondoFilter);
        element(selectedCondoFilter).click();
    }

    public void selectCoopFilter() {
        element(coopFilter).click();
    }

    public void deselectCoopFilter() {
        Helper.universalVerticalSwipe(selectedCoopFilter);
        element(selectedCoopFilter).click();
    }

    public void selectTownhouseFilter() {
        element(townhouseFilter).click();
    }

    public void selectSalesProperty() {
        element(salesProperty).click();
    }

    public void checkNoOnePropertyIsSelectedInSales() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(element(selectedSalesProperty).isDisplayed());
        softAssertions.assertThat(element(condoFilter).isDisplayed());
        softAssertions.assertThat(element(coopFilter).isDisplayed());
        softAssertions.assertThat(element(townhouseFilter).isDisplayed());
        softAssertions.assertAll();
    }

    public void checkNoOnePropertyIsSelectedInRentals() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(element(selectedRentalsProperty).isDisplayed());
        softAssertions.assertThat(element(condoFilter).isDisplayed());
        softAssertions.assertThat(element(coopFilter).isDisplayed());
        softAssertions.assertThat(element(townhouseFilter).isDisplayed());
        softAssertions.assertThat(element(rentalFilter).isDisplayed());
        softAssertions.assertAll();
    }

    public void swipeToPropertiesSection() {
        Helper.universalVerticalSwipe(propertyTypeSection);
    }

    public void deselectTownhouseFilter() {
        Helper.universalVerticalSwipe(selectedTownhouseFilter);
        element(selectedTownhouseFilter).click();
    }

    public void selectRentalFilter() {
        element(rentalFilter).click();
    }

    public void clickOnCollapsePropertyButton() {
        element(propertyTypeCollapseButton).click();
    }

    public void checkCondoFilterIsSelectedInSalesProperty() {
        universalVerticalSwipe(selectedSalesProperty);
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(element(selectedSalesProperty).isDisplayed());
        softAssertions.assertThat(element(selectedCondoFilter).isDisplayed());
        softAssertions.assertAll();
    }

    public void checkCondoFilterIsSelectedInRentalsProperty() {
        universalVerticalSwipe(selectedRentalsProperty);
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(element(selectedRentalsProperty).isDisplayed());
        softAssertions.assertThat(element(selectedCondoFilter).isDisplayed());
        softAssertions.assertAll();
    }

    public void fillInAddressSearchField(String address) {
        element(searchAddressField).sendKeys(address);
    }

    public void closeSearch() {
        element(closeSearchButton).click();
    }

    public void checkManhattanIsNotVisible() {
        element(manhattanCheckedCheckbox).shouldNotBeVisible();
    }

    public void clickOnFirstSixListings() {
        waitFor(ExpectedConditions.visibilityOf(firstBuilding));
        for (int i = 0; i < 3; i++) {
            buildingsList.get(i).click();
        }
    }

    public void checkIfBuildingsFilterChangesAreSaved() {
        Assert.assertEquals(3, removeButtonList.size());
    }

    public void deleteFirstBuildingFilter() {
        for (int i = 0; i < 2; i++) {
            removeButtonList.get(i).click();
        }
        element(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name BEGINSWITH 'Remove Button: '")).click();
    }

    public void checkIfBedAndBathThreeMinimumFiltersAreSelected() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(element(selectedThreeBedsMinimumFilter).isDisplayed());
        universalVerticalShortSwipe(totalRoomsSection);
        softAssertions.assertThat(element(selectedThreeBathsMinimumFilter).isDisplayed());
        softAssertions.assertAll();
    }

    public void checkIfBedAndBathThreeRangeFiltersAreSelected() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(element(selectedFilterFor3Beds).isDisplayed());
        universalVerticalShortSwipe(totalRoomsSection);
        softAssertions.assertThat(element(selectedFilterFor3Baths).isDisplayed());
        softAssertions.assertAll();
    }

    public void fillInTotalRoomsMinField(String value) {
        Helper.universalVerticalSwipe(totalRoomsSection);
        element(totalRoomsMinValueField).sendKeys(value);
        if (!Config.isAndroid()) {
            getDriver().findElement(By.name("Done")).click();
        }
    }

    public void clearTotalRoomsMinValueFiled() {
        Helper.universalVerticalSwipe(totalRoomsSection);
        element(totalRoomsMinValueField).clear();
    }

    public void clearMinimumPriceFilters() {
        element(minimumPriceTextBox).clear();
        if (!Config.isAndroid()) {
            getDriver().findElement(By.name("Done")).click();
        }
    }

    public void clearMaximumPriceFilters() {
        element(maximumPriceTextBox).clear();
        if (!Config.isAndroid()) {
            getDriver().findElement(By.name("Done")).click();
        }
    }

    public void clickOnOutdoorSpaceFilter() {
        Helper.universalVerticalSwipe(outdoorSpaceCheckmarkFiler);
        element(outdoorSpaceCheckmarkFiler).click();
    }

    public void deselectOutDoorSpaceCheckmarkFilter() {
        Helper.universalVerticalSwipe(selectedOutdoorSpaceCheckmarkFilter);
        element(selectedOutdoorSpaceCheckmarkFilter).click();
    }

    public void checkLaundryBuildingAndOutdoorSpaceFiltersAreSelected() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(element(selectedLaundryBLDGFilter).isDisplayed());
        softAssertions.assertThat(element(selectedOutdoorSpaceCheckmarkFilter).isDisplayed());
        softAssertions.assertAll();
    }


    public void checkJustCreatedCustomBoundaryIsDisplayed() {
        element(MobileBy.AccessibilityId("Remove Button: " + SessionVariables.getValueFromSessionVariable("Custom_Boundary_name"))).shouldBeVisible();
    }

    public void openJustCreatedCustomBoundary() {
        element(MobileBy.AccessibilityId(SessionVariables.getValueFromSessionVariable("Custom_Boundary_name"))).click();
    }

    public void removeJustCreatedCustomBoundary() {
        element(MobileBy.AccessibilityId("Remove Button: " + SessionVariables.getValueFromSessionVariable("Custom_Boundary_name"))).click();
    }

    public void selectSponsorOption() {
        universalVerticalSwipe(resaleSponsorSection);
        element(sponsorOption).click();
    }

    public void checkIfSponsorOptionIsSelected() {
        universalVerticalSwipe(resaleSponsorSection);
        element(selectedSponsorOption).shouldBeVisible();
    }

    public void selectResaleOption() {
        universalVerticalSwipe(resaleSponsorSection);
        element(resaleOption).click();
    }

    public void fillInPricePerSquareFeetMinField(String value) {
        universalVerticalSwipe(collapseReleaseSponsorArrow);
        element(minPricePerFTField).sendKeys(value);
        if (!Config.isAndroid()) {
            getDriver().findElement(By.name("Done")).click();
        }
    }

    public void fillInPricePerSquareFeetMaxField(String value) {
        element(maxPricePerFTField).sendKeys(value);
        if (!Config.isAndroid()) {
            getDriver().findElement(By.name("Done")).click();
        }
    }

    public void clearMinPricePerSFTField() {
        universalVerticalSwipe(collapseReleaseSponsorArrow);
        element(minPricePerFTField).clear();
    }

    public void clearMaxPricePerSFTField() {
        element(maxPricePerFTField).clear();
    }

    public void fillInMonthliesMinField(String value) {
        universalVerticalSwipe(minMonthliesInputFiled);
        element(minMonthliesInputFiled).sendKeys(value);
        if (!Config.isAndroid()) {
            getDriver().findElement(By.name("Done")).click();
        }
    }

    public void fillInMonthliesMaxField(String value) {
        element(maxMonthliesInputFiled).sendKeys(value);
        if (!Config.isAndroid()) {
            getDriver().findElement(By.name("Done")).click();
        }
    }

    public void clearMinMonthliesField() {
        universalVerticalSwipe(minMonthliesInputFiled);
        element(minMonthliesInputFiled).clear();
    }

    public void clearMaxMonthliesField() {
        element(maxMonthliesInputFiled).clear();
    }

    public void fillInFinancingMinField(String value) {
        universalVerticalSwipe(financingMinValueField);
        element(financingMinValueField).sendKeys(value);
        if (!Config.isAndroid()) {
            getDriver().findElement(By.name("Done")).click();
        }
    }

    public void fillInFinancingMaxField(String value) {
        element(financingMaxValueField).sendKeys(value);
        if (!Config.isAndroid()) {
            getDriver().findElement(By.name("Done")).click();
        }
    }

    public void clearMinFinancingField() {
        universalVerticalSwipe(financingMinValueField);
        element(financingMinValueField).clear();
    }

    public void clearMaxFinancingField() {
        element(financingMaxValueField).clear();
    }

    public void selectCorePublicOption() {
        if (Config.isAndroid()) {
            universalVerticalSwipe(buildingWidthTitle);
        } else {
            universalVerticalSwipe(financingMinValueField);
        }
        element(corePublicOption).click();
    }

    public void selectOtherPublicOption() {
//        universalVerticalSwipe(financingMinValueField);
        universalVerticalSwipe(buildingWidthTitle);
//        if (!Config.isAndroid()) {
//            element(collapseReleaseSponsorArrow).click();
//        }
        element(otherPublicOption).click();
    }

    public void checkIfFieldIsFilledByCorrectValue(String element, String value) {
        String elementsValue;

        if(Config.isAndroid()) {
            universalVerticalSwipe(element(MobileBy.AccessibilityId(element)));
        }

        WebElement elementToCheck = getDriver().findElement(MobileBy.AccessibilityId(element));

        if (Config.isAndroid()) {
            elementsValue = elementToCheck.getAttribute("text").replaceAll("[%$, .]", "");
        } else {
            elementsValue = elementToCheck.getAttribute("value").replaceAll("[%$, .]", "");
        }

//        universalVerticalSwipe(elementToCheck);
        Assert.assertEquals(value, elementsValue);
    }

    public void enterTextInTextSearchField(String value) {
        universalVerticalSwipe(textSearchField);
        element(textSearchField).sendKeys(value);
        if(!Config.isAndroid()) {
            element(returnButtonOnKeyboard).click();
        }
    }

    public void clearTextSearchField() {
        universalVerticalSwipe(textSearchField);
        element(textSearchField).clear();
    }

    public void checkThatAllOfTheseTermsButtonSelected() {
        universalVerticalSwipe(selectedAllOfTheseTermsButton);
        Assert.assertTrue(element(selectedAllOfTheseTermsButton).isDisplayed());
    }

    public void checkThatTextSearchFieldSavedTest(String value) {
        universalVerticalSwipe(textSearchField);
        if(Config.isAndroid()) {
            Assert.assertEquals(value, element(textSearchField).getAttribute("text"));
        } else {
            Assert.assertEquals(value, element(textSearchField).getAttribute("value"));
        }
    }

    public void clickOnAllOfTheseTermsButton() {
        element(allOfTheseTermsButton).click();
    }

    public void clickOnAnyOfTheseTermsButton() {
        element(anyOfTheseTermsButton).click();
    }

    public void clearSquareFeetMaxFilter() {
        element(squareFeetMaxValueField).clear();
    }

    public void setMaxBldgWidthValue() throws Exception {
        element(collapseLocationArrow).click();
        element(collapseBedroomsArrow).click();
        Helper.universalVerticalSwipe(bldgWidthSection);

        Helper.horizontalElementSwipeForIOS(buildWightMaxControl, 120);
//        Helper.universalHorizontalSwipe(buildWightMaxControl, y);
    }

    public void setDateRange(String date) {
       element(MobileBy.AccessibilityId(date)).click();
    }

    public void clickOnOpenHouseMinValueField() {
        universalVerticalSwipe(openHouseMinValueInput);
        element(openHouseMinValueInput).click();
    }

    public void openNextMonthPage() {
        element(nextMonthPageButton).click();
    }

    public void checkIfOpenHouseDateRangeIsCorrect(String firstDate, String secondDate) {
        String firstValueToCheck;
        String secondValueToCheck;

        universalVerticalSwipe(openHouseMinValueInput);
        if (Config.isAndroid()) {
            firstValueToCheck = openHouseMinValueInput.getAttribute("text").substring(3,5);
            secondValueToCheck = openHouseMaxValueInput.getAttribute("text").substring(3,5);
        } else {
            firstValueToCheck = openHouseMinValueInput.getAttribute("value").substring(3,5);
            secondValueToCheck = openHouseMaxValueInput.getAttribute("value").substring(3,5);
        }
        Assert.assertEquals(firstDate, firstValueToCheck);
        Assert.assertEquals(secondDate, secondValueToCheck);
    }

    public void clickOnListingActivityMinValueField() {
        universalVerticalSwipe(priceDropOption);
        element(listingActivityMinValueInput).click();
    }

    public void openPreviousMonthPage() {
        element(previousMonthPageButton).click();
    }

    public void selectListedListingActivityOption() {
        element(listedOption).click();
    }

    public void clickOnResetDataButton() {
        element(resetDateButton).click();
    }

    public void clickOnCloseCalendarButton() {
        element(closeCalendarButton).click();
    }

    public void checkIfListingStatusDateRangeIsCorrect(String firstDate, String secondDate) {
        String firstValueToCheck;
        String secondValueToCheck;

        universalVerticalSwipe(listingActivityMinValueInput);

        if(Config.isAndroid()) {
            firstValueToCheck = listingActivityMinValueInput.getAttribute("text").substring(3,5);
            secondValueToCheck = listingActivityMaxValueInput.getAttribute("text").substring(3,5);
        } else {
            firstValueToCheck = listingActivityMinValueInput.getAttribute("value").substring(3,5);
            secondValueToCheck = listingActivityMaxValueInput.getAttribute("value").substring(3,5);
        }
        Assert.assertEquals(firstDate, firstValueToCheck);
        Assert.assertEquals(secondDate, secondValueToCheck);
    }

    public void checkIfCorePublicOptionIsSelected() {
//        universalVerticalSwipe(financingMinValueField);
        universalVerticalSwipe(buildingWidthTitle);
//        if (!Config.isAndroid()) {
//            element(collapseReleaseSponsorArrow).click();
//        }
//        element(selectedCorePublicButton).shouldBeVisible();
        setImplicitTimeout(3, SECONDS);
        if (Config.isAndroid()) {
            Assert.assertEquals(0, getDriver().findElements(MobileBy.AccessibilityId("Brokerage Suboption: CORE Public")).size());
        } else {
            Assert.assertEquals(0, getDriver().findElements(MobileBy.AccessibilityId("brokerage: deselected STRI Public")).size());
        }
        resetImplicitTimeout();
    }

    public void checkIfMaxBldgWidthValueIsCorrect(String maxFilterValue) {
//        element(MobileBy.AccessibilityId(maxFilterValue)).getAttribute("value");
        Assert.assertEquals(maxFilterValue, element(MobileBy.AccessibilityId(maxFilterValue)).getAttribute("value"));
    }

    public void clickOnListingByAddress(String address) {
        element(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value CONTAINS '" + address + "'")).click();
    }

    public void fillInTotalRoomsMaxField(String value) {
        Helper.universalVerticalSwipe(totalRoomsSection);
        element(totalRoomsMaxValueField).sendKeys(value);
        if (!Config.isAndroid()) {
            getDriver().findElement(By.name("Done")).click();
        }
    }

    public void clearTotalRoomsMaxValueFiled() {
        Helper.universalVerticalSwipe(totalRoomsSection);
        element(totalRoomsMaxValueField).clear();
    }

    public void singleUpSwipeForAndroid() {
        Helper.singleUpShortSwipeAndroid();
    }

    public void openFirstBuilding() {
        element(firstBuildingInSearch).click();
    }

    public void closeAddressSearch() {
        element(closeSearchAddressButton).click();
    }

    public void clearAddressSearchField() {
        element(searchAddressField).clear();
    }

    public void clickOnCrossBackButtonFromAddressSearch() {
        element(addressSearchCancelButton).click();
    }

    public void closeSavedSearches() {
        element(closeSavedSearchesButton).click();
    }

    public void waitUntilFirstSearchAppears() {
        waitFor(ExpectedConditions.visibilityOf(firstBellIcon));
    }

    public void checkBuildingPillIsDisplayed(String address) {
        element(MobileBy.AccessibilityId(address)).shouldBeVisible();
    }

    public void checkFirstBuildingPillIsUnderBuildingTitle(String address) {
        WebElement buildingPill = element(MobileBy.AccessibilityId(address));

        Assert.assertEquals(getYPositionOfElement(buildingsTitle) + 32, getYPositionOfElement(buildingPill));
    }

    public void manhattanPillIsNotShownAtSearchPage() {
        setImplicitTimeout(3, SECONDS);
        element(manhattanCheckedCheckbox).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void brooklynPillIsNotShownAtSearchPage() {
        setImplicitTimeout(3, SECONDS);
        element(brooklynRemoveIcon).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void queensPillIsNotShownAtSearchPage() {
        setImplicitTimeout(3, SECONDS);
        element(queensRemoveIcon).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void checkBuildingPillIsNotDisplayed(String address) {
        setImplicitTimeout(3, SECONDS);
        element(MobileBy.AccessibilityId(address)).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void checkIfAddressBuildingIsReturned(String address) {
        element(MobileBy.AccessibilityId(address)).shouldBeVisible();
    }

    public void checkIfResultsAreCleared() {
        Assert.assertTrue(element(searchAddressField).getAttribute("value").contains("ADDRESS OR BUILDING NAME..."));
    }

    public void getCountActiveSalesAndRentals() {
        String activeSalesAndRentalsCount;
        activeSalesAndRentalsCount = element(activeSalesAndRentals).getAttribute("value");
        SessionVariables.addValueInSessionVariable("activeSalesAndRentals", activeSalesAndRentalsCount);
    }

    public void getNeighborhoodAndBuildingType() {
        neighborhoodAndBuilding = element(neighborhoodAndBuildingType).getAttribute("value");
    }

    public void checkIfAddressBuildingIsReturnedFirst(String address) {
        Assert.assertEquals(address, element(firstBuildingInSearch).getAttribute("value"));
    }

    public void getListOfBuildings(int amount) {
        for (int i = 0; i < amount; i++) {
            listOfBuildingAddresses.add(i, buildingAddressesList.get(i).getAttribute("value"));
        }
    }

    public void manhattanPillIsShownAtSearchPage() {
        element(manhattanCheckedCheckbox).shouldBeVisible();
    }

    public void brooklynPillIsShownAtSearchPage() {
        element(brooklynRemoveIcon).shouldBeVisible();
    }

    public void queensPillIsShownAtSearchPage() {
        element(queensRemoveIcon).shouldBeVisible();
    }

    public void clickOnCollapseExpandLocationButton() {
        element(collapseExpandLocationButton).click();
    }
}