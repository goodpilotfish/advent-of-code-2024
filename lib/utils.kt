import java.io.File
import java.net.URL
import java.net.URI

// read files
fun readByLinesToList (fileName: String) : List<String> = File(fileName).useLines { it.toList() }
fun readByLinesToSplitStrings (fileName: String) = readByLinesToList(fileName).map { x -> x.split(" ") }
fun readByLinesToSplitInts (fileName: String) = readByLinesToList(fileName).map { x -> x.split(" ").map { it.toInt() } }

fun readAsTextToString (fileName: String) = File(fileName).inputStream().readBytes().toString(Charsets.UTF_8)

//fun fileFromUrl (s: String) = URL(s).readText(Charsets.UTF_8)

