package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC029 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC029 () throws Throwable
	{
		reportTestCaseName = "Aff_29";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 029" );	
		runAPITestCase("StandAlone_TC029");
		verifyAffordableAmountAndLoanTermForAPI("TC029");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC029() throws Throwable 
	{
		reportTestCaseName = "Aff_29";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 029" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC029");
		addApplicants("TC029","single");
		getDecision();
		addLoanRequirements("TC029");
		additionalBorrowing("TC029");
		personalDetailsSingle("TC029");
		addressDetails("TC029");
		currentIncome("TC029");
		appBreakDownIncome("TC029","one","single");
		committedExpenditure("TC029","single");	
		houseHoldExp("TC029");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC029");
		verifyMinimumAffordableLoanTerm("TC029");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC029() throws Throwable 
	{
		reportTestCaseName = "Aff_29";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 029" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC029");
		enterDOBAndRetirementAge("TC029", "1");
		clickYesApplicant1("TC029");
		setemployment_statusApplicant1("TC029");
		setGrossSalaryApplicant1("TC029");
		enterExpenditures("TC029");		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC029");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
