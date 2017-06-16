package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC020 extends MSOBusinessFunctions{
	@Test
	public void MSOTC020() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 020" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC020");
	    addApplicants("TC020", "joint");
	    getDecision();
	    addLoanRequirements("TC020");
	    additionalBorrowing("TC020");
	    personalDetailsSingle("TC020");
	    addressDetails("TC020");
	    currentIncome("TC020");
	    appBreakDownIncome("TC020", "one","joint");
	    personalDetailsJoint("TC020");
	    addressDetailsJoint("TC020");
	    currentIncomeJoint("TC020");
	    appBreakDownIncomejoint("TC020","one");
	    committedExpenditure("TC020","joint");
	    houseHoldExp("TC020");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC020");
	    verifyMinimumAffordableLoanTerm("TC020");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}

}
