package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC004 extends MSOBusinessFunctions{
	@Test
	public void MSOTC004() throws Throwable {
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 004" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC004");
	    addApplicants("TC004", "joint");
	    getDecision();
	    addLoanRequirements("TC004");
	    additionalBorrowing("TC004");
	    personalDetailsSingle("TC004");
	    addressDetails("TC004");
	    currentIncome("TC004");
	    appBreakDownIncome("TC004", "one","joint");
	    personalDetailsJoint("TC004");
	    addressDetailsJoint("TC004");
	    currentIncomeJoint("TC004");
	    appBreakDownIncomejoint("TC004","one");
	    committedExpenditure("TC004","joint");
	    houseHoldExp("TC004");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC004");
	    verifyMinimumAffordableLoanTerm("TC004");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}

}
