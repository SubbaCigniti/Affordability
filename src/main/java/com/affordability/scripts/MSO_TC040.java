package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC040 extends MSOBusinessFunctions {
@Test
public void  MSOTC040() throws Throwable{
	child = extent.startTest("MSO", "Verification");
	iterationReport(1, "MSO Test Case 040" + " Started");	
	launchApplication(MSODMTestData.INTERMEDIARYURL);
    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
    createNewCase("TC040");
    addApplicants("TC040", "joint");
    getDecision();
    addLoanRequirements("TC040");
    additionalBorrowing("TC040");
    personalDetailsSingle("TC040");
    addressDetails("TC040");
    currentIncome("TC040");
    appBreakDownIncome("TC040", "one","joint");
    personalDetailsJoint("TC040");
    addressDetailsJoint("TC040");
    currentIncomeJoint("TC040");
    appBreakDownIncomejoint("TC040","one");
    committedExpenditure("TC040","joint");
    houseHoldExp("TC040");
    futureChanges("");
    getDip();
    decison();
    verifyMaxAffordableAmount("TC040");
    verifyMinimumAffordableLoanTerm("TC040");
	parent.appendChild(child);
	iterationReport(1,"Test Case Completed");
}
}
