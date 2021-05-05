package com.krogerson

class Patient {
//variables
	String patientName
	String patientAddress
	String patientResidence
	Date patientDob
	String patientID
	Date dateRegistered
	String patientPhone 

	String toString(){
		return patientName	
	}
//Constraints
    static constraints = {
	patientName(blank:true)
	patientAddress(blank:false)
	patientResidence(nullable:true)
	patientDob(blank:false)
	patientID(blank:false)
	dateRegistered(blank:false)
	patientPhone(maxSize:11)
    }
//Relationships
	static belongsTo=[Appointment,Prescription,Doctor]
	static hasMany=[prescriptions:Prescription,doctors:Doctor,appointment:Appointment]
}
