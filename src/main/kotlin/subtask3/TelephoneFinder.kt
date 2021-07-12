package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val result = mutableListOf<String>()
        val neighborsNumber = mapOf(
            '0' to "8",
            '1' to "24",
            '2' to "135",
            '3' to "26",
            '4' to "157",
            '5' to "2468",
            '6' to "359",
            '7' to "48",
            '8' to "5790",
            '9' to "68"
        )

        for ((index, value) in number.withIndex()) {
            val neighbors = neighborsNumber[value]
            if (neighbors != null) {
                for (i in neighbors) {
                    result.add(number.take(index) + i + number.drop(index + 1))
                    //result.add(number.replaceRange(index, index, value.toString()))
                }
            } else {
                return null
            }
        }
        return result.toTypedArray()
    }
}
