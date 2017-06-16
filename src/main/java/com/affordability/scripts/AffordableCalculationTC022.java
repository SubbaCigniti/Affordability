package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC022 extends StandaloneBusinessFunctions {

	@Test (groups="Standalone",priority=1)
	public void standaloneTC022 () throws Throwable
	{
		reportTestCaseName = "Aff_22";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 022" );	
		runAPITestCase("StandAlone_TC022");
		verifyAffordableAmountAndLoanTermForAPI("TC022");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC022() throws Throwable 
	{
		reportTestCaseName = "Aff_22";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 022" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC022");
		addApplicants("TC022", "joint");
		getDecision();
		addLoanRequirements("TC022");
		additionalBorrowing("TC022");
		personalDetailsSingle("TC022");
		addressDetails("TC022");
		currentIncome("TC022");
		appBreakDownIncome("TC022", "one","joint");
		personalDetailsJoint("TC022");
		addressDetailsJoint("TC022");
		currentIncomeJoint("TC022");
		appBreakDownIncomejoint("TC022","one");
		committedExpenditure("TC022","joint");
		houseHoldExp("TC022");
		futureChanges("EB");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC022");
		verifyMinimumAffordableLoanTerm("TC022");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC022() throws Throwable 
	{
		reportTestCaseName = "Aff_22";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 022" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC022");		
		enterDOBAndRetirementAge("TC022", "2");
		clickYesApplicant1("TC022");
		setemployment_statusApplicant1("TC022");
		setGrossSalaryApplicant1("TC022");		
		clickYesApplicant2("TC022");
		setemployment_statusApplicant2("TC022");
		setGrossSalaryApplicant2("TC022");
		enterExpenditures("TC022");		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC022");
		parent.appendChild(child);		
		iterationReport(1, "Test Case Completed");
	}
}
