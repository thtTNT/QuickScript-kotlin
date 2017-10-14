package top.thtTNT.quickscript.operator

import top.thtTNT.quickscript.Unit.Message
import top.thtTNT.quickscript.command.CommandExecutor

object Resolution {

    private val executors = HashMap<String, CommandExecutor>()

    fun deal(line: String) {
        var command = line
        while (command.contentEquals("  ")) {
            command = command.replace("  ", " ")
        }
        val args = command.split(" ")
        executors.filter { it.key.contentEquals(args[0]) }.forEach {
            it.value.onCommand(args)
            return
        }
        println(Message.get("command_unknown"))
    }
}