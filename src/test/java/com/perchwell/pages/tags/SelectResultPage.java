package com.perchwell.pages.tags;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.AppProperties;
import com.perchwell.entity.MailTrapAttachment;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectResultPage extends BasePage {

	public SelectResultPage(WebDriver driver) {
		super(driver);
	}

	@iOSXCUITFindBy(accessibility = "OK")
	private WebElement reportSemtOkButton;

	@iOSXCUITFindBy(accessibility = "MY EMAIL")
	private WebElement myEmailOption;

	@iOSXCUITFindBy(accessibility = "CLIENT")
	private WebElement clientOption;

	@iOSXCUITFindBy(accessibility = "TagPDFExportButton")
	private WebElement tagPDFExportButton;

	@iOSXCUITFindBy(accessibility = "SAVE")
	private WebElement saveButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	private WebElement nameThisReport;

	public void clickTagPDFExportButton() {
		element(tagPDFExportButton).click();
	}

	public void clickClientOption() {
		element(clientOption).click();
	}

	public void clickSaveButton() {
		element(saveButton).click();
	}

	public void clickMyEmailOption() {
		element(myEmailOption).click();
	}

	public void setReportName(String reportName) {
		element(nameThisReport).sendKeys(reportName);
	}

	public void addValueInSessionVariable(String name, String value) {
		Serenity.setSessionVariable(name).to(value);
	}

	public void clickReportSemtOkButton() {
		reportSemtOkButton.click();
	}

	public String getValueFromSessionVariable(String name) {
		return Serenity.sessionVariableCalled(name);
	}

	public Boolean shouldFindSentEmail(String report_name) {
		//Waiting while report was sent
		try {
			Thread.sleep(30000);
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
}
