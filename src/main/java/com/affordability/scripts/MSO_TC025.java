package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;


public class MSO_TC025 extends MSOBusinessFunctions
{
	
	@Test
	public void MSOTC025() throws Throwable {
				child = extent.startTest("MSO", "Verification");
				iterationReport(1, "MSO Test Case 025" + " Started");	
				launchApplication(MSODMTestData.INTERMEDIARYURL);
			    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
			    createNewCase("TC025");
			    addApplicants("TC025","single");
			    getDecision();
			    addLoanRequirements("TC025");
			    additionalBorrowing("TC025");
			    personalDetailsSingle("TC025");
			    addressDetails("TC025");
			    currentIncome("TC025");
			    appBreakDownIncome("TC025","one","single");
			    committedExpenditure("TC025","single");		
			    houseHoldExp("TC025");
			    futureChanges("");
			    getDip();
			    decison();
			    verifyMaxAffordableAmount("TC025");
			    verifyMinimumAffordableLoanTerm("TC025");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	

}
