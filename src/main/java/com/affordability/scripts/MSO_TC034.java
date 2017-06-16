package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC034 extends MSOBusinessFunctions{
	@Test
	public void MSOTC034() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 034" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC034");
	    addApplicants("TC034", "joint");
	    getDecision();
	    addLoanRequirements("TC034");
	    additionalBorrowing("TC034");
	    personalDetailsSingle("TC034");
	    addressDetails("TC034");
	    currentIncome("TC034");
	    appBreakDownIncome("TC034", "one","joint");
	    personalDetailsJoint("TC034");
	    addressDetailsJoint("TC034");
	    currentIncomeJoint("TC034");
	    appBreakDownIncomejoint("TC034","one");
	    committedExpenditure("TC034","joint");
	    houseHoldExp("TC034");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC034");
	    verifyMinimumAffordableLoanTerm("TC034");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
}
