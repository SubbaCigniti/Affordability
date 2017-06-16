package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;

public class StandAloneTest006 extends StandaloneBusinessFunctions
{
	@Test
	public void standaloneTC031 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 031" );	
		runAPITestCase("StandAlone_TC031");
		verifyAffordableAmountAndLoanTermForAPI("TC031");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	
	@Test
	public void standaloneTC032 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 032" );	
		runAPITestCase("StandAlone_TC032");
		verifyAffordableAmountAndLoanTermForAPI("TC032");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC033 () throws Throwable{
			
			child = extent.startTest("StandAlone", "Verification");
			iterationReport(1, "StandAlone Test Case 033" );	
			runAPITestCase("StandAlone_TC033");
			verifyAffordableAmountAndLoanTermForAPI("TC033");
			parent.appendChild(child);
			iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC035 () throws Throwable{
			
			child = extent.startTest("StandAlone", "Verification");
			iterationReport(1, "StandAlone Test Case 035" );	
			runAPITestCase("StandAlone_TC035");
			verifyAffordableAmountAndLoanTermForAPI("TC035");
			parent.appendChild(child);
			iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC036 () throws Throwable{
			
			child = extent.startTest("StandAlone", "Verification");
			iterationReport(1, "StandAlone Test Case 036" );	
			runAPITestCase("StandAlone_TC036");
			verifyAffordableAmountAndLoanTermForAPI("TC036");
			parent.appendChild(child);
			iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC037 () throws Throwable{
			
			child = extent.startTest("StandAlone", "Verification");
			iterationReport(1, "StandAlone Test Case 037" );	
			runAPITestCase("StandAlone_TC037");
			verifyAffordableAmountAndLoanTermForAPI("TC037");
			parent.appendChild(child);
			iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC038 () throws Throwable{
			
			child = extent.startTest("StandAlone", "Verification");
			iterationReport(1, "StandAlone Test Case 038" );	
			runAPITestCase("StandAlone_TC038");
			verifyAffordableAmountAndLoanTermForAPI("TC038");
			parent.appendChild(child);
			iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC039 () throws Throwable{
			
			child = extent.startTest("StandAlone", "Verification");
			iterationReport(1, "StandAlone Test Case 039" );	
			runAPITestCase("StandAlone_TC039");
			verifyAffordableAmountAndLoanTermForAPI("TC039");
			parent.appendChild(child);
			iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC040 () throws Throwable{
			
			child = extent.startTest("StandAlone", "Verification");
			iterationReport(1, "StandAlone Test Case 040" );	
			runAPITestCase("StandAlone_TC040");
			verifyAffordableAmountAndLoanTermForAPI("TC040");
			parent.appendChild(child);
			iterationReport(1,"Test Case Completed"); 	
	}
}
