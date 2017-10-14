package top.thttnt.quickscript

import top.thttnt.quickscript.command.CommandCD
import top.thttnt.quickscript.console.Console
import top.thttnt.quickscript.console.ConsoleMode
import top.thttnt.quickscript.operator.Resolution
import top.thttnt.quickscript.unit.DiskOperator
import top.thttnt.quickscript.unit.Message

/**
 * main enter
 * 程序主入口
 */
fun main(args: Array<String>){
    initExecutors()
    initLang()
    val console : Console
    if (args.isEmpty()){
        console = Console(ConsoleMode.LOCAL)
        console.waitInput()
    }
}

fun initLang() {
    val lanStr = DiskOperator.readResourceText("lan/zh_cn.json")
    Message.loadMessage(lanStr)
}

fun initExecutors() {
    Resolution.addExecutor("cd", CommandCD())
}

