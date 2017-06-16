package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC039 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC039 () throws Throwable
	{
		reportTestCaseName = "Aff_39";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 039" );	
		runAPITestCase("StandAlone_TC039");
		verifyAffordableAmountAndLoanTermForAPI("TC039");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC039() throws Throwable 
	{
		reportTestCaseName = "Aff_39";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 039" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC039");
		addApplicants("TC039","single");
		getDecision();
		addLoanRequirements("TC039");
		additionalBorrowing("TC039");
		personalDetailsSingle("TC039");
		addressDetails("TC039");
		currentIncome("TC039");
		appBreakDownIncome("TC039","one","single");
		committedExpenditure("TC039","single");
		houseHoldExp("TC039");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC039");
		verifyMinimumAffordableLoanTerm("TC039");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC039() throws Throwable 
	{
		reportTestCaseName = "Aff_39";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 039" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC039");	
		enterDOBAndRetirementAge("TC039", "1");
		clickYesApplicant1("TC039");
		setemployment_statusApplicant1("TC039");
		setGrossSalaryApplicant1("TC039");
		enterExpenditures("TC039");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC039");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
