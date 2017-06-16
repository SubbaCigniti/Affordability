package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC062 extends MSOBusinessFunctions{
	@Test
	public void MSOTC062() throws Throwable {
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 062" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC062");
	    addApplicants("TC062","single");			    
	    getDecision();
	    addLoanRequirements("TC062");
	    additionalBorrowing("TC062");
	    personalDetailsSingle("TC062");
	    addressDetails("TC062");
	    currentIncome("TC062");
	    appBreakDownIncome("TC062", "one","single");
	    committedExpenditure("TC062","single");
	    houseHoldExp("TC062");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC062");
	    verifyMinimumAffordableLoanTerm("TC062");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");     
	}
	

}
