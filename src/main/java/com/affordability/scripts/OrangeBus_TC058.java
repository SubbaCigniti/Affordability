package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC058 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC058() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 058" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC058");
		
		clickYesApplicant1("TC058");
		setemployment_statusApplicant1("TC058");
		setAnnualIncomeofApplicant1("TC058");	
		setDayRate_1("TC058");
		
		clickAddIncomeApplicant1();
		setemploymentStatusApp12ndJob("TC058");
		setEmploymentSalary1App12ndJob("TC058");
		
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC058");
		
		clickDetailedOption_oth();
		setEssentialTravel("TC058");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC058");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
