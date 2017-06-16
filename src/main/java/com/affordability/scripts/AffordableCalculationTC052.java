package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC052 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC052 () throws Throwable{
		reportTestCaseName = "Aff_52";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 052" );	
		runAPITestCase("StandAlone_TC052");
		verifyAffordableAmountAndLoanTermForAPI("TC052");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");		
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC052() throws Throwable {
		reportTestCaseName = "Aff_52";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 052" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC052");
	    addApplicants("TC052", "joint");
	    getDecision();
	    addLoanRequirements("TC052");
	    additionalBorrowing("TC052");
	    personalDetailsSingle("TC052");
	    addressDetails("TC052");
	    currentIncome("TC052");
	    appBreakDownIncome("TC052", "one","joint");
	    personalDetailsJoint("TC052");
	    addressDetailsJoint("TC052");
	    currentIncomeJoint("TC052");
	    appBreakDownIncomejoint("TC052","two");
	    committedExpenditure("TC052","joint");
	    houseHoldExp("TC052");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC052");
	    verifyMinimumAffordableLoanTerm("TC052");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC052() throws Throwable 
	{
		reportTestCaseName = "Aff_52";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 052" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC052");		
		enterDOBAndRetirementAge("TC052", "2");
		clickYesApplicant1("TC052");
		setemployment_statusApplicant1("TC052");
		setAnnualIncomeofApplicant1("TC052");	
		setDayRate_1("TC052");		
		setemployment_statusApplicant2("TC052");
		setGrossSalaryApplicant2("TC052");		
		enterExpenditures("TC052");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC052");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
