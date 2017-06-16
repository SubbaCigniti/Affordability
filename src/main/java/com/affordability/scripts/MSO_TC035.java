package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC035 extends MSOBusinessFunctions{
	@Test
	public void MSOTC035() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 035" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC035");
	    addApplicants("TC035", "joint");
	    getDecision();
	    addLoanRequirements("TC035");
	    additionalBorrowing("TC035");
	    personalDetailsSingle("TC035");
	    addressDetails("TC035");
	    currentIncome("TC035");
	    appBreakDownIncome("TC035", "two","joint");
	    personalDetailsJoint("TC035");
	    addressDetailsJoint("TC035");
	    currentIncomeJoint("TC035");
	    appBreakDownIncomejoint("TC035","one");
	    committedExpenditure("TC035","joint");
	    houseHoldExp("TC035");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC035");
	    verifyMinimumAffordableLoanTerm("TC035");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}

}
