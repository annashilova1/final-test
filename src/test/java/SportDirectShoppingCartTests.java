import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SportDirectShoppingCartTests {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private final By KIDS_CATALOG_SECTION = By.id("liTopLevelMenu_3917124");
    private final By HOODIES_SECTION = By.xpath(".//div[contains(@class, 'swiper-slide swiper-slide-visible')]");
    private final By MIN_PRICE = By.id("PriceFilterTextEntryMin");
    private final By MAX_PRICE = By.id("PriceFilterTextEntryMax");

    @Test
    public void shoppingCartCheck(){
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://www.sportsdirect.com/");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));
        WebElement acceptBtn = browser.findElement(ACCEPT_COOKIES_BTN);
        acceptBtn.click();

        WebElement kidsCatalog = browser.findElement(KIDS_CATALOG_SECTION);
        kidsCatalog.click();

        WebElement hoodiesSection = browser.findElement(HOODIES_SECTION);
        hoodiesSection.click();

        WebElement minPrice = browser.findElement(MIN_PRICE);
        minPrice.sendKeys("25");

        WebElement maxPrice = browser.findElement(MAX_PRICE);
        maxPrice.sendKeys("35");



    }


    }


