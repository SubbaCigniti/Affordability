package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.MSOBusinessFunctions;
import com.testdata.MSODMTestData;

public class MSO_TC060 extends MSOBusinessFunctions{
	@Test
	
	public void MSOTC060() throws Throwable{
		child = extent.startTest("MSO", "Verification");
		iterationReport(1, "MSO Test Case 060" + " Started");	
		launchApplication(MSODMTestData.INTERMEDIARYURL);
	    loginMSO(MSODMTestData.LOGINNAME, MSODMTestData.PASSWORD);
	    createNewCase("TC060");
	    addApplicants("TC060", "joint");
	    getDecision();
	    addLoanRequirements("TC060");
	    additionalBorrowing("TC060");
	    personalDetailsSingle("TC060");
	    addressDetails("TC060");
	    currentIncome("TC060");
	    appBreakDownIncome("TC060", "one","joint");
	    personalDetailsJoint("TC060");
	    addressDetailsJoint("TC060");
	    currentIncomeJoint("TC060");
	    appBreakDownIncomejoint("TC060","two");
	    committedExpenditure("TC060","joint");
	    houseHoldExp("TC060");
	    futureChanges("");
	    getDip();
	    decison();
	    verifyMaxAffordableAmount("TC060");
	    verifyMinimumAffordableLoanTerm("TC060");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 
		
	}

}
