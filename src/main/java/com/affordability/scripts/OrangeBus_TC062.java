package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC062 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC062() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 062" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC062");
		
		clickYesApplicant1("TC062");
		setemployment_statusApplicant1("TC062");
		setLastFullTradingYearsNetProfit_1("TC062");
		setPreviousFullTradingYearsNetProfit_1("TC062");
		
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC062");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC062");
		
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC062");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
