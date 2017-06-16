package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC014 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC014() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 014" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC014");
		
		clickYesApplicant1("TC014");
		setemployment_statusApplicant1("TC014");
		setGrossSalaryApplicant1("TC014");	
		
		setemployment_statusApplicant2("TC014");
		setGrossSalaryApplicant2("TC014");
		
		ClickDetailedOption_hh();
	    setproperty_expenditure("TC014");
	       
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC014");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
