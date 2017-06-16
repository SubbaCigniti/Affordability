package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC033 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC033 () throws Throwable
	{
		reportTestCaseName = "Aff_33";
		reportApplicationName = "Standalone";	
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 033" );	
		runAPITestCase("StandAlone_TC033");
		verifyAffordableAmountAndLoanTermForAPI("TC033");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC033() throws Throwable 
	{
		reportTestCaseName = "Aff_33";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 033" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC033");
		addApplicants("TC033","single");
		getDecision();
		addLoanRequirements("TC033");
		additionalBorrowing("TC033");
		personalDetailsSingle("TC033");
		addressDetails("TC033");
		currentIncome("TC033");
		appBreakDownIncome("TC033","one","single");
		committedExpenditure("TC033","single");
		houseHoldExp("TC033");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC033");
		verifyMinimumAffordableLoanTerm("TC033");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	//@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC033() throws Throwable 
	{
		reportTestCaseName = "Aff_33";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 033" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC033");
		enterDOBAndRetirementAge("TC033", "1");
		clickYesApplicant1("TC033");
		setemployment_statusApplicant1("TC033");
		setLastFullTradingYearsNetProfit_1("TC033");
		setPreviousFullTradingYearsNetProfit_1("TC033");
//		enterExpenditures("TC033");		
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC033");
		setCSAMaintenance("TC033");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC033");
		clickSimpleOption_oth();
		setTotalExpenditure("TC033");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC033");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
