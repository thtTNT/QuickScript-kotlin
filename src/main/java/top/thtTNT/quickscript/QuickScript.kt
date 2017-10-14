package top.thtTNT.quickscript

import top.thtTNT.quickscript.Unit.Message

/**
 * main enter
 * 程序主入口
 */
fun main(args: Array<String>){
    if (args.isEmpty()){
        println(Message.get("param_filename_not_exist"))
    }
}

