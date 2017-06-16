package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC023 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC023() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 023" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC023");
		clickYesApplicant1("TC023");
		setemployment_statusApplicant1("TC023");
		setGrossSalaryApplicant1("TC023");
		clickYesApplicant2("TC023");
		setemployment_statusApplicant2("TC023");
		setGrossSalaryApplicant2("TC023");
		
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC023");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC023");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC023");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
