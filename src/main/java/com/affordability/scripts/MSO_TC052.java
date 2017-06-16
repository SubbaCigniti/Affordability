package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC052 extends MSOBusinessFunctions{
	
	@Test
	public void MSOTC052() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 052" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC052");
	    addApplicants("TC052", "joint");
	    getDecision();
	    addLoanRequirements("TC052");
	    additionalBorrowing("TC052");
	    personalDetailsSingle("TC052");
	    addressDetails("TC052");
	    currentIncome("TC052");
	    appBreakDownIncome("TC052", "one","joint");
	    personalDetailsJoint("TC052");
	    addressDetailsJoint("TC052");
	    currentIncomeJoint("TC052");
	    appBreakDownIncomejoint("TC052","two");
	    committedExpenditure("TC052","joint");
	    houseHoldExp("TC052");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC052");
	    verifyMinimumAffordableLoanTerm("TC052");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
		
	}

}
