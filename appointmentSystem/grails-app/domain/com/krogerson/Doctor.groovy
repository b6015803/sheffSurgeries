package com.krogerson

class Doctor {
//Variables 
	String fullName
	String qualification
	String position
	String doctorEmail
	String password
	String doctorOffice
	String doctorPhone
	String bio

	String toString(){
		return fullName
	}
//Constraints
    static constraints = {
	fullName(blank:true)
	qualification(blank:false)
	position(blank:false)
	doctorEmail(email:true)
	password(minSize:6)
	doctorOffice(blank:false)
	doctorPhone(maxSize:11)
	bio(nullable:true)
    }
//Relationships
	static belongsTo=[Surgery,Prescription,Receptionist,Patient,Nurse]
	static hasMany=[nurses:Nurse,patients:Patient,prescriptions:Prescription,receptionists:Receptionist,surgeries:Surgery]
}
