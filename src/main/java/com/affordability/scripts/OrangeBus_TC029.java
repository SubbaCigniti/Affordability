package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC029 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC029() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 029" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC029");
		clickYesApplicant1("TC029");
		setemployment_statusApplicant1("TC029");
		setGrossSalaryApplicant1("TC029");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC029");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC029");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
