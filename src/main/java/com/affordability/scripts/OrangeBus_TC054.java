package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC054 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC054() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 054" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC054");
		
		clickYesApplicant1("TC054");
		setemployment_statusApplicant1("TC054");
		setAnnualIncomeofApplicant1("TC054");	
		setDayRate_1("TC054");
		
		clickYesApplicant2("TC054");
		setemployment_statusApplicant2("TC054");
		setAnnualIncomeofApplicant2("TC054");	
		setDayRate_2("TC054");
		
		clickAddIncomeApplicant2();
		setEmploymentStatusApp22ndJob("TC054");
		setLastFullTradingYearsNetProfitofApplicant2Job2("TC054");
		setPreviousFullTradingYearsNetProfitofApplicant2Job2("TC054");
		
		clickDetailedOption_exp();
		setSecureMonthlyPaymentonCompletion("TC054");
		setCSAMaintenance("TC054");
		
		ClickDetailedOption_hh();
		setcouncil_tax("TC054");
		setBuildingsInsurance("TC054");
		
		clickDetailedOption_oth();
		setChildCare("TC054");
		setEssentialTravel("TC054");
		setMobilePhoneBroadband("TC054");
		
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC054");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
