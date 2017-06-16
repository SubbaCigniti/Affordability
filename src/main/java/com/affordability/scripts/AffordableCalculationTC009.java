package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC009 extends StandaloneBusinessFunctions{

	@Test(groups="Standalone",priority=1)
	public void standaloneTC009 () throws Throwable{
		reportTestCaseName = "Aff_09";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 009" );	
		runAPITestCase("StandAlone_TC009");
		verifyAffordableAmountAndLoanTermForAPI("TC009");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC009() throws Throwable {
		reportTestCaseName = "Aff_09";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 009" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC009");
		addApplicants("TC009","single");			    
		getDecision();
		addLoanRequirements("TC009");
		additionalBorrowing("TC009");
		personalDetailsSingle("TC009");
		addressDetails("TC009");
		currentIncome("TC009");
		appBreakDownIncome("TC009", "one","single");
		committedExpenditure("TC009","single");
		houseHoldExp("TC009");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC009");
		verifyMinimumAffordableLoanTerm("TC009");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	//@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC009() throws Throwable 
	{
		reportTestCaseName = "Aff_09";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 009" + " Started");	
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC009");
		enterDOBAndRetirementAge("TC009", "1");
		clickYesApplicant1("TC009");
		setemployment_statusApplicant1("TC009");
		setGrossSalaryApplicant1("TC009");
		setRegularBonusofApplicant1("TC009");
		setAllowancesofApplicant1("TC009");
		enterExpenditures("TC003");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC009");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
}
