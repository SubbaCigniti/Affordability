package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC049 extends MSOBusinessFunctions {
	
	@Test
	public void MSOTC049() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 049" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC049");
	    addApplicants("TC049", "single");
	    getDecision();
	    addLoanRequirements("TC049");
	    additionalBorrowing("TC049");
	    personalDetailsSingle("TC049");
	    addressDetails("TC049");
	    currentIncome("TC049");
	    appBreakDownIncome("TC049", "one","single");
	    committedExpenditure("TC049","single");
	    houseHoldExp("TC049");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC049");
	    verifyMinimumAffordableLoanTerm("TC049");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
}