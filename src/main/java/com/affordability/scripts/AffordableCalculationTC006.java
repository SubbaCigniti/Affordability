package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC006 extends StandaloneBusinessFunctions{

	@Test(groups="Standalone",priority=1)
	public void standaloneTC006 () throws Throwable{
		reportTestCaseName = "Aff_06";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 006" );	
		runAPITestCase("StandAlone_TC006");
		verifyAffordableAmountAndLoanTermForAPI("TC006");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}

	@Test (groups="MSO",priority=2)
	public void msoTC006() throws Throwable {
		reportTestCaseName = "Aff_06";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 006" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC006");
		addApplicants("TC006", "joint");
		getDecision();
		addLoanRequirements("TC006");
		additionalBorrowing("TC006");
		personalDetailsSingle("TC006");
		addressDetails("TC006");
		currentIncome("TC006");
		appBreakDownIncome("TC006", "one","joint");
		personalDetailsJoint("TC006");
		addressDetailsJoint("TC006");
		currentIncomeJoint("TC006");
		appBreakDownIncomejoint("TC006","one");
		committedExpenditure("TC006","joint");
		houseHoldExp("TC006");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC006");
		verifyMinimumAffordableLoanTerm("TC006");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC006() throws Throwable 
	{
		reportTestCaseName = "Aff_06";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 006" + " Started");	
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC006");
		clickNumOfApplicantsInput_2();
		enterDOBAndRetirementAge("TC006", "2");
		clickYesApplicant1("TC006");
		setemployment_statusApplicant1("TC006");
		setGrossSalaryApplicant1("TC006");
		setemployment_statusApplicant2("TC006");
		setGrossSalaryApplicant2("TC006");
		enterExpenditures("TC006");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC006");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
}
