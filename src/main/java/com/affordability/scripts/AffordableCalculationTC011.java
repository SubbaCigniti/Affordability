package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC011 extends StandaloneBusinessFunctions{

	@Test(groups="Standalone",priority=1)
	public void standaloneTC011 () throws Throwable{
		reportTestCaseName = "Aff_11";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 011" );	
		runAPITestCase("StandAlone_TC011");
		verifyAffordableAmountAndLoanTermForAPI("TC011");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC011() throws Throwable {
		reportTestCaseName = "Aff_11";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 011" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC011");
		addApplicants("TC011","single");
		getDecision();
		addLoanRequirements("TC011");
		additionalBorrowing("TC011");
		personalDetailsSingle("TC011");
		addressDetails("TC011");
		currentIncome("TC011");
		appBreakDownIncome("TC011","one","single");
		committedExpenditure("TC011","single");
		houseHoldExp("TC011");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC011");
		verifyMinimumAffordableLoanTerm("TC011");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC011() throws Throwable 
	{
		reportTestCaseName = "Aff_11";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 011" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC011");
		enterDOBAndRetirementAge("TC011", "1");
		clickYesApplicant1("TC011");
		setemployment_statusApplicant1("TC011");
		setLastFullTradingYearsNetProfit_1("TC011");
		setPreviousFullTradingYearsNetProfit_1("TC011");
		enterExpenditures("TC011");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC011");
		parent.appendChild(child);		
		iterationReport(1, "Test Case Completed");
	}
}
