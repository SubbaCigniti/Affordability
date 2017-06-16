package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC050 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC050() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 050" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC050");
		
		clickYesApplicant1("TC050");
		setemployment_statusApplicant1("TC050");
		setAnnualIncomeofApplicant1("TC050");
		setDayRate_1("TC050");
		
		//applicant2 2nd job need to be added 
		clickAddIncomeApplicant2();
		setEmploymentStatusApp22ndJob("TC036");
		setEmploymentSalary1App22ndJob("TC036");
		

		clickCalculateResults();
		verifyAmountAndLoanTerm("TC050");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
