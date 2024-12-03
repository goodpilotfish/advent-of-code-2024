import kotlin.math.abs

fun logic_first(input: List<List<Int>>) : Int {
  var safeCounter = 0
  for (x in input) {
    var isAscending = x.toMutableList().sorted() == x
    var isDecending = x.toMutableList().sortedDescending() == x
    val checkDiff = x.windowed(2).all { (a, b) -> abs(a - b) in 1..3 }

    safeCounter += if (checkDiff && (isDecending || isAscending)) 1 else 0
  }
  return safeCounter
}

//////

fun test_first(fileName: String, answer: Int) {
  val input = readByLinesToSplitInts(fileName)

  val res = logic_first(input)
  if (res != answer) throw IllegalArgumentException("Incorrect result: $res != $answer")

  println("Success!")
}

fun main() {
  val test_input = "day2_test"
  val real_input = "input/day2_real"
  test_first("input/$test_input", 2)

  // TODO Call with real data
  //val input = readByLinesToSplitInts(real_input)
  //println(logic_first(input))
}

