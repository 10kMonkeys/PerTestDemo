package com.perchwell.pages.perchwell;

import com.perchwell.helpers.FilteringAndSortingBuildings;
import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PerchwellPage extends BasePage {

	private int listningsAmmount;

	public PerchwellPage(WebDriver driver) {
		super(driver);
	}

	@iOSXCUITFindBy(accessibility = "EDIT SEARCH FILTERS OR SEARCH FOR A SPECIFIC ADDRESS")
	private WebElement editSearchFiltersHint;

	@iOSXCUITFindBy(accessibility = "MANAGE YOUR PROFILE, CONTACTS, DISCUSSIONS, AND TAGS")
	private WebElement manageYourProfileHint;

	@iOSXCUITFindBy(accessibility = "TRANSFORM DATA INTO MARKET INSIGHTS")
	private WebElement transformDataHint;

	@iOSXCUITFindBy(accessibility = "EXPLORE SEARCH RESULTS BY LOCATION")
	private WebElement exploreSearchResultHint;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText[1]")
	private WebElement magnifierIcon;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar/XCUIElementTypeButton")
	private WebElement openAccountButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[1]")
	private WebElement firstBuilding;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[2]")
	private WebElement secondBuilding;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[3]")
	private WebElement thirdBuilding;

	@iOSXCUITFindBy(accessibility = "map_view_button")
	private WebElement map;

	@iOSXCUITFindBy(accessibility = "market report logo")
	private WebElement analyticsButton;

	@iOSXCUITFindBy(accessibility = "list_view_button")
	private WebElement listButton;

	@iOSXCUITFindBy(xpath = "*//XCUIElementTypeNavigationBar[1]/XCUIElementTypeStaticText[1]")
	private WebElement currentSearchInTitle;

	@iOSXCUITFindBy(iOSNsPredicate = "**//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
	private List<WebElement> aa;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'LISTINGS BY'")
	private WebElement listingsByButton;

	@iOSXCUITFindBy(accessibility = "BEDROOMS")
	private WebElement bedroomsSortButton;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'INFO'")
	private List<WebElement> roomsInfoList;

    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name CONTAINS 'PRICE'")
    private List<WebElement> pricesList;

    @iOSXCUITFindBy(accessibility = "LEAST EXPENSIVE")
    private WebElement leastExpensiveButton;

    @iOSXCUITFindBy(accessibility = "MOST EXPENSIVE")
    private WebElement mostExpensiveButton;

	@iOSXCUITFindBy(accessibility = "BATHROOMS")
	private WebElement bathroomsSortButton;

	@iOSXCUITFindBy(accessibility = "TOTAL ROOMS")
    private WebElement totalRoomsSortButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`visible==1`][-1]")
	private WebElement lastVisibleBuilding;

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'ADDRESS'")
	private WebElement firstBuildingAddress;

	private By nextBuildingToSwipeDown = By.xpath("//XCUIElementTypeCell[@visible=\"true\"][last()]/following::XCUIElementTypeCell[1]");

	@iOSXCUITFindBy(accessibility = "AccountDetailsHeader")
	private WebElement initials;

	@iOSXCUITFindBy(accessibility = "RESET PASSWORD")
	private WebElement resetPassword;

	public static Integer numberOfItemsInListView;
	// public String buildingAddress;

	public WebElement getThirdBuilding() {
		return thirdBuilding;
	}

	public void clickOpenAccountButton() {
		element(openAccountButton).click();
	}

	public void clickMagnifer() {
		element(magnifierIcon).click();
	}

	public void clickEditSearchFiltersHint() {
		setImplicitTimeout(1, SECONDS);
		element(editSearchFiltersHint).click();
		resetImplicitTimeout();
	}

	public Boolean isEditSearchFiltersHintisDisplayed() {
		return Helper.isElementDisplayed(editSearchFiltersHint);
	}

	public void clickManageYourProfileHint() {
		setImplicitTimeout(1, SECONDS);
		element(manageYourProfileHint).click();
		resetImplicitTimeout();
	}

	public void clickTransformDataHint() {
		setImplicitTimeout(1, SECONDS);
		element(transformDataHint).click();
		resetImplicitTimeout();
	}

	public void clickMap() {
		element(map).click();
	}

	public void clickExploreSearchResultHint() {
		setImplicitTimeout(1, SECONDS);
		element(exploreSearchResultHint).click();
		resetImplicitTimeout();
	}

	public void openFirstBuilding() {
		element(firstBuilding).click();
	}

	public void openSecondBuilding() {
		element(secondBuilding).click();
	}

	public void openThirdBuilding() throws Exception {
		element(thirdBuilding).click();
	}

	public boolean isBuildingDisplayedWithSwipe(WebElement element) throws Exception {
		setImplicitTimeout(1, SECONDS);
		Helper.swipeDownUntilElementVisible(element);
		resetImplicitTimeout();
		return element.isDisplayed();
	}

	public boolean editSearchFiltersHintIsDispalyed() {
		return element(editSearchFiltersHint).isDisplayed();
	}

	public Integer countItemsInListView() {
        String newString = "0";
        String s = listingsByButton.getAttribute("value");
        s = Helper.removeChar(s, ',');
        Pattern p = Pattern.compile("^\\d+\\s+");
        Matcher m = p.matcher(s);
        while (m.find()) {
            newString = m.group();
        }
        return Integer.parseInt(newString.trim());
	}

	public String getFistBuildingAddress() {
		return firstBuildingAddress.getAttribute("value");
	}

	public void addBuildingAddressInSessionVariable(String buildingName, String buildingAddress) {
		Serenity.setSessionVariable(buildingName).to(buildingAddress);
	}

	public void openAnalytics() {
		element(analyticsButton).click();
	}

	public void clickList() {
		element(listButton).click();
	}

	public boolean isElementExistsInEachCell(String element) {
		boolean isAllCellsContain = true;
		WebElement table = getDriver().findElements(By.className("XCUIElementTypeTable")).get(0);
		List<WebElement> listCells = table.findElements(By.className("XCUIElementTypeCell"));
		if (listCells.size() > 0) {
			for (int i = 0; (i < 10 || i < listCells.size()); i++) {
				if (listCells.get(i).findElements(By.name(element)).size() == 0) {
					isAllCellsContain = false;
					break;
				}
			}
		}
		return isAllCellsContain;
	}

	public void addValueInSessionVariable(String name, String value) {
		Serenity.setSessionVariable(name).to(value);
	}

	public String getValueFromSessionVariable(String name) {
		return Serenity.sessionVariableCalled(name);
	}

	public String getCurrentSearchName() {
		//	String currentName=withTimeoutOf(3,SECONDS).getDriver().findElement(By.xpath ("*//XCUIElementTypeNavigationBar[1]")).getAttribute("name");

		String currentName = currentSearchInTitle.getAttribute("name");
		return currentName;
	}

	public void isContainParticularRooms(String rooms) {
		Assert.assertTrue(FilteringAndSortingBuildings.isContainParticularRooms(roomsInfoList, rooms));
	}

	public void isContainsStudios() {
		Assert.assertTrue(FilteringAndSortingBuildings.isContainsStudios(roomsInfoList));
	}

	public void isContains4PlusParticularRooms(String roomType) {
		Assert.assertTrue(FilteringAndSortingBuildings.isContains4PlusParticularRooms(roomsInfoList, roomType));
	}

    public void clickOnListingsByButton() {
		element(listingsByButton).click();
    }

	public void clickOnBedroomsSortButton() {
		element(bedroomsSortButton).click();
	}

	public void checkSortLabel(String sortType) {
		if (!(element(listingsByButton).getAttribute("label").contains(sortType))) {
			Assert.assertTrue(false);
		}
	}

	public void clickOnBathroomsSortButton() {
		element(bathroomsSortButton).click();
	}

	public void swipeDownUntillNextBuildingVisible () throws Exception {
		setImplicitTimeout(1, SECONDS);
		Helper.swipeDownUntilElementVisible(getDriver().findElement(nextBuildingToSwipeDown));
		resetImplicitTimeout();
	}

	public void clickLastVisibleBuilding () {
		element(lastVisibleBuilding).click();
	}

	public void clickOnLeastExpensiveButton() {
	    element(leastExpensiveButton).click();
    }

    public void clickOnMostExpensiveButton() {
	    element(mostExpensiveButton).click();
    }

    public void clickOnTotalRoomsButton() {
	    element(totalRoomsSortButton).click();
    }

    public boolean isListingSortedByLeastExpensive() {
        return (FilteringAndSortingBuildings.getCounterInSorting("priceLeast", pricesList) == 0);
    }

    public boolean isListingSortedByMostExpensive() {
        return (FilteringAndSortingBuildings.getCounterInSorting("priceMost", pricesList) == 1);
    }

    public boolean isListingSortedByBedrooms() {
	    return (FilteringAndSortingBuildings.getCounterInSorting("bedrooms", roomsInfoList) == 1);
    }

    public boolean isListingSortedByBathrooms() {
        return (FilteringAndSortingBuildings.getCounterInSorting("bathrooms", roomsInfoList) == 1);
    }

    public boolean isInitialIconDispalyed(){
		return element(openAccountButton).isDisplayed();
	}

	public boolean isInfoRoomsPresent(String info) {
		return FilteringAndSortingBuildings.isSomeInfoPresentInBuildings(info, roomsInfoList);
	}

	public void clickOnInitials() {
		element(initials).click();
	}

	public void clickOnResetPassword() {
		element(resetPassword).click();
	}

	public void isListingsQuantity() {
		listningsAmmount = getNumberOfListings(listingsByButton);
	}

	public boolean checkListingsQuantity() {
		int listingsAmountToCheck = getNumberOfListings(listingsByButton);
		return ((listingsAmountToCheck > (listningsAmmount - 50)) && ((listningsAmmount + 50) > listingsAmountToCheck));
	}
	
	private int getNumberOfListings(WebElement listingsByButton) {
		String listingsByText = element(listingsByButton).getAttribute("value");
		StringBuilder listingsQty = new StringBuilder();

		for (int i = 0; i < listingsByText.length(); i++) {
			if (Character.isDigit(listingsByText.charAt(i))) {
				listingsQty.append(String.valueOf(listingsByText.charAt(i)));
			}
		}
		return Integer.parseInt(String.valueOf(listingsQty));
	}

    public boolean isPriceFilterAppliedOnListings(String typePriceFilter) {
	    String min = "0";
	    String max = "1000000";

	    if (Serenity.hasASessionVariableCalled("min price")) {
            min = getValueFromSessionVariable("min price");
        }

        if (Serenity.hasASessionVariableCalled("max price")) {
            max = getValueFromSessionVariable("max price");
        }
        return FilteringAndSortingBuildings.isPriceFilterAppliedOnListings(typePriceFilter, pricesList, min, max);
    }
}
