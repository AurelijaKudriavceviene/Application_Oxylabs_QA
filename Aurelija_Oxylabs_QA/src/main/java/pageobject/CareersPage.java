
package pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CareersPage extends BasePage {
    public CareersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='#jobs']")
    private WebElement openPositionBtnElement;

    @FindBy(css = "input[placeholder='Search jobs by keywords']")
    private WebElement searchJobsByKeywordsInputElement;

    public void setSearchJobTitle(String jobTitle) {
        waitForVisibilityOf(openPositionBtnElement);
        waitForClickabilityOf(openPositionBtnElement);
        openPositionBtnElement.click();
        searchJobsByKeywordsInputElement.sendKeys(jobTitle);
    }

    public String getSearchInputValue() {
        return searchJobsByKeywordsInputElement.getAttribute("value");
    }
}
