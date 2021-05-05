package com.krogerson

class Appointment {
//Variables
	int appnum
	Date appDate
	String appTime
	int appDuration
	String roomNumber

String toString(){
		return appnum	
	}

//Constraints
    static constraints = {
	roomNumber(blank:false)
	appDate(blank:false)
	appTime(blank:false)
	appDuration(blank:false)
    }
//Relationships
	static belongsTo=[Doctor,Patient,Surgery]
	static hasMany=[doctor:Doctor,patients:Patient,surgeries:Surgery]
}
