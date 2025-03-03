package uz.madatbek.myapplication

 interface JsonParser {
    fun toJson(stn: Student): String
    fun fromJson(json: String): Student
 }