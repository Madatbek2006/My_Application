package uz.madatbek.myapplication


actual class JsonParserImpl : JsonParser {
    actual override fun toJson(obj: Student): String {
       return obj.toString()
    }

    actual override  fun fromJson(json: String): Student {
        return Student(
            id=json.substringAfter("\"id\":\"").substringBefore("\",").toInt(),
            name=json.substringAfter("\"name\":\"").substringBefore("\","),
            phone=json.substringAfter("\"phone\":\"").substringBefore("\","),
            age=json.substringAfter("\"age\":\"").substringBefore("\",").toInt()
        )
    }


}

/*
{
            "id":"$id",
            "name":"$name",
            "phone":"$phone",
            "age":"$age",
            }
*/