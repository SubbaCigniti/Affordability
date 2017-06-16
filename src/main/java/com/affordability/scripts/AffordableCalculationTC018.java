package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC018  extends StandaloneBusinessFunctions{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC018 () throws Throwable{
		reportTestCaseName = "Aff_18";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 018" );	
		runAPITestCase("StandAlone_TC018");
		verifyAffordableAmountAndLoanTermForAPI("TC018");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}	
	@Test(groups="MSO",priority=2)
	public void msoTC018() throws Throwable {
		reportTestCaseName = "Aff_18";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 018" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC018");
		addApplicants("TC018","single");
		getDecision();
		addLoanRequirements("TC018");
		additionalBorrowing("TC018");
		personalDetailsSingle("TC018");
		addressDetails("TC018");
		currentIncome("TC018");
		appBreakDownIncome("TC018","one","single");
		committedExpenditure("TC018","single");			    
		houseHoldExp("TC018");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC018");
		verifyMinimumAffordableLoanTerm("TC018");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 		
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC018() throws Throwable 
	{
		reportTestCaseName = "Aff_18";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 018" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);		
		setPropertyAndLoanValues("TC018");
		enterDOBAndRetirementAge("TC018", "1");
		clickYesApplicant1("TC018");
		setemployment_statusApplicant1("TC018");
		setGrossSalaryApplicant1("TC018");				
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC018");
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC018");		
		enterOtherExpenditures("TC018");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC018");
		parent.appendChild(child);		
		iterationReport(1, "Test Case Completed");
	}
}
