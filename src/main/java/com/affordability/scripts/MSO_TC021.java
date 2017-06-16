package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC021 extends MSOBusinessFunctions {
	@Test
	public void MSOTC021() throws Throwable {
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 021" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC021");
	    addApplicants("TC021","single");			    
	    getDecision();
	    addLoanRequirements("TC021");
	    additionalBorrowing("TC021");
	    personalDetailsSingle("TC021");
	    addressDetails("TC021");
	    currentIncome("TC021");
	    appBreakDownIncome("TC021", "one","single");
	    committedExpenditure("TC021","single");
	    houseHoldExp("TC021");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC021");
	    verifyMinimumAffordableLoanTerm("TC021");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
		
		
	}

}
