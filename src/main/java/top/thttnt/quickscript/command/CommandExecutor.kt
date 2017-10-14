package top.thttnt.quickscript.command

import top.thttnt.quickscript.console.Console

abstract class CommandExecutor {

    abstract fun onCommand(console : Console, args: List<String>)
}