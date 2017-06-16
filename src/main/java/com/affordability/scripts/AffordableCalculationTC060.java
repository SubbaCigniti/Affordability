package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC060 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC060 () throws Throwable{
		reportTestCaseName = "Aff_60";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 060" );	
		runAPITestCase("StandAlone_TC060");
		verifyAffordableAmountAndLoanTermForAPI("TC060");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	//@Test (groups="MSO",priority=2)
	public void msoTC060() throws Throwable {
		reportTestCaseName = "Aff_60";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 060" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC060");
		addApplicants("TC060", "joint");
		getDecision();
		addLoanRequirements("TC060");
		additionalBorrowing("TC060");
		personalDetailsSingle("TC060");
		addressDetails("TC060");
		currentIncome("TC060");
		appBreakDownIncome("TC060", "one","joint");
		personalDetailsJoint("TC060");
		addressDetailsJoint("TC060");
		currentIncomeJoint("TC060");
		appBreakDownIncomejoint("TC060","two");
		committedExpenditure("TC060","joint");
		houseHoldExp("TC060");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC060");
		verifyMinimumAffordableLoanTerm("TC060");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC060() throws Throwable 
	{
		reportTestCaseName = "Aff_60";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 060" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC060");		
		enterDOBAndRetirementAge("TC060", "2");
		clickYesApplicant1("TC060");
		setemployment_statusApplicant1("TC060");
		setAnnualIncomeofApplicant1("TC060");	
		setDayRate_1("TC060");	
		clickYesApplicant2("TC060");
		setemployment_statusApplicant2("TC060");
		setGrossSalaryApplicant2("TC060");
//		setAnnualIncomeofApplicant2("TC060");	
		clickAddIncomeApplicant2();
		setEmploymentStatusApp22ndJob("TC060");
		setEmploymentSalary1App22ndJob("TC060");
//		enterExpenditures("TC060");	
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC060");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC060");
		clickSimpleOption_oth();
		setTotalExpenditure("TC060");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC060");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
