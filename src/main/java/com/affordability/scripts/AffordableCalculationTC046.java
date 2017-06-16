package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC046 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC046 () throws Throwable{
		reportTestCaseName = "Aff_46";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 046" );	
		runAPITestCase("StandAlone_TC046");
		verifyAffordableAmountAndLoanTermForAPI("TC046");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");  	
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC046() throws Throwable {
		reportTestCaseName = "Aff_46";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 046" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC046");
	    addApplicants("TC046", "joint");
	    getDecision();
	    addLoanRequirements("TC046");
	    additionalBorrowing("TC046");
	    personalDetailsSingle("TC046");
	    addressDetails("TC046");
	    currentIncome("TC046");
	    appBreakDownIncome("TC046", "one","joint");
	    personalDetailsJoint("TC046");
	    addressDetailsJoint("TC046");
	    currentIncomeJoint("TC046");
	    appBreakDownIncomejoint("TC046","one");
	    committedExpenditure("TC046","joint");
	    houseHoldExp("TC046");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC046");
	    verifyMinimumAffordableLoanTerm("TC046");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC046() throws Throwable 
	{
		reportTestCaseName = "Aff_46";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 046" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC046");	
		enterDOBAndRetirementAge("TC046", "2");
		clickYesApplicant1("TC046");
		setemployment_statusApplicant1("TC046");
		setAnnualIncomeofApplicant1("TC046");		
		clickYesApplicant2("TC046");
		setemployment_statusApplicant2("TC046");
		setLastFullTradingYearsNetProfit_2("TC046");
		setPreviousFullTradingYearsNetProfit_2("TC046");		
//		enterExpenditures("TC046");	
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC046");
		setSecureMonthlyPaymentonCompletion("TC046");
		setStudentPaymentonCompletion("TC046");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC046");
		clickSimpleOption_oth();
		setTotalExpenditure("TC046");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC046");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
