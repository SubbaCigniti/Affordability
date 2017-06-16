package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;


public class MSO_TC002 extends MSOBusinessFunctions
{
	
	@Test
	public void MSOTC002() throws Throwable {
				child = extent.startTest("MSO", "Verification");
				iterationReport(1, "MSO Test Case 002" + " Started");	
				launchApplication(MSODMTestData.INTERMEDIARYURL);
			    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
			    createNewCase("TC002");
			    addApplicants("TC002","single");
			    getDecision();
			    addLoanRequirements("TC002");
			    additionalBorrowing("TC002");
			    personalDetailsSingle("TC002");
			    addressDetails("TC002");
			    currentIncome("TC002");
			    appBreakDownIncome("TC002","one","single");
			    committedExpenditure("TC002","single");
			    houseHoldExp("TC002");
			    futureChanges("");
			    getDip();
			    decison();
			    verifyMaxAffordableAmount("TC002");
			    verifyMinimumAffordableLoanTerm("TC002");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	

}
