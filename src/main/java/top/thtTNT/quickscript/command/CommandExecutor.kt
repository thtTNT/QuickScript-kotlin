package top.thtTNT.quickscript.command

abstract class CommandExecutor {

    abstract fun onCommand(args: List<String>)
}