import java.io.File

// read files
fun readByLinesToList (fileName: String) = File(fileName).useLines { it.toList() }
fun readAsTextToString (fileName: String) = File(fileName).inputStream().readBytes().toString(Charsets.UTF_8)
