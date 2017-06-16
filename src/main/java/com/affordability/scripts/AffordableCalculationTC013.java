package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC013 extends StandaloneBusinessFunctions{

	@Test(groups="Standalone",priority=1)
	public void standaloneTC013 () throws Throwable{
		reportTestCaseName = "Aff_13";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 013" );	
		runAPITestCase("StandAlone_TC013");
		verifyAffordableAmountAndLoanTermForAPI("TC013");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}	
	@Test(groups="MSO",priority=2)
	public void msoTC013() throws Throwable {
		reportTestCaseName = "Aff_13";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 013" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC013");
		addApplicants("TC013", "joint");
		getDecision();
		addLoanRequirements("TC013");
		additionalBorrowing("TC013");
		personalDetailsSingle("TC013");
		addressDetails("TC013");
		currentIncome("TC013");
		appBreakDownIncome("TC013", "one","joint");
		personalDetailsJoint("TC013");
		addressDetailsJoint("TC013");
		currentIncomeJoint("TC013");
		appBreakDownIncomejoint("TC013","one");
		committedExpenditure("TC013","joint");
		houseHoldExp("TC013");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC013");
		verifyMinimumAffordableLoanTerm("TC013");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC013() throws Throwable 
	{
		reportTestCaseName = "Aff_13";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 013" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);		
		setPropertyAndLoanValues("TC013");	
		enterDOBAndRetirementAge("TC013", "2");
		clickYesApplicant1("TC013");
		setemployment_statusApplicant1("TC013");
		setGrossSalaryApplicant1("TC013");				
		clickYesApplicant2("TC013");
		setemployment_statusApplicant2("TC013");
		setGrossSalaryApplicant2("TC013");					
//		enterExpenditures("TC013");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC013");
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC013");
		setSecureMonthlyPaymentonCompletion("TC013");
		setCSAMaintenance("TC013");
		setStudentPaymentonCompletion("TC013");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC013");
		clickSimpleOption_oth();
		setTotalExpenditure("TC013");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC013");
		parent.appendChild(child);		
		iterationReport(1, "Test Case Completed");
	}
}
