package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;

public class StandAloneTest005 extends StandaloneBusinessFunctions
{
	@Test
	public void standaloneTC021 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 021" );	
		runAPITestCase("StandAlone_TC021");
		verifyAffordableAmountAndLoanTermForAPI("TC021");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC022 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 022" );	
		runAPITestCase("StandAlone_TC022");
		verifyAffordableAmountAndLoanTermForAPI("TC022");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC023 () throws Throwable{
			
			child = extent.startTest("StandAlone", "Verification");
			iterationReport(1, "StandAlone Test Case 023" );	
			runAPITestCase("StandAlone_TC023");
			verifyAffordableAmountAndLoanTermForAPI("TC023");
			parent.appendChild(child);
			iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC024 () throws Throwable{
			
			child = extent.startTest("StandAlone", "Verification");
			iterationReport(1, "StandAlone Test Case 024" );	
			runAPITestCase("StandAlone_TC024");
			verifyAffordableAmountAndLoanTermForAPI("TC024");
			parent.appendChild(child);
			iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC025 () throws Throwable{
			
			child = extent.startTest("StandAlone", "Verification");
			iterationReport(1, "StandAlone Test Case 025" );	
			runAPITestCase("StandAlone_TC025");
			verifyAffordableAmountAndLoanTermForAPI("TC025");
			parent.appendChild(child);
			iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC026 () throws Throwable{
			
			child = extent.startTest("StandAlone", "Verification");
			iterationReport(1, "StandAlone Test Case 026" );	
			runAPITestCase("StandAlone_TC026");
			verifyAffordableAmountAndLoanTermForAPI("TC026");
			parent.appendChild(child);
			iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC027 () throws Throwable{
			
			child = extent.startTest("StandAlone", "Verification");
			iterationReport(1, "StandAlone Test Case 027" );	
			runAPITestCase("StandAlone_TC027");
			verifyAffordableAmountAndLoanTermForAPI("TC027");
			parent.appendChild(child);
			iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC028 () throws Throwable{
			
			child = extent.startTest("StandAlone", "Verification");
			iterationReport(1, "StandAlone Test Case 028" );	
			runAPITestCase("StandAlone_TC028");
			verifyAffordableAmountAndLoanTermForAPI("TC028");
			parent.appendChild(child);
			iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC029 () throws Throwable{
			
			child = extent.startTest("StandAlone", "Verification");
			iterationReport(1, "StandAlone Test Case 029" );	
			runAPITestCase("StandAlone_TC029");
			verifyAffordableAmountAndLoanTermForAPI("TC029");
			parent.appendChild(child);
			iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC030 () throws Throwable{
			
			child = extent.startTest("StandAlone", "Verification");
			iterationReport(1, "StandAlone Test Case 030" );	
			runAPITestCase("StandAlone_TC030");
			verifyAffordableAmountAndLoanTermForAPI("TC030");
			parent.appendChild(child);
			iterationReport(1,"Test Case Completed"); 	
	}
}
