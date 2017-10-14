package top.thttnt.quickscript.operator

import top.thttnt.quickscript.unit.Message
import top.thttnt.quickscript.command.CommandExecutor
import top.thttnt.quickscript.console.Console

object Resolution {

    private val executors = HashMap<String, CommandExecutor>()

    fun deal(console : Console, line: String) {
        var command = line
        while (command.contentEquals("  ")) {
            command = command.replace("  ", " ")
        }
        val args = command.split(" ")
        executors.filter { it.key.contentEquals(args[0]) }.forEach {
            it.value.onCommand(console,args)
            return
        }
        println(Message.get("command_unknown"))
    }

    fun addExecutor(name : String, executor: CommandExecutor){
        executors[name] = executor
    }
}