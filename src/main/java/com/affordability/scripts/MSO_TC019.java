package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC019 extends MSOBusinessFunctions {
	@Test
	public void MSOTC019() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 019" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC019");
	    addApplicants("TC019", "joint");
	    getDecision();
	    addLoanRequirements("TC019");
	    additionalBorrowing("TC019");
	    personalDetailsSingle("TC019");
	    addressDetails("TC019");
	    currentIncome("TC019");
	    appBreakDownIncome("TC019", "one","joint");
	    personalDetailsJoint("TC019");
	    addressDetailsJoint("TC019");
	    currentIncomeJoint("TC019");
	    appBreakDownIncomejoint("TC019","one");
	    committedExpenditure("TC019","joint");
	    houseHoldExp("TC019");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC019");
	    verifyMinimumAffordableLoanTerm("TC019");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}

}
