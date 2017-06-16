package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC056 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC056 () throws Throwable{
		reportTestCaseName = "Aff_56";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 056" );	
		runAPITestCase("StandAlone_TC056");
		verifyAffordableAmountAndLoanTermForAPI("TC056");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");		
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC056() throws Throwable {
		reportTestCaseName = "Aff_56";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 056" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC056");
		addApplicants("TC056", "joint");
		getDecision();
		addLoanRequirements("TC056");
		additionalBorrowing("TC056");
		personalDetailsSingle("TC056");
		addressDetails("TC056");
		currentIncome("TC056");
		appBreakDownIncome("TC056", "one","joint");
		personalDetailsJoint("TC056");
		addressDetailsJoint("TC056");
		currentIncomeJoint("TC056");
		appBreakDownIncomejoint("TC056","two");
		committedExpenditure("TC056","joint");
		houseHoldExp("TC056");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC056");
		verifyMinimumAffordableLoanTerm("TC056");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC056() throws Throwable 
	{
		reportTestCaseName = "Aff_56";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 056" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC056");	
		enterDOBAndRetirementAge("TC056", "2");
		clickYesApplicant1("TC056");
		setemployment_statusApplicant1("TC056");
		setAnnualIncomeofApplicant1("TC056");	
		setDayRate_1("TC056");		
		setemployment_statusApplicant2("TC056");
		setGrossSalaryApplicant2("TC056");			
		clickAddIncomeApplicant2();
		setEmploymentStatusApp22ndJob("TC056");
		setLastFullTradingYearsNetProfitofApplicant2Job2("TC056");
		setPreviousFullTradingYearsNetProfitofApplicant2Job2("TC056");
		enterExpenditures("TC056");		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC056");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
