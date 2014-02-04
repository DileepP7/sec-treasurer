package sec.treasurer

import java.util.Date;

class Person {
	String firstName
	String middleName
	String lastName
	Date DOB
	String companyName
	String email
	static constraints = {
		firstName(nullable:true ,blank:false, size:4..10)
		middleName(nullable:true , size:4..10)
		lastName(nullable:true ,blank:false, size:4..10)
		DOB(format:"dd/mm/yyyy")
		companyName(blank:false)
		email(email:true)
	}
}
