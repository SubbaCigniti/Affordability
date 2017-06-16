package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC044 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC044() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 044" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC044");
		
		clickYesApplicant1("TC044");
		setemployment_statusApplicant1("TC044");
		setAnnualIncomeofApplicant1("TC044");
		
		clickYesApplicant2("TC044");
		setemployment_statusApplicant2("TC044");
		setLastFullTradingYearsNetProfit_2("TC044");
		setPreviousFullTradingYearsNetProfit_2("TC044");
						
		clickDetailedOption_exp();
		setSecureMonthlyPaymentonCompletion("TC044");
		setCSAMaintenance("TC044");
		
		ClickDetailedOption_hh();
		setcouncil_tax("TC044");
		setBuildingsInsurance("TC044");
		
		clickDetailedOption_oth();
		setChildCare("TC044");
		setEssentialTravel("TC044");
		setMobilePhoneBroadband("TC044");
		setOtherOutgoings("TC044");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC044");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
