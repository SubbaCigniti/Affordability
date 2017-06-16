package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;


public class MSO_TC033 extends MSOBusinessFunctions
{
	
	@Test
	public void MSOTC033() throws Throwable {
				child = extent.startTest("MSO", "Verification");
				iterationReport(1, "MSO Test Case 033" + " Started");	
				launchApplication(MSODMTestData.INTERMEDIARYURL);
			    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
			    createNewCase("TC033");
			    addApplicants("TC033","single");
			    getDecision();
			    addLoanRequirements("TC033");
			    additionalBorrowing("TC033");
			    personalDetailsSingle("TC033");
			    addressDetails("TC033");
			    currentIncome("TC033");
			    appBreakDownIncome("TC033","one","single");
			    committedExpenditure("TC033","single");
			    houseHoldExp("TC033");
			    futureChanges("");
			    getDip();
			    decison();
			    verifyMaxAffordableAmount("TC033");
			    verifyMinimumAffordableLoanTerm("TC033");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	

}
