package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC055 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC055 () throws Throwable{
		reportTestCaseName = "Aff_55";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 055" );	
		runAPITestCase("StandAlone_TC055");
		verifyAffordableAmountAndLoanTermForAPI("TC055");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");		
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC055() throws Throwable {
		reportTestCaseName = "Aff_55";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 055" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC055");
		addApplicants("TC055", "joint");
		getDecision();
		addLoanRequirements("TC055");
		additionalBorrowing("TC055");
		personalDetailsSingle("TC055");
		addressDetails("TC055");
		currentIncome("TC055");
		appBreakDownIncome("TC055", "one","joint");
		personalDetailsJoint("TC055");
		addressDetailsJoint("TC055");
		currentIncomeJoint("TC055");
		appBreakDownIncomejoint("TC055","one");
		committedExpenditure("TC055","joint");
		houseHoldExp("TC055");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC055");
		verifyMinimumAffordableLoanTerm("TC055");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC055() throws Throwable 
	{
		reportTestCaseName = "Aff_55";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 055" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC055");	
		enterDOBAndRetirementAge("TC055", "2");
		clickYesApplicant1("TC055");
		setemployment_statusApplicant1("TC055");
		setAnnualIncomeofApplicant1("TC055");	
		setDayRate_1("TC055");		
		clickYesApplicant2("TC055");
		setemployment_statusApplicant2("TC055");
		setAnnualIncomeofApplicant2("TC055");	
		setDayRate_2("TC055");
//		enterExpenditures("TC055");
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC055");
		setcomittedExp_CC_Monthlypayment("TC055");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC055");
		clickSimpleOption_oth();
		setTotalExpenditure("TC055");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC055");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
