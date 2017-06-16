package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC017 extends MSOBusinessFunctions{
	@Test
	public void MSOTC017() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 017" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC017");
	    addApplicants("TC017", "joint");
	    getDecision();
	    addLoanRequirements("TC017");
	    additionalBorrowing("TC017");
	    personalDetailsSingle("TC017");
	    addressDetails("TC017");
	    currentIncome("TC017");
	    appBreakDownIncome("TC017", "one","joint");
	    personalDetailsJoint("TC017");
	    addressDetailsJoint("TC017");
	    currentIncomeJoint("TC017");
	    appBreakDownIncomejoint("TC017","one");
	    committedExpenditure("TC017","joint");
	    houseHoldExp("TC017");
	    futureChanges("EB");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC017");
	    verifyMinimumAffordableLoanTerm("TC017");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}

}
