public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }// error to come alert

    @CacheLookup
    FindBy JobTitle = By.id("keywords");
    Webelement jobtitle;

    @CacheLookup
    FindBy locationlink = By.id("location");
    Webelement locationlink;

    @CacheLookup
    FindBy distanceDropDown = By.id("distance");
    Webelement distanceDropDown;

    @CacheLookup
    FindBy moreSearchOptionsLink =By.cssSelector("div.hp-search-more>#toggle-hp-search");
    Webelement moreSearchOptionsLink;

    @CacheLookup
    FindBy salaryMin = By.cssSelector("input#salarymin");
    Webelement salaryMin;

    @CacheLookup
    FindBy salaryMax = By.cssSelector("input#salarymax");
    Webelement salaryMax;

    @CacheLookup
    FindBy  salaryType = By.cssSelector("select[id='salarytype']");
    Webelement salaryType;

    @CacheLookup
    FindBy jobType = By.cssSelector("select#tempperm");
    Webelement jobType;

    @CacheLookup
    FindBy findJobsBtn =  By.cssSelector("input#hp-search-btn");
    Webelement findJobsBtn;

    private String jobTiles;
    public void enterJobTitle(String jobTitles) {
        Reporter.log("Enter Job Title");
        sendTextToElement(JobTitle,jobTitles);
    }

    public void enterLocation(String Location) {
        Reporter.log(" location"+ locationlink.toString());
        sendTextToElement(locationlink, Location);
    }

    public void distanceDropDown(String Distance) {
        Reporter.log("Select Distance" + Distance.toString());
        selectByVisibleTextFromDropDown(distanceDropDown,Distance);
    }

    public void moreSearchOptionslink() {
        Reporter.log("Select SearchOptions");
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterSalaryMin(String SalaryMin) {
        Reporter.log("Enter Salary" + salaryMin.toString ());
        sendTextToElement(salaryMin,SalaryMin );
    }

    public void enterSalaryMax(String SalaryMax) {
        Reporter.log("Enter Salary" + salaryMax.toString());
        sendTextToElement(salaryMax, SalaryMax);
    }

    public void salaryTypeDropDown(String SalaryType) {
        Reporter.log(" Enter  Salary");
        selectByVisibleTextFromDropDown(salaryType, SalaryType);
    }


    public void jobTypeDropDown(String JobType) {
        Reporter.log("click Job type");
        selectByVisibleTextFromDropDown(jobType,JobType);

    }

    public void iframeHandle() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.xpath("//button[@id='save']")).click();
        driver.switchTo().defaultContent();
    }
    public void clickOnFindJobsButton() {

        clickOnElement(findJobsBtn);
    }


}

