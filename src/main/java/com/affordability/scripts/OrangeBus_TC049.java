package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC049 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC049() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 049" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC049");
		
		clickYesApplicant1("TC049");
		setemployment_statusApplicant1("TC049");
		setAnnualIncomeofApplicant1("TC049");
		setDayRate_1("TC049");

		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC049");
		
		ClickDetailedOption_hh();
		setcouncil_tax("TC049");
		setBuildingsInsurance("TC049");
		setUtilities("TC049");
		
		clickDetailedOption_oth();
		setEssentialTravel("TC049");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC049");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
