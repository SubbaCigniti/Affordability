package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC027 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC027 () throws Throwable
	{
		reportTestCaseName = "Aff_27";
		reportApplicationName = "Standalone";	
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 027" );	
		runAPITestCase("StandAlone_TC027");
		verifyAffordableAmountAndLoanTermForAPI("TC027");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="MSO",priority=2)
	public void msoTC027() throws Throwable 
	{
		reportTestCaseName = "Aff_27";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 027" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC027");
		addApplicants("TC027", "joint");
		getDecision();
		addLoanRequirements("TC027");
		additionalBorrowing("TC027");
		personalDetailsSingle("TC027");
		addressDetails("TC027");
		currentIncome("TC027");
		appBreakDownIncome("TC027", "one","joint");
		personalDetailsJoint("TC027");
		addressDetailsJoint("TC027");
		currentIncomeJoint("TC027");
		appBreakDownIncomejoint("TC027","one");
		committedExpenditure("TC027","joint");
		houseHoldExp("TC027");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC027");
		verifyMinimumAffordableLoanTerm("TC027");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC027() throws Throwable 
	{
		reportTestCaseName = "Aff_27";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 027" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC027");
		enterDOBAndRetirementAge("TC027", "2");
		clickYesApplicant1("TC027");
		setemployment_statusApplicant1("TC027");
		setGrossSalaryApplicant1("TC027");
		clickYesApplicant2("TC027");
		setemployment_statusApplicant2("TC027");
		setGrossSalaryApplicant2("TC027");
		enterExpenditures("TC027");		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC027");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
