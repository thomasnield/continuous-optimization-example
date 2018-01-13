// parameters
val operatingDay = 6..22
val allowableShiftSize = 4..6


// constants
val operatingDayLength = operatingDay.endInclusive - operatingDay.start


// declare drivers
val drivers = listOf(
        Driver(driverNumber = 1, rate = 10.0),
        Driver(driverNumber = 2, rate = 12.0, availability = 6..11),
        Driver(driverNumber = 3, rate = 14.0)
)


fun main(args: Array<String>) {

    buildModel()

    model.minimise().run(::println)

    // see variables for each driver
    drivers.forEach {
        println("Driver ${it.driverNumber}: ${it.shiftStart.value.toInt()}-${it.shiftEnd.value.toInt()}")
    }
}