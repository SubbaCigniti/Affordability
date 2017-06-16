package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;


public class MSO_TC010 extends MSOBusinessFunctions
{	
	@Test
	public void MSOTC010() throws Throwable {
				child = extent.startTest("MSO", "Verification");
				iterationReport(1, "MSO Test Case 010" + " Started");	
				launchApplication(MSODMTestData.INTERMEDIARYURL);
			    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
			    createNewCase("TC010");
			    addApplicants("TC010","single");			    
			    getDecision();
			    addLoanRequirements("TC010");
			    additionalBorrowing("TC010");
			    personalDetailsSingle("TC010");
			    addressDetails("TC010");
			    currentIncome("TC010");
			    appBreakDownIncome("TC010","one","single");
			    committedExpenditure("TC010","single");
			    houseHoldExp("TC010");
			    futureChanges("");
			    getDip();
			    decison();
			    verifyMaxAffordableAmount("TC010");
			    verifyMinimumAffordableLoanTerm("TC010");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	

}
