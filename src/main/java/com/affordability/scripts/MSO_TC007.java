package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC007 extends MSOBusinessFunctions{
	@Test
	public void MSOTC007() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 007" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC007");
	    addApplicants("TC007", "joint");
	    getDecision();
	    addLoanRequirements("TC007");
	    additionalBorrowing("TC007");
	    personalDetailsSingle("TC007");
	    addressDetails("TC007");
	    currentIncome("TC007");
	    appBreakDownIncome("TC007", "one","joint");
	    personalDetailsJoint("TC007");
	    addressDetailsJoint("TC007");
	    currentIncomeJoint("TC007");
	    appBreakDownIncomejoint("TC007","one");
	    committedExpenditure("TC007","joint");
	    houseHoldExp("TC007");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC007");
	    verifyMinimumAffordableLoanTerm("TC007");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}

}
