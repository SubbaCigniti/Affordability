package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC049 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC049 () throws Throwable{
		reportTestCaseName = "Aff_49";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 049" );	
		runAPITestCase("StandAlone_TC049");
		verifyAffordableAmountAndLoanTermForAPI("TC049");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 		
	}
	@Test (groups="MSO",priority=2)
	public void msoTC049() throws Throwable {
		reportTestCaseName = "Aff_49";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 049" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC049");
	    addApplicants("TC049", "single");
	    getDecision();
	    addLoanRequirements("TC049");
	    additionalBorrowing("TC049");
	    personalDetailsSingle("TC049");
	    addressDetails("TC049");
	    currentIncome("TC049");
	    appBreakDownIncome("TC049", "one","single");
	    committedExpenditure("TC049","single");
	    houseHoldExp("TC049");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC049");
	    verifyMinimumAffordableLoanTerm("TC049");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC049() throws Throwable 
	{
		reportTestCaseName = "Aff_49";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 049" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC049");	
		enterDOBAndRetirementAge("TC049", "1");
		clickYesApplicant1("TC049");
		setemployment_statusApplicant1("TC049");
		setAnnualIncomeofApplicant1("TC049");
		setDayRate_1("TC049");
		enterExpenditures("TC049");		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC049");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
