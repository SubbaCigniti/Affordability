package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC058  extends MSOBusinessFunctions{
	@Test
	public void MSOTC058() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 058" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC058");
	    addApplicants("TC058", "single");
	    getDecision();
	    addLoanRequirements("TC058");
	    additionalBorrowing("TC058");
	    personalDetailsSingle("TC058");
	    addressDetails("TC058");
	    currentIncome("TC058");
	    appBreakDownIncome("TC058", "two","single");
	    committedExpenditure("TC058","single");
	    houseHoldExp("TC058");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC058");
	    verifyMinimumAffordableLoanTerm("TC058");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
	}

}
