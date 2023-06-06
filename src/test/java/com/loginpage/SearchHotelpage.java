package com.loginpage;

import java.nio.channels.SelectionKey;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class SearchHotelpage extends BaseClass {
	
	public SearchHotelpage() {
	PageFactory.initElements(driver, this);
	
	}

	@FindBy(id="location")
    private WebElement locationbyid;
	
	@FindBy(id="hotels")
    private WebElement hotelsid;
	
	@FindBy(id="room_type")
    private WebElement roomtypeid;

	@FindBy(id="room_nos")
    private WebElement roomsid;
	
	@FindBy(id="datepick_in")
    private WebElement checkindt;
	
	@FindBy(id="datepick_out")
    private WebElement checkoutdt;

	
	@FindBy(id="adult_room")
    private WebElement adult;
	
	@FindBy(id="child_room")
    private WebElement child;
	
	@FindBy(id="Submit")
    private WebElement searchbtn;

	public WebElement getLocationbyid() {
		return locationbyid;
	}

	public WebElement getHotelsid() {
		return hotelsid;
	}

	public WebElement getRoomtypeid() {
		return roomtypeid;
	}

	public WebElement getRoomsid() {
		return roomsid;
	}

	public WebElement getCheckindt() {
		return checkindt;
	}

	public WebElement getCheckoutdt() {
		return checkoutdt;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public void hotelpgsearch(String location,String hotels,String roomtype,String noofRooms,String checkInDate,String checkOutDate,String adultsperroom, String childrenperroom) {
	      selectoptionbytext(getLocationbyid(), location);
	      selectoptionbytext(getHotelsid(), hotels);
	      selectoptionbytext(getRoomtypeid(), roomtype);
	      selectoptionbytext(getRoomsid(), noofRooms);
	      elementsendkeys(getCheckindt(), checkInDate);
	      elementsendkeys(getCheckoutdt(), checkOutDate);
	      selectoptionbytext(getAdult(), adultsperroom);
	      selectoptionbytext(getChild(), childrenperroom);
	      elementclick(getSearchbtn());
	      

	}
	
	
	
	
}
