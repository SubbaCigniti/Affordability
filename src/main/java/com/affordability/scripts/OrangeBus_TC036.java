package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC036 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC036() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 036" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC036");
		
		clickYesApplicant1("TC036");
		setemployment_statusApplicant1("TC036");
		setLastFullTradingYearsNetProfit_1("TC036");
		setPreviousFullTradingYearsNetProfit_1("TC036");
		
		// Need to employment for applicant1
		//Here we clicking add income button of applicant2 before clicking add income of applicant1
		clickAddIncomeApplicant2();
		clickAddIncomeApplicant1();
		setemploymentStatusApp12ndJob("TC036");
		setEmploymentSalary1App12ndJob("TC036");
		
		clickYesApplicant2("TC036");
		setemployment_statusApplicant2("TC036");
		setGrossSalaryApplicant2("TC036");	
		
		// Need to employment for applicant2
		//clickAddIncomeApplicant2();
		setEmploymentStatusApp22ndJob("TC036");
		setEmploymentSalary1App22ndJob("TC036");
		
		clickDetailedOption_exp();
		setSecureMonthlyPaymentonCompletion("TC036");
		setCSAMaintenance("TC036");
		
		ClickDetailedOption_hh();
		setcouncil_tax("TC036");
		setBuildingsInsurance("TC036");
		
		clickDetailedOption_oth();
		setChildCare("TC036");
		setEssentialTravel("TC036");
		setMobilePhoneBroadband("TC036");;
		setOtherOutgoings("TC036");		
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC036");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
