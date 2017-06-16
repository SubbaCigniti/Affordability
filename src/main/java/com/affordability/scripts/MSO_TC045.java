package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC045 extends MSOBusinessFunctions {
	@Test
	public void MSOTC045() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 045" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC045");
	    addApplicants("TC045", "single");
	    getDecision();
	    addLoanRequirements("TC045");
	    additionalBorrowing("TC045");
	    personalDetailsSingle("TC045");
	    addressDetails("TC045");
	    currentIncome("TC045");
	    appBreakDownIncome("TC045", "one","single");
	    committedExpenditure("TC045","single");
	    houseHoldExp("TC045");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC045");
	    verifyMinimumAffordableLoanTerm("TC045");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 

	}

}
