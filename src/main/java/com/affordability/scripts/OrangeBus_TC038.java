package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC038 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC038() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 038" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC038");
		
		clickYesApplicant1("TC038");
		setemployment_statusApplicant1("TC038");
		setLastFullTradingYearsNetProfit_1("TC038");
		setPreviousFullTradingYearsNetProfit_1("TC038");
		
		clickYesApplicant2("TC038");
		setemployment_statusApplicant2("TC038");
		setGrossSalaryApplicant2("TC038");
				
		clickDetailedOption_exp();
		setSecureMonthlyPaymentonCompletion("TC038");
		setStudentPaymentonCompletion("TC038");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC038");
		setGroundRentOrService("TC038");
		setUtilities("TC038");
		
		clickDetailedOption_oth();
		setSchoolFees("TC038");
		setHouseKeeping("TC038");
		setOtherInsuranced("TC038");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC038");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
