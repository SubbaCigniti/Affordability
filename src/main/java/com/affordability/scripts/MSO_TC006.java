package com.affordability.scripts;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;
import org.testng.annotations.Test;

public class MSO_TC006 extends MSOBusinessFunctions
{	
	@Test
	public void MSOTC006() throws Throwable {

	child = extent.startTest("MSO", "Verification");
	iterationReport(1, "MSO Test Case 006" + " Started");	
	launchApplication(MSODMTestData.INTERMEDIARYURL);
    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
    createNewCase("TC006");
    addApplicants("TC006", "joint");
    getDecision();
    addLoanRequirements("TC006");
    additionalBorrowing("TC006");
    personalDetailsSingle("TC006");
    addressDetails("TC006");
    currentIncome("TC006");
    appBreakDownIncome("TC006", "one","joint");
    personalDetailsJoint("TC006");
    addressDetailsJoint("TC006");
    currentIncomeJoint("TC006");
    appBreakDownIncomejoint("TC006","one");
    committedExpenditure("TC006","joint");
    houseHoldExp("TC006");
    futureChanges("");
    getDip();
    decison();
    verifyMaxAffordableAmount("TC006");
    verifyMinimumAffordableLoanTerm("TC006");
	parent.appendChild(child);
	iterationReport(1,"Test Case Completed"); 

}
}