package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC034 extends StandaloneBusinessFunctions
{
	//@Test (groups="MSO",priority=2)
	public void msoTC034() throws Throwable 
	{
		reportTestCaseName = "Aff_34";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 034" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC034");
		addApplicants("TC034", "joint");
		getDecision();
		addLoanRequirements("TC034");
		additionalBorrowing("TC034");
		personalDetailsSingle("TC034");
		addressDetails("TC034");
		currentIncome("TC034");
		appBreakDownIncome("TC034", "one","joint");
		personalDetailsJoint("TC034");
		addressDetailsJoint("TC034");
		currentIncomeJoint("TC034");
		appBreakDownIncomejoint("TC034","one");
		committedExpenditure("TC034","joint");
		houseHoldExp("TC034");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC034");
		verifyMinimumAffordableLoanTerm("TC034");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	//@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC034() throws Throwable 
	{
		reportTestCaseName = "Aff_34";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 034" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC034");		
		enterDOBAndRetirementAge("TC034", "2");
		clickYesApplicant1("TC034");
		setemployment_statusApplicant1("TC034");
		setLastFullTradingYearsNetProfit_1("TC034");
		setPreviousFullTradingYearsNetProfit_1("TC034");		
		clickYesApplicant2("TC034");
		setemployment_statusApplicant2("TC034");
		setGrossSalaryApplicant2("TC034");			
//		enterExpenditures("TC034");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC034");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC034");
		clickSimpleOption_oth();
		setTotalExpenditure("TC034");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC034");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
