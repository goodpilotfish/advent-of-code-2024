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
return 42
}

fun main() {
  val test_input = "day0_test"
  test_first("input/$test_input", 7)
  //test_second("input/$test_input", 5)

  // TODO Call with real data
}

