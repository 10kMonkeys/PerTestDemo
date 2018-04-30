package com.perchwell.pages.tags;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapAttachment;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectResultPage extends BasePage {

	//region WebElements

	@iOSXCUITFindBy(accessibility = "OK")
	private WebElement reportSentOkButton;

	@iOSXCUITFindBy(accessibility = "MY EMAIL")
	private WebElement myEmailOption;

	@iOSXCUITFindBy(accessibility = "CLIENT")
	private WebElement clientOption;

	@iOSXCUITFindBy(accessibility = "TagPDFExportButton")
	private WebElement tagPDFExportButton;

	@iOSXCUITFindBy(accessibility = "SAVE")
	private WebElement saveButton;

	@iOSXCUITFindBy(accessibility = "SHARE TAGGED ITEMS")
	private WebElement shareTaggedItems;

	@iOSXCUITFindBy(accessibility = "generic_text_input_field")
	private WebElement nameThisReport;

	//endregion

	public SelectResultPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnTagPDFExportButton() {
		element(tagPDFExportButton).click();
	}

	public void clickOnClientOption() {
		element(clientOption).click();
	}

	public void clickOnSaveButton() {
		element(saveButton).click();
	}

	public void clickOnMyEmailOption() {
		element(myEmailOption).click();
	}

	public void setReportName(String reportName) {
		element(nameThisReport).sendKeys(reportName);
	}

	public void clickOnReportSentOkButton() {
		reportSentOkButton.click();
	}

	public Boolean shouldFindSentEmail(String report_name) {
		//Waiting while report was sent
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Get last emails with HEADER_SHARE_TAGS
		MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(AppProperties.INSTANCE.getProperty("HEADER_SHARE_TAGS"));
		Boolean reportWasFound = false;
		report_name = report_name + ".pdf";
		//Get attachments
		MailTrapAttachment[] mailTrapAttachment = MailTrap.getMassageAttachment(mailTrapResponse[0].getId());
		//Find attachments with REPORT_NAME
		for (MailTrapAttachment my_attachment : mailTrapAttachment) {
			if (my_attachment.getFilename().equalsIgnoreCase(report_name)) {
				reportWasFound = true;
				break;
			}
		}

		return reportWasFound;
	}

	public void selectShareTaggedItems(){
		element(shareTaggedItems).click();
	}
}
