
import handlers.WindowHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pageobject.CareersPage;
import pageobject.HomePage;

public class JuniorQAPositionTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(strings = {"Junior Quality Assurance", "QA Specialist"})
    void searchingForJobTitle(String jobTitle) {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        WindowHandler windowHandler = new WindowHandler(driver);

        homePage.goToCareersPage();
        windowHandler.switchToNewWindow();
        careersPage.setSearchJobTitle(jobTitle);

        String errorMessage = "Search input value does not match the search query";
        Assertions.assertEquals(jobTitle, careersPage.getSearchInputValue(), errorMessage);
        System.out.println("param is = " + jobTitle);
    }
}
