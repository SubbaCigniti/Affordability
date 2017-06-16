package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC041 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC041 () throws Throwable{
		reportTestCaseName = "Aff_41";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 041" );	
		runAPITestCase("StandAlone_TC041");
		verifyAffordableAmountAndLoanTermForAPI("TC041");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC041() throws Throwable {
		reportTestCaseName = "Aff_41";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 041" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC041");
		addApplicants("TC041","single");
		getDecision();
		addLoanRequirements("TC041");
		additionalBorrowing("TC041");
		personalDetailsSingle("TC041");
		addressDetails("TC041");
		currentIncome("TC041");
		appBreakDownIncome("TC041","one","single");
		committedExpenditure("TC041","single");
		houseHoldExp("TC041");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC041");
		verifyMinimumAffordableLoanTerm("TC041");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC041() throws Throwable 
	{
		reportTestCaseName = "Aff_41";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 041" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC041");	
		enterDOBAndRetirementAge("TC041", "1");
		clickYesApplicant1("TC041");
		setemployment_statusApplicant1("TC041");
		setAnnualIncomeofApplicant1("TC041");
		enterExpenditures("TC041");		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC041");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}

}
