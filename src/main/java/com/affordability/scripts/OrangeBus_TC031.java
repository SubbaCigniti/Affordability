package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC031 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC031() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 031" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC031");
		clickYesApplicant1("TC031");
		setemployment_statusApplicant1("TC031");
		setGrossSalaryApplicant1("TC031");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC031");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC031");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
