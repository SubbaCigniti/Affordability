package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC016 extends StandaloneBusinessFunctions{

	@Test(groups="Standalone",priority=1)
	public void standaloneTC016 () throws Throwable{
		reportTestCaseName = "Aff_16";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 016" );	
		runAPITestCase("StandAlone_TC016");
		verifyAffordableAmountAndLoanTermForAPI("TC016");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 		
	}
	@Test  (groups="MSO",priority=2)
	public void msoTC016() throws Throwable{
		reportTestCaseName = "Aff_16";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 016" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC016");
		addApplicants("TC016", "joint");
		getDecision();
		addLoanRequirements("TC016");
		additionalBorrowing("TC016");
		personalDetailsSingle("TC016");
		addressDetails("TC016");
		currentIncome("TC016");
		appBreakDownIncome("TC016", "one","joint");
		personalDetailsJoint("TC016");
		addressDetailsJoint("TC016");
		currentIncomeJoint("TC016");
		appBreakDownIncomejoint("TC016","one");
		committedExpenditure("TC016","joint");
		houseHoldExp("TC016");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC016");
		verifyMinimumAffordableLoanTerm("TC016");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 		
	}
	//@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC016() throws Throwable 
	{
		reportTestCaseName = "Aff_16";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 016" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC016");
		enterDOBAndRetirementAge("TC016", "2");
		clickYesApplicant1("TC016");
		setemployment_statusApplicant1("TC016");
		setGrossSalaryApplicant1("TC016");		
		clickYesApplicant2("TC016");
		setemployment_statusApplicant2("TC016");
		setGrossSalaryApplicant2("TC016");				
		enterExpenditures("TC016");		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC016");
		parent.appendChild(child);		
		iterationReport(1, "Test Case Completed");
	}
}
