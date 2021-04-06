fun main() {

    var clinic=Hospital(12,"Audrey")
    println(clinic.admit(19,"7:00am"))
    println(clinic.checkUp("Audrey","Malaria test","Positive"))
    println(clinic.med(2))

}

class Hospital(var ward:Int,var patient:String){
    fun admit(age: Int,time:String){
        println(" Audrey is $age  and she arrived in the hospital at $time and is in  ward $ward")
    }


    fun checkUp(name:String,labTest: String,result: String){
        println("$patient after the $labTest  we did,this is what we found out $labTest is $result")

    }

    fun med(dosage:Int){
        println("The patient should take brufen $dosage times a day")
    }


    }


