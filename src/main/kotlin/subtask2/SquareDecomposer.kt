package subtask2

import kotlin.math.sqrt

class SquareDecomposer {
    fun decomposeNumber(number: Int): Array<Int>? {
        if (number < 0) {
            return null
        }
        return decompose(sqr(number), number - 1)
    }

    fun decompose(initialNumber: Int, startCycle: Int): Array<Int>? {
        for (currentNumber in startCycle downTo 1) {
            val remains = initialNumber - sqr(currentNumber)
            if (remains < 0) return null
            if (remains == 0) return arrayOf(currentNumber)
            var probableNumber = sqrt(remains.toDouble()).toInt()
            if (probableNumber >= currentNumber) {
                probableNumber = currentNumber - 1
            }
            val decomposedNumbers = decompose(remains, probableNumber)
            if (decomposedNumbers != null) return decomposedNumbers + arrayOf(currentNumber)
        }
        return null
    }

    fun sqr(x: Int): Int = (x * x)
}






