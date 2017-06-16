package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC008 extends MSOBusinessFunctions {
	@Test
	public void MSOTC008() throws Throwable {
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 008" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC008");
	    addApplicants("TC008","single");			    
	    getDecision();
	    addLoanRequirements("TC008");
	    additionalBorrowing("TC008");
	    personalDetailsSingle("TC008");
	    addressDetails("TC008");
	    currentIncome("TC008");
	    appBreakDownIncome("TC008", "one","single");
	    committedExpenditure("TC008","single");
	    houseHoldExp("TC008");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC008");
	    verifyMinimumAffordableLoanTerm("TC008");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");	
		
	}

}
