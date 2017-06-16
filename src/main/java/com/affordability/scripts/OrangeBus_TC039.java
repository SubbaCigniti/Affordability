package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC039 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC039() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 039" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC039");
		
		clickYesApplicant1("TC039");
		setemployment_statusApplicant1("TC039");
//		setAnnualIncomeofApplicant1("TC039");
		setGrossSalaryApplicant1("TC039");
		
		clickDetailedOption_exp();
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC039");
		
		ClickDetailedOption_hh();
		setcouncil_tax("TC039");
		setBuildingsInsurance("TC039");
		setUtilities("TC039");
		
		clickDetailedOption_oth();
		setEssentialTravel("TC039");
		setOtherOutgoings("TC039");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC039");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
