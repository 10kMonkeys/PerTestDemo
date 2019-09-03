package com.perchwell.pages.reportWizard;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditListingPage extends TechHelper {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Edit Listing']")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Edit Listing' AND visible == true")
    private WebElement editListingLabel;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/value")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Appointment Time-'")
    private WebElement appointmentTimeField;

    @AndroidFindBy(xpath = "(//android.widget.NumberPicker[1]/android.widget.EditText)[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "value CONTAINS 'o’clock'")
    private WebElement hourWheel;

    @AndroidFindBy(xpath = "//android.widget.NumberPicker[2]/android.widget.EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "value CONTAINS 'minutes'")
    private WebElement minuteWheel;

    @AndroidFindBy(xpath = "(//android.widget.NumberPicker[1]/android.widget.EditText)[2]")
    @iOSXCUITFindBy(iOSNsPredicate = "value CONTAINS 'AM' OR value CONTAINS 'PM' AND visible == 1")
    private WebElement meridiemWheel;

    @AndroidFindBy(accessibility = "Option Selected: Include Map")
    @iOSXCUITFindBy(accessibility = " Option Selected: Include Map")
    private WebElement selectedIncludeMapOption;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/subtitle")
    @iOSXCUITFindBy(iOSNsPredicate = "name BEGINSWITH 'Notes'")
    private WebElement notesLabel;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/reset_button")
    @iOSXCUITFindBy(accessibility = "refresh14")
    private WebElement revertIcon;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
    @iOSXCUITFindBy(accessibility = "x")
    private WebElement closeButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Save']")
    @iOSXCUITFindBy(accessibility = "Save")
    private WebElement saveButton;

    @AndroidFindBy(accessibility = "Done")
    @iOSXCUITFindBy(accessibility = "Done")
    private WebElement doneButton;

    @AndroidFindBy(accessibility = "Option: No Map")
    @iOSXCUITFindBy(accessibility = " Option: No Map")
    private WebElement unselectedNoMapOption;

    @AndroidFindBy(accessibility = "Option Selected: No Map")
    @iOSXCUITFindBy(accessibility = " Option Selected: No Map")
    private WebElement selectedNoMapOption;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/notes")
    @iOSXCUITFindBy(accessibility = "textView")
    private WebElement notesField;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/edit_text")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther/*[2]/*/*[2]/*[2]/*/XCUIElementTypeTextView")
    private WebElement expandedNotesField;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/shrink_button")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Done' AND visible == true")
    private WebElement doneButtonOnNotesField;

    @iOSXCUITFindBy(accessibility = "delete")
    private WebElement deleteButtonOnKeyboard;

    @AndroidFindBy(accessibility = "Option: Include Map")
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
        if(Config.isAndroid()) {
            Assert.assertEquals("10", element(hourWheel).getText());
            Assert.assertEquals("00", element(minuteWheel).getText());
            Assert.assertEquals("AM", element(meridiemWheel).getText());
        } else {
            Assert.assertEquals("10 o’clock", element(hourWheel).getValue());
            Assert.assertEquals("00 minutes", element(minuteWheel).getValue());
            Assert.assertEquals("AM", element(meridiemWheel).getValue());
        }
    }

    public void checkIncludeMapIsSelected() {
        element(selectedIncludeMapOption).shouldBeVisible();
    }

    public void checkNotesMaxSymbolsLabelIsFortyHundred() {
        element(notesLabel).shouldContainText("/400)");
    }

    public void changeTime() {
        swipeDownDateWheel(hourWheel);
        swipeDownDateWheel(minuteWheel);
        swipeDownDateWheel(meridiemWheel);

        if(Config.isAndroid()) {
            SessionVariables.addValueInSessionVariable("hourWheelValue", element(hourWheel).getText());
            SessionVariables.addValueInSessionVariable("minuteWheelValue", element(minuteWheel).getText());
            SessionVariables.addValueInSessionVariable("meridiemWheelValue", element(meridiemWheel).getText());
        } else {
            SessionVariables.addValueInSessionVariable("hourWheelValue", element(hourWheel).getValue());
            SessionVariables.addValueInSessionVariable("minuteWheelValue", element(minuteWheel).getValue());
            SessionVariables.addValueInSessionVariable("meridiemWheelValue", element(meridiemWheel).getValue());
        }
    }

    public void clickOnRevertIcon() {
        element(revertIcon).click();
    }

    public void clickOnCloseButton() {
        element(closeButton).click();
    }

    public void checkAppointmentTimeFieldIsEmpty() {
        if(Config.isAndroid()) {
            Assert.assertEquals("Appointment Time", element(appointmentTimeField).getText());
        } else {
            Assert.assertEquals("Appointment Time", element(appointmentTimeField).getValue());
        }
    }

    public void checkTimeIsChange() {
        if(Config.isAndroid()) {
            element(MobileBy.xpath("//android.widget.EditText[@text = '" + SessionVariables.getValueFromSessionVariable("hourWheelValue") + "']")).shouldBeVisible();
            element(MobileBy.xpath("//android.widget.EditText[@text = '" + SessionVariables.getValueFromSessionVariable("minuteWheelValue") + "']")).shouldBeVisible();
            element(MobileBy.xpath("//android.widget.EditText[@text = '" + SessionVariables.getValueFromSessionVariable("meridiemWheelValue") + "']")).shouldBeVisible();
        } else {
            element(MobileBy.iOSNsPredicateString("value == '" + SessionVariables.getValueFromSessionVariable("hourWheelValue") + "'")).shouldBeVisible();
            element(MobileBy.iOSNsPredicateString("value == '" + SessionVariables.getValueFromSessionVariable("minuteWheelValue") + "'")).shouldBeVisible();
            element(MobileBy.iOSNsPredicateString("value == '" + SessionVariables.getValueFromSessionVariable("meridiemWheelValue") + "'")).shouldBeVisible();
        }
    }

    public void clickOnSaveButton() {
        element(saveButton).click();
    }

    public void checkSelectedTimeIsShown() {
        if(Config.isAndroid()) {
            Assert.assertEquals(getSelectedTimeToString(), element(appointmentTimeField).getText());
        } else {
            Assert.assertEquals(getSelectedTimeToString(), element(appointmentTimeField).getValue());
        }
    }

    private String getSelectedTimeToString() {
        if(Config.isAndroid()) {
            return SessionVariables.getValueFromSessionVariable("hourWheelValue").replace(" o’clock", "")
                    + ":"
                    + SessionVariables.getValueFromSessionVariable("minuteWheelValue").replace("minutes", "")
                    + " " + SessionVariables.getValueFromSessionVariable("meridiemWheelValue");
        } else {
            return SessionVariables.getValueFromSessionVariable("hourWheelValue").replace(" o’clock", "")
                    + ":"
                    + SessionVariables.getValueFromSessionVariable("minuteWheelValue").replace("minutes", "")
                    + SessionVariables.getValueFromSessionVariable("meridiemWheelValue");
        }
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
        if (Config.isAndroid()) {
            element(MobileBy.AccessibilityId("Characters textField color:#ea6656")).shouldBeVisible();
        }
    }

    public void checkDoneButtonIsDisabled() {
        element(doneButton).shouldNotBeEnabled();
    }

    public void checkNotesLabelIsRed() {
        if (Config.isAndroid()) {
            element(MobileBy.AccessibilityId("Notes textField color:#ea6656")).shouldBeVisible();
        }
    }

    public void removeOneSymbol() {
        if (Config.isAndroid()) {
            pressDeleteButtonOnlyAndroid();
        } else
            element(deleteButtonOnKeyboard).click();
    }


    public void checkCharactersLabelIsGreen() {
        if (Config.isAndroid()) {
            element(MobileBy.AccessibilityId("Characters textField color:#606060")).shouldBeVisible();
        }
    }

    public void checkDoneButtonIsEnabled() {
        element(doneButton).shouldBeEnabled();
    }

    public void checkNotesLabelIsGreen() {
        if (Config.isAndroid()) {
            element(MobileBy.AccessibilityId("Notes textField color:#606060")).shouldBeVisible();
        }
    }

    public void selectIncludeMapOption() {
        element(unselectedIncludeMapOption).click();
    }

    public void clearNotesField() {
        if (Config.isAndroid()) {
            element(MobileBy.id("com.perchwell.re.staging:id/edit_text")).clear();
        } else {
            element(notesField).clear();
        }
    }
}
