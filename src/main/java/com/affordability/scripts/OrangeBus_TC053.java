package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC053 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC053() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 053" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC053");
		
		clickYesApplicant1("TC053");
		setemployment_statusApplicant1("TC053");
		setAnnualIncomeofApplicant1("TC053");	
		setDayRate_1("TC053");
		//setLastFullTradingYearsNetProfit_1("TC053");
		//setPreviousFullTradingYearsNetProfit_1("TC053");

		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC053");
		setStudentPaymentonCompletion("TC053");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC053");
		setGroundRentOrService("TC053");
		setUtilities("TC053");
		
		clickDetailedOption_oth();
		setSchoolFees("TC053");
		setHouseKeeping("TC053");
		setOtherInsuranced("TC053");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC053");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
