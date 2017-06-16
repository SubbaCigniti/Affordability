package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;


public class MSO_TC032 extends MSOBusinessFunctions
{
	
	@Test
	public void MSOTC032() throws Throwable {
				child = extent.startTest("MSO", "Verification");
				iterationReport(1, "MSO Test Case 032" + " Started");	
				launchApplication(MSODMTestData.INTERMEDIARYURL);
			    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
			    createNewCase("TC032");
			    addApplicants("TC032","single");
			    getDecision();
			    addLoanRequirements("TC032");
			    additionalBorrowing("TC032");
			    personalDetailsSingle("TC032");
			    addressDetails("TC032");
			    currentIncome("TC032");
			    appBreakDownIncome("TC032","one","single");
			    committedExpenditure("TC032","single");
			    houseHoldExp("TC032");
			    futureChanges("");
			    getDip();
			    decison();
			    verifyMaxAffordableAmount("TC032");
			    verifyMinimumAffordableLoanTerm("TC032");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	

}
