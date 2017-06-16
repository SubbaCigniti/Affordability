package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.pageobject.MSOPO;
import com.testdata.MSODMTestData;

public class MSO_TC061 extends MSOBusinessFunctions
{
	@Test
	public void MSOTC061() throws Throwable {
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 061" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC061");
	    addApplicants("TC061","single");			    
	    getDecision();
	    addLoanRequirements("TC061");
	    additionalBorrowing("TC061");
	    personalDetailsSingle("TC061");
	    addressDetails("TC061");
	    currentIncome("TC061");
	    appBreakDownIncome("TC061", "two","single");
	    committedExpenditure("TC061", "single");
	    houseHoldExp("TC061"); 
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC061");
	    verifyMinimumAffordableLoanTerm("TC061");
		parent.appendChild(child);
		iterationReport(1, "Test Case Completed"); 
	    
		
	}
	

}
