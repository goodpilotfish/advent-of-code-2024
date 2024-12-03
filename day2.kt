import kotlin.math.abs

val checkDiff : (Int,Int) -> Boolean = { a, b -> abs(a-b) >=1 && abs(a-b) <=3 }
val checkAscending : (Int,Int) -> Boolean = { a, b -> a <= b && checkDiff(a, b) }
val checkDecending : (Int,Int) -> Boolean = { a, b -> a >= b && checkDiff(a, b) }

fun logic_first(input: List<List<Int>>) : Int {
  var safeCounter = 0
  for (x in input) {
    var ascending = x.toMutableList().sorted() == x
    var decending = x.toMutableList().sortedDescending() == x

    for (i in 0..x.count()-2) {
      if (ascending) ascending = checkAscending(x[i], x[i+1])
      if (decending) decending = checkDecending(x[i], x[i+1])
    }
    safeCounter += if (decending || ascending) 1 else 0
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
  val input = readByLinesToSplitInts(real_input)
  println(logic_first(input))
}

