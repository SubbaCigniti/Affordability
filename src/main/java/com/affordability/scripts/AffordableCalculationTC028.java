package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC028 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC028 () throws Throwable
	{
		reportTestCaseName = "Aff_28";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 028" );	
		runAPITestCase("StandAlone_TC028");
		verifyAffordableAmountAndLoanTermForAPI("TC028");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC028() throws Throwable 
	{
		reportTestCaseName = "Aff_28";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 028" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC028");
		addApplicants("TC028", "joint");
		getDecision();
		addLoanRequirements("TC028");
		additionalBorrowing("TC028");
		personalDetailsSingle("TC028");
		addressDetails("TC028");
		currentIncome("TC028");
		appBreakDownIncome("TC028", "one","joint");
		personalDetailsJoint("TC028");
		addressDetailsJoint("TC028");
		currentIncomeJoint("TC028");
		appBreakDownIncomejoint("TC028","one");
		committedExpenditure("TC028","joint");
		houseHoldExp("TC028");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC028");
		verifyMinimumAffordableLoanTerm("TC028");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	//@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC028() throws Throwable 
	{
		reportTestCaseName = "Aff_28";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 028" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC028");
		enterDOBAndRetirementAge("TC028", "2");
		clickYesApplicant1("TC028");
		setemployment_statusApplicant1("TC028");
		setGrossSalaryApplicant1("TC028");
		clickYesApplicant2("TC028");
		setemployment_statusApplicant2("TC028");
		setGrossSalaryApplicant2("TC028");
		enterExpenditures("TC028");		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC028");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
