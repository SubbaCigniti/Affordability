package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC021 extends StandaloneBusinessFunctions {

	@Test (groups="Standalone",priority=1)
	public void standaloneTC021 () throws Throwable
	{
		reportTestCaseName = "Aff_21";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 021" );	
		runAPITestCase("StandAlone_TC021");
		verifyAffordableAmountAndLoanTermForAPI("TC021");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}

	//@Test (groups="MSO",priority=2)
	public void msoTC021() throws Throwable 
	{
		reportTestCaseName = "Aff_21";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 021" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC021");
		addApplicants("TC021","single");			    
		getDecision();
		addLoanRequirements("TC021");
		additionalBorrowing("TC021");
		personalDetailsSingle("TC021");
		addressDetails("TC021");
		currentIncome("TC021");
		appBreakDownIncome("TC021", "one","single");
		committedExpenditure("TC021","single");
		houseHoldExp("TC021");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC021");
		verifyMinimumAffordableLoanTerm("TC021");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	//@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC021() throws Throwable 
	{
		reportTestCaseName = "Aff_21";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 021" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC021");
		enterDOBAndRetirementAge("TC021", "1");
		clickYesApplicant1("TC021");
		setemployment_statusApplicant1("TC021");
		setGrossSalaryApplicant1("TC021");
		enterExpenditures("TC021");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC021");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
