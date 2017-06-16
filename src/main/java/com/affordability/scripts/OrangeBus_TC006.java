package com.affordability.scripts;


import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC006 extends OrangeBusBusinessFunctions
{	
	@Test
	public void OrangeBusTC006() throws Throwable 
	{
				child = extent.startTest("OrangeBus", "Verification");
				iterationReport(1, "OrangeBus Test Case 002" + " Started");	
				launchApplication(OrangeBusTestData.ORANGEBUSURL);
				setPropertyAndLoanValues("TC006");
				clickNumOfApplicantsInput_2();
				clickYesApplicant1("TC006");
				setemployment_statusApplicant1("TC006");
				setGrossSalaryApplicant1("TC006");
				setemployment_statusApplicant2("TC006");
				setGrossSalaryApplicant2("TC006");
				clickDetailedOption_exp();
				setCSAMaintenance("TC006");
				setStudentPaymentonCompletion("TC006");
				 ClickDetailedOption_hh();
				setBuildingsInsurance("TC006");
				setUtilities("TC006");
				clickDetailedOption_oth();
				setEssentialTravel("TC006");
				setOtherInsuranced("TC006");
			    clickCalculateResults();
			    verifyAmountAndLoanTerm("TC006");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	
	
	
}
