package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;


public class MSO_TC005 extends MSOBusinessFunctions
{	
	@Test
	public void MSOTC005() throws Throwable {
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 005" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC005");
	    addApplicants("TC005", "single");
	    getDecision();
	    addLoanRequirements("TC005");
	    additionalBorrowing("TC005");
	    personalDetailsSingle("TC005");
	    addressDetails("TC005");
	    currentIncome("TC005");
	    appBreakDownIncome("TC005", "one","single");
	    committedExpenditure("TC005","single");
	    houseHoldExp("TC005");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC005");
	    verifyMinimumAffordableLoanTerm("TC005");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
		
	}
	

}
