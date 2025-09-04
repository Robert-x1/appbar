package com.robert.appbar

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.icu.number.Scale
import android.icu.text.CaseMap
import android.os.Bundle
import android.webkit.WebSettings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Composition
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.robert.appbar.ui.theme.AppbarTheme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
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
          Image(google,"" , modifier = Modifier.size(220.dp))
          Text("Google", fontSize = 25.sp)
          Spacer(modifier = Modifier.height(20.dp))
          Row(Modifier
              .fillMaxWidth(),
              Arrangement.SpaceEvenly
              ) {
              Column(
                  verticalArrangement = Arrangement.Center,
                  horizontalAlignment = Alignment.CenterHorizontally
              ) {
                  Image(painterResource(R.drawable.star), "Star", Modifier.size(40.dp))
                  Spacer(Modifier.height(10.dp))
                  Text("501420", fontSize = 15.sp)
              }
              Column(
                  verticalArrangement = Arrangement.Center,
                  horizontalAlignment = Alignment.CenterHorizontally
              ){
                  Image(painterResource(R.drawable.python), "Star", Modifier.size(40.dp))
                  Spacer(Modifier.height(10.dp))
                  Text("Python", fontSize = 15.sp)
              }
              Column(
                  verticalArrangement = Arrangement.Center,
                  horizontalAlignment = Alignment.CenterHorizontally
                  ) {
                  Image(painterResource(R.drawable.github), "Star", Modifier.size(40.dp))
                  Spacer(Modifier.height(10.dp))
                  Text("3000", fontSize = 15.sp)
              }
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