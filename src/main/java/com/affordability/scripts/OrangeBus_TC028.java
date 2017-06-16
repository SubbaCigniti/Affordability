package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC028 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC028() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 028" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC028");
		clickYesApplicant1("TC028");
		setemployment_statusApplicant1("TC028");
		setGrossSalaryApplicant1("TC028");
		clickYesApplicant2("TC028");
		setemployment_statusApplicant2("TC028");
		setGrossSalaryApplicant2("TC028");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC028");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC028");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
