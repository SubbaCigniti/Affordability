package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC035 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC035 () throws Throwable
	{
		reportTestCaseName = "Aff_35";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 035" );	
		runAPITestCase("StandAlone_TC035");
		verifyAffordableAmountAndLoanTermForAPI("TC035");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC035() throws Throwable 
	{
		reportTestCaseName = "Aff_35";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 035" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC035");
		addApplicants("TC035", "joint");
		getDecision();
		addLoanRequirements("TC035");
		additionalBorrowing("TC035");
		personalDetailsSingle("TC035");
		addressDetails("TC035");
		currentIncome("TC035");
		appBreakDownIncome("TC035", "two","joint");
		personalDetailsJoint("TC035");
		addressDetailsJoint("TC035");
		currentIncomeJoint("TC035");
		appBreakDownIncomejoint("TC035","one");
		committedExpenditure("TC035","joint");
		houseHoldExp("TC035");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC035");
		verifyMinimumAffordableLoanTerm("TC035");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC035() throws Throwable 
	{
		reportTestCaseName = "Aff_35";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 035" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC035");	
		enterDOBAndRetirementAge("TC035", "2");
		clickYesApplicant1("TC035");
		setemployment_statusApplicant1("TC035");
		setLastFullTradingYearsNetProfit_1("TC035");
		setPreviousFullTradingYearsNetProfit_1("TC035");
		clickYesApplicant2("TC035");
		setemployment_statusApplicant2("TC035");
		setGrossSalaryApplicant2("TC035");	
		clickAddIncomeApplicant1();
		setemploymentStatusApp12ndJob("TC035");
		setLastFullTradingYearsNetProfitofApplicant1Job2("TC035");
		setPreviousFullTradingYearsNetProfitofApplicant1Job2("TC035");		
//		enterExpenditures("TC035");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC035");
//		setSecureMonthlyPaymentonCompletion("TC035");
//		setCSAMaintenance("TC035");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC035");
		clickSimpleOption_oth();
		setTotalExpenditure("TC035");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC035");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
