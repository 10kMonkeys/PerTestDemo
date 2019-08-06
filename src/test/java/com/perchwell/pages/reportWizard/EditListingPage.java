package com.perchwell.pages.reportWizard;

import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditListingPage extends TechHelper {
    
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Edit Listing' AND visible == true")
    private WebElement editListingLabel;

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Appointment Time-'")
    private WebElement appointmentTimeField;

    @iOSXCUITFindBy(iOSNsPredicate = "value CONTAINS 'o’clock'")
    private WebElement hourWheel;

    @iOSXCUITFindBy(iOSNsPredicate = "value CONTAINS 'minutes'")
    private WebElement minuteWheel;

    @iOSXCUITFindBy(iOSNsPredicate = "value CONTAINS 'AM' OR value CONTAINS 'PM' AND visible == 1")
    private WebElement meridiemWheel;

    @iOSXCUITFindBy(accessibility = " Option Selected: Include Map")
    private WebElement selectedIncludeMapOption;

    @iOSXCUITFindBy(iOSNsPredicate = "name BEGINSWITH 'Notes'")
    private WebElement notesLabel;

    @iOSXCUITFindBy(accessibility = "refresh14")
    private WebElement revertIcon;

    @iOSXCUITFindBy(accessibility = "x")
    private WebElement closeButton;

    @iOSXCUITFindBy(accessibility = "Save")
    private WebElement saveButton;

    @iOSXCUITFindBy(accessibility = "Done")
    private WebElement doneButton;

    @iOSXCUITFindBy(accessibility = " Option: No Map")
    private WebElement unselectedNoMapOption;

    @iOSXCUITFindBy(accessibility = " Option Selected: No Map")
    private WebElement selectedNoMapOption;

    @iOSXCUITFindBy(accessibility = "textView")
    private WebElement notesField;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther/*[2]/*/*[2]/*[2]/*/XCUIElementTypeTextView")
    private WebElement expandedNotesField;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Done' AND visible == true")
    private WebElement doneButtonOnNotesField;

    @iOSXCUITFindBy(accessibility = "delete")
    private WebElement deleteButtonOnKeyboard;

    @iOSXCUITFindBy(accessibility = " Option: Include Map")
    private WebElement unselectedIncludeMapOption;
    
    public EditListingPage(WebDriver driver) {
        super(driver);
    }

    public void checkEditListingPageIsOpened() {
        element(editListingLabel).shouldBeVisible();
    }

    public void clickOnAppointmentTimeField() {
        element(appointmentTimeField).click();
    }

    public void checkDefaultTimeIsSetOnTenAm() {
        Assert.assertEquals("10 o’clock", element(hourWheel).getValue());
        Assert.assertEquals("00 minutes", element(minuteWheel).getValue());
        Assert.assertEquals("AM", element(meridiemWheel).getValue());
    }

    public void checkIncludeMapIsSelected() {
        element(selectedIncludeMapOption).shouldBeVisible();
    }

    public void checkNotesMaxSymbolsLabelIsFortyHundred() {
        element(notesLabel).shouldContainText("/400)");
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

    public void clickOnCloseButton() {
        element(closeButton).click();
    }

    public void checkAppointmentTimeFieldIsEmpty() {
        Assert.assertEquals("Appointment Time", element(appointmentTimeField).getValue());
    }

    public void checkTimeIsChange() {
        element(MobileBy.iOSNsPredicateString("value == '" + SessionVariables.getValueFromSessionVariable("hourWheelValue") + "'")).shouldBeVisible();
        element(MobileBy.iOSNsPredicateString("value == '" + SessionVariables.getValueFromSessionVariable("minuteWheelValue") + "'")).shouldBeVisible();
        element(MobileBy.iOSNsPredicateString("value == '" + SessionVariables.getValueFromSessionVariable("meridiemWheelValue") + "'")).shouldBeVisible();
    }

    public void clickOnSaveButton() {
        element(saveButton).click();
    }

    public void checkSelectedTimeIsShown() {
        String selectedTime = SessionVariables.getValueFromSessionVariable("hourWheelValue").replace(" o’clock", "")
                + ":"
                + SessionVariables.getValueFromSessionVariable("minuteWheelValue").replace("minutes", "")
                + SessionVariables.getValueFromSessionVariable("meridiemWheelValue");

        Assert.assertEquals(selectedTime, element(appointmentTimeField).getValue());
    }

    public void clickOnDoneButton() {
        element(doneButton).click();
    }

    public void selectNoMapOption() {
        element(unselectedNoMapOption).click();
    }

    public void checkNoMapOptionIsSelected() {
        element(selectedNoMapOption).shouldBeVisible();
    }

    public void checkNotesMaxSymbolsLabelIsChangedOnEightyHundred() {
        element(notesLabel).shouldContainText("/800)");
    }

    public void clickOnNotesField() {
        element(notesField).click();
    }

    public void fillInExpendedNotesField(int length) {
        String message = StringUtils.repeat("a", length);
        element(expandedNotesField).sendKeys(message);
    }

    public void clickOnDoneButtonOnNotesField() {
        element(doneButtonOnNotesField).click();
    }

    public void checkCharactersLabelIsRed() {
        // TODO: no color diff attributes
    }

    public void checkDoneButtonIsDisabled() {
        element(doneButton).shouldNotBeEnabled();
    }

    public void checkNotesLabelIsRed() {
        // TODO: no color diff attributes
    }

    public void removeOneSymbol() {
        element(deleteButtonOnKeyboard).click();
    }

    public void checkCharactersLabelIsGreen() {
        // TODO: no color diff attributes
    }

    public void checkDoneButtonIsEnabled() {
        element(doneButton).shouldBeEnabled();
    }

    public void checkNotesLabelIsGreen() {
        // TODO: no color diff attributes
    }

    public void selectIncludeMapOption() {
        element(unselectedIncludeMapOption).click();
    }

    public void clearNotesField() {
        element(notesField).clear();
    }
}
