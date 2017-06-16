package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC023 extends StandaloneBusinessFunctions 
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC023 () throws Throwable
	{
		reportTestCaseName = "Aff_23";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 023" );	
		runAPITestCase("StandAlone_TC023");
		verifyAffordableAmountAndLoanTermForAPI("TC023");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC023() throws Throwable 
	{
		reportTestCaseName = "Aff_23";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 023" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC023");
		addApplicants("TC023", "joint");
		getDecision();
		addLoanRequirements("TC023");
		additionalBorrowing("TC023");
		personalDetailsSingle("TC023");
		addressDetails("TC023");
		currentIncome("TC023");
		appBreakDownIncome("TC023", "one","joint");
		personalDetailsJoint("TC023");
		addressDetailsJoint("TC023");
		currentIncomeJoint("TC023");
		appBreakDownIncomejoint("TC023","one");
		committedExpenditure("TC023","joint");
		houseHoldExp("TC023");
		futureChanges("EB");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC023");
		verifyMinimumAffordableLoanTerm("TC023");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC023() throws Throwable 
	{
		reportTestCaseName = "Aff_23";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 023" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC023");
		enterDOBAndRetirementAge("TC023", "2");
		clickYesApplicant1("TC023");
		setemployment_statusApplicant1("TC023");
		setGrossSalaryApplicant1("TC023");
		clickYesApplicant2("TC023");
		setemployment_statusApplicant2("TC023");
		setGrossSalaryApplicant2("TC023");
//		enterExpenditures("TC023");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC023");
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC023");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC023");
		clickSimpleOption_oth();
		setTotalExpenditure("TC023");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC023");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
