package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC059 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC059 () throws Throwable{
		reportTestCaseName = "Aff_59";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 059" );	
		runAPITestCase("StandAlone_TC059");
		verifyAffordableAmountAndLoanTermForAPI("TC059");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");	
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC059() throws Throwable {
		reportTestCaseName = "Aff_59";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 059" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC059");
		addApplicants("TC059", "joint");
		getDecision();
		addLoanRequirements("TC059");
		additionalBorrowing("TC059");
		personalDetailsSingle("TC059");
		addressDetails("TC059");
		currentIncome("TC059");
		appBreakDownIncome("TC059","two","joint");
		personalDetailsJoint("TC059");
		addressDetailsJoint("TC059");
		currentIncomeJoint("TC059");
		appBreakDownIncomejoint("TC059","one");
		committedExpenditure("TC059","joint");
		houseHoldExp("TC059");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC059");
		verifyMinimumAffordableLoanTerm("TC059");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");  	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC059() throws Throwable 
	{
		reportTestCaseName = "Aff_59";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 059" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC059");	
		enterDOBAndRetirementAge("TC059", "2");
		clickYesApplicant1("TC059");
		setemployment_statusApplicant1("TC059");
		setAnnualIncomeofApplicant1("TC059");	
		setDayRate_1("TC059");		
		clickYesApplicant2("TC059");
		setemployment_statusApplicant2("TC059");
		setLastFullTradingYearsNetProfit_2("TC059");
		setPreviousFullTradingYearsNetProfit_2("TC059");
		clickAddIncomeApplicant1();
		setemploymentStatusApp12ndJob("TC059");
		setLastFullTradingYearsNetProfitofApplicant1Job2("TC059");
		setPreviousFullTradingYearsNetProfitofApplicant1Job2("TC059");
//		enterExpenditures("TC059");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC059");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC059");
		clickSimpleOption_oth();
		setTotalExpenditure("TC059");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC059");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
