val A_TO_D = ('a'..'d')
val A_UNTIL_D = ('a' until 'd')
val A_RANGETO_D = ('a'.rangeTo('d'))
//val A_RANGETO_D_NEW = ('a'..<'d')
val A_DOWNTO_D = ('d'.downTo('a'))

val dotdotRange: String
    get() {
        return A_TO_D.joinToString(",")
    }
val untilRange: String
    get() {
        return A_UNTIL_D.joinToString(",")
    }
val rangeTo: String
    get() {
        return A_RANGETO_D.joinToString(",")
    }
//val rangeToNew_1_7_20: String
//    get() {
//        return A_RANGETO_D_NEW.joinToString(",")
//    }
val downTo: String
    get() {
        return A_DOWNTO_D.joinToString(",")
    }

println(
    "RangedotdotRange: ${dotdotRange} \n" +
    "untilRange: ${untilRange} \n" +
    "rangeTo: ${rangeTo} \n" +
//    "rangeTo new 1.7.20: ${rangeToNew_1_7_20} \n" +
    "downTo: ${downTo} \n"
)
