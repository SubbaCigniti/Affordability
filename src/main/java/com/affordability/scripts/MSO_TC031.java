package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC031 extends MSOBusinessFunctions{
	@Test
	public void MSOTC031() throws Throwable {
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 031" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC031");
	    addApplicants("TC031","single");			    
	    getDecision();
	    addLoanRequirements("TC031");
	    additionalBorrowing("TC031");
	    personalDetailsSingle("TC031");
	    addressDetails("TC031");
	    currentIncome("TC031");
	    appBreakDownIncome("TC031", "one","single");
	    committedExpenditure("TC031","single");
	    houseHoldExp("TC031");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC031");
	    verifyMinimumAffordableLoanTerm("TC031");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
		
	}
}
