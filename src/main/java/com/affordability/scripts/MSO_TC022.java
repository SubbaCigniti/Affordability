package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC022 extends MSOBusinessFunctions{
	@Test
	public void MSOTC022() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 022" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC022");
	    addApplicants("TC022", "joint");
	    getDecision();
	    addLoanRequirements("TC022");
	    additionalBorrowing("TC022");
	    personalDetailsSingle("TC022");
	    addressDetails("TC022");
	    currentIncome("TC022");
	    appBreakDownIncome("TC022", "one","joint");
	    personalDetailsJoint("TC022");
	    addressDetailsJoint("TC022");
	    currentIncomeJoint("TC022");
	    appBreakDownIncomejoint("TC022","one");
	    committedExpenditure("TC022","joint");
	    houseHoldExp("TC022");
	    futureChanges("EB");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC022");
	    verifyMinimumAffordableLoanTerm("TC022");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}

}
