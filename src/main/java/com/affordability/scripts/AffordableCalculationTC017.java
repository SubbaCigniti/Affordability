package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC017 extends StandaloneBusinessFunctions{

	@Test(groups="Standalone",priority=1)
	public void standaloneTC017 () throws Throwable{
		reportTestCaseName = "Aff_17";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 017" );	
		runAPITestCase("StandAlone_TC017");
		verifyAffordableAmountAndLoanTermForAPI("TC017");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC017() throws Throwable{
		reportTestCaseName = "Aff_17";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 017" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC017");
		addApplicants("TC017", "joint");
		getDecision();
		addLoanRequirements("TC017");
		additionalBorrowing("TC017");
		personalDetailsSingle("TC017");
		addressDetails("TC017");
		currentIncome("TC017");
		appBreakDownIncome("TC017", "one","joint");
		personalDetailsJoint("TC017");
		addressDetailsJoint("TC017");
		currentIncomeJoint("TC017");
		appBreakDownIncomejoint("TC017","one");
		committedExpenditure("TC017","joint");
		houseHoldExp("TC017");
		futureChanges("EB");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC017");
		verifyMinimumAffordableLoanTerm("TC017");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC017() throws Throwable 
	{
		reportTestCaseName = "Aff_17";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 017" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC017");	
		enterDOBAndRetirementAge("TC017", "2");
		clickYesApplicant1("TC017");
		setemployment_statusApplicant1("TC017");
		setGrossSalaryApplicant1("TC017");		
		clickYesApplicant2("TC017");
		setemployment_statusApplicant2("TC017");
		setGrossSalaryApplicant2("TC017");				
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC017");
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC017");		
		enterOtherExpenditures("TC017");		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC017");
		parent.appendChild(child);		
		iterationReport(1, "Test Case Completed");
	}
}
