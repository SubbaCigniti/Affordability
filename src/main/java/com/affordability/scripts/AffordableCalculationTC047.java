package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC047 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC047 () throws Throwable{
		reportTestCaseName = "Aff_47";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 047" );	
		runAPITestCase("StandAlone_TC047");
		verifyAffordableAmountAndLoanTermForAPI("TC047");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC047() throws Throwable {
		reportTestCaseName = "Aff_47";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 047" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC047");
		addApplicants("TC047", "joint");
		getDecision();
		addLoanRequirements("TC047");
		additionalBorrowing("TC047");
		personalDetailsSingle("TC047");
		addressDetails("TC047");
		currentIncome("TC047");
		appBreakDownIncome("TC047", "one","joint");
		personalDetailsJoint("TC047");
		addressDetailsJoint("TC047");
		currentIncomeJoint("TC047");
		appBreakDownIncomejoint("TC047","one");
		committedExpenditure("TC047","joint");
		houseHoldExp("TC047");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC047");
		verifyMinimumAffordableLoanTerm("TC047");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC047() throws Throwable 
	{
		reportTestCaseName = "Aff_47";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 047" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC047");	
		enterDOBAndRetirementAge("TC047", "2");
		clickYesApplicant1("TC047");
		setemployment_statusApplicant1("TC047");
		setLastFullTradingYearsNetProfit_1("TC047");
		setPreviousFullTradingYearsNetProfit_1("TC047");		
		clickYesApplicant2("TC047");
		setemployment_statusApplicant2("TC047");
		setLastFullTradingYearsNetProfit_2("TC047");
		setPreviousFullTradingYearsNetProfit_2("TC047");		
		enterExpenditures("TC047");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC047");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
