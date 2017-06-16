package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC004 extends StandaloneBusinessFunctions{

	@Test (groups="Standalone",priority=1)
	public void standaloneTC004 () throws Throwable{
		reportTestCaseName = "Aff_04";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 004" );	
		runAPITestCase("StandAlone_TC004");
		verifyAffordableAmountAndLoanTermForAPI("TC004");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC004() throws Throwable {
		reportTestCaseName = "Aff_04";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 004" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC004");
		addApplicants("TC004", "joint");
		getDecision();
		addLoanRequirements("TC004");
		additionalBorrowing("TC004");
		personalDetailsSingle("TC004");
		addressDetails("TC004");
		currentIncome("TC004");
		appBreakDownIncome("TC004", "one","joint");
		personalDetailsJoint("TC004");
		addressDetailsJoint("TC004");
		currentIncomeJoint("TC004");
		appBreakDownIncomejoint("TC004","one");
		committedExpenditure("TC004","joint");
		houseHoldExp("TC004");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC004");
		verifyMinimumAffordableLoanTerm("TC004");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC004() throws Throwable 
	{
		reportTestCaseName = "Aff_04";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 004" + " Started");	
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC004");
		clickNumOfApplicantsInput_2();
		enterDOBAndRetirementAge("TC004", "2");
		clickYesApplicant1("TC004");
		setemployment_statusApplicant1("TC004");
		setGrossSalaryApplicant1("TC004");
		setemployment_statusApplicant2("TC004");
		setGrossSalaryApplicant2("TC004");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC004");
		enterOtherExpenditures("TC004");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC004");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 

	}
}
