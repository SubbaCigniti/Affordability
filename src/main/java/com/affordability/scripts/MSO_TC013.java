package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC013 extends MSOBusinessFunctions{

@Test
public void MSOTC013() throws Throwable {
	child = extent.startTest("MSO", "Verification");
	iterationReport(1, "MSO Test Case 013" + " Started");	
	launchApplication(MSODMTestData.INTERMEDIARYURL);
    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
    createNewCase("TC013");
    addApplicants("TC013", "joint");
    getDecision();
    addLoanRequirements("TC013");
    additionalBorrowing("TC013");
    personalDetailsSingle("TC013");
    addressDetails("TC013");
    currentIncome("TC013");
    appBreakDownIncome("TC013", "one","joint");
    personalDetailsJoint("TC013");
    addressDetailsJoint("TC013");
    currentIncomeJoint("TC013");
    appBreakDownIncomejoint("TC013","one");
    committedExpenditure("TC013","joint");
    houseHoldExp("TC013");
    futureChanges("");
    getDip();
    decison();
    verifyMaxAffordableAmount("TC013");
    verifyMinimumAffordableLoanTerm("TC013");
	parent.appendChild(child);
	iterationReport(1,"Test Case Completed"); 
}
}
