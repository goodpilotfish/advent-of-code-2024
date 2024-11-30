import java.io.File
import java.net.URL
import java.net.URI

// read files
fun readByLinesToList (fileName: String) = File(fileName).useLines { it.toList() }
fun readAsTextToString (fileName: String) = File(fileName).inputStream().readBytes().toString(Charsets.UTF_8)

//fun fileFromUrl (s: String) = URL(s).readText(Charsets.UTF_8)

