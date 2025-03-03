package uz.madatbek.myapplication

import com.google.gson.Gson

actual class JsonParserImpl : JsonParser {
    val gson=Gson()
    actual override fun toJson(obj: Student): String {
        return gson.toJson(obj)
    }

    actual override  fun fromJson(json: String): Student {
        return gson.fromJson(json,Student::class.java)
    }
}



/*

actual class JsonParserImpl : JsonParser {
    val gson=Gson()
    actual override fun toJson(obj: Any): String {
        return gson.toJson(obj)
    }

    actual override  fun <T> fromJson(json: String, className:String): T? {
       return gson.fromJson<T>(json,Class.forName(className))
    }
}
 */