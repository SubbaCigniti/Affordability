package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC015 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC015() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 015" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC015");
		
		clickYesApplicant1("TC015");
		setemployment_statusApplicant1("TC015");
		setGrossSalaryApplicant1("TC015");
		
		clickYesApplicant2("TC015");
		setGrossSalaryApplicant2("TC015");
		setemployment_statusApplicant1("TC015");
		
		
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC015");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC015");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC015");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
