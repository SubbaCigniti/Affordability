package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC034 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC034() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 034" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC034");
		
		clickYesApplicant1("TC034");
		setemployment_statusApplicant1("TC034");
		setLastFullTradingYearsNetProfit_1("TC034");
		setPreviousFullTradingYearsNetProfit_1("TC034");
		
		clickYesApplicant2("TC034");
		setemployment_statusApplicant2("TC034");
		setGrossSalaryApplicant2("TC034");	
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC034");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
