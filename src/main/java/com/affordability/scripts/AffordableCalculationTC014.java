package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC014 extends StandaloneBusinessFunctions{

	@Test(groups="Standalone",priority=1)
	public void standaloneTC014 () throws Throwable{
		reportTestCaseName = "Aff_14";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 014" );	
		runAPITestCase("StandAlone_TC014");
		verifyAffordableAmountAndLoanTermForAPI("TC014");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC014() throws Throwable{
		reportTestCaseName = "Aff_14";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 014" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC014");
		addApplicants("TC014", "joint");
		getDecision();
		addLoanRequirements("TC014");
		additionalBorrowing("TC014");
		personalDetailsSingle("TC014");
		addressDetails("TC014");
		currentIncome("TC014");
		appBreakDownIncome("TC014", "one","joint");
		personalDetailsJoint("TC014");
		addressDetailsJoint("TC014");
		currentIncomeJoint("TC014");
		appBreakDownIncomejoint("TC014","one");
		committedExpenditure("TC014","joint");
		houseHoldExp("TC014");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC014");
		verifyMinimumAffordableLoanTerm("TC014");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	//@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC014() throws Throwable 
	{
		reportTestCaseName = "Aff_14";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 014" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC014");		
		enterDOBAndRetirementAge("TC014", "2");
		clickYesApplicant1("TC014");
		setemployment_statusApplicant1("TC014");
		setGrossSalaryApplicant1("TC014");			
		setemployment_statusApplicant2("TC014");
		setGrossSalaryApplicant2("TC014");		
		enterExpenditures("TC014");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC014");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}

}
