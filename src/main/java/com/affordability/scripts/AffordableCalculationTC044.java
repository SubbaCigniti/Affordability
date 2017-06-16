package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC044 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC044 () throws Throwable{
		reportTestCaseName = "Aff_44";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 044" );	
		runAPITestCase("StandAlone_TC044");
		verifyAffordableAmountAndLoanTermForAPI("TC044");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");   	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC044() throws Throwable {
		reportTestCaseName = "Aff_44";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 044" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC044");
	    addApplicants("TC044", "joint");
	    getDecision();
	    addLoanRequirements("TC044");
	    additionalBorrowing("TC044");
	    personalDetailsSingle("TC044");
	    addressDetails("TC044");
	    currentIncome("TC044");
	    appBreakDownIncome("TC044", "one","joint");
	    personalDetailsJoint("TC044");
	    addressDetailsJoint("TC044");
	    currentIncomeJoint("TC044");
	    appBreakDownIncomejoint("TC044","one");
	    committedExpenditure("TC044","joint");
	    houseHoldExp("TC044");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC044");
	    verifyMinimumAffordableLoanTerm("TC044");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC044() throws Throwable 
	{
		reportTestCaseName = "Aff_44";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 044" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC044");	
		enterDOBAndRetirementAge("TC044", "2");
		clickYesApplicant1("TC044");
		setemployment_statusApplicant1("TC044");
		setAnnualIncomeofApplicant1("TC044");		
		clickYesApplicant2("TC044");
		setemployment_statusApplicant2("TC044");
		setLastFullTradingYearsNetProfit_2("TC044");
		setPreviousFullTradingYearsNetProfit_2("TC044");
		enterExpenditures("TC044");		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC044");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
