import kotlin.math.abs

fun test_first(fileName: String, answer: Int) {
  val input = readByLinesToList(fileName)

  val res = logic_first(input)
  if (res != answer) throw IllegalArgumentException("Incorrect result: $res != $answer")

  println("Success!")
}

fun test_second(fileName: String, answer: Int) {
}

fun logic_second(input: List<String>) : Int {
  return 42
}

fun logic_first(input: List<String>) : Int {
  var first : ArrayList<Int> = arrayListOf()
  var second : ArrayList<Int> = arrayListOf()
  for (x in input) {
    val split : List<String> = x.split(Regex("\\s+"))
    first.add(split[0].toInt())
    second.add(split[1].toInt())
  }
  first.sort()
  second.sort()

  var diff : Int = 0
  for (x in first.indices) {
    diff += abs(first[x] - second[x])
  }

  return diff
}

fun main() {
  val test_input = "day1_test"
  val real_input = "day1_real"
  test_first("input/$test_input", 11)
  //test_second("input/$test_input", 5)

  // TODO Call with real data
  val input = readByLinesToList("input/$real_input")
  println(logic_first(input))
}

