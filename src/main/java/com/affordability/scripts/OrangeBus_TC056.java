package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC056 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC056() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 056" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC056");
		
		clickYesApplicant1("TC056");
		setemployment_statusApplicant1("TC056");
		setAnnualIncomeofApplicant1("TC056");	
		setDayRate_1("TC056");
		
		setemployment_statusApplicant2("TC056");
		setGrossSalaryApplicant2("TC056");	
		
		clickAddIncomeApplicant2();
		setEmploymentStatusApp22ndJob("TC056");
		setLastFullTradingYearsNetProfitofApplicant2Job2("TC056");
		setPreviousFullTradingYearsNetProfitofApplicant2Job2("TC056");
		
		clickDetailedOption_exp();
		setSecureMonthlyPaymentonCompletion("TC056");;
		setStudentPaymentonCompletion("TC056");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC056");
		setGroundRentOrService("TC056");
		setUtilities("TC056");
		
		clickDetailedOption_oth();
		setSchoolFees("TC056");
		setHouseKeeping("TC056");
		setOtherInsuranced("TC056");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC056");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
