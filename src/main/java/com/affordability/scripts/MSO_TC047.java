package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC047 extends MSOBusinessFunctions{
	@Test
	public void MSOTC047() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 047" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC047");
	    addApplicants("TC047", "joint");
	    getDecision();
	    addLoanRequirements("TC047");
	    additionalBorrowing("TC047");
	    personalDetailsSingle("TC047");
	    addressDetails("TC047");
	    currentIncome("TC047");
	    appBreakDownIncome("TC047", "one","joint");
	    personalDetailsJoint("TC047");
	    addressDetailsJoint("TC047");
	    currentIncomeJoint("TC047");
	    appBreakDownIncomejoint("TC047","one");
	    committedExpenditure("TC047","joint");
	    houseHoldExp("TC047");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC047");
	    verifyMinimumAffordableLoanTerm("TC047");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}

}
