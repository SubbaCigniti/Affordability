package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC020 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC020() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 020" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC020");
		
		clickYesApplicant1("TC020");
		setemployment_statusApplicant1("TC020");
		setGrossSalaryApplicant1("TC020");
		
		clickYesApplicant2("TC020");
		setemployment_statusApplicant2("TC020");
		setGrossSalaryApplicant2("TC020");
		
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC020");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC020");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC020");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
