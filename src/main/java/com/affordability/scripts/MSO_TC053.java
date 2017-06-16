package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC053 extends MSOBusinessFunctions{
	@Test
	public void MSOTC053() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 053" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC053");
	    addApplicants("TC053", "joint");
	    getDecision();
	    addLoanRequirements("TC053");
	    additionalBorrowing("TC053");
	    personalDetailsSingle("TC053");
	    addressDetails("TC053");
	    currentIncome("TC053");
	    appBreakDownIncome("TC053", "one","joint");
	    personalDetailsJoint("TC053");
	    addressDetailsJoint("TC053");
	    currentIncomeJoint("TC053");
	    appBreakDownIncomejoint("TC053","one");
	    committedExpenditure("TC053","joint");
	    houseHoldExp("TC053");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC053");
	    verifyMinimumAffordableLoanTerm("TC053");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}

}
