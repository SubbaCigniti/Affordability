package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC012 extends StandaloneBusinessFunctions{
	@Test(groups="Standalone",priority=1)
	public void standaloneTC012 () throws Throwable{
		reportTestCaseName = "Aff_12";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 012" );	
		runAPITestCase("StandAlone_TC012");
		verifyAffordableAmountAndLoanTermForAPI("TC012");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	//@Test(groups="MSO",priority=2)
	public void msoTC012() throws Throwable{
		reportTestCaseName = "Aff_12";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 012" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC012");
		addApplicants("TC012", "joint");
		getDecision();
		addLoanRequirements("TC012");
		additionalBorrowing("TC012");
		personalDetailsSingle("TC012");
		addressDetails("TC012");
		currentIncome("TC012");
		appBreakDownIncome("TC012", "one","joint");
		personalDetailsJoint("TC012");
		addressDetailsJoint("TC012");
		currentIncomeJoint("TC012");
		appBreakDownIncomejoint("TC012","one");
		committedExpenditure("TC012","joint");
		houseHoldExp("TC012");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC012");
		verifyMinimumAffordableLoanTerm("TC012");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC012() throws Throwable 
	{
		reportTestCaseName = "Aff_12";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 012" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC012");	
		enterDOBAndRetirementAge("TC012", "2");
		clickYesApplicant1("TC012");
		setemployment_statusApplicant1("TC012");
		setGrossSalaryApplicant1("TC012");
		setGuaranteedBonusofApplicant1("TC012");
		setRegularBonusofApplicant1("TC012");		
		clickYesApplicant2("TC012");
		setemployment_statusApplicant2("TC012");
		setGrossSalaryApplicant2("TC012");
		setGuaranteedBonusofApplicant2("TC012");
		setRegularBonusofApplicant2("TC012");		
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC010");
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC012");		
		enterOtherExpenditures("TC012");	
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC012");
		parent.appendChild(child);		
		iterationReport(1, "Test Case Completed");
	}
}
