package top.thtTNT.quickscript.disk

import java.io.*

/**
 * static method of io
 * io静态方法
 */
object QSIO{

    /**
     * read text from file
     * 从文件的读取文本
     */
    fun readTextFromFile(file : File) : List<String>{
        val lines = ArrayList<String>()
        val br = BufferedReader(FileReader(file))
        while (true){
            val line = br.readLine() ?: break
            lines.add(line)
        }
        return lines
    }

}