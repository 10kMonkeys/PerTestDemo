package com.perchwell.steps;

import com.github.javafaker.Faker;
import com.perchwell.entity.AppProperties;
import com.perchwell.pages.perchwell.SettingsProfilePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import com.perchwell.pages.clientdetails.ClientPage;

public class SettingsProfileSteps {

    SettingsProfilePage onPage;

    @Step
    public void changeName(){
        Faker faker = new Faker();
        String name = faker.name().fullName();
        AppProperties.INSTANCE.setProperty("name",name);
        onPage.fillInNameTextBox(name);
    }

    @Step
    public void changeCompany(){
        Faker faker = new Faker();
        String company = faker.company().name();
        AppProperties.INSTANCE.setProperty("company",company);
        onPage.fillInCompanyTextBox(company);
    }

    @Step
    public void saveButtonClick(){
        onPage.saveButtonClick();
    }

    @Step
    public void isNameTextBoxChange(){
        Assert.assertTrue(onPage.nameProfile().contains(AppProperties.INSTANCE.getProperty("name")));
    }

    @Step
    public void isCompanyTextBoxChange(){
        Assert.assertTrue(onPage.companyProfile().contains(AppProperties.INSTANCE.getProperty("company")));
    }

    @Step
    public void okButtonClick(){
        onPage.okButtonClick();
    }

    @Step
    public void resetPasswordClick(){
        onPage.resetPasswordButtonClick();
    }

    @Step
    public void cancelButtonClick(){
        onPage.cancelButtonClick();
    }

    @Step
    public void backButtonClick(){
        onPage.backButtonClick();
    }
}
