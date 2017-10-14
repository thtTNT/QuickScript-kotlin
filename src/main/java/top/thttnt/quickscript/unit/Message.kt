package top.thttnt.quickscript.unit

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
        return if (messages.containsKey(id)){
            messages[id]!!
        }else{
            messages["unknown"]!!.replace("{id}",id)
        }
    }
}
