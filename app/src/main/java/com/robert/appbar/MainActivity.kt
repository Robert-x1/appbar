package com.robert.appbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.robert.appbar.screens.Home.Data
import com.robert.appbar.screens.ReboDetailsItem

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar() {
    val google = painterResource(R.drawable.google)
    Scaffold (Modifier
        .fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text("DETAILS", modifier = Modifier.fillMaxWidth() , textAlign = TextAlign.Center )
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.ArrowBack,"Back")
                    }
                }

            )

        }
    ){ innerPadding ->
        Column(Modifier
            .padding(innerPadding)
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(google,"" ,
                modifier = Modifier
                .size(220.dp))

            Text("Google", fontSize = 25.sp)
            Spacer(modifier = Modifier.height(20.dp))
            Row(Modifier
                .fillMaxWidth(),
                Arrangement.SpaceEvenly
            ) {
                ReboDetailsItem(
                    "501420",
                    R.drawable.star
                )
                ReboDetailsItem(
                    "Python",
                    R.drawable.python
                )
                ReboDetailsItem(
                    "3000",
                    R.drawable.github
                )

               
            }

            Text("Shared repository for open-sourced\n" +
                    "projects from the Google Al\n" +
                    "Language team.", fontSize = 22.sp,modifier = Modifier.padding(15.dp).padding(start = 10.dp))
            Column (Modifier
                .fillMaxSize()
                .padding(bottom = 10.dp),
                Arrangement.Bottom,
                Alignment.CenterHorizontally
            ){ Button(onClick = {}, modifier = Modifier.size(300.dp,50.dp), shape = RoundedCornerShape(5.dp)) {Text("Robert") } }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewAppBar(){
    AppBar()
}
