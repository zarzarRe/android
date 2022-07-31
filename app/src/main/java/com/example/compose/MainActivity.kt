package com.example.compose

import android.content.Context
import android.graphics.Paint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ComposeTheme {
            // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
////                    color = MaterialTheme.colors.background
//                )
//                {
//                }
//            }
        }
    }
}

@Composable
fun Sample(context: Context) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Button(onClick = {
            Toast.makeText(context, "Hi there! This is a Toast.", Toast.LENGTH_SHORT).show()
        }) {
            Text(
                text = "Send Email",

                )
        }
        Button(onClick = { /*TODO*/ }) {
            Text(
                text = "Call",

                )
        }
        Text(
            text = "Hello world",
            fontWeight = FontWeight(900),
            color = Color.White,
            modifier = Modifier.padding(15.dp),

            )
        Image(
            painter = painterResource(id = R.drawable.download),
            contentDescription = null,
            alpha = 1F, modifier = Modifier.clip(CutCornerShape(20.dp))

        )
        Card(modifier = Modifier.padding(top = 20.dp),
            elevation = 4.dp

        ) {
            Image(
                painter = painterResource(id = R.drawable.download),
                contentDescription = null,
            )

            Text(text = "elevation" , modifier = Modifier.padding(start = 50.dp))
            Text(text = "hello", color = Color.White)
        }
    }
}

@Preview
@Composable
fun SamplePreview() {
    val context = LocalContext.current
    Sample(context = context)
}





