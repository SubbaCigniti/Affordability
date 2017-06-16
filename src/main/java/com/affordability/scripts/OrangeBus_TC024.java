package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC024 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC024() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 024" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC024");
		clickYesApplicant1("TC024");
		setemployment_statusApplicant1("TC024");
		setGrossSalaryApplicant1("TC024");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC024");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC024");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
