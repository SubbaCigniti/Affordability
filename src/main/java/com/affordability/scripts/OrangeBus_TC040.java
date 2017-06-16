package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC040 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC040() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 040" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC040");
		
		clickYesApplicant1("TC040");
		setemployment_statusApplicant1("TC040");
		setAnnualIncomeofApplicant1("TC040");
		
		clickYesApplicant2("TC040");
		setemployment_statusApplicant2("TC040");
		setAnnualIncomeofApplicant2("TC040");
			
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC040");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
