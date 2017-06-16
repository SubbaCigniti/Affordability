package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC023 extends MSOBusinessFunctions{
	@Test
	public void MSOTC023() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 023" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC023");
	    addApplicants("TC023", "joint");
	    getDecision();
	    addLoanRequirements("TC023");
	    additionalBorrowing("TC023");
	    personalDetailsSingle("TC023");
	    addressDetails("TC023");
	    currentIncome("TC023");
	    appBreakDownIncome("TC023", "one","joint");
	    personalDetailsJoint("TC023");
	    addressDetailsJoint("TC023");
	    currentIncomeJoint("TC023");
	    appBreakDownIncomejoint("TC023","one");
	    committedExpenditure("TC023","joint");
	    houseHoldExp("TC023");
	    futureChanges("EB");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC023");
	    verifyMinimumAffordableLoanTerm("TC023");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}

}
