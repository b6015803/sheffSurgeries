package com.krogerson

class Receptionist {
//Variables
	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	String recepPhone

	String toString(){
		return recepName
	}
//Constraints
    static constraints = {
	recepName(blank:true)
	recepEmail(email:true)
	recepUsername(blank:false)
	recepPassword(blank:false)
	recepPhone(maxSize:11)
    }
//Relationships
	/*static belongsTo=[Surgery,Doctor]
	static hasMany=[doctors:Doctor,surgeries:Surgery]*/
}
