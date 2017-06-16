package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC059 extends MSOBusinessFunctions{
@Test
public void MSOTC059() throws Throwable{
	child = extent.startTest("MSO", "Verification");
	iterationReport(1, "MSO Test Case 059" + " Started");	
	launchApplication(MSODMTestData.INTERMEDIARYURL);
    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
    createNewCase("TC059");
    addApplicants("TC059", "joint");
    getDecision();
    addLoanRequirements("TC059");
    additionalBorrowing("TC059");
    personalDetailsSingle("TC059");
    addressDetails("TC059");
    currentIncome("TC059");
    appBreakDownIncome("TC059","two","joint");
    personalDetailsJoint("TC059");
    addressDetailsJoint("TC059");
    currentIncomeJoint("TC059");
    appBreakDownIncomejoint("TC059","one");
    committedExpenditure("TC059","joint");
    houseHoldExp("TC059");
    futureChanges("");
    getDip();
    decison();
    verifyMaxAffordableAmount("TC059");
    verifyMinimumAffordableLoanTerm("TC059");
	parent.appendChild(child);
	iterationReport(1,"Test Case Completed"); 
}
}
