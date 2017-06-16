package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC015 extends MSOBusinessFunctions {
	@Test
	public void MSOTC15() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 015" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC015");
	    addApplicants("TC015", "joint");
	    getDecision();
	    addLoanRequirements("TC015");
	    additionalBorrowing("TC015");
	    personalDetailsSingle("TC015");
	    addressDetails("TC015");
	    currentIncome("TC015");
	    appBreakDownIncome("TC015", "one","joint");
	    personalDetailsJoint("TC015");
	    addressDetailsJoint("TC015");
	    currentIncomeJoint("TC015");
	    appBreakDownIncomejoint("TC015","one");
	    committedExpenditure("TC015","joint");
	    houseHoldExp("TC015");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC015");
	    verifyMinimumAffordableLoanTerm("TC015");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
		
	}

}
