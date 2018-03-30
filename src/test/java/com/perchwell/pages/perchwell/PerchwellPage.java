package com.perchwell.pages.perchwell;

import com.perchwell.helpers.FilteringAndSortingBuildings;
import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PerchwellPage extends BasePage {

	private int totalCellAmmount;
	private final String BD = " BD";
	private StringBuilder baQty;

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

	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'LISTINGS'")
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
		return editSearchFiltersHint.isDisplayed();
	}

	public Integer countItemsInListView() {
		return getDriver().findElements(By.className("XCUIElementTypeCell")).size();
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

	public boolean isContainParticularRooms(String rooms) {
		WebElement table = getDriver().findElement(By.className("XCUIElementTypeTable"));
		List<WebElement> listCells = table.findElements(By.xpath("//XCUIElementTypeCell/XCUIElementTypeStaticText[1]"));

		if (listCells.size() > 0) {
			for (int i = 0; (i < 10 && i < listCells.size()); i++) {

//				String roomsString = listCells.get(i).findElement(element(roomsValue)).getAttribute("value");
				String roomsString = listCells.get(i).getAttribute("value");

				if (!roomsString.contains(rooms)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public boolean isContainsStudios() {
		WebElement table = getDriver().findElement(By.className("XCUIElementTypeTable"));
		List<WebElement> listCells = table.findElements(By.xpath("//XCUIElementTypeCell/XCUIElementTypeStaticText[1]"));

		if (listCells.size() > 0) {
			for (int i = 0; (i < 10 && i < listCells.size()); i++) {
				String studioString = listCells.get(i).getAttribute("value");

					if (studioString.contains(BD)) {
						return false;
					}
				}
				return true;
		}
		return false;
	}

	public boolean isContains4PlusParticularRooms(String roomType) {
		WebElement table = getDriver().findElement(By.className("XCUIElementTypeTable"));
		List<WebElement> listCells = table.findElements(By.xpath("//XCUIElementTypeCell/XCUIElementTypeStaticText[1]"));

		if (listCells.size() > 0) {
			for (int i = 0; (i < 10 && i < listCells.size()); i++) {
				baQty = new StringBuilder();
				String[] roomsValues = listCells.get(i).getAttribute("value").split("\\|");
				String particularRoomsValue = null;
				int counter = 0;

				while (counter < roomsValues.length) {
					if(roomsValues[counter].contains(roomType)) {
						particularRoomsValue = roomsValues[counter];
					} else if ((particularRoomsValue == null) && counter == (roomsValues.length - 1)) {
						return false;
					}
					counter++;
				}

				for (int j = 0; j < particularRoomsValue.length(); j++) {
					if (Character.isDigit(particularRoomsValue.charAt(j))) {
						baQty.append(String.valueOf(particularRoomsValue.charAt(j)));
					}
				}

				int roomsNumbers = Integer.parseInt(String.valueOf(baQty));

				if (roomsNumbers < 4) {
					return false;
				}

			}
			return true;
		}
		return false;
	}

    public void clickOnListingsByButton() {
		element(listingsByButton).click();
    }

	public void clickOnBedroomsSortButton() {
		element(bedroomsSortButton).click();
	}

	public void isListingsSortedByRooms(String roomType) {
		Assert.assertTrue(FilteringAndSortingBuildings.isSortedByRooms(roomsInfoList, roomType));
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
}
