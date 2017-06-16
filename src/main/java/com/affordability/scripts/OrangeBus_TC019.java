package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC019 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC019() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 019" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC019");
		clickYesApplicant1("TC019");
		setemployment_statusApplicant1("TC019");
		setGrossSalaryApplicant1("TC019");
		clickYesApplicant2("TC019");
		setemployment_statusApplicant2("TC019");
		setGrossSalaryApplicant2("TC019");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC019");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC019");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
