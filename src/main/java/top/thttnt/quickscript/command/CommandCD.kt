package top.thttnt.quickscript.command

import top.thttnt.quickscript.unit.Message
import top.thttnt.quickscript.console.Console
import java.io.File

class CommandCD : CommandExecutor()
{
    override fun onCommand(console: Console, args: List<String>) {
        if (args.size == 1){
            println(Message.get("command_cd_help_1"))
            return
        }
        val dir = args[1]
        if (dir.contentEquals("..")){
            if (console.dir.canonicalFile == null){
                println(Message.get("command_cd_root"))
                return
            }
            console.dir = console.dir.canonicalFile
        }
        val newFile = File(console.dir,dir)
        if (!newFile.exists()){
            println(Message.get("command_cd_not_exist"))
            return
        }
        if (newFile.isFile){
            println(Message.get("command_cd_is_file"))
            return
        }
        console.dir = newFile
    }
}