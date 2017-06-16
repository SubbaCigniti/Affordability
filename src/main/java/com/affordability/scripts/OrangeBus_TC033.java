package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC033 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC033() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 033" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC033");
		clickYesApplicant1("TC033");
		setemployment_statusApplicant1("TC033");
		setLastFullTradingYearsNetProfit_1("TC033");
		setPreviousFullTradingYearsNetProfit_1("TC033");
		
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC033");
		setCSAMaintenance("TC033");
		
		ClickDetailedOption_hh();
		setGroundRentOrService("TC033");
		setBuildingsInsurance("TC033");
		
		clickDetailedOption_oth();
		setChildCare("TC033");
		setSchoolFees("TC033");
		setMobilePhoneBroadband("TC033");
		setOtherInsuranced("TC033");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC033");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
