fun test_first(fileName: String, answer: Int) {
  val input = readByLinesToSplitInts(fileName)

  val res = logic_first(input)
  if (res != answer) throw IllegalArgumentException("Incorrect result: $res != $answer")

  println("Success!")
}

fun test_second(fileName: String, answer: Int) {
}

fun logic_second(input: List<String>) : Int {
  return 42
}

fun logic_first(input: List<List<Int>>) : Int {
  var safeCounter = 0
  for (x in input) {
    val a : List<Boolean> = x.mapIndexed { i, element ->
      if (i < x.count()-1) (element > x[i+1]) && (element-x[i+1] >= 1 && element-x[i+1] <= 3)   else false
    } 
    val aa = a.toMutableList()
    aa.removeLast()
    //println(aa)
    val aaa = aa.contains(false)

    val b : List<Boolean> = x.mapIndexed { i, element ->
      if (i < x.count()-1) (element < x[i+1]) && (x[i+1]-element >= 1 && x[i+1]-element <= 3) else false
    } 
    val bb = b.toMutableList()
    bb.removeLast()
    //println(bb)
    val bbb = bb.contains(false)

    safeCounter += if (!aaa || !bbb) 1 else 0
  }
  return safeCounter
}

fun main() {
  val test_input = "day2_test"
  val real_input = "input/day2_real"
  test_first("input/$test_input", 2)
  //test_second("input/$test_input", 5)

  // TODO Call with real data
  val input = readByLinesToSplitInts(real_input)
  println(logic_first(input))
}

