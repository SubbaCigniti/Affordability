package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC057 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC057 () throws Throwable{
		reportTestCaseName = "Aff_57";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 057" );	
		runAPITestCase("StandAlone_TC057");
		verifyAffordableAmountAndLoanTermForAPI("TC057");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");		
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC057() throws Throwable {
		reportTestCaseName = "Aff_57";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 057" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC057");
		addApplicants("TC057", "joint");
		getDecision();
		addLoanRequirements("TC057");
		additionalBorrowing("TC057");
		personalDetailsSingle("TC057");
		addressDetails("TC057");
		currentIncome("TC057");
		appBreakDownIncome("TC057", "one","joint");
		personalDetailsJoint("TC057");
		addressDetailsJoint("TC057");
		currentIncomeJoint("TC057");
		appBreakDownIncomejoint("TC057","one");
		committedExpenditure("TC057","joint");
		houseHoldExp("TC057");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC057");
		verifyMinimumAffordableLoanTerm("TC057");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");  	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC057() throws Throwable 
	{
		reportTestCaseName = "Aff_57";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 057" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC057");	
		enterDOBAndRetirementAge("TC057", "2");
		clickYesApplicant1("TC057");
		setemployment_statusApplicant1("TC057");
		setAnnualIncomeofApplicant1("TC057");	
		setDayRate_1("TC057");		
		clickAddIncomeApplicant2();
		setemployment_statusApplicant2("TC057");
		setGrossSalaryApplicant2("TC057");	
//		enterExpenditures("TC057");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC057");
		setSecureMonthlyPaymentonCompletion("TC057");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC057");
		clickSimpleOption_oth();
		setTotalExpenditure("TC057");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC057");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
