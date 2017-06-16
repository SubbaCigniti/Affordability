package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC019 extends StandaloneBusinessFunctions{

	@Test (groups="Standalone",priority=1)
	public void standaloneTC019 () throws Throwable{
		reportTestCaseName = "Aff_19";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 019" );	
		runAPITestCase("StandAlone_TC019");
		verifyAffordableAmountAndLoanTermForAPI("TC019");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC019() throws Throwable{
		reportTestCaseName = "Aff_19";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 019" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC019");
		addApplicants("TC019", "joint");
		getDecision();
		addLoanRequirements("TC019");
		additionalBorrowing("TC019");
		personalDetailsSingle("TC019");
		addressDetails("TC019");
		currentIncome("TC019");
		appBreakDownIncome("TC019", "one","joint");
		personalDetailsJoint("TC019");
		addressDetailsJoint("TC019");
		currentIncomeJoint("TC019");
		appBreakDownIncomejoint("TC019","one");
		committedExpenditure("TC019","joint");
		houseHoldExp("TC019");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC019");
		verifyMinimumAffordableLoanTerm("TC019");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC019() throws Throwable 
	{
		reportTestCaseName = "Aff_19";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 019" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC019");
		enterDOBAndRetirementAge("TC019", "2");
		clickYesApplicant1("TC019");
		setemployment_statusApplicant1("TC019");
		setGrossSalaryApplicant1("TC019");
		clickYesApplicant2("TC019");
		setemployment_statusApplicant2("TC019");
		setGrossSalaryApplicant2("TC019");				
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC019");		
		enterOtherExpenditures("TC019");
		clickCalculateResults();
		verifyAmountAndLoanTermTC019("TC019");
		parent.appendChild(child);		
		iterationReport(1, "Test Case Completed");
	}
}
