package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC011 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC011() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 011" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);

		setPropertyAndLoanValues("TC011");

		clickYesApplicant1("TC011");
		setemployment_statusApplicant1("TC011");
		setLastFullTradingYearsNetProfit_1("TC011");
		setPreviousFullTradingYearsNetProfit_1("TC011");

		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC011");

		ClickDetailedOption_hh();
		setproperty_expenditure("TC011");

		clickCalculateResults();
		verifyAmountAndLoanTerm("TC011");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
