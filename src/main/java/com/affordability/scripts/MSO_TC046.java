package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC046 extends MSOBusinessFunctions{
	@Test
	public void MSOTC046() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 046" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC046");
	    addApplicants("TC046", "joint");
	    getDecision();
	    addLoanRequirements("TC046");
	    additionalBorrowing("TC046");
	    personalDetailsSingle("TC046");
	    addressDetails("TC046");
	    currentIncome("TC046");
	    appBreakDownIncome("TC046", "one","joint");
	    personalDetailsJoint("TC046");
	    addressDetailsJoint("TC046");
	    currentIncomeJoint("TC046");
	    appBreakDownIncomejoint("TC046","one");
	    committedExpenditure("TC046","joint");
	    houseHoldExp("TC046");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC046");
	    verifyMinimumAffordableLoanTerm("TC046");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}

}
