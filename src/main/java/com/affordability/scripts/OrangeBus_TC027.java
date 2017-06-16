package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC027 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC027() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 027" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC027");
		clickYesApplicant1("TC027");
		setemployment_statusApplicant1("TC027");
		setGrossSalaryApplicant1("TC027");
		clickYesApplicant2("TC027");
		setemployment_statusApplicant2("TC027");
		setGrossSalaryApplicant2("TC027");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC027");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC027");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
