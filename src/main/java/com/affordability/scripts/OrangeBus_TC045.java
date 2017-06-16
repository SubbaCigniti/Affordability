package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC045 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC045() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 045" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC045");
		
		clickYesApplicant1("TC045");
		setemployment_statusApplicant1("TC045");
		setAnnualIncomeofApplicant1("TC045");
						
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC045");
		setcomittedExp_CC_Monthlypayment("TC045");

		ClickDetailedOption_hh();
		setproperty_expenditure("TC045");
		setGroundRentOrService("TC045");
		setUtilities("TC045");
		
		clickDetailedOption_oth();
		setSchoolFees("TC045");
		setHouseKeeping("TC045");
		setOtherInsuranced("TC045");

		clickCalculateResults();
		verifyAmountAndLoanTerm("TC045");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
