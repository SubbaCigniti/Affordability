package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC030 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC030() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 030" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC030");
		clickYesApplicant1("TC030");
		setemployment_statusApplicant1("TC030");
		setGrossSalaryApplicant1("TC030");
		
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC030");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC030");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC030");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
