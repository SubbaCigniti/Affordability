package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC020 extends StandaloneBusinessFunctions{

	@Test (groups="Standalone",priority=1)
	public void standaloneTC20 () throws Throwable{
		reportTestCaseName = "Aff_20";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 020" );	
		runAPITestCase("StandAlone_TC020");
		verifyAffordableAmountAndLoanTermForAPI("TC020");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC020() throws Throwable{
		reportTestCaseName = "Aff_20";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 020" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC020");
		addApplicants("TC020", "joint");
		getDecision();
		addLoanRequirements("TC020");
		additionalBorrowing("TC020");
		personalDetailsSingle("TC020");
		addressDetails("TC020");
		currentIncome("TC020");
		appBreakDownIncome("TC020", "one","joint");
		personalDetailsJoint("TC020");
		addressDetailsJoint("TC020");
		currentIncomeJoint("TC020");
		appBreakDownIncomejoint("TC020","one");
		committedExpenditure("TC020","joint");
		houseHoldExp("TC020");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC020");
		verifyMinimumAffordableLoanTerm("TC020");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC020() throws Throwable 
	{
		reportTestCaseName = "Aff_20";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 020" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC020");	
		enterDOBAndRetirementAge("TC020", "2");
		clickYesApplicant1("TC020");
		setemployment_statusApplicant1("TC020");
		setGrossSalaryApplicant1("TC020");		
		clickYesApplicant2("TC020");
		setemployment_statusApplicant2("TC020");
		setGrossSalaryApplicant2("TC020");
//		enterExpenditures("TC020");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC020");
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC020");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC020");
		clickSimpleOption_oth();
		setTotalExpenditure("TC020");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC020");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
