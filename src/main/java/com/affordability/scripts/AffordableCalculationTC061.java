package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC061 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC061 () throws Throwable{
		reportTestCaseName = "Aff_61";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 061" );	
		runAPITestCase("StandAlone_TC061");
		verifyAffordableAmountAndLoanTermForAPI("TC061");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	@Test (groups="MSO",priority=2)
	public void msoTC061() throws Throwable {
		reportTestCaseName = "Aff_61";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 061" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC061");
		addApplicants("TC061","single");			    
		getDecision();
		addLoanRequirements("TC061");
		additionalBorrowing("TC061");
		personalDetailsSingle("TC061");
		addressDetails("TC061");
		currentIncome("TC061");
		appBreakDownIncome("TC061", "two","single");
		committedExpenditure("TC061", "single");
		houseHoldExp("TC061"); 
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC061");
		verifyMinimumAffordableLoanTerm("TC061");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed"); 
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC061() throws Throwable 
	{
		reportTestCaseName = "Aff_61";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 061" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC061");	
		enterDOBAndRetirementAge("TC061", "1");
		clickYesApplicant1("TC061");
		setemployment_statusApplicant1("TC061");
		setAnnualIncomeofApplicant1("TC061");	
		setDayRate_1("TC061");	
		clickAddIncomeApplicant1();
		setemploymentStatusApp12ndJob("TC061");
		setEmploymentSalary1App12ndJob("TC061");				
//		enterExpenditures("TC061");
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC061");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC061");
		clickSimpleOption_oth();
		setTotalExpenditure("TC061");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC061");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
