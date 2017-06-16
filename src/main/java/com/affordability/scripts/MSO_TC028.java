package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC028 extends MSOBusinessFunctions{
	@Test
	public void MSOTC028() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 028" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC028");
	    addApplicants("TC028", "joint");
	    getDecision();
	    addLoanRequirements("TC028");
	    additionalBorrowing("TC028");
	    personalDetailsSingle("TC028");
	    addressDetails("TC028");
	    currentIncome("TC028");
	    appBreakDownIncome("TC028", "one","joint");
	    personalDetailsJoint("TC028");
	    addressDetailsJoint("TC028");
	    currentIncomeJoint("TC028");
	    appBreakDownIncomejoint("TC028","one");
	    committedExpenditure("TC028","joint");
	    houseHoldExp("TC028");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC028");
	    verifyMinimumAffordableLoanTerm("TC028");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
		
	}

}
