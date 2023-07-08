public class Registerpage extends Utility {

    private static final Logger log = LogManager.getLogger(Registerpage.class.getName());

    public Registerpage() {
        PageFactory.initElements(driver, this);
    }// error to come alert

    @CacheLookup
    @FindBy Registerlink = = By.cssSelector("input[type='submit']");
    WebElement Registerlink;

    @CacheLookup
    @FindBy First name = By.text("First Name:");
    WebElement Firstname;

    @CacheLookup
    @FindBy Last name = By.text("Last Name:");
    WebElement Lastname;

    @CacheLookup
    @FindBy Address = By.cssSelector("div.hp-search-more>#toggle-hp-search");
    WebElement Address;

    @CacheLookup
    @FindBy City = By.cssSelector("input#city");
    WebElement City;

    @CacheLookup
    @FindBy State= By.cssSelector("input#state");
    WebElement State;

    @CacheLookup
    @FindBy Zip Code = By.cssSelector("select[id='Zip Code']");
    WebElement ZipCode;

    @CacheLookup
    @FindBy Phone = By.cssSelector("select#tempperm");
    WebElement Phone;

    @CacheLookup
    @FindBy SSN = By.cssSelector("input#hp-ssn");
    WebElement SSN;

    @CacheLookup
    @FindBy Username = By.cssSelector("input#username");
    WebElement  Username;

    @CacheLookup
    @FindBy Password  = By.cssSelector("select[id='password']");
    WebElement Password;

    @CacheLookup
    @FindBy Confirm = By.cssSelector("select#tempperm");
    WebElement Confirm;

    @CacheLookup
    @FindBy REGISTER button = By.cssSelector("input#hp-register-btn");
    WebElement  REGISTER button;

    @CacheLookup
    @FindBy welcomeText = By.cssSelector("h1['welcometext']");
    WebElement welcomeText;

    public void Registerlink() {
        Reporter.log("Select Registerlink");
        clickOnElement(Registerlink);


    public void Enter Firstname(String firstnames ) {
        Reporter.log("Enter First name");
        sendTextToElement(Firstname, firstnames);
    }

    public void Enter Lastname(String lastnames) {
        Reporter.log("Enter Last name"));
        sendTextToElement(Lastname, lastnames);
    }

    public void Enter Address(String add) {
        Reporter.log("Enter Address");
        selectByVisibleTextFromDropDown(Address,add);
    }


    public void Enter City(String cty) {
        Reporter.log("Enter City");
        sendTextToElement(City, cty);
    }

    public void Enter State(String stat) {
        Reporter.log("Enter State");
        sendTextToElement(State, stat);
    }

    public void Enter ZipCode(String zcd) {
        Reporter.log(" Enter Zip Code");
        selectByVisibleTextFromDropDown(ZipCode,zcd);
    }


    public void Enter Phone(String phn) {
        Reporter.log("Enter Phone");
        selectByVisibleTextFromDropDown(Phone, phn);


    }
    public void Enter SSN(String ssnn) {
        Reporter.log("Enter SSN");
        selectByVisibleTextFromDropDown(SSN,ssnn);


    }
    public void Enter Username(String uname) {
        Reporter.log("Enter Username");
        selectByVisibleTextFromDropDown(Username, uname);


    }
    public void Enter Password(String pswd) {
        Reporter.log("Enter Password");
        selectByVisibleTextFromDropDown(Password, pswd);

    }
    public void Enter Confirm(String cnfm) {
        Reporter.log("Enter Confirm");
        selectByVisibleTextFromDropDown(Confirm, cnfm);
    }

    public void clickOnFindJobsButton() {

        clickOnElement(findJobsBtn);
    }
}