package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC032 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC032 () throws Throwable
	{
		reportTestCaseName = "Aff_32";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 032" );	
		runAPITestCase("StandAlone_TC032");
		verifyAffordableAmountAndLoanTermForAPI("TC032");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC032() throws Throwable 
	{
		reportTestCaseName = "Aff_32";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 032" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC032");
		addApplicants("TC032","single");
		getDecision();
		addLoanRequirements("TC032");
		additionalBorrowing("TC032");
		personalDetailsSingle("TC032");
		addressDetails("TC032");
		currentIncome("TC032");
		appBreakDownIncome("TC032","one","single");
		committedExpenditure("TC032","single");
		houseHoldExp("TC032");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC032");
		verifyMinimumAffordableLoanTerm("TC032");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	//@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC032() throws Throwable 
	{
		reportTestCaseName = "Aff_32";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 032" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC032");
		enterDOBAndRetirementAge("TC032", "1");
		clickYesApplicant1("TC032");
		setemployment_statusApplicant1("TC032");
		setLastFullTradingYearsNetProfit_1("TC032");
		setPreviousFullTradingYearsNetProfit_1("TC032");
		enterExpenditures("TC032");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC032");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
