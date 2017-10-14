package top.thttnt.quickscript.command

import top.thttnt.quickscript.unit.Message
import top.thttnt.quickscript.console.Console

class CommandCD : CommandExecutor()
{
    override fun onCommand(console: Console, args: List<String>) {
        if (args.size == 1){
            println(Message.get("command_cd_help"))
            return
        }

    }
}