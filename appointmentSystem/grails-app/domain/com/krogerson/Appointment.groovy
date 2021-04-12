package com.krogerson

class Appointment {
//Variable declaration
	Date appDate
	Time appTime
	int appDuration
	String roomNumber 

//constraints
    static constraints = {
	appDate(min: new Date())
	appDate(blank:false)
	appTime(blank:false)
    }
}
