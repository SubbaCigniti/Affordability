package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;


public class MSO_TC039 extends MSOBusinessFunctions
{
	
	@Test
	public void MSOTC039() throws Throwable {
				child = extent.startTest("MSO", "Verification");
				iterationReport(1, "MSO Test Case 039" + " Started");	
				launchApplication(MSODMTestData.INTERMEDIARYURL);
			    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
			    createNewCase("TC039");
			    addApplicants("TC039","single");
			    getDecision();
			    addLoanRequirements("TC039");
			    additionalBorrowing("TC039");
			    personalDetailsSingle("TC039");
			    addressDetails("TC039");
			    currentIncome("TC039");
			    appBreakDownIncome("TC039","one","single");
			    committedExpenditure("TC039","single");
			    houseHoldExp("TC039");
			    futureChanges("");
			    getDip();
			    decison();
			    verifyMaxAffordableAmount("TC039");
			    verifyMinimumAffordableLoanTerm("TC039");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	

}
