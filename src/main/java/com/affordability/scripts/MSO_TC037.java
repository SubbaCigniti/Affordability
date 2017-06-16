package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;


public class MSO_TC037 extends MSOBusinessFunctions
{
	
	@Test
	public void MSOTC037() throws Throwable {
				child = extent.startTest("MSO", "Verification");
				iterationReport(1, "MSO Test Case 037" + " Started");	
				launchApplication(MSODMTestData.INTERMEDIARYURL);
			    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
			    createNewCase("TC037");
			    addApplicants("TC037","single");
			    getDecision();
			    addLoanRequirements("TC037");
			    additionalBorrowing("TC037");
			    personalDetailsSingle("TC037");
			    addressDetails("TC037");
			    currentIncome("TC037");
			    appBreakDownIncome("TC037","one","single");
			    committedExpenditure("TC037","single");
			    houseHoldExp("TC037");
			    futureChanges("");
			    getDip();
			    decison();
			    verifyMaxAffordableAmount("TC037");
			    verifyMinimumAffordableLoanTerm("TC037");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	

}
