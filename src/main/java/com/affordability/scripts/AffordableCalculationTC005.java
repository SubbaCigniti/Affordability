package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC005 extends StandaloneBusinessFunctions{

	@Test (groups="Standalone",priority=1)
	public void standaloneTC005 () throws Throwable{
		reportTestCaseName = "Aff_05";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 005" );	
		runAPITestCase("StandAlone_TC005");
		verifyAffordableAmountAndLoanTermForAPI("TC005");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC005() throws Throwable {
		reportTestCaseName = "Aff_05";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 005" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC005");
	    addApplicants("TC005", "single");
	    getDecision();
	    addLoanRequirements("TC005");
	    additionalBorrowing("TC005");
	    personalDetailsSingle("TC005");
	    addressDetails("TC005");
	    currentIncome("TC005");
	    appBreakDownIncome("TC005", "one","single");
	    committedExpenditure("TC005","single");
	    houseHoldExp("TC005");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC005");
	    verifyMinimumAffordableLoanTerm("TC005");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
		
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC005() throws Throwable 
	{
		reportTestCaseName = "Aff_05";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 005" + " Started");	
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC005");
		enterDOBAndRetirementAge("TC005", "1");
		clickYesApplicant1("TC005");
		setemployment_statusApplicant1("TC005");
		setGrossSalaryApplicant1("TC005");
		enterExpenditures("TC005");
	    clickCalculateResults();
	    verifyAmountAndLoanTerm("TC005");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 

}
}
