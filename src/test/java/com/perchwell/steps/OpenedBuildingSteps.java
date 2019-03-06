package com.perchwell.steps;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.perchwell.OpenedBuildingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class OpenedBuildingSteps extends ScenarioSteps {

	OpenedBuildingPage onPage;

	@Step
	public void clickOnDiscussWithMyClientHint() {
		if (!Config.isAndroid()) {
			onPage.clickOnDiscussWithMyClientHint();
		}
	}

	@Step
	public void clickOnMyTagsLabel() {
		onPage.clickOnMyTagsLabel();
	}

	@Step
	public void clickOnArrowBackButtonFromListing() {
		onPage.clickOnArrowBackButtonFromListing();
	}

	@Step
	public void clickOnDeleteTagButton() {
		onPage.clickOnDeleteTagButton();
	}

	@Step("Add to compare {0}")
	public void addToCompare(String buildingName) {
		onPage.clickOnAddToCompareButton();
		SessionVariables.addValueInSessionVariable(buildingName, onPage.getBuildingAddress());
	}

	@Step
	public void clickOnDiscussWithMyClientOption() {
		onPage.clickOnDiscussWithClientOption();
	}

	@Step
	public void clickOnAddDiscusButton() {
		onPage.clickOnAddDiscus();
	}

	@Step
	public void shouldSeeListingAddress() {
		onPage.isBuildingAddressDisplayed();
	}

	@Step
	public void openExistingDiscussion() {
		onPage.openExistingDiscussion(SessionVariables.getValueFromSessionVariable("Client"));
	}

	@Step
	public void shouldSeeExistingDiscussion() {
		onPage.discussionIsDisplayed(SessionVariables.getValueFromSessionVariable("Client"));
	}

	@Step
	public void clickOnSendWithinPerchwell() {
		onPage.clickOnSendWithinPerchwell();
	}

	@Step
	public void shouldSeeExistingDiscussionWithAgent() {
		onPage.discussionIsDisplayed(SessionVariables.getValueFromSessionVariable("Agent"));
	}

	@Step
	public void openExistingDiscussionWithAgent() {
		onPage.openExistingDiscussion(SessionVariables.getValueFromSessionVariable("Agent"));
	}

	@Step
	public void isDiscussionWithMyClientDisplayed() {
		onPage.isDiscussionWithMyClientDisplayed();
	}

	@Step
	public void isFilterStudioApplied() {
		onPage.isTextStudioDisplayed();
	}

	@Step
	public void isFilter1BathApplied() {
		onPage.isText1BathDisplayed();
	}

	@Step
	public void shouldFilterFireplaceApplied() throws Exception {
		onPage.clickFeaturesAmenities();
		onPage.isFireplaceDisplayed();
	}

	@Step
	public void clickShareButton() {
		onPage.clickOnShareButton();
	}

	@Step
	public void isBuildingOpen() {
		onPage.isBuildingOpen();
	}

	@Step
	public void openDiscussionWithJustCreatedClient() {
		onPage.openDiscussionWithJustCreatedClient(SessionVariables.getValueFromSessionVariable("User_name"));
	}

	@Step
	public void shouldFilterLaundryBLDG() throws Exception {
		onPage.clickFeaturesAmenities();
		onPage.isLaundryBLDGDisplayed();
	}

	@Step
    public void clickOnSeveralSellersAgentSection() {
		onPage.clickOnSeveralSellersAgentSection();
    }

    @Step
    public void removeAllTags() {
    	onPage.removeAllTAgs();
	}

	@Step
	public void shouldSeeFirstExistingTag() {
		onPage.shouldSeeSpecificTag(SessionVariables.getValueFromSessionVariable("First_Existing_Tag"));
	}

	@Step
	public void getFirstBuildingAddress() {
		onPage.saveFirstBuildingAddress();
	}

	@Step
	public void getSecondBuildingAddress() {
		onPage.saveSecondBuildingAddress();
	}

	@Step
	public void clickOnCancelButton() {
		onPage.clickOnCancelButton();
	}

	@Step
	public void clickOnCancelButtonInDiscussWithClient() {
		onPage.clickOnCancelButtonInDiscussWithClient();
	}

	@Step
	public void reopenDiscussionsPopUpInListingOnlyForAndroid() {
		if(Config.isAndroid()) {
			this.clickOnCancelButtonInDiscussWithClient();
			this.clickShareButton();
			this.clickOnSendWithinPerchwell();
		}
	}

	@Step
	public void fillInSearchFieldByNeighborhood() {
		onPage.fillInSearchField(SessionVariables.getValueFromSessionVariable("Neighborhood_value"));
	}

	@Step
	public void checkIfListingsAreFilteredByBeds() {
		onPage.checkIfListingsAreFilteredByBeds();
	}

	@Step
	public void clickOnClearFieldButton() {
		onPage.clickOnClearFieldButton();
	}

	@Step
	public void checkIfListingReturnedToInitialState() {
		onPage.checkIfListingReturnedToInitialState();
	}

	@Step
	public void swipeToTheListings() {
		onPage.swipeToTheListings();
	}

	@Step
	public void getBedsAndBathsListingsAmount() {
		onPage.getInitialBedsAndBathsAmountList();
	}

	@Step
	public void clickOnTestListing() {
		onPage.clickOnTestListing();
	}

	@Step
	public void skipDiscussWithClientHint() {
		onPage.skipDiscussWithClientHint();
	}

	@Step
	public void checkIfListingsAreFilteredByBaths() {
		onPage.checkIfListingsAreFilteredByBaths();
	}

	@Step
	public void checkIfListingsAreFilteredByNeighborhood() {
		onPage.checkIfListingsAreFilteredByNeighborhood();
	}

	@Step
	public void getNeighborhoodValue() {
		onPage.getNeighborhoodValue();
	}

	@Step
	public void clickOnMoreInBuildingSection() {
		onPage.clickOnMoreInBuildingSection();
		onPage.checkMoreInBuildingSectionIsOpened();
	}

	@Step
	public void checkIfSearchFieldIsFilledByNeighborhood() {
		onPage.checkIfSearchFieldIsFilledByNeighborhood();
	}

	@Step
	public void clickOnSimilarListingsSection() {
		onPage.clickOnSimilarListingsSection();
		onPage.checkSimilarListingsSectionIsOpened();
	}

	@Step
	public void fillInSearchFieldByFilter(String value) {
		onPage.fillInSearchField(value);
	}

	@Step
	public void fixSearchField() {
		onPage.fixSearchField();
		onPage.clickOnSimilarListingsSection();
	}

	@Step
	public void checkIfListingsAreFilteredByActiveStatus() {
		onPage.checkIfListingsAreFilteredByActiveStatus();
	}

	@Step
	public void checkIfListingsAreFilteredByInContractStatus() {
		onPage.checkIfListingsAreFilteredByInContractStatus();
	}

	@Step
	public void checkIfListingsAreFilteredByInContractStatusWithoutLabel() {
		onPage.checkIfListingsAreFilteredByInContractStatusWithoutLabel();
	}

	@Step
	public void clickOnSortButton() {
		onPage.clickOnSortButton();
	}

	@Step
	public void clickOnLeastExpensiveButton() {
		onPage.clickOnLeastExpensiveButton();
	}

	@Step
	public void clickOnMostExpensiveButton() {
		onPage.clickOnMostExpensiveButton();
	}

	@Step
	public void clickOnSortByBedroomsButton() {
		onPage.clickOnSortByBedroomsButton();
	}

	@Step
	public void checkIfSearchFieldIsFilledByFilter(String value) {
		onPage.checkIfSearchFieldIsFilledByFilter(value);
	}

	@Step
	public void checkIfMostExpensiveSortingButtonIsEnabled() {
		onPage.checkIfMostExpensiveSortingButtonIsEnabled();
	}

	@Step
	public void clickOnPastListingsSection() {
		onPage.clickOnPastListingsSection();
		onPage.checkPastListingsSectionIsOpened();

	}

	@Step
	public void clickOnCurrentListingsSection() {
		onPage.clickOnCurrentListingsSection();
		onPage.checkCurrentListingsSectionIsOpened();
	}

	@Step
    public void checkIfLeastExpensiveSortingButtonIsEnabled() {
		onPage.checkIfLeastExpensiveSortingButtonIsEnabled();
    }

    @Step
	public void bedroomsSortButtonShouldBeEnabled() {
			onPage.bedroomsSortButtonShouldBeEnabled();
	}

	@Step
	public void fixListingsSearchField() {
		onPage.fixListingsSearchField();
		onPage.clickOnCurrentListingsSection();
	}

	@Step
	public void closeSortWindow() {
		onPage.closeSortWindow();
	}

	@Step
	public void checkIfTenListingsReturnedToInitialState() {
		onPage.checkIfTenListingsReturnedToInitialState();
	}

	@Step
	public void checkListingsStatus(String status) {
		onPage.checkListingsStatus(status);
	}

	@Step
	public void checkListingsStatusNormal(String status) {
		onPage.checkListingsStatusNormal(status);
	}

	@Step
	public void shouldSeeNoMatchLabel() {
		onPage.shouldSeeNoMatchLabel();
	}

	@Step
	public void checkIfBuildingsAreFilteredByNeighborhood() {
		onPage.checkIfBuildingsAreFilteredByNeighborhood();
	}

	@Step
    public void getTestAgentEmail() {
		onPage.getTestAgentEmail();
    }

    @Step
    public void clearTagsList() {
		onPage.clearTagsList();
    }

    @Step
	public void shouldNotSeeFirstExistingTag() {
		onPage.shouldNotSeeSpecificTag(SessionVariables.getValueFromSessionVariable("First_Existing_Tag"));
	}

	@Step
	public void shouldSeeSpecificClient() {
		onPage.shouldSeeSpecificClient();
	}

	@Step
	public void getFifthBuildingAddress() {
		onPage.getFifthBuildingAddress();
	}

	@Step

	public void shouldNotSeeJustCreatedTag() {
		onPage.shouldNotSeeSpecificTag(SessionVariables.getValueFromSessionVariable("Just_Created_Tag"));
	}

	@Step
	public void shouldSeeAddedNewTag() {
		onPage.shouldSeeSpecificTag(SessionVariables.getValueFromSessionVariable("Just_Created_Tag"));
	}

	@Step
	public void shouldSeeDuplicatedTag() {
		onPage.shouldSeeSpecificTag(SessionVariables.getValueFromSessionVariable("Duplicated_Tag"));
	}

	@Step
	public void clickOnListingsBuilding() {
		onPage.clickOnListingsBuilding();
	}

	@Step
	public void swipeUpToMyTagsLabel() {
		onPage.swipeUpToMyTagsLabel();
	}

	@Step
	public void shouldSeeRenamedTag() {
		onPage.shouldSeeSpecificTag(SessionVariables.getValueFromSessionVariable("Renamed_Tag"));
	}

	@Step
	public void shouldNotSeeCustomClientTag() {
		onPage.shouldNotSeeSpecificTag(SessionVariables.getValueFromSessionVariable("First_Custom_Client"));
	}

	@Step
    public void shouldSeeCustomClientTag() {
		onPage.shouldSeeSpecificTag(SessionVariables.getValueFromSessionVariable("First_Custom_Client"));
    }

	@Step
	public void checkNoOneTagPillIsShown() {
		onPage.checkNoOneTagIsAdded();
	}
}

