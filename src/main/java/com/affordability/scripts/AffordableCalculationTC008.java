package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC008 extends StandaloneBusinessFunctions {

	@Test(groups="Standalone",priority=1)
	public void standaloneTC008 () throws Throwable{
		reportTestCaseName = "Aff_08";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 008" );	
		runAPITestCase("StandAlone_TC008");
		verifyAffordableAmountAndLoanTermForAPI("TC008");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC008() throws Throwable {
		reportTestCaseName = "Aff_08";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 008" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC008");
		addApplicants("TC008","single");			    
		getDecision();
		addLoanRequirements("TC008");
		additionalBorrowing("TC008");
		personalDetailsSingle("TC008");
		addressDetails("TC008");
		currentIncome("TC008");
		appBreakDownIncome("TC008", "one","single");
		committedExpenditure("TC008","single");
		houseHoldExp("TC008");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC008");
		verifyMinimumAffordableLoanTerm("TC008");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC008() throws Throwable 
	{
		reportTestCaseName = "Aff_08";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 008" + " Started");	
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC008");
		clickNumOfApplicantsInput_1();
		enterDOBAndRetirementAge("TC008", "1");
		clickYesApplicant1("TC008");
		setemployment_statusApplicant1("TC008");
		setGrossSalaryApplicant1("TC008");
		setGuaranteedBonusofApplicant1("TC008");		
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC008");
		setSecureMonthlyPaymentonCompletion("TC008");		
		setCSAMaintenance("TC008");
		enterOtherExpenditures("TC008");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC008");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
}
