package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC057 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC057() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 057" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC057");
		
		clickYesApplicant1("TC057");
		setemployment_statusApplicant1("TC057");
		setAnnualIncomeofApplicant1("TC057");	
		setDayRate_1("TC057");
		
		clickAddIncomeApplicant2();
		setemployment_statusApplicant2("TC057");
		setGrossSalaryApplicant2("TC057");	
		
		
		clickDetailedOption_exp();
		setSecureMonthlyPaymentonCompletion("TC057");;
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC057");
		setcouncil_tax("TC057");
		setBuildingsInsurance("TC057");

		clickDetailedOption_oth();
		setChildCare("TC057");
		setEssentialTravel("TC057");
		setMobilePhoneBroadband("TC057");
		setOtherOutgoings("TC057");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC057");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
