package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC042 extends MSOBusinessFunctions{
	@Test
	public void MSOTC042() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 042" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC042");
	    addApplicants("TC042", "joint");
	    getDecision();
	    addLoanRequirements("TC042");
	    additionalBorrowing("TC042");
	    personalDetailsSingle("TC042");
	    addressDetails("TC042");
	    currentIncome("TC042");
	    appBreakDownIncome("TC042", "one","joint");
	    personalDetailsJoint("TC042");
	    addressDetailsJoint("TC042");
	    currentIncomeJoint("TC042");
	    appBreakDownIncomejoint("TC042","one");
	    committedExpenditure("TC042","joint");
	    houseHoldExp("TC042");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC042");
	    verifyMinimumAffordableLoanTerm("TC042");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}

}
