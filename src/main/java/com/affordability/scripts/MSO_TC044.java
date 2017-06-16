package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC044 extends MSOBusinessFunctions{
	@Test
	public void MSOTC044() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 044" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC044");
	    addApplicants("TC044", "joint");
	    getDecision();
	    addLoanRequirements("TC044");
	    additionalBorrowing("TC044");
	    personalDetailsSingle("TC044");
	    addressDetails("TC044");
	    currentIncome("TC044");
	    appBreakDownIncome("TC044", "one","joint");
	    personalDetailsJoint("TC044");
	    addressDetailsJoint("TC044");
	    currentIncomeJoint("TC044");
	    appBreakDownIncomejoint("TC044","one");
	    committedExpenditure("TC044","joint");
	    houseHoldExp("TC044");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC044");
	    verifyMinimumAffordableLoanTerm("TC044");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}
	

}
