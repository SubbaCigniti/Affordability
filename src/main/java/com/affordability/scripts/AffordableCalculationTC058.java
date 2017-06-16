package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class AffordableCalculationTC058 extends StandaloneBusinessFunctions
{
	@Test (groups="Standalone",priority=1)
	public void standaloneTC058 () throws Throwable{
		reportTestCaseName = "Aff_58";
		reportApplicationName = "Standalone";
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 058" );	
		runAPITestCase("StandAlone_TC058");
		verifyAffordableAmountAndLoanTermForAPI("TC058");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");		
	}
	@Test (groups="MSO",priority=2)
	public void msoTC058() throws Throwable {
		reportTestCaseName = "Aff_58";
		reportApplicationName = "MSO";
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 058" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
		loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
		createNewCase("TC058");
		addApplicants("TC058", "single");
		getDecision();
		addLoanRequirements("TC058");
		additionalBorrowing("TC058");
		personalDetailsSingle("TC058");
		addressDetails("TC058");
		currentIncome("TC058");
		appBreakDownIncome("TC058", "two","single");
		committedExpenditure("TC058","single");
		houseHoldExp("TC058");
		futureChanges("");
		getDip();
		decison();
		verifyMaxAffordableAmount("TC058");
		verifyMinimumAffordableLoanTerm("TC058");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");  	
	}
	@Test (groups="OrangeBus",priority=3)
	public void orangeBusTC058() throws Throwable 
	{
		reportTestCaseName = "Aff_58";
		reportApplicationName = "Orangebus";
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 058" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC058");	
		enterDOBAndRetirementAge("TC058", "1");
		clickYesApplicant1("TC058");
		setemployment_statusApplicant1("TC058");
		setAnnualIncomeofApplicant1("TC058");	
		setDayRate_1("TC058");		
		clickAddIncomeApplicant1();
		setemploymentStatusApp12ndJob("TC058");
		setEmploymentSalary1App12ndJob("TC058");
//		enterExpenditures("TC058");	
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC058");
		ClickSimpleOption_hh();
		setTotalCosts_hh("TC058");
		clickSimpleOption_oth();
		setTotalExpenditure("TC058");
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC058");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed");
	}
}
