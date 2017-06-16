package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC046 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC046() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 046" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC046");
		
		clickYesApplicant1("TC046");
		setemployment_statusApplicant1("TC046");
		setAnnualIncomeofApplicant1("TC046");
		
		clickYesApplicant2("TC046");
		setemployment_statusApplicant2("TC046");
		setLastFullTradingYearsNetProfit_2("TC046");
		setPreviousFullTradingYearsNetProfit_2("TC046");
						
		clickDetailedOption_exp();
		setSecureMonthlyPaymentonCompletion("TC046");
		setStudentPaymentonCompletion("TC046");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC046");
		setGroundRentOrService("TC046");
		setUtilities("TC046");
		
		clickDetailedOption_oth();
		setSchoolFees("TC046");
		setHouseKeeping("TC046");
		setOtherInsuranced("TC046");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC046");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
