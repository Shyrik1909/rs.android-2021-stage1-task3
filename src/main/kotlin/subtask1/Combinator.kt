package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]
        if (m >= 0 && n > 0) {
            for (x in 0..n) {
                if (factorial(n) == m * factorial(n - x) * factorial(x)) {
                    return x
                }

            }
            return null
        }
        return null
    }

    fun factorial(num: Int): Int {
        var factorial = 1
        for (i in 1..num) {
            factorial *= i
        }
        return factorial
    }
}
