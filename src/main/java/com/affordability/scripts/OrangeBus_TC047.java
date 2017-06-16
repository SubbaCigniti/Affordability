package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC047 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC047() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 047" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC047");
		
		clickYesApplicant1("TC047");
		setemployment_statusApplicant1("TC047");
		setLastFullTradingYearsNetProfit_1("TC047");
		setPreviousFullTradingYearsNetProfit_1("TC047");
		
		clickYesApplicant2("TC047");
		setemployment_statusApplicant2("TC047");
		setLastFullTradingYearsNetProfit_2("TC047");
		setPreviousFullTradingYearsNetProfit_2("TC047");
						
		clickDetailedOption_exp();
		setSecureMonthlyPaymentonCompletion("TC047");
		setcomittedExp_CC_Monthlypayment("TC047");
		
		ClickDetailedOption_hh();
		setcouncil_tax("TC047");
		setGroundRentOrService("TC047");
		setUtilities("TC047");
		
		clickDetailedOption_oth();
		setChildCare("TC047");
		setHouseKeeping("TC047");
		setMobilePhoneBroadband("TC047");

		clickCalculateResults();
		verifyAmountAndLoanTerm("TC047");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
