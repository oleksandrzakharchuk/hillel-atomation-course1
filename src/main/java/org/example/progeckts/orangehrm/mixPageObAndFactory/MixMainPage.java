package org.example.progeckts.orangehrm.mixPageObAndFactory;

/*
import java.util.List;

public class MixMainPage {
    private final WebDriver webDriver;
    private final WebDriverWait wait;
    private final JavascriptExecutor js;


    public MixMainPage(WebDriver webDriver) {
        this.webDriver = webDriver;

        wait = new WebDriverWait(this.webDriver, 30);
        js = (JavascriptExecutor) this.webDriver;

    }

    public int openPage() {

        return getAllPages().size();
    }


    public void clickLoginLinkE () {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("frmLogin")));
        WebElement loginPanel = webDriver.findElement(By.id("frmLogin"));

        js.executeScript(JavaScripts.SCROLL_TO_ELEMENT.getJs(), loginPanel);

        List<WebElement> loginLinks = loginPanel.findElements(By.tagName("LOGIN Panel"));
        for (WebElement link : loginLinks) {
            if (link.getText().equals("LOGIN Panel")) {
                link.click();
                break;
            }
        }
    }


    private List<WebElement> getAllPages() {
        WebElement pageBlock = webDriver.findElement(By.id("top-menu"));
        js.executeScript(JavaScripts.SCROLL_TO_ELEMENT.getJs(), pageBlock);

        return pageBlock.findElements(By.tagName("Admin"));
    }
}

*/
