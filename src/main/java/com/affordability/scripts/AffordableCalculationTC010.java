package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC010 extends StandaloneBusinessFunctions{

	@Test(groups="Standalone",priority=1)
	public void standaloneTC010 () throws Throwable{
		reportTestCaseName = "Aff_10";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 010" );	
		runAPITestCase("StandAlone_TC010");
		verifyAffordableAmountAndLoanTermForAPI("TC010");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC010() throws Throwable {
		reportTestCaseName = "Aff_10";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 010" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC010");
		addApplicants("TC010","single");			    
		getDecision();
		addLoanRequirements("TC010");
		additionalBorrowing("TC010");
		personalDetailsSingle("TC010");
		addressDetails("TC010");
		currentIncome("TC010");
		appBreakDownIncome("TC010","one","single");
		committedExpenditure("TC010","single");
		houseHoldExp("TC010");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC010");
		verifyMinimumAffordableLoanTerm("TC010");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC010() throws Throwable 
	{
		reportTestCaseName = "Aff_10";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 010" + " Started");	
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC010");
		enterDOBAndRetirementAge("TC010", "1");
		clickYesApplicant1("TC010");
		setemployment_statusApplicant1("TC010");
		setPensionAnnuity_1("TC010");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC010");
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC010");		
		enterOtherExpenditures("TC010");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC010");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
}
