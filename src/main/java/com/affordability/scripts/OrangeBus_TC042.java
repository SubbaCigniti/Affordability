package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC042 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC042() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 042" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC042");
		
		clickYesApplicant1("TC042");
		setemployment_statusApplicant1("TC042");
		setAnnualIncomeofApplicant1("TC042");
		
		clickYesApplicant2("TC042");
		setemployment_statusApplicant2("TC042");
		setGrossSalaryApplicant2("TC042");
						
		clickDetailedOption_exp();
		setCSAMaintenance("TC042");
		setStudentPaymentonCompletion("TC042");
		
		ClickDetailedOption_hh();
		setBuildingsInsurance("TC042");
		setUtilities("TC042");
		
		clickDetailedOption_oth();
		setSchoolFees("TC042");
		setEssentialTravel("TC042");
		setOtherInsuranced("TC042");
		setOtherOutgoings("TC042");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC042");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
