package com.krogerson

class Appointment {
//Variables
	String appID
	Date appDate
	String appTime
	int appDuration
	String roomNumber

	String toString(){
		return appID
	}

//Constraints
    static constraints = {
	roomNumber(blank:true)
	appDate(blank:true)
	appTime(blank:true)
	appDuration(blank:true)
    }
//Relationships
	static belongsTo=[Doctor, Surgery, Patient]
	static hasMany = [doctors:Doctor, surgeries:Surgery, patients:Patient]
	
}
