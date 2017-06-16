package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC017 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC017() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 017" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC017");
		
		clickYesApplicant1("TC017");
		setemployment_statusApplicant1("TC017");
		setGrossSalaryApplicant1("TC017");
		
		clickYesApplicant2("TC017");
		setemployment_statusApplicant2("TC017");
		setGrossSalaryApplicant2("TC017");
		
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC017");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC017");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC017");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
