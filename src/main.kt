fun main(){
//1.Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//-carry(people: Int) : Prints out “Carrying $peoplepassengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//-identity() : Prints out the color, make and modelin the following
//format e.g:  “I am a white subaru legacy”(1 point)
//-calculateParkingFees(hours: Int) : Calculates andreturns the
//parking fees by multiplying the hours by 20(1 point)
//2.Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method calledmaxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.(2 points)
//The bus’calculateParkingFees method returns the productof hours and
//the capacity of the bus(3 points)
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
//and call each of the functions on the objects.
    var toyota = Car("Toyota","Forester","black",4)
      println(toyota.capacity)
    toyota.carry(8)
    toyota.identity()
    toyota.calculateParkingFees(10)


    var nissan = Bus("SUbaru","Porshe","blue",6)
    println(nissan.calledMaxTripFare(500.50))

    println(nissan.calculateParkingFees(7))





}
 open class Car(var make:String,var model:String,var colour:String,var capacity:Int) {

//if (elemnt is Int|| elemnt is Double || elemnt is Float){
    // sum.toString().toDouble()
//println("Carrying $peoplepassangers")

     fun carry(people: Int) {
         var x = people - capacity
        if (people <=capacity) {
            print("Carrying $people passangers")
        } else {
            println("Overcapacity by $x people")

        }
    }
    fun identity(){
       println("I am a $colour $make $model")

    }
    open fun calculateParkingFees(hours:Int):Int{
       var parkingfees = hours*20
         println(parkingfees)

         return parkingfees

     }
     }
class Bus( make:String, model:String, colour: String, capacity:Int):Car(make,model,colour,capacity){

      fun calledMaxTripFare(fare:Double):Double{
          var price = fare*capacity

          return price

      }

    override fun calculateParkingFees(hours: Int): Int {
        //return super.calculateParkingFees(hours)
        var time =hours*capacity

        return time
    }
      }




