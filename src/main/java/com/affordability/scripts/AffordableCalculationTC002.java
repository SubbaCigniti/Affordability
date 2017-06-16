package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC002 extends StandaloneBusinessFunctions{

	@Test (groups="Standalone",priority=1)
	public void standaloneTC002 () throws Throwable{
		reportTestCaseName = "Aff_02";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 002" );	
		runAPITestCase("StandAlone_TC002");
		verifyAffordableAmountAndLoanTermForAPI("TC002");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}	
	@Test (groups="MSO",priority=2)
	public void msoTC002() throws Throwable {
		reportTestCaseName = "Aff_02";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 002" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC002");
		addApplicants("TC002","single");
		getDecision();
		addLoanRequirements("TC002");
		additionalBorrowing("TC002");
		personalDetailsSingle("TC002");
		addressDetails("TC002");
		currentIncome("TC002");
		appBreakDownIncome("TC002","one","single");
		committedExpenditure("TC002","single");
		houseHoldExp("TC002");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC002");
		verifyMinimumAffordableLoanTerm("TC002");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	//@Test (groups="OrangeBus",priority=3)
	/*public void orangeBusTC002() throws Throwable 
	{
		reportTestCaseName = "Aff_02";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 002" + " Started");	
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC002");
		enterDOBAndRetirementAge("TC002", "1");
		clickYesApplicant1("TC002");
		clickNumOfApplicantsInput_1();
		setGrossSalaryApplicant1("TC002");
		setGuaranteedBonusofApplicant1("TC002");				
		enterExpenditures("TC002");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC002");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}*/
}
