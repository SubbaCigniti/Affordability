package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC032 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC032() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 032" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC032");
		clickYesApplicant1("TC032");
		setemployment_statusApplicant1("TC032");
		setLastFullTradingYearsNetProfit_1("TC032");
		setPreviousFullTradingYearsNetProfit_1("TC032");
		
		clickDetailedOption_exp();
		setSecureMonthlyPaymentonCompletion("TC032");
		setcomittedExp_CC_Monthlypayment("TC032");
		
		ClickDetailedOption_hh();
		setcouncil_tax("TC032");
		setGroundRentOrService("TC032");
		setUtilities("TC032");
		
		clickDetailedOption_oth();
		setChildCare("TC032");
		setHouseKeeping("TC032");
		setMobilePhoneBroadband("TC032");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC032");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
