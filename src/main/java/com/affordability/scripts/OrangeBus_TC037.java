package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC037 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC037() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 037" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC037");
		
		clickYesApplicant1("TC037");
		setemployment_statusApplicant1("TC037");
		setLastFullTradingYearsNetProfit_1("TC037");
		setPreviousFullTradingYearsNetProfit_1("TC037");
				
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC037");
		setcomittedExp_CC_Monthlypayment("TC037");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC037");
		setGroundRentOrService("TC037");
		setUtilities("TC037");
		
		clickDetailedOption_oth();
		setSchoolFees("TC037");
		setHouseKeeping("TC037");
		setOtherInsuranced("TC037");	
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC037");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
