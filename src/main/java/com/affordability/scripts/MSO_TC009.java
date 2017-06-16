package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC009 extends MSOBusinessFunctions  {
	@Test
	public void MSOTC009() throws Throwable {
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 009" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC009");
	    addApplicants("TC009","single");			    
	    getDecision();
	    addLoanRequirements("TC009");
	    additionalBorrowing("TC009");
	    personalDetailsSingle("TC009");
	    addressDetails("TC009");
	    currentIncome("TC009");
	    appBreakDownIncome("TC009", "one","single");
	    committedExpenditure("TC009","single");
	    houseHoldExp("TC009");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC009");
	    verifyMinimumAffordableLoanTerm("TC009");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
		
		

	}
}
