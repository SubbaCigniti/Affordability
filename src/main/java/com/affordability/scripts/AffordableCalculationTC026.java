package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC026 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC026 () throws Throwable
	{
		reportTestCaseName = "Aff_26";
		reportApplicationName = "Standalone";	
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 026" );	
		runAPITestCase("StandAlone_TC026");
		verifyAffordableAmountAndLoanTermForAPI("TC026");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC026() throws Throwable 
	{
		reportTestCaseName = "Aff_26";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 026" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC026");
		addApplicants("TC026", "joint");
		getDecision();
		addLoanRequirements("TC026");
		additionalBorrowing("TC026");
		personalDetailsSingle("TC026");
		addressDetails("TC026");
		currentIncome("TC026");
		appBreakDownIncome("TC026", "one","joint");
		personalDetailsJoint("TC026");
		addressDetailsJoint("TC026");
		currentIncomeJoint("TC026");
		appBreakDownIncomejoint("TC026","one");
		committedExpenditure("TC026","joint");
		houseHoldExp("TC026");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC026");
		verifyMinimumAffordableLoanTerm("TC026");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	//@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC026() throws Throwable 
	{
		reportTestCaseName = "Aff_26";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 026" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC026");
		enterDOBAndRetirementAge("TC026", "2");
		clickYesApplicant1("TC026");
		setemployment_statusApplicant1("TC026");
		setGrossSalaryApplicant1("TC026");
		clickYesApplicant2("TC026");
		setemployment_statusApplicant2("TC026");
		setGrossSalaryApplicant2("TC026");
		enterExpenditures("TC026");		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC026");
		parent.appendChild(child);		
		iterationReport(1, "Test Case Completed");
	}
}
