package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC026 extends MSOBusinessFunctions{
	@Test
	public void MSOTC026() throws Throwable {
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 026" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC026");
	    addApplicants("TC026", "joint");
	    getDecision();
	    addLoanRequirements("TC026");
	    additionalBorrowing("TC026");
	    personalDetailsSingle("TC026");
	    addressDetails("TC026");
	    currentIncome("TC026");
	    appBreakDownIncome("TC026", "one","joint");
	    personalDetailsJoint("TC026");
	    addressDetailsJoint("TC026");
	    currentIncomeJoint("TC026");
	    appBreakDownIncomejoint("TC026","one");
	    committedExpenditure("TC026","joint");
	    houseHoldExp("TC026");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC026");
	    verifyMinimumAffordableLoanTerm("TC026");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}

}
