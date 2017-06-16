package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC048 extends MSOBusinessFunctions{
	@Test
	public void MSOTC048() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 048" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC048");
	    addApplicants("TC048", "joint");
	    getDecision();
	    addLoanRequirements("TC048");
	    additionalBorrowing("TC048");
	    personalDetailsSingle("TC048");
	    addressDetails("TC048");
	    currentIncome("TC048");
	    appBreakDownIncome("TC048", "one","joint");
	    personalDetailsJoint("TC048");
	    addressDetailsJoint("TC048");
	    currentIncomeJoint("TC048");
	    appBreakDownIncomejoint("TC048","one");
	    committedExpenditure("TC048","joint");
	    houseHoldExp("TC048");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC048");
	    verifyMinimumAffordableLoanTerm("TC048");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}

}
