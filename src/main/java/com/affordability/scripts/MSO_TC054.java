package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC054 extends MSOBusinessFunctions{
	@Test
	public void MSOTC054() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 054" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC054");
	    addApplicants("TC054", "joint");
	    getDecision();
	    addLoanRequirements("TC054");
	    additionalBorrowing("TC054");
	    personalDetailsSingle("TC054");
	    addressDetails("TC054");
	    currentIncome("TC054");
	    appBreakDownIncome("TC054", "one","joint");
	    personalDetailsJoint("TC054");
	    addressDetailsJoint("TC054");
	    currentIncomeJoint("TC054");
	    appBreakDownIncomejoint("TC054","two");
	    committedExpenditure("TC054","joint");
	    houseHoldExp("TC054");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC054");
	    verifyMinimumAffordableLoanTerm("TC054");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}

}
