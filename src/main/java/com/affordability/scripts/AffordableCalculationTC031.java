package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC031 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC031 () throws Throwable
	{
		reportTestCaseName = "Aff_31";
		reportApplicationName = "Standalone";	
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 031" );	
		runAPITestCase("StandAlone_TC031");
		verifyAffordableAmountAndLoanTermForAPI("TC031");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC031() throws Throwable 
	{
		reportTestCaseName = "Aff_31";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 031" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC031");
		addApplicants("TC031","single");			    
		getDecision();
		addLoanRequirements("TC031");
		additionalBorrowing("TC031");
		personalDetailsSingle("TC031");
		addressDetails("TC031");
		currentIncome("TC031");
		appBreakDownIncome("TC031", "one","single");
		committedExpenditure("TC031","single");
		houseHoldExp("TC031");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC031");
		verifyMinimumAffordableLoanTerm("TC031");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC031() throws Throwable 
	{
		reportTestCaseName = "Aff_31";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 031" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC031");
		enterDOBAndRetirementAge("TC031", "1");
		clickYesApplicant1("TC031");
		setemployment_statusApplicant1("TC031");
		setGrossSalaryApplicant1("TC031");
		enterExpenditures("TC031");		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC031");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
