
    fun main() {
        val list = listOf(8, 38, 94, 48, 22, 99, 23, 60, 63, 87)

        list.filterSmaller().forEach{i -> println(i)}
    }

    fun List<Int>.filterSmaller(): List<Int>{
        return this.filter{i -> i > 50}

    }