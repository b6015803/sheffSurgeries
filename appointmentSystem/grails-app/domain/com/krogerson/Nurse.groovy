package com.krogerson

class Nurse {
//Variables
	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	String nursePhone
//Constraints
    static constraints = {
	nurseName(blank:true)
	nurseEmail(email:true)
	nurseOffice(blank:false)
	qualifications(nullable:true)
	nurseOffice(blank:false)
	nursePhone(blank:false)
    }
//Relationship
	static belongsTo=[Surgery,Doctor]
	static hasMany=[doctors:Doctor]
}
