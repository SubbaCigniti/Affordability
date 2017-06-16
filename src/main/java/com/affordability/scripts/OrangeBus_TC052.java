package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC052 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC052() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 052" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC052");
		
		clickYesApplicant1("TC052");
		setemployment_statusApplicant1("TC052");
		setAnnualIncomeofApplicant1("TC052");	
		setDayRate_1("TC052");
		//setLastFullTradingYearsNetProfit_1("TC052");
		//setPreviousFullTradingYearsNetProfit_1("TC052");
		
		setemployment_statusApplicant2("TC052");
		setGrossSalaryApplicant2("TC052");
//		setEmploymentStatusApp22ndJob("TC052");
//		// need to update in test data sheet
//		setEmploymentSalary1App22ndJob("TC052");

		clickDetailedOption_exp();
		setCSAMaintenance("TC052");
		setStudentPaymentonCompletion("TC052");
		setStudentPaymentonCompletion("TC052");
		
		ClickDetailedOption_hh();
		setBuildingsInsurance("TC052");
		setUtilities("TC052");
		
		clickDetailedOption_oth();
		setSchoolFees("TC052");
		setEssentialTravel("TC052");
		setOtherInsuranced("TC052");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC052");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
