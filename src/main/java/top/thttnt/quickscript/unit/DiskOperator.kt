package top.thttnt.quickscript.unit

import java.io.*

object DiskOperator{

    fun readResourceText(name : String): String {
        val url = this.javaClass.getResource("/$name")
        val br = BufferedReader(InputStreamReader(url.openStream()))
        val content = br.readText()
        br.close()
        return content
    }


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

