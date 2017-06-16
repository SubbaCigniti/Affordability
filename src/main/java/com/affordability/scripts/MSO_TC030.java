package com.affordability.scripts;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

import org.testng.annotations.Test;

public class MSO_TC030 extends MSOBusinessFunctions{
	@Test
	public void MSOTC030() throws Throwable {
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 030" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC030");
	    addApplicants("TC030","single");			    
	    getDecision();
	    addLoanRequirements("TC030");
	    additionalBorrowing("TC030");
	    personalDetailsSingle("TC030");
	    addressDetails("TC030");
	    currentIncome("TC030");
	    appBreakDownIncome("TC030", "one","single");
	    committedExpenditure("TC030","single");
	    houseHoldExp("TC030");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC030");
	    verifyMinimumAffordableLoanTerm("TC030");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
		
		
	}
}
