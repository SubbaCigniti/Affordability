package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;


public class MSO_TC018 extends MSOBusinessFunctions
{
	
	@Test
	public void MSOTC018() throws Throwable {
				child = extent.startTest("MSO", "Verification");
				iterationReport(1, "MSO Test Case 018" + " Started");	
				launchApplication(MSODMTestData.INTERMEDIARYURL);
			    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
			    createNewCase("TC018");
			    addApplicants("TC018","single");
			    getDecision();
			    addLoanRequirements("TC018");
			    additionalBorrowing("TC018");
			    personalDetailsSingle("TC018");
			    addressDetails("TC018");
			    currentIncome("TC018");
			    appBreakDownIncome("TC018","one","single");
			    committedExpenditure("TC018","single");			    
			    houseHoldExp("TC018");
			    futureChanges("");
			    getDip();
			    decison();
			    verifyMaxAffordableAmount("TC018");
			    verifyMinimumAffordableLoanTerm("TC018");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	

}
