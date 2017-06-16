package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC040 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC040 () throws Throwable
	{
		reportTestCaseName = "Aff_40";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 040" );	
		runAPITestCase("StandAlone_TC040");
		verifyAffordableAmountAndLoanTermForAPI("TC040");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC040() throws Throwable 
	{
		reportTestCaseName = "Aff_40";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 040" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC040");
		addApplicants("TC040", "joint");
		getDecision();
		addLoanRequirements("TC040");
		additionalBorrowing("TC040");
		personalDetailsSingle("TC040");
		addressDetails("TC040");
		currentIncome("TC040");
		appBreakDownIncome("TC040", "one","joint");
		personalDetailsJoint("TC040");
		addressDetailsJoint("TC040");
		currentIncomeJoint("TC040");
		appBreakDownIncomejoint("TC040","one");
		committedExpenditure("TC040","joint");
		houseHoldExp("TC040");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC040");
		verifyMinimumAffordableLoanTerm("TC040");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC040() throws Throwable 
	{
		reportTestCaseName = "Aff_40";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 040" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC040");	
		enterDOBAndRetirementAge("TC040", "2");
		clickYesApplicant1("TC040");
		setemployment_statusApplicant1("TC040");
		setAnnualIncomeofApplicant1("TC040");		
		clickYesApplicant2("TC040");
		setemployment_statusApplicant2("TC040");
		setAnnualIncomeofApplicant2("TC040");		
//		enterExpenditures("TC040");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC040");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC040");
		clickSimpleOption_oth();
		setTotalExpenditure("TC040");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC040");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
