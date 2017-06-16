package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC054 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC054 () throws Throwable{
		reportTestCaseName = "Aff_54";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 054" );	
		runAPITestCase("StandAlone_TC054");
		verifyAffordableAmountAndLoanTermForAPI("TC054");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");		
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC054() throws Throwable {
		reportTestCaseName = "Aff_54";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 054" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC054");
		addApplicants("TC054", "joint");
		getDecision();
		addLoanRequirements("TC054");
		additionalBorrowing("TC054");
		personalDetailsSingle("TC054");
		addressDetails("TC054");
		currentIncome("TC054");
		appBreakDownIncome("TC054", "one","joint");
		personalDetailsJoint("TC054");
		addressDetailsJoint("TC054");
		currentIncomeJoint("TC054");
		appBreakDownIncomejoint("TC054","two");
		committedExpenditure("TC054","joint");
		houseHoldExp("TC054");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC054");
		verifyMinimumAffordableLoanTerm("TC054");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC054() throws Throwable 
	{
		reportTestCaseName = "Aff_54";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 054" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC054");	
		enterDOBAndRetirementAge("TC054", "2");
		clickYesApplicant1("TC054");
		setemployment_statusApplicant1("TC054");
		setAnnualIncomeofApplicant1("TC054");	
		setDayRate_1("TC054");		
		clickYesApplicant2("TC054");
		setemployment_statusApplicant2("TC054");
		setAnnualIncomeofApplicant2("TC054");	
		setDayRate_2("TC054");		
		clickAddIncomeApplicant2();
		setEmploymentStatusApp22ndJob("TC054");
		setLastFullTradingYearsNetProfitofApplicant2Job2("TC054");
		setPreviousFullTradingYearsNetProfitofApplicant2Job2("TC054");
//		enterExpenditures("TC054");	
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC054");
		setSecureMonthlyPaymentonCompletion("TC054");
		setCSAMaintenance("TC054");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC054");
		clickSimpleOption_oth();
		setTotalExpenditure("TC054");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC054");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
