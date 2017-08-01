package uitests;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.TerritoriesPage;
import  pages.testBase;

/**
 * Created by user1 on 23/06/2017.
 */
public class TerritoriesPageTests extends testBase {
    private String filmTablecontainershowMoreButton = "show-more-btn";
    private String circuitBreakdownshowMoreButton = "circuit-expand-text";

    @Test
    public void checkFilmtableIsNotNull() throws InterruptedException {
        TerritoriesPage territoriesPage = loginpagetest.loginToTerritorriesPage();
        Assert.assertNotNull(territoriesPage.setFilmTablebody().findElements(By.tagName("tr")).size());
    }

    @Test
    public void checkDailyPerformancetable() throws InterruptedException {
        TerritoriesPage territoriesPage = loginpagetest.loginToTerritorriesPage();
        Assert.assertNotNull(territoriesPage.setDailyPerformanceContainer().getAttribute("id"));
    }

    @Test
    public void checkCircuitBreakdownTable() throws InterruptedException {
        TerritoriesPage territoriesPage = loginpagetest.loginToTerritorriesPage();
        Assert.assertNotNull(territoriesPage.setCircuitBreakDownTable().findElements(By.tagName("td")).size());
    }

    @Test
    public void clickonShowMoreButtonFilmTable() throws InterruptedException {
        TerritoriesPage territoriesPage = loginpagetest.loginToTerritorriesPage();
        territoriesPage.clickOnShowMoreButton(territoriesPage.getFilmTableShowMoreButton());
        Assert.assertEquals("keyboard_arrow_up", territoriesPage.returnUpArrowStatus());
    }
    @Test
    public void clickonShowMoreButtoncircuitBreakDown() throws InterruptedException {
        TerritoriesPage territoriesPage = loginpagetest.loginToTerritorriesPage();
        //Thread.sleep(5000L);
        territoriesPage.clickOnShowMoreButton(territoriesPage.getCircuitBreakDownTableShowMoreButton());
        //Assert.assertEquals("keyboard_arrow_up", territoriesPage.returnUpArrowStatus());
    }
}
