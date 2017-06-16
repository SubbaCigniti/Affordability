package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC048 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC048 () throws Throwable{
		reportTestCaseName = "Aff_48";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 048" );	
		runAPITestCase("StandAlone_TC048");
		verifyAffordableAmountAndLoanTermForAPI("TC048");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC048() throws Throwable {
		reportTestCaseName = "Aff_48";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 048" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC048");
	    addApplicants("TC048", "joint");
	    getDecision();
	    addLoanRequirements("TC048");
	    additionalBorrowing("TC048");
	    personalDetailsSingle("TC048");
	    addressDetails("TC048");
	    currentIncome("TC048");
	    appBreakDownIncome("TC048", "one","joint");
	    personalDetailsJoint("TC048");
	    addressDetailsJoint("TC048");
	    currentIncomeJoint("TC048");
	    appBreakDownIncomejoint("TC048","one");
	    committedExpenditure("TC048","joint");
	    houseHoldExp("TC048");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC048");
	    verifyMinimumAffordableLoanTerm("TC048");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC048() throws Throwable 
	{
		reportTestCaseName = "Aff_48";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 048" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC048");		
		enterDOBAndRetirementAge("TC048", "2");
		clickYesApplicant1("TC048");
		setemployment_statusApplicant1("TC048");
		setLastFullTradingYearsNetProfit_1("TC048");
		setPreviousFullTradingYearsNetProfit_1("TC048");		
		clickYesApplicant2("TC048");
		setemployment_statusApplicant2("TC048");
		setLastFullTradingYearsNetProfit_2("TC048");
		setPreviousFullTradingYearsNetProfit_2("TC048");
		enterExpenditures("TC048");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC048");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
