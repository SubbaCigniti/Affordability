package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC050 extends MSOBusinessFunctions{
	@Test
	public void MSOTC050() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 050" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC050");
	    addApplicants("TC050", "joint");
	    getDecision();
	    addLoanRequirements("TC050");
	    additionalBorrowing("TC050");
	    personalDetailsSingle("TC050");
	    addressDetails("TC050");
	    currentIncome("TC050");
	    appBreakDownIncome("TC050", "one","joint");
	    personalDetailsJoint("TC050");
	    addressDetailsJoint("TC050");
	    currentIncomeJoint("TC050");
	    appBreakDownIncomejoint("TC050","two");
	    committedExpenditure("TC050","joint");
	    houseHoldExp("TC050");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC050");
	    verifyMinimumAffordableLoanTerm("TC050");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}

}
