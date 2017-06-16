package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC012 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC012() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 012" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC012");
		
		clickYesApplicant1("TC012");
		setemployment_statusApplicant1("TC012");
		setGrossSalaryApplicant1("TC012");
		setGuaranteedBonusofApplicant1("TC012");
		setRegularBonusofApplicant1("TC012");
		
		clickYesApplicant2("TC012");
		setemployment_statusApplicant2("TC012");
		setGrossSalaryApplicant2("TC012");
		setGuaranteedBonusofApplicant2("TC012");
		setRegularBonusofApplicant2("TC012");

		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC012");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC012");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
