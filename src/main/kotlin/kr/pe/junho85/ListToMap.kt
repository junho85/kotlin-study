package kr.pe.junho85

data class UserDevice(
    val userId: Long,
    val oldDevices: List<Int>,
    val newDevices: List<Int>,
)

fun main() {
    val userDeviceList = listOf(
        UserDevice(1, listOf(101, 102), listOf(111, 112)),
        UserDevice(1, listOf(102, 103), listOf(111, 112)),
        UserDevice(2, listOf(201), listOf(211, 212))
    )

    val userDeviceMap = userDeviceList.groupBy(UserDevice::userId)
        .mapValues { entry ->
            UserDevice(
                userId = entry.key,
                oldDevices = entry.value.flatMap { it.oldDevices }.distinct(),
                newDevices = entry.value.flatMap { it.newDevices }.distinct()
            )
        }

    println(userDeviceMap)
}
