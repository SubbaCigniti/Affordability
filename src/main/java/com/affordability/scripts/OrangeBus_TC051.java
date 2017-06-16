package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC051 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC051() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 051" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC051");
		
		clickYesApplicant1("TC051");
		setemployment_statusApplicant1("TC051");
		setAnnualIncomeofApplicant1("TC051");
		setDayRate_1("TC051");

		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC051");
		setCSAMaintenance("TC051");
		
		ClickDetailedOption_hh();
		setGroundRentOrService("TC051");
		setBuildingsInsurance("TC051");
		
		clickDetailedOption_oth();
		setChildCare("TC051");
		setSchoolFees("TC051");
		setMobilePhoneBroadband("TC051");
		setOtherInsuranced("TC051");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC051");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
