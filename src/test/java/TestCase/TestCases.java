package TestCase;

import org.testng.annotations.Test;
//Package name.Classname
import Enquiry.Enquiry;

public class TestCases {
	Enquiry Enq = new Enquiry(); 
  @Test
  public void TestCase1() {
	  
	  int enqnumber = Enq.CreateEnquiry("dsfsd","234234");
	  Enq.SearchEnquiry(enqnumber);
	  
  }
}
