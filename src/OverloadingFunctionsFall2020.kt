fun main(){
    // start with a menu, business or residential?
    println("Are you a residential or business customer?")
    println("1) Residential")
    println("2) Business")
    var customer = readLine()!!.toInt()
    // create functions with the same name, "overloading functions"
    // make the first two inputs the one shared between both business and residential customers.
    fun customerInfo (contactName: String, phoneNumber: String, businessName: String): String{
        println("Your name is ${contactName}.")
        println("Your phone number is ${phoneNumber}.")
        println("Your business' name is ${businessName}.")
        return String()
    }

    fun customerInfo (contactName: String, phoneNumber: String): String{
        println("Your name is ${contactName}.")
        println("Your phone number is ${phoneNumber}.")
        return String()
    }
    //menu fr residential; create a function to print info properly
    if (customer == 1){
        println("Please enter your name on line one and your phone number on line two. ")
        var contactName = readLine()!!.toString()
        var phoneNumber = readLine()!!.toString()
        var printInfo = customerInfo(contactName, phoneNumber)
        print("${printInfo}")
    }
    //menu fr business; create a function to print info properly
    if (customer == 2){
        println("Please enter your name on line one, your phone number on line two, and your business name on line three.")
        var contactName = readLine()!!.toString()
        var phoneNumber = readLine()!!.toString()
        var businessName = readLine()!!.toString()
        var printInfo = customerInfo(contactName, phoneNumber, businessName)
        print("${printInfo}")
    }
}