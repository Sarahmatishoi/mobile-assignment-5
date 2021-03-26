fun main(){
var person=Human("sharon",26,54)
    person.eat(10)
    var humanWeight=person.weight +10
    println(humanWeight)
    person.speak("Good morning,")
    person.birthday()
var details=User("joy","marau","joymarau@gmail.com","0759221716",1256)
println(details.firstName)
 println(details.email)
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating " + foodWeight + " Kgs of food")
    }
    fun speak(speech:String){
        println(speech + " ladies and gentlemen ")
    }
    fun birthday(){
        var years=age+1
        println(years)
    }
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:Int){

}