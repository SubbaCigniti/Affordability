package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;


public class MSO_TC051 extends MSOBusinessFunctions
{
	
	@Test
	public void MSOTC051() throws Throwable {
				child = extent.startTest("MSO", "Verification");
				iterationReport(1, "MSO Test Case 051" + " Started");	
				launchApplication(MSODMTestData.INTERMEDIARYURL);
			    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
			    createNewCase("TC051");
			    addApplicants("TC051","single");
			    getDecision();
			    addLoanRequirements("TC051");
			    additionalBorrowing("TC051");
			    personalDetailsSingle("TC051");
			    addressDetails("TC051");
			    currentIncome("TC051");
			    appBreakDownIncome("TC051","one","single");
			    committedExpenditure("TC051","single");
			    houseHoldExp("TC051");
			    futureChanges("");
			    getDip();
			    decison();
			    verifyMaxAffordableAmount("TC051");
			    verifyMinimumAffordableLoanTerm("TC051");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	

}
