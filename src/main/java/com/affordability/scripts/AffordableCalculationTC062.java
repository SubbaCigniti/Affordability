package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC062 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC062 () throws Throwable{
		reportTestCaseName = "Aff_62";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 062" );	
		runAPITestCase("StandAlone_TC062");
		verifyAffordableAmountAndLoanTermForAPI("TC062");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC062() throws Throwable {
		reportTestCaseName = "Aff_62";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 062" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC062");
		addApplicants("TC062","single");			    
		getDecision();
		addLoanRequirements("TC062");
		additionalBorrowing("TC062");
		personalDetailsSingle("TC062");
		addressDetails("TC062");
		currentIncome("TC062");
		appBreakDownIncome("TC062", "one","single");
		committedExpenditure("TC062","single");
		houseHoldExp("TC062");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC062");
		verifyMinimumAffordableLoanTerm("TC062");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");  
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC062() throws Throwable 
	{
		reportTestCaseName = "Aff_62";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 062" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC062");
		enterDOBAndRetirementAge("TC062", "1");
		clickYesApplicant1("TC062");
		setemployment_statusApplicant1("TC062");
		setLastFullTradingYearsNetProfit_1("TC062");
		setPreviousFullTradingYearsNetProfit_1("TC062");
		enterExpenditures("TC062");		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC062");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
