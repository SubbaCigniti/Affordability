package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC025 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC025 () throws Throwable
	{
		reportTestCaseName = "Aff_25";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 025" );	
		runAPITestCase("StandAlone_TC025");
		verifyAffordableAmountAndLoanTermForAPI("TC025");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC025() throws Throwable 
	{
		reportTestCaseName = "Aff_25";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 025" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC025");
		addApplicants("TC025","single");
		getDecision();
		addLoanRequirements("TC025");
		additionalBorrowing("TC025");
		personalDetailsSingle("TC025");
		addressDetails("TC025");
		currentIncome("TC025");
		appBreakDownIncome("TC025","one","single");
		committedExpenditure("TC025","single");		
		houseHoldExp("TC025");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC025");
		verifyMinimumAffordableLoanTerm("TC025");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC025() throws Throwable 
	{
		reportTestCaseName = "Aff_25";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 025" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC025");
		enterDOBAndRetirementAge("TC025", "1");
		clickYesApplicant1("TC025");
		setemployment_statusApplicant1("TC025");
		setGrossSalaryApplicant1("TC025");
//		enterExpenditures("TC025");	
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC025");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC025");
		clickSimpleOption_oth();
		setTotalExpenditure("TC025");
		clickCalculateResults();
		verifyAmountAndLoanTermTC025("TC025");
		parent.appendChild(child);		
		iterationReport(1, "Test Case Completed");
	}
}
