package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC013 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC013() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 013" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		
		setPropertyAndLoanValues("TC013");
		
		clickYesApplicant1("TC013");
		setemployment_statusApplicant1("TC013");
		setGrossSalaryApplicant1("TC013");		
		
		clickYesApplicant2("TC013");
		setemployment_statusApplicant2("TC013");
		setGrossSalaryApplicant2("TC013");
		
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC013");
		setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC013");
		setSecureMonthlyPaymentonCompletion("TC013");
		setCSAMaintenance("TC013");
		setStudentPaymentonCompletion("TC013");
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC013");
		setcouncil_tax("TC013");
		setGroundRentOrService("TC013");
		setBuildingsInsurance("TC013");
		setUtilities("TC013");
		
		clickDetailedOption_oth();
		setChildCare("TC013");
		setSchoolFees("TC013");
		setEssentialTravel("TC013");
		setHouseKeeping("TC013");
		setMobilePhoneBroadband("TC013");
		setOtherInsuranced("TC013");
		setOtherOutgoings("TC013");
		

		clickCalculateResults();
		verifyAmountAndLoanTerm("TC013");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
