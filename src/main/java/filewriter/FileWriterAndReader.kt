package filewriter

import java.io.File

class FileWriterAndReader {
}

fun main() {

    val fineName = "D:\\Download\\wood_window_background.xml"
    val file = File(fineName)
    val lines = file.useLines { it.toList() }.map { it.replace("@color/wood_texture_color_window", "@color/wood_texture_color_start") }
    file.bufferedWriter().use { out -> out.write(lines.joinToString("\n")) }
}