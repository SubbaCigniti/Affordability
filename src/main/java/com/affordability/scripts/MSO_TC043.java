package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;


public class MSO_TC043 extends MSOBusinessFunctions
{
	
	@Test
	public void MSOTC043() throws Throwable {
				child = extent.startTest("MSO", "Verification");
				iterationReport(1, "MSO Test Case 043" + " Started");	
				launchApplication(MSODMTestData.INTERMEDIARYURL);
			    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
			    createNewCase("TC043");
			    addApplicants("TC043","single");
			    getDecision();
			    addLoanRequirements("TC043");
			    additionalBorrowing("TC043");
			    personalDetailsSingle("TC043");
			    addressDetails("TC043");
			    currentIncome("TC043");
			    appBreakDownIncome("TC043","one","single");
			    committedExpenditure("TC043","single");
			    houseHoldExp("TC043");
			    futureChanges("");
			    getDip();
			    decison();
			    verifyMaxAffordableAmount("TC043");
			    verifyMinimumAffordableLoanTerm("TC043");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	

}
