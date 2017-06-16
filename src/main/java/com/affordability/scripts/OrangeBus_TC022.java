package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC022 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC022() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 022" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC022");
		
		clickYesApplicant1("TC022");
		setemployment_statusApplicant1("TC022");
		setGrossSalaryApplicant1("TC022");
		
		clickYesApplicant2("TC022");
		setemployment_statusApplicant2("TC022");
		setGrossSalaryApplicant2("TC022");
		
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC022");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC022");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC022");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
