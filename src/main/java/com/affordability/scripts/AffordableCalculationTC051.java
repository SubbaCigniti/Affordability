package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC051 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC051 () throws Throwable{
		reportTestCaseName = "Aff_51";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 051" );	
		runAPITestCase("StandAlone_TC051");
		verifyAffordableAmountAndLoanTermForAPI("TC051");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");		
	}
	@Test (groups="MSO",priority=2)
	public void msoTC051() throws Throwable {
		reportTestCaseName = "Aff_51";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 051" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC051");
		addApplicants("TC051","single");
		getDecision();
		addLoanRequirementsMonths_LoanTerm("TC051");
		additionalBorrowing("TC051");
		personalDetailsSingle("TC051");
		addressDetails("TC051");
		currentIncome("TC051");
		appBreakDownIncome("TC051","one","single");
		committedExpenditure("TC051","single");
		houseHoldExp("TC051");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC051");
		verifyMinimumAffordableLoanTerm("TC051");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC051() throws Throwable 
	{
		reportTestCaseName = "Aff_51";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 051" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValuesWithTerm("TC051");
		enterDOBAndRetirementAge("TC051", "1");
		clickYesApplicant1("TC051");
		setemployment_statusApplicant1("TC051");
		setAnnualIncomeofApplicant1("TC051");
		setDayRate_1("TC051");		
//		enterExpenditures("TC051");	
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC051");
		setCSAMaintenance("TC051");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC051");
		clickSimpleOption_oth();
		setTotalExpenditure("TC051");
		clickCalculateResults();
		verifyAmountAndLoanTermTC025("TC051");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
