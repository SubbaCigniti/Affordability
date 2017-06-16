package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC036 extends MSOBusinessFunctions{
	@Test
	public void MSOTC036() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 036" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC036");
	    addApplicants("TC036", "joint");
	    getDecision();
	    addLoanRequirements("TC036");
	    additionalBorrowing("TC036");
	    personalDetailsSingle("TC036");
	    addressDetails("TC036");
	    currentIncome("TC036");
	    appBreakDownIncome("TC036", "two","joint");
	    personalDetailsJoint("TC036");
	    addressDetailsJoint("TC036");
	    currentIncomeJoint("TC036");
	    appBreakDownIncomejoint("TC036","two");
	    committedExpenditure("TC036","joint");
	    houseHoldExp("TC036");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC036");
	    verifyMinimumAffordableLoanTerm("TC036");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}

}
