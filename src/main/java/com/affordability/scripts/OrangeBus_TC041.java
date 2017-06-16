package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC041 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC041() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 041" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC041");
		
		clickYesApplicant1("TC041");
		setemployment_statusApplicant1("TC041");
		setAnnualIncomeofApplicant1("TC041");
		
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC041");
		setCSAMaintenance("TC041");
		
		ClickDetailedOption_hh();
		setGroundRentOrService("TC041");
		setBuildingsInsurance("TC041");
		
		clickDetailedOption_oth();
		setChildCare("TC041");
		setSchoolFees("TC041");
		setMobilePhoneBroadband("TC041");
		setOtherInsuranced("TC041");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC041");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
