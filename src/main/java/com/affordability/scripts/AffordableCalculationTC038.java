package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC038 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC038 () throws Throwable
	{
		reportTestCaseName = "Aff_38";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 038" );	
		runAPITestCase("StandAlone_TC038");
		verifyAffordableAmountAndLoanTermForAPI("TC038");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC038() throws Throwable 
	{
		reportTestCaseName = "Aff_38";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 038" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC038");
		addApplicants("TC038", "joint");
		getDecision();
		addLoanRequirements("TC038");
		additionalBorrowing("TC038");
		personalDetailsSingle("TC038");
		addressDetails("TC038");
		currentIncome("TC038");
		appBreakDownIncome("TC038", "one","joint");
		personalDetailsJoint("TC038");
		addressDetailsJoint("TC038");
		currentIncomeJoint("TC038");
		appBreakDownIncomejoint("TC038","one");
		committedExpenditure("TC038","joint");
		houseHoldExp("TC038");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC038");
		verifyMinimumAffordableLoanTerm("TC038");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC038() throws Throwable 
	{
		reportTestCaseName = "Aff_38";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 038" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC038");		
		enterDOBAndRetirementAge("TC038", "2");
		clickYesApplicant1("TC038");
		setemployment_statusApplicant1("TC038");
		setLastFullTradingYearsNetProfit_1("TC038");
		setPreviousFullTradingYearsNetProfit_1("TC038");		
		clickYesApplicant2("TC038");
		setemployment_statusApplicant2("TC038");
		setGrossSalaryApplicant2("TC038");
//		enterExpenditures("TC038");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC038");
		setSecureMonthlyPaymentonCompletion("TC038");
		setStudentPaymentonCompletion("TC038");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC038");
		clickSimpleOption_oth();
		setTotalExpenditure("TC038");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC038");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
