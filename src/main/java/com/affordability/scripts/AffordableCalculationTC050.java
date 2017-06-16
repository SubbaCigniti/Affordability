package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC050 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC050 () throws Throwable{
		reportTestCaseName = "Aff_50";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 050" );	
		runAPITestCase("StandAlone_TC050");
		verifyAffordableAmountAndLoanTermForAPI("TC050");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");		
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC050() throws Throwable {
		reportTestCaseName = "Aff_50";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 050" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC050");
		addApplicants("TC050", "joint");
		getDecision();
		addLoanRequirements("TC050");
		additionalBorrowing("TC050");
		personalDetailsSingle("TC050");
		addressDetails("TC050");
		currentIncome("TC050");
		appBreakDownIncome("TC050", "one","joint");
		personalDetailsJoint("TC050");
		addressDetailsJoint("TC050");
		currentIncomeJoint("TC050");
		appBreakDownIncomejoint("TC050","two");
		committedExpenditure("TC050","joint");
		houseHoldExp("TC050");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC050");
		verifyMinimumAffordableLoanTerm("TC050");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC050() throws Throwable 
	{
		reportTestCaseName = "Aff_50";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 050" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC050");
		enterDOBAndRetirementAge("TC050", "2");
		clickYesApplicant1("TC050");
		setemployment_statusApplicant1("TC050");
		setAnnualIncomeofApplicant1("TC050");
		setDayRate_1("TC050");		 
		clickAddIncomeApplicant2();
		setemployment_statusApplicant2("TC050");
		setGrossSalaryApplicant2("TC050");		
		enterExpenditures("TC050");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC050");
		parent.appendChild(child);		
		iterationReport(1, "Test Case Completed");
	}
}
