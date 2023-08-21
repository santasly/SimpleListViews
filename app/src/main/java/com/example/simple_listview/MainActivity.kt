package com.example.simple_listview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simple_listview.ui.theme.Simple_ListViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleListview()

        }
    }
}
val namelist= mutableListOf("Erick","Victor","John","Joan","Sara")

val listModifier= Modifier
    .fillMaxSize()
    .background(androidx.compose.ui.graphics.Color.Cyan)
    .padding(20.dp)
private val  textStyle=androidx.compose.ui.text.TextStyle(fontSize = 25.sp, color = androidx.compose.ui.graphics.Color.Red)


@Composable
fun SimpleListview() {
    LazyColumn(modifier = listModifier) {
       items(namelist){
           jina->
           Text(text = jina, style = textStyle)



        }
    }
}




@Preview(showBackground = true)
@Composable
fun MyList() {
    SimpleListview()
}

