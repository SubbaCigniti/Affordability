package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC024 extends MSOBusinessFunctions{
	@Test
	public void MSOTC024() throws Throwable {
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 024" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC024");
	    addApplicants("TC024","single");			    
	    getDecision();
	    addLoanRequirements("TC024");
	    additionalBorrowing("TC024");
	    personalDetailsSingle("TC024");
	    addressDetails("TC024");
	    currentIncome("TC024");
	    appBreakDownIncome("TC024", "one","single");
	    committedExpenditure("TC024","single");
	    houseHoldExp("TC024");
	    futureChanges("EB");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC024");
	    verifyMinimumAffordableLoanTerm("TC024");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed");
	}
	

}
