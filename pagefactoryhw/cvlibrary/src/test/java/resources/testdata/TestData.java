package resources.testdata;

import org.testng.annotations.DataProvider;

@DataProvider(name = "resultData")
public Object[][] getData() {

        Object[][] data = new Object[][]{

        {"Tester", "Harrow, Greater London", "5 miles", "30000", "50000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow"},
        {"Test manager", "London", "5 miles", "30000", "40000", "Per annum", "Permanent", "Permanent Test Manager jobs in London"},

        {"test technician","Brent","7 miles","30000","50000","Per annum","Permanent","Permanent Test Technician jobs in Brent"}

        };
        Reporter.log("data provider " + data.toString() + "<br>");
        return data;
        }
        }

