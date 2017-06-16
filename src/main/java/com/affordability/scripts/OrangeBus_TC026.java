package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC026 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC026() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 026" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC026");
		clickYesApplicant1("TC026");
		setemployment_statusApplicant1("TC026");
		setGrossSalaryApplicant1("TC026");
		clickYesApplicant2("TC026");
		setemployment_statusApplicant2("TC026");
		setGrossSalaryApplicant2("TC026");
		
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC026");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC026");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC026");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
