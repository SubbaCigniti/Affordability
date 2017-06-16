package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC030 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC030 () throws Throwable
	{
		reportTestCaseName = "Aff_30";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 030" );	
		runAPITestCase("StandAlone_TC030");
		verifyAffordableAmountAndLoanTermForAPI("TC030");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC030() throws Throwable 
	{
		reportTestCaseName = "Aff_30";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 030" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC030");
		addApplicants("TC030","single");			    
		getDecision();
		addLoanRequirements("TC030");
		additionalBorrowing("TC030");
		personalDetailsSingle("TC030");
		addressDetails("TC030");
		currentIncome("TC030");
		appBreakDownIncome("TC030", "one","single");
		committedExpenditure("TC030","single");
		houseHoldExp("TC030");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC030");
		verifyMinimumAffordableLoanTerm("TC030");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC030() throws Throwable 
	{
		reportTestCaseName = "Aff_30";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 030" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC030");
		enterDOBAndRetirementAge("TC030", "1");
		clickYesApplicant1("TC030");
		setemployment_statusApplicant1("TC030");
		setGrossSalaryApplicant1("TC030");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC030");
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC030");		
		enterOtherExpenditures("TC030");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC030");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
