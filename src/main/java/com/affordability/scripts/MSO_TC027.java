package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC027 extends MSOBusinessFunctions{
	@Test
	public void MSOTC027() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 027" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC027");
	    addApplicants("TC027", "joint");
	    getDecision();
	    addLoanRequirements("TC027");
	    additionalBorrowing("TC027");
	    personalDetailsSingle("TC027");
	    addressDetails("TC027");
	    currentIncome("TC027");
	    appBreakDownIncome("TC027", "one","joint");
	    personalDetailsJoint("TC027");
	    addressDetailsJoint("TC027");
	    currentIncomeJoint("TC027");
	    appBreakDownIncomejoint("TC027","one");
	    committedExpenditure("TC027","joint");
	    houseHoldExp("TC027");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC027");
	    verifyMinimumAffordableLoanTerm("TC027");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}

}
