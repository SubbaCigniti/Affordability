package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;


public class MSO_TC003 extends MSOBusinessFunctions
{	
	@Test
	public void MSOTC003() throws Throwable {
				child = extent.startTest("MSO", "Verification");
				iterationReport(1, "MSO Test Case 003" + " Started");	
				launchApplication(MSODMTestData.INTERMEDIARYURL);
			    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
			    createNewCase("TC003");
			    addApplicants("TC003","single");
			    getDecision();
			    addLoanRequirements("TC003");
			    additionalBorrowing("TC003");
			    personalDetailsSingle("TC003");
			    addressDetails("TC003");
			    currentIncome("TC003");
			    appBreakDownIncome("TC003","one","single");
			    committedExpenditure("TC003","single");
			    houseHoldExp("TC003");
			    futureChanges("");
			    getDip();
			    decison();
			    verifyMaxAffordableAmount("TC003");
			    verifyMinimumAffordableLoanTerm("TC003");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	

}
