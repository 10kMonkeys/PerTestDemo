package com.perchwell.pages.perchwell;

import com.perchwell.helpers.FilteringAndSortingBuildings;
import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebElement;

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

	@iOSXCUITFindBy(accessibility= "MY NEW SEARCH")
	private WebElement myNewSearch;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'cluster'")
	private List<WebElement> clusterList;

	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '1½ BA'")
	private WebElement oneAndHalfBaths;

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

	public void clickOnNotNowButton() {
		element(notNowButton).click();
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

	private boolean checkForChangesAfterApplyingTheFilter() {
		Boolean isCheckPassed = true;
		int numberPins = clusterList.size() < 10 ? clusterList.size() : 10;

		if (clusterList.size() > 0) {

			for (int i = 0; i < numberPins; i++) {
				WebElement cluster = clusterList.get(i);
				cluster.click();

				if (!Helper.isElementDisplayed(oneAndHalfBaths) || (!Helper.isElementDisplayed(oneBed))) {
					isCheckPassed = false;
					break;
				}
			}
		}
		return isCheckPassed;
	}

	public void shouldFiltersBeApplied() {
		Assert.assertTrue(checkForChangesAfterApplyingTheFilter());
	}

	public void swipeBuilding() throws Exception {
		int y = pricesList.get(0).getLocation().getY();
		Helper.swipeRightElementWithSetY(pricesList.get(0), y+1);
	}

	public void clickOnSecondPin() {
		clusterList.get(1).click();
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
}
