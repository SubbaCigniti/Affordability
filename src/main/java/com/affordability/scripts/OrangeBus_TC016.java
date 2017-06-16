package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC016 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC016() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 016" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC016");
		
		clickYesApplicant1("TC016");
		setemployment_statusApplicant1("TC016");
		setGrossSalaryApplicant1("TC016");
		
		clickYesApplicant2("TC016");
		setemployment_statusApplicant2("TC016");
		setGrossSalaryApplicant2("TC016");
		
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC016");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC016");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC016");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
