package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC048 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC048() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 048" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC048");
		
		clickYesApplicant1("TC048");
		setemployment_statusApplicant1("TC048");
		setLastFullTradingYearsNetProfit_1("TC048");
		setPreviousFullTradingYearsNetProfit_1("TC048");
		
		clickYesApplicant2("TC048");
		setemployment_statusApplicant2("TC048");
		setLastFullTradingYearsNetProfit_2("TC048");
		setPreviousFullTradingYearsNetProfit_2("TC048");
						
		clickDetailedOption_exp();
		setCSAMaintenance("TC048");
		setStudentPaymentonCompletion("TC048");
		
		ClickDetailedOption_hh();
		setBuildingsInsurance("TC048");
		setUtilities("TC048");
		
		clickDetailedOption_oth();
		setSchoolFees("TC048");
		setEssentialTravel("TC048");
		setOtherInsuranced("TC048");
		setOtherOutgoings("TC048");

		clickCalculateResults();
		verifyAmountAndLoanTerm("TC048");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
