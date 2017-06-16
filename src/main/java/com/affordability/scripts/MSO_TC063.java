package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC063 extends MSOBusinessFunctions{
	@Test
	public void MSOTC063() throws Throwable {
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 063" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC063");
	    addApplicants("TC063","single");			    
	    getDecision();
	    addLoanRequirements("TC063");
	    additionalBorrowing("TC063");
	    personalDetailsSingle("TC063");
	    addressDetails("TC063");
	    currentIncome("TC063");
	    appBreakDownIncome("TC063", "one","single");
	    committedExpenditure("TC063","single");
	    houseHoldExp("TC063");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC063");
	    verifyMinimumAffordableLoanTerm("TC063");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	
}
