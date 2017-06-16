package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC024 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC024 () throws Throwable
	{
		reportTestCaseName = "Aff_24";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 024" );	
		runAPITestCase("StandAlone_TC024");
		verifyAffordableAmountAndLoanTermForAPI("TC024");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC024() throws Throwable 
	{
		reportTestCaseName = "Aff_24";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 024" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC024");
		addApplicants("TC024","single");			    
		getDecision();
		addLoanRequirements("TC024");
		additionalBorrowing("TC024");
		personalDetailsSingle("TC024");
		addressDetails("TC024");
		currentIncome("TC024");
		appBreakDownIncome("TC024", "one","single");
		committedExpenditure("TC024","single");
		houseHoldExp("TC024");
		futureChanges("EB");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC024");
		verifyMinimumAffordableLoanTerm("TC024");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC024() throws Throwable 
	{
		reportTestCaseName = "Aff_24";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 024" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC024");
		enterDOBAndRetirementAge("TC024", "1");
		clickYesApplicant1("TC024");
		setemployment_statusApplicant1("TC024");
		setGrossSalaryApplicant1("TC024");
		enterExpenditures("TC024");		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC024");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
