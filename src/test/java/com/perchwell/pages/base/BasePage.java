package com.perchwell.pages.base;

        import com.google.common.base.Predicate;
        import io.appium.java_client.ios.IOSDriver;
        import io.appium.java_client.ios.IOSElement;
        import io.appium.java_client.pagefactory.AppiumFieldDecorator;
        import net.serenitybdd.core.pages.PageObject;
        import net.thucydides.core.webdriver.WebDriverFacade;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.support.PageFactory;

        import java.util.concurrent.TimeUnit;

public abstract class BasePage extends PageObject {
    public BasePage(final WebDriver driver) {
        super(driver, new Predicate<PageObject>() {
            @Override
            public boolean apply(PageObject page) {

                PageFactory
                        .initElements(new AppiumFieldDecorator(((WebDriverFacade) page.getDriver()).getProxiedDriver(),
                                page.getImplicitWaitTimeout().in(TimeUnit.SECONDS), TimeUnit.SECONDS), page);

                return true;
                            }


        });
    }

    public IOSDriver<IOSElement> iOSDriver() {
        return (IOSDriver<IOSElement>) ((WebDriverFacade) getDriver()).getProxiedDriver();
    }
}