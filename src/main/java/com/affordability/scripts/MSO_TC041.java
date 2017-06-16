package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;


public class MSO_TC041 extends MSOBusinessFunctions
{
	
	@Test
	public void MSOTC041() throws Throwable {
				child = extent.startTest("MSO", "Verification");
				iterationReport(1, "MSO Test Case 041" + " Started");	
				launchApplication(MSODMTestData.INTERMEDIARYURL);
			    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
			    createNewCase("TC041");
			    addApplicants("TC041","single");
			    getDecision();
			    addLoanRequirements("TC041");
			    additionalBorrowing("TC041");
			    personalDetailsSingle("TC041");
			    addressDetails("TC041");
			    currentIncome("TC041");
			    appBreakDownIncome("TC041","one","single");
			    committedExpenditure("TC041","single");
			    houseHoldExp("TC041");
			    futureChanges("");
			    getDip();
			    decison();
			    verifyMaxAffordableAmount("TC041");
			    verifyMinimumAffordableLoanTerm("TC041");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	

}
