package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC038 extends MSOBusinessFunctions{
	@Test
	public void MSOTC038() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 038" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC038");
	    addApplicants("TC038", "joint");
	    getDecision();
	    addLoanRequirements("TC038");
	    additionalBorrowing("TC038");
	    personalDetailsSingle("TC038");
	    addressDetails("TC038");
	    currentIncome("TC038");
	    appBreakDownIncome("TC038", "one","joint");
	    personalDetailsJoint("TC038");
	    addressDetailsJoint("TC038");
	    currentIncomeJoint("TC038");
	    appBreakDownIncomejoint("TC038","one");
	    committedExpenditure("TC038","joint");
	    houseHoldExp("TC038");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC038");
	    verifyMinimumAffordableLoanTerm("TC038");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}

}
