public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }// error to come alert


    @CacheLookup
    @FindBy welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    WebElement welcomeText;

    @CacheLookup
    @FindBy emailfield = By.id("Email");
    WebElement emailfield;

    @CacheLookup
    @FindBy emailfield passwordField = By.name("Password");
    WebElement emailfield;

    @CacheLookup
    @FindBy emailfield loginButton = By.xpath("//button[contains(text(),'Log in')]");
    WebElement emailfield;

    @CacheLookup
    @FindBy emailfield errorMag = By.xpath("//div[@class='message-error validation-summary-errors']");
    WebElement emailfield;

    public String getWelcomeText() {

        Reporter.log("get welcome text" +welcomeText.toString());return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        Reporter.log("Enter email ID" +email.toString());
        sendTextToElement(emailfield, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMag);
    }


    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();

    }


}
