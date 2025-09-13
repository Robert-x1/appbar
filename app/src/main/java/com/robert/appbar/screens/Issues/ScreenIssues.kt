package com.robert.appbar.screens.Issues

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.robert.appbar.R
import com.robert.appbar.screens.IssuesCard

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenIssues(modifier: Modifier = Modifier) {
    val dataList = mutableListOf<DataIssues>(
        DataIssues(
            R.drawable.issues_icon,
            "Robert",
            "Romany",
            "2025-8-12, 12:00 AM",
            true
        ),
        DataIssues(
            R.drawable.issues_icon,
            "Mina",
            "Adel",
            "2025-8-13, 03:15 PM",
            false
        ),
        DataIssues(
            R.drawable.issues_icon,
            "Sara",
            "Nabil",
            "2025-8-14, 09:30 AM",
            true
        ),
        DataIssues(
            R.drawable.issues_icon,
            "John",
            "Michael",
            "2025-8-15, 06:45 PM",
            false
        ),
        DataIssues(
            R.drawable.issues_icon,
            "Lina",
            "Hany",
            "2025-8-16, 10:10 AM",
            true
        ),
        DataIssues(
            R.drawable.issues_icon,
            "Peter",
            "Samir",
            "2025-8-17, 01:20 PM",
            false
        ),
        DataIssues(
            R.drawable.issues_icon,
            "Nour",
            "Khaled",
            "2025-8-18, 05:40 PM",
            true
        ),
        DataIssues(
            R.drawable.issues_icon,
            "Mariam",
            "Fady",
            "2025-8-19, 07:25 AM",
            false
        ),
        DataIssues(
            R.drawable.issues_icon,
            "Youssef",
            "Magdy",
            "2025-8-20, 02:55 PM",
            true
        ),
        DataIssues(
            R.drawable.issues_icon,
            "Heba",
            "Wael",
            "2025-8-21, 11:35 AM",
            false
        )

    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Issues", Modifier.fillMaxWidth(),textAlign = TextAlign.Center
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack,null)

                    }
                }
            )
        }

    ) { innerPadding ->
        LazyColumn(
            Modifier.padding(innerPadding)
        ) { items(dataList){ issue -> IssuesCard( data = issue) }  }
    }


}