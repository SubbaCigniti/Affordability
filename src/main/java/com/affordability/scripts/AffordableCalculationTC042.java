package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC042 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC042 () throws Throwable{
		reportTestCaseName = "Aff_42";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 042" );	
		runAPITestCase("StandAlone_TC042");
		verifyAffordableAmountAndLoanTermForAPI("TC042");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");  	
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC042() throws Throwable {
		reportTestCaseName = "Aff_42";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 042" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC042");
	    addApplicants("TC042", "joint");
	    getDecision();
	    addLoanRequirements("TC042");
	    additionalBorrowing("TC042");
	    personalDetailsSingle("TC042");
	    addressDetails("TC042");
	    currentIncome("TC042");
	    appBreakDownIncome("TC042", "one","joint");
	    personalDetailsJoint("TC042");
	    addressDetailsJoint("TC042");
	    currentIncomeJoint("TC042");
	    appBreakDownIncomejoint("TC042","one");
	    committedExpenditure("TC042","joint");
	    houseHoldExp("TC042");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC042");
	    verifyMinimumAffordableLoanTerm("TC042");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC042() throws Throwable 
	{
		reportTestCaseName = "Aff_42";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 042" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC042");		
		enterDOBAndRetirementAge("TC042", "2");
		clickYesApplicant1("TC042");
		setemployment_statusApplicant1("TC042");
		setAnnualIncomeofApplicant1("TC042");		
		clickYesApplicant2("TC042");
		setemployment_statusApplicant2("TC042");
		setGrossSalaryApplicant2("TC042");		
//		enterExpenditures("TC042");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC042");
		setCSAMaintenance("TC042");
		setStudentPaymentonCompletion("TC042");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC042");
		clickSimpleOption_oth();
		setTotalExpenditure("TC042");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC042");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
	
}
