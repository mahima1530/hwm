public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(resultPage.class.getName());

    public resultPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy resultMsg = By.cssSelector("h1[class='search-header__title']");
    WebElement resultMsg;

    public void verifyTheResult(String expected) {
        Reporter.log("Result Text: " + resultMsg.toString());

        String actualMsg = getTextFromElement(resultMsg);
        Assert.assertEquals(actualMsg, expected);
    }
}