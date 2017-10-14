package top.thtTNT.quickscript.Unit

import com.google.gson.JsonParser

object Message{

    private val messages = HashMap<String,String>()

    fun loadMessage(str : String){
        val json = JsonParser().parse(str).asJsonObject
        for (key in json.keySet()){
            messages[key] = json.get(key).asString
        }
    }

    fun get(id : String): String {
        if (messages.containsKey(id)){
            return messages["id"]!!
        }else{
            return messages["unknown"]!!.replace("{id}",id)
        }
    }
}
