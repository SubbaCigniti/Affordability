package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC057 extends MSOBusinessFunctions{
	@Test
	public void MSOTC057() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 057" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC057");
	    addApplicants("TC057", "joint");
	    getDecision();
	    addLoanRequirements("TC057");
	    additionalBorrowing("TC057");
	    personalDetailsSingle("TC057");
	    addressDetails("TC057");
	    currentIncome("TC057");
	    appBreakDownIncome("TC057", "one","joint");
	    personalDetailsJoint("TC057");
	    addressDetailsJoint("TC057");
	    currentIncomeJoint("TC057");
	    appBreakDownIncomejoint("TC057","one");
	    committedExpenditure("TC057","joint");
	    houseHoldExp("TC057");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC057");
	    verifyMinimumAffordableLoanTerm("TC057");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}

}
