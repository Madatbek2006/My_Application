package uz.madatbek.myapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform