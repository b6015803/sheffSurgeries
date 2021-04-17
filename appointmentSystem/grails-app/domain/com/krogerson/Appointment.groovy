package com.krogerson

class Appointment {
//Variables
	Date appDate
	String appTime
	int appDuration
	String roomNumber

//Constraints
    static constraints = {
	roomNumber(blank:false)
	appDate(blank:false)
	appTime(blank:false)
	appDuration(blank:false)
    }
//Relationships
	static belongsTo=[Doctor]
	static hasMany=[prescriptions:Prescription,surgeries:Surgery]
}
