package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC025 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC025() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 025" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC025");
		clickYesApplicant1("TC025");
		setemployment_statusApplicant1("TC025");
		setGrossSalaryApplicant1("TC025");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC025");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC025");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
