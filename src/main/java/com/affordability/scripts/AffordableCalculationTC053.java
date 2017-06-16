package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC053 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC053 () throws Throwable{
		reportTestCaseName = "Aff_53";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 053" );	
		runAPITestCase("StandAlone_TC053");
		verifyAffordableAmountAndLoanTermForAPI("TC053");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");		
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC053() throws Throwable {
		reportTestCaseName = "Aff_53";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 053" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC053");
		addApplicants("TC053", "joint");
		getDecision();
		addLoanRequirements("TC053");
		additionalBorrowing("TC053");
		personalDetailsSingle("TC053");
		addressDetails("TC053");
		currentIncome("TC053");
		appBreakDownIncome("TC053", "one","joint");
		personalDetailsJoint("TC053");
		addressDetailsJoint("TC053");
		currentIncomeJoint("TC053");
		appBreakDownIncomejoint("TC053","one");
		committedExpenditure("TC053","joint");
		houseHoldExp("TC053");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC053");
		verifyMinimumAffordableLoanTerm("TC053");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC053() throws Throwable 
	{
		reportTestCaseName = "Aff_53";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 053" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC053");
		enterDOBAndRetirementAge("TC053", "2");
		clickYesApplicant1("TC053");
		setemployment_statusApplicant1("TC053");
		setAnnualIncomeofApplicant1("TC053");	
		setDayRate_1("TC053");
		clickYesApplicant2("TC053");
		setemployment_statusApplicant2("TC053");
		setLastFullTradingYearsNetProfit_2("TC053");
		setPreviousFullTradingYearsNetProfit_2("TC053");
//		enterExpenditures("TC053");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC053");
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC053");
		setStudentPaymentonCompletion("TC053");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC053");
		clickSimpleOption_oth();
		setTotalExpenditure("TC053");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC053");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
