package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC056 extends MSOBusinessFunctions{
	@Test
	public void MSOTC056() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 056" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC056");
	    addApplicants("TC056", "joint");
	    getDecision();
	    addLoanRequirements("TC056");
	    additionalBorrowing("TC056");
	    personalDetailsSingle("TC056");
	    addressDetails("TC056");
	    currentIncome("TC056");
	    appBreakDownIncome("TC056", "one","joint");
	    personalDetailsJoint("TC056");
	    addressDetailsJoint("TC056");
	    currentIncomeJoint("TC056");
	    appBreakDownIncomejoint("TC056","two");
	    committedExpenditure("TC056","joint");
	    houseHoldExp("TC056");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC056");
	    verifyMinimumAffordableLoanTerm("TC056");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}

}
