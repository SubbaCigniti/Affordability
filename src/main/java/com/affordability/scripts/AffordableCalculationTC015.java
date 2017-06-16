package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC015 extends StandaloneBusinessFunctions{

	@Test(groups="Standalone",priority=1)
	public void standaloneTC015 () throws Throwable{
		reportTestCaseName = "Aff_15";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 015" );	
		runAPITestCase("StandAlone_TC015");
		verifyAffordableAmountAndLoanTermForAPI("TC015");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}

	@Test (groups="MSO",priority=2)
	public void msoTC15() throws Throwable{
		reportTestCaseName = "Aff_15";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 015" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC015");
		addApplicants("TC015", "joint");
		getDecision();
		addLoanRequirements("TC015");
		additionalBorrowing("TC015");
		personalDetailsSingle("TC015");
		addressDetails("TC015");
		currentIncome("TC015");
		appBreakDownIncome("TC015", "one","joint");
		personalDetailsJoint("TC015");
		addressDetailsJoint("TC015");
		currentIncomeJoint("TC015");
		appBreakDownIncomejoint("TC015","one");
		committedExpenditure("TC015","joint");
		houseHoldExp("TC015");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC015");
		verifyMinimumAffordableLoanTerm("TC015");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC015() throws Throwable 
	{
		reportTestCaseName = "Aff_15";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 015" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC015");	
		enterDOBAndRetirementAge("TC015", "2");
		clickYesApplicant1("TC015");
		setemployment_statusApplicant1("TC015");
		setGrossSalaryApplicant1("TC015");		
		clickYesApplicant2("TC015");
		setGrossSalaryApplicant2("TC015");
		setemployment_statusApplicant1("TC015");
		enterExpenditures("TC015");		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC015");
		parent.appendChild(child);		
		iterationReport(1, "Test Case Completed");
	}
}
