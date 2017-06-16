package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC012 extends MSOBusinessFunctions{
	@Test
	public void MSOTC012() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 012" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC012");
	    addApplicants("TC012", "joint");
	    getDecision();
	    addLoanRequirements("TC012");
	    additionalBorrowing("TC012");
	    personalDetailsSingle("TC012");
	    addressDetails("TC012");
	    currentIncome("TC012");
	    appBreakDownIncome("TC012", "one","joint");
	    personalDetailsJoint("TC012");
	    addressDetailsJoint("TC012");
	    currentIncomeJoint("TC012");
	    appBreakDownIncomejoint("TC012","one");
	    committedExpenditure("TC012","joint");
	    houseHoldExp("TC012");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC012");
	    verifyMinimumAffordableLoanTerm("TC012");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}

}
