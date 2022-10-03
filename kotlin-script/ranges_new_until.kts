val A_TO_D = ('a'..'d')
val A_UNTIL_D = ('a' until 'd')
val A_RANGETO_D = ('a'.rangeTo('d'))
@OptIn(kotlin.ExperimentalStdlibApi::class)
val A_NEW_UNTIL_D = ('a' ..< 'd')
val A_DOWNTO_D = ('d'.downTo('a'))

val dotdotRange: String
    get() {
        return A_TO_D.joinToString(",")
    }
val untilRange: String
    get() {
        return A_UNTIL_D.joinToString(",")
    }
val rangeRangeNew_1_7_20: String
    get() {
        return A_NEW_UNTIL_D.joinToString(",")
    }
val rangeTo: String
    get() {
        return A_RANGETO_D.joinToString(",")
    }
val downTo: String
    get() {
        return A_DOWNTO_D.joinToString(",")
    }

println(
    "RangedotdotRange: ${dotdotRange} \n" +
    "untilRange: ${untilRange} \n" +
    "rangeTo: ${rangeTo} \n" +
    "untilRange new 1.7.20: ${rangeRangeNew_1_7_20} \n" +
    "downTo: ${downTo} \n"
)
