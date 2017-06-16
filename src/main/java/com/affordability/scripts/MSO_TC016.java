package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC016 extends MSOBusinessFunctions{
	@Test
	public void MSOTC016() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 016" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC016");
	    addApplicants("TC016", "joint");
	    getDecision();
	    addLoanRequirements("TC016");
	    additionalBorrowing("TC016");
	    personalDetailsSingle("TC016");
	    addressDetails("TC016");
	    currentIncome("TC016");
	    appBreakDownIncome("TC016", "one","joint");
	    personalDetailsJoint("TC016");
	    addressDetailsJoint("TC016");
	    currentIncomeJoint("TC016");
	    appBreakDownIncomejoint("TC016","one");
	    committedExpenditure("TC016","joint");
	    houseHoldExp("TC016");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC016");
	    verifyMinimumAffordableLoanTerm("TC016");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
		
	}

}
