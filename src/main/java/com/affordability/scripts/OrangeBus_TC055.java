package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC055 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC055() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 055" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC055");
		
		clickYesApplicant1("TC055");
		setemployment_statusApplicant1("TC055");
		setAnnualIncomeofApplicant1("TC055");	
		setDayRate_1("TC055");
		
		clickYesApplicant2("TC055");
		setemployment_statusApplicant2("TC055");
		setAnnualIncomeofApplicant2("TC055");	
		setDayRate_2("TC055");
		
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC055");
		setcomittedExp_CC_Monthlypayment("TC055");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC055");
		setGroundRentOrService("TC055");
		setUtilities("TC055");
		
		clickDetailedOption_oth();
		setSchoolFees("TC055");
		setHouseKeeping("TC055");
		setOtherInsuranced("TC055");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC055");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
