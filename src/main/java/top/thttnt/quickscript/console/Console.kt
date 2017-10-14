package top.thttnt.quickscript.console

import top.thttnt.quickscript.operator.Resolution
import java.io.File
import java.util.*

class Console(private val mode : ConsoleMode){

    //work folder 工作目录
    private val dir = File("")

    private fun execute(input : String){
        Resolution.deal(this,input)
    }

    fun waitInput(){
        if (mode != ConsoleMode.LOCAL){
            println("This isn't a local console")
        }
        val scanner = Scanner(System.`in`)
        while(true){
            print(dir.canonicalFile.name+"#")
            val line =scanner.nextLine()
            execute(line)
        }
    }
}