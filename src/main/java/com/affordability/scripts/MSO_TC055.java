package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC055 extends MSOBusinessFunctions{
	@Test
	public void MSOTC055() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 055" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC055");
	    addApplicants("TC055", "joint");
	    getDecision();
	    addLoanRequirements("TC055");
	    additionalBorrowing("TC055");
	    personalDetailsSingle("TC055");
	    addressDetails("TC055");
	    currentIncome("TC055");
	    appBreakDownIncome("TC055", "one","joint");
	    personalDetailsJoint("TC055");
	    addressDetailsJoint("TC055");
	    currentIncomeJoint("TC055");
	    appBreakDownIncomejoint("TC055","one");
	    committedExpenditure("TC055","joint");
	    houseHoldExp("TC055");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC055");
	    verifyMinimumAffordableLoanTerm("TC055");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}

}
