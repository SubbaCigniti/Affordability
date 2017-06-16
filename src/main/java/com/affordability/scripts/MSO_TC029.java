package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;


public class MSO_TC029 extends MSOBusinessFunctions
{
	
	@Test
	public void MSOTC029() throws Throwable {
				child = extent.startTest("MSO", "Verification");
				iterationReport(1, "MSO Test Case 029" + " Started");	
				launchApplication(MSODMTestData.INTERMEDIARYURL);
			    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
			    createNewCase("TC029");
			    addApplicants("TC029","single");
			    getDecision();
			    addLoanRequirements("TC029");
			    additionalBorrowing("TC029");
			    personalDetailsSingle("TC029");
			    addressDetails("TC029");
			    currentIncome("TC029");
			    appBreakDownIncome("TC029","one","single");
			    committedExpenditure("TC029","single");	
			    houseHoldExp("TC029");
			    futureChanges("");
			    getDip();
			    decison();
			    verifyMaxAffordableAmount("TC029");
			    verifyMinimumAffordableLoanTerm("TC029");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	

}
