package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC036 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC036 () throws Throwable
	{
		reportTestCaseName = "Aff_36";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 036" );	
		runAPITestCase("StandAlone_TC036");
		verifyAffordableAmountAndLoanTermForAPI("TC036");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC036() throws Throwable 
	{
		reportTestCaseName = "Aff_36";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 036" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC036");
		addApplicants("TC036", "joint");
		getDecision();
		addLoanRequirements("TC036");
		additionalBorrowing("TC036");
		personalDetailsSingle("TC036");
		addressDetails("TC036");
		currentIncome("TC036");
		appBreakDownIncome("TC036", "two","joint");
		personalDetailsJoint("TC036");
		addressDetailsJoint("TC036");
		currentIncomeJoint("TC036");
		appBreakDownIncomejoint("TC036","two");
		committedExpenditure("TC036","joint");
		houseHoldExp("TC036");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC036");
		verifyMinimumAffordableLoanTerm("TC036");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC036() throws Throwable 
	{
		reportTestCaseName = "Aff_36";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 036" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC036");		
		enterDOBAndRetirementAge("TC036", "2");
		clickYesApplicant1("TC036");
		setemployment_statusApplicant1("TC036");
		setLastFullTradingYearsNetProfit_1("TC036");
		setPreviousFullTradingYearsNetProfit_1("TC036");		
		clickYesApplicant2("TC036");
		setemployment_statusApplicant2("TC036");
		setGrossSalaryApplicant2("TC036");
		clickAddIncomeApplicant1();
		setemploymentStatusApp12ndJob("TC036");
		setEmploymentSalary1App12ndJob("TC036");
		clickAddIncomeApplicant2();
		setEmploymentStatusApp22ndJob("TC036");
		setEmploymentSalary1App22ndJob("TC036");
//		enterExpenditures("TC036");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC036");
		setSecureMonthlyPaymentonCompletion("TC036");
		setCSAMaintenance("TC036");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC036");
		clickSimpleOption_oth();
		setTotalExpenditure("TC036");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC036");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
