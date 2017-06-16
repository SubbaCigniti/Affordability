package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;


public class MSO_TC011 extends MSOBusinessFunctions
{
	@Test
	public void MSOTC011() throws Throwable {
				child = extent.startTest("MSO", "Verification");
				iterationReport(1, "MSO Test Case 011" + " Started");	
				launchApplication(MSODMTestData.INTERMEDIARYURL);
			    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
			    createNewCase("TC011");
			    addApplicants("TC011","single");
			    getDecision();
			    addLoanRequirements("TC011");
			    additionalBorrowing("TC011");
			    personalDetailsSingle("TC011");
			    addressDetails("TC011");
			    currentIncome("TC011");
			    appBreakDownIncome("TC011","one","single");
			    committedExpenditure("TC011","single");
			    houseHoldExp("TC011");
			    futureChanges("");
			    getDip();
			    decison();
			    verifyMaxAffordableAmount("TC011");
			    verifyMinimumAffordableLoanTerm("TC011");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	

}
