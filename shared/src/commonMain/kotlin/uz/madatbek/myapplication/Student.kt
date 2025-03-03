package uz.madatbek.myapplication

data class Student (
    val id:Int,
    val name:String,
    val phone:String,
   val age:Int
){
    override fun toString(): String {
        return """
            {
            "id":"$id",
            "name":"$name",
            "phone":"$phone",
            "age":"$age",
            }
        """.trimIndent()
    }
}
