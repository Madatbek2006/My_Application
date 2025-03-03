package uz.madatbek.myapplication.android

import uz.madatbek.myapplication.JsonParserImpl
import uz.madatbek.myapplication.Student

fun main(){
    val jsonPar= JsonParserImpl()
    val student= Student(0,"Madatbek","+998999999999",18)
    jsonPar.toJson(student).myLog()
    jsonPar.fromJson(jsonPar.toJson(student)).toString().myLog()
}

fun String.myLog(tag:String="TTT"){
    println(this)
}