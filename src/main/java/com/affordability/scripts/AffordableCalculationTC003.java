package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC003 extends StandaloneBusinessFunctions{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC003 () throws Throwable{
		reportTestCaseName = "Aff_03";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 003" );	
		runAPITestCase("StandAlone_TC003");
		verifyAffordableAmountAndLoanTermForAPI("TC003");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC003() throws Throwable {
				reportTestCaseName = "Aff_03";
				reportApplicationName = "MSO";
				child = extent.startTest("MSO", "Verification");
				iterationReport(1, "MSO Test Case 003" + " Started");	
				launchApplication(MSODMTestData.INTERMEDIARYURL);
			    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
			    createNewCase("TC003");
			    addApplicants("TC003","single");
			    getDecision();
			    addLoanRequirements("TC003");
			    additionalBorrowing("TC003");
			    personalDetailsSingle("TC003");
			    addressDetails("TC003");
			    currentIncome("TC003");
			    appBreakDownIncome("TC003","one","single");
			    committedExpenditure("TC003","single");
			    houseHoldExp("TC003");
			    futureChanges("");
			    getDip();
			    decison();
			    verifyMaxAffordableAmount("TC003");
			    verifyMinimumAffordableLoanTerm("TC003");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC003() throws Throwable 
	{
		reportTestCaseName = "Aff_03";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 003" + " Started");	
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC003");
		enterDOBAndRetirementAge("TC003", "1");
		clickYesApplicant1("TC003");
		setemployment_statusApplicant1("TC003");
		setGrossSalaryApplicant1("TC003");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC003");
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC003");		
		enterOtherExpenditures("TC003");
	    clickCalculateResults();
	    verifyAmountAndLoanTerm("TC003");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 

	}

}
