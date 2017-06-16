package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC037 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC037 () throws Throwable
	{
		reportTestCaseName = "Aff_37";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 037" );	
		runAPITestCase("StandAlone_TC037");
		verifyAffordableAmountAndLoanTermForAPI("TC037");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC037() throws Throwable 
	{
		reportTestCaseName = "Aff_37";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 037" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC037");
		addApplicants("TC037","single");
		getDecision();
		addLoanRequirements("TC037");
		additionalBorrowing("TC037");
		personalDetailsSingle("TC037");
		addressDetails("TC037");
		currentIncome("TC037");
		appBreakDownIncome("TC037","one","single");
		committedExpenditure("TC037","single");
		houseHoldExp("TC037");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC037");
		verifyMinimumAffordableLoanTerm("TC037");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC037() throws Throwable 
	{
		reportTestCaseName = "Aff_37";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 037" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC037");	
		enterDOBAndRetirementAge("TC037", "1");
		clickYesApplicant1("TC037");
		setemployment_statusApplicant1("TC037");
		setLastFullTradingYearsNetProfit_1("TC037");
		setPreviousFullTradingYearsNetProfit_1("TC037");		
//		enterExpenditures("TC037");	
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC037");
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC037");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC037");
		clickSimpleOption_oth();
		setTotalExpenditure("TC037");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC037");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
