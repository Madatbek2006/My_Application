package uz.madatbek.myapplication.android

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import uz.madatbek.myapplication.JsonParserImpl
import uz.madatbek.myapplication.Student
import kotlin.concurrent.thread

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                ////////////
            }
        }
    }
}



