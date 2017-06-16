package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC043 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC043 () throws Throwable{
		reportTestCaseName = "Aff_43";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 043" );	
		runAPITestCase("StandAlone_TC043");
		verifyAffordableAmountAndLoanTermForAPI("TC043");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");   	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC043() throws Throwable {
		reportTestCaseName = "Aff_43";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 043" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC043");
		addApplicants("TC043","single");
		getDecision();
		addLoanRequirements("TC043");
		additionalBorrowing("TC043");
		personalDetailsSingle("TC043");
		addressDetails("TC043");
		currentIncome("TC043");
		appBreakDownIncome("TC043","one","single");
		committedExpenditure("TC043","single");
		houseHoldExp("TC043");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC043");
		verifyMinimumAffordableLoanTerm("TC043");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC043() throws Throwable 
	{
		reportTestCaseName = "Aff_43";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 043" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC043");	
		enterDOBAndRetirementAge("TC043", "1");
		clickYesApplicant1("TC043");
		setemployment_statusApplicant1("TC043");
		setAnnualIncomeofApplicant1("TC043");
		enterExpenditures("TC043");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC043");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}

}
