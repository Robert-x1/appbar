package com.robert.appbar.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextOverflow
import com.robert.appbar.R
import com.robert.appbar.screens.Home.Data


@Composable
fun ReboCard(Rebos: Data) {
    Card(
        Modifier
            .padding(12.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row(Modifier.fillMaxWidth(),verticalAlignment = Alignment.CenterVertically) {
            Image(
                painterResource(Rebos.image),
                "", Modifier
                    .padding(10.dp)
                    .clip(CircleShape)
                    .size(60.dp)

            )
            Column(
                Modifier.padding(top = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(Rebos.title, fontSize = 20.sp)
                Text(Rebos.semiTitle, fontSize = 20.sp, modifier = Modifier.padding(10.dp))
            }
            Row(Modifier.fillMaxWidth().padding(bottom = 30.dp), horizontalArrangement = Arrangement.End, verticalAlignment = Alignment.CenterVertically) {
                Text("${Rebos.numberOfStars}", fontSize = 20.sp, modifier = Modifier.padding(end = 10.dp))
                Image(painterResource(R.drawable.star),"", modifier = Modifier.size(30.dp))

            }
        }
        Column(Modifier.padding(10.dp)) { Text(Rebos.description, fontSize = 21.sp, maxLines = 2, overflow = TextOverflow.Ellipsis) }

    }

}





@Composable
fun ReboDetailsItem(title:String,@DrawableRes image:Int) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painterResource(image), "Star", Modifier.size(40.dp))
        Spacer(Modifier.height(10.dp))
        Text(title, fontSize = 15.sp)
    }

}