package uz.madatbek.myapplication

expect class JsonParserImpl : JsonParser {
    override fun toJson(obj: Student): String
    override  fun fromJson(json: String): Student

}