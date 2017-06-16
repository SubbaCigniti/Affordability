package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC014 extends MSOBusinessFunctions{
	@Test
	public void MSOTC014() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 014" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC014");
	    addApplicants("TC014", "joint");
	    getDecision();
	    addLoanRequirements("TC014");
	    additionalBorrowing("TC014");
	    personalDetailsSingle("TC014");
	    addressDetails("TC014");
	    currentIncome("TC014");
	    appBreakDownIncome("TC014", "one","joint");
	    personalDetailsJoint("TC014");
	    addressDetailsJoint("TC014");
	    currentIncomeJoint("TC014");
	    appBreakDownIncomejoint("TC014","one");
	    committedExpenditure("TC014","joint");
	    houseHoldExp("TC014");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC014");
	    verifyMinimumAffordableLoanTerm("TC014");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}

}
