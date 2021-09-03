/*
Button Setter
You need to have a minimum height for the Buttons - it cannot have a value below 50.
You decide to create a setter for the height property so that if the provided value is less than 50, it is set as 50.

 */

class Button {
    var width: Int = 0
    var height: Int = 0
        // your code goes here
        set(value){
            if(value < 50) field = 50 else field = value

        }

}
fun main() {
    val b1 = Button()
    print("Please Enter Height: ")
    b1.height = readLine()!!.toInt()
    print("Please Enter Width: ")
    b1.width = readLine()!!.toInt()

    println("Width is ${b1.width} and Height is ${b1.height}")
}