package com.perchwell.pages.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.FilteringAndSortingBuildings;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebElement;

import javax.swing.text.AttributeSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPage extends BasePage {

	public MapPage(WebDriver driver) {
		super(driver);
	}

	public static int numberOfItemsInMapView;

	@iOSXCUITFindBy(accessibility = "NOT NOW")
	private WebElement notNowButton;

	@iOSXCUITFindBy(className = "XCUIElementTypeMap")
    private WebElement map;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/title")
	@iOSXCUITFindBy(accessibility= "MY NEW SEARCH")
	private WebElement myNewSearch;

	@AndroidFindBy(xpath = "//android.view.View/android.view.View")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'GMSMarker'")
	private List<WebElement> clusterList;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/baths")
	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '1½ BA'")
	private WebElement oneAndHalfBaths;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/beds")
	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '1 BD'")
    private WebElement oneBed;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'SORTING'")
	private WebElement sortingButton;

	@iOSXCUITFindBy(accessibility = "LEAST EXPENSIVE")
	private WebElement leastExpensiveOption;

	@iOSXCUITFindBy(accessibility = "MOST EXPENSIVE")
	private WebElement mostExpensiveOption;

	@iOSXCUITFindBy(accessibility = "BEDROOMS")
	private WebElement bedroomsOption;

	@iOSXCUITFindBy(accessibility = "BATHROOMS")
	private WebElement bathroomsOption;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '$'")
	private List<WebElement> pricesList;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'BD'")
	private List<WebElement> bedroomsList;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'BA'")
	private List<WebElement> bathroomsList;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/listing_address")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	private WebElement mapFirstAddress;

	public void clickOnNotNowButton() {
		if (!Config.isAndroid()){
			element(notNowButton).click();
		}
	}

	public Integer countItemsInMapView() {
		return getDriver().findElements(By.name("cluster")).size();
	}

	public void zoom(String scale, String velocity) {
		AppiumDriver driver = getAppiumDriver();
		Map<String, Object> params = new HashMap<>();

		params.put("scale", scale);
		params.put("velocity", velocity);
		params.put("element", ((RemoteWebElement) map).getId());
		driver.executeScript("mobile: pinch", params);
	}

	private AppiumDriver getAppiumDriver() {
		WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
		WebDriver webDriver = webDriverFacade.getProxiedDriver();
		return (AppiumDriver) webDriver;
	}

	public void swipeRight() throws Exception {
		AppiumDriver appiumDriver = getAppiumDriver();
		Helper.swipeHorizontal(appiumDriver, 0.8, 0.7, 0.7, 1);
	}

	public void clickOnMyNewSearch() {
		element(myNewSearch).click();
	}

	public boolean checkForChangesAfterApplyingTheFilter() {
		Boolean isCheckPassed = true;
		int numberPins = clusterList.size() < 10 ? clusterList.size() : 10;

		for (int i = 0; i < numberPins; i++) {
			WebElement cluster = clusterList.get(i);
			cluster.click();

			if (!Helper.isElementDisplayed(oneAndHalfBaths) || (!Helper.isElementDisplayed(oneBed))) {
				isCheckPassed = false;
				break;
			}
		}
		return isCheckPassed;
	}

	public void shouldFiltersBeApplied() {
		waitABit(10000);
		Assert.assertTrue(checkForChangesAfterApplyingTheFilter());
	}

	public void swipeBuilding() throws Exception {
		int y = pricesList.get(0).getLocation().getY();
		Helper.swipeRightElementWithSetY(pricesList.get(0), y+1);
	}

	public void clickOnSecondPin() {
		clusterList.get(0).click();

	}

	public void clickOnSortingButton() {
		element(sortingButton).click();
	}

	public void clickOnLeastExpensiveSection() {
		element(leastExpensiveOption).click();
	}

	public void clickOnMostExpensiveSection() {
		element(mostExpensiveOption).click();
	}

	public void clickOnBedroomsSection() {
		element(bedroomsOption).click();
	}

	public void clickOnBathroomsSection() {
		element(bathroomsOption).click();
	}

	public void shouldListingBeSortedByLeastExpensive() {
        boolean isSortedByLeastExpensive = FilteringAndSortingBuildings.getCounterInSorting("priceLeast", pricesList) == 0;
        Assert.assertTrue(isSortedByLeastExpensive);
    }

    public void shouldListingBeSortedByMostExpensive() {
        boolean isSortedByMostExpensive = FilteringAndSortingBuildings.getCounterInSorting("priceMost", pricesList) == 1;
        Assert.assertTrue(isSortedByMostExpensive);
    }

    public void shouldListingBeSortedByBedrooms() {
        boolean isSortedByBedrooms = FilteringAndSortingBuildings.getCounterInSorting("bedrooms", bedroomsList) == 1;
        Assert.assertTrue(isSortedByBedrooms);
    }

    public void shouldListingBeSortedByBathrooms() {
        boolean isSortedByBathrooms = FilteringAndSortingBuildings.getCounterInSorting("bathrooms", bathroomsList) == 1;
        Assert.assertTrue(isSortedByBathrooms);
    }

    public void checkSortLabel(String sortType) {
        waitFor(sortingButton);
        element(sortingButton).shouldContainText(sortType);
    }

	public void checkListings() {
		Boolean correctPin = false;
		List<WebElement> incorrectListings;

		for (WebElement pin: clusterList) {
			incorrectListings = getDriver().findElements(MobileBy.iOSNsPredicateString("name == 'NA'"));
			if (incorrectListings.isEmpty()) {
				correctPin = true;
				break;
			}
			pin.click();
		}
		Assert.assertTrue(correctPin);
	}


	public void swipeMap() {
		WebElement pin = getDriver().findElement(MobileBy.iOSNsPredicateString("name CONTAINS 'cluster'"));
		int y = pin.getLocation().getY();
		Helper.swipeRightElementABitWithSetY(y);
	}

    public String getPinFirstListingAddress() {
		if (Config.isAndroid())
		{
			return (mapFirstAddress).getAttribute("text");
		}
		else {
			return (mapFirstAddress).getAttribute("name");
		}
    }

	public void clickOnPinFirstListing(String pinListingAddress) {
		if (Config.isAndroid()){
			element(mapFirstAddress).click();//////////////
		}
		else{
			element(MobileBy.AccessibilityId(pinListingAddress)).click();
		}
	}

	public void checkFirstListingIsOpened(String pinListingAddress) {
		if (Config.isAndroid()){
			element(By.xpath("//*[@text='" + pinListingAddress + "']")).shouldBeVisible();
		}
		else{
			element(MobileBy.iOSClassChain("**/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText[$name CONTAINS '" + pinListingAddress + "'$]")).shouldBeVisible();
		}
	}
}
