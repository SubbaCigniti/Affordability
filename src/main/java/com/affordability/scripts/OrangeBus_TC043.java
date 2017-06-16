package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC043 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC043() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 043" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC043");
		
		clickYesApplicant1("TC043");
		setemployment_statusApplicant1("TC043");
		setAnnualIncomeofApplicant1("TC043");
		
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC043");
		setStudentPaymentonCompletion("TC043");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC043");
		setGroundRentOrService("TC043");
		setUtilities("TC043");
		
		clickDetailedOption_oth();
		setSchoolFees("TC043");
		setHouseKeeping("TC043");
		setOtherInsuranced("TC043");

		clickCalculateResults();
		verifyAmountAndLoanTerm("TC043");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
