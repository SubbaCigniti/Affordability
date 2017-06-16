package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC018 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC018() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 018" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		
		setPropertyAndLoanValues("TC018");
		clickYesApplicant1("TC018");
		setemployment_statusApplicant1("TC018");
		setGrossSalaryApplicant1("TC018");
		
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC018");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC018");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC018");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
