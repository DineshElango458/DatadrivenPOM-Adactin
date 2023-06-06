package com.loginpage;

import org.junit.Test;
import org.test.BaseClass;

public class EmployeePageFactory extends BaseClass{

	@org.junit.BeforeClass
	public static void BeforeClass() {
		getdriver();
		geturl("https://adactinhotelapp.com/");
		maximizewindow();
	}
	@org.junit.AfterClass
	public static void AfterClass() {


	}
	@Test
	public void cancelbooking() throws Exception {


		LoginPage l = new LoginPage();
		l.login(getdatafromexcel("Sheet2", 1, 0),getdatafromexcel("Sheet2", 1, 1));

         SearchHotelpage s = new SearchHotelpage();
         s.hotelpgsearch(getdatafromexcel("Sheet2", 1, 3), getdatafromexcel("Sheet2", 1, 4), getdatafromexcel("Sheet2", 1, 5), getdatafromexcel("Sheet2", 1, 6), getdatafromexcel("Sheet2", 1, 7), getdatafromexcel("Sheet2", 1, 8), getdatafromexcel("Sheet2", 1, 9), getdatafromexcel("Sheet2", 1, 10));

        
         SelectHotelpage h = new SelectHotelpage();
         h.hotelpgselect();
         
         
         BookingHotelpage bh = new BookingHotelpage();
        bh.hotelbookingpg(getdatafromexcel("Sheet2", 1, 11), getdatafromexcel("Sheet2", 1, 12), getdatafromexcel("Sheet2", 1, 13), getdatafromexcel("Sheet2", 1, 14), getdatafromexcel("Sheet2", 1, 15), getdatafromexcel("Sheet2", 1, 17), getdatafromexcel("Sheet2", 1, 18), getdatafromexcel("Sheet2", 1, 19),"booknow");
      //   bh.hotelbookingpg(firtsname, lastname, address, creditcrdno, creditcrdtype, expmonth, expyear, cvvno, booknow);
        // bh.hotelbookingpg(firtsname, lastname, address, creditcrdno, creditcrdtype, expmonth, expyear, cvvno, booknow);
        // bh.hotelbookingpg(firtsname, lastname, address, creditcrdno, creditcrdtype, expmonth, expyear, cvvno, booknow);
   
         //BookingHotelpage k = new BookingHotelpage();
        // k.hotelbookingpg(firtsname, lastname, address, creditcrdno, creditcrdtype, expmonth, expyear, cvvno, );
         
         
         
         BookingPage b = new BookingPage();
         b.bookingpg();
         
         CancelBooking c = new CancelBooking();
         c.cancelbooking(getdatafromexcel("Sheet2", 1, 21));
         
	}


}
