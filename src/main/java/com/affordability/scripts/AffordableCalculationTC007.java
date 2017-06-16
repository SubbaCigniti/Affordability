package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC007 extends StandaloneBusinessFunctions{

	@Test(groups="Standalone",priority=1)
	public void standaloneTC007 () throws Throwable{
		reportTestCaseName = "Aff_07";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 007" );	
		runAPITestCase("StandAlone_TC007");
		verifyAffordableAmountAndLoanTermForAPI("TC007");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC007() throws Throwable{
		reportTestCaseName = "Aff_07";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 007" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC007");
		addApplicants("TC007", "joint");
		getDecision();
		addLoanRequirements("TC007");
		additionalBorrowing("TC007");
		personalDetailsSingle("TC007");
		addressDetails("TC007");
		currentIncome("TC007");
		appBreakDownIncome("TC007", "one","joint");
		personalDetailsJoint("TC007");
		addressDetailsJoint("TC007");
		currentIncomeJoint("TC007");
		appBreakDownIncomejoint("TC007","one");
		committedExpenditure("TC007","joint");
		houseHoldExp("TC007");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC007");
		verifyMinimumAffordableLoanTerm("TC007");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC007() throws Throwable 
	{
		reportTestCaseName = "Aff_07";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 007" + " Started");	
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC007");
		clickNumOfApplicantsInput_2();
		enterDOBAndRetirementAge("TC007", "2");
		clickYesApplicant1("TC007");
		setemployment_statusApplicant1("TC007");
		setGrossSalaryApplicant1("TC007");
		setGuaranteedBonusofApplicant1("TC007");
		setRegularBonusofApplicant1("TC007");
		setemployment_statusApplicant2("TC007");
		setGrossSalaryApplicant2("TC007");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC007");
		enterOtherExpenditures("TC007");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC007");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
}
