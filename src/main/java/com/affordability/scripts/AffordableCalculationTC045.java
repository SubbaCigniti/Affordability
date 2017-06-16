package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC045 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC045 () throws Throwable{
		reportTestCaseName = "Aff_45";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 045" );	
		runAPITestCase("StandAlone_TC045");
		verifyAffordableAmountAndLoanTermForAPI("TC045");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");  	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC045() throws Throwable {
		reportTestCaseName = "Aff_45";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 045" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC045");
		addApplicants("TC045", "single");
		getDecision();
		addLoanRequirements("TC045");
		additionalBorrowing("TC045");
		personalDetailsSingle("TC045");
		addressDetails("TC045");
		currentIncome("TC045");
		appBreakDownIncome("TC045", "one","single");
		committedExpenditure("TC045","single");
		houseHoldExp("TC045");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC045");
		verifyMinimumAffordableLoanTerm("TC045");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC045() throws Throwable 
	{
		reportTestCaseName = "Aff_45";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 045" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC045");	
		enterDOBAndRetirementAge("TC045", "1");
		clickYesApplicant1("TC045");
		setemployment_statusApplicant1("TC045");
		setAnnualIncomeofApplicant1("TC045");
//		enterExpenditures("TC045");
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC045");
		setcomittedExp_CC_Monthlypayment("TC045");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC045");
		clickSimpleOption_oth();
		setTotalExpenditure("TC045");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC045");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
