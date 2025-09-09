package com.robert.appbar.screens.Home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.robert.appbar.screens.ReboCard


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun reboScreen(modifier: Modifier = Modifier) {
    val data: MutableList<Data> = mutableListOf(
        Data(
            com.robert.appbar.R.drawable.ro,
            "Robert",
            "Romany",
            "High-performance, visually appealing, and user-friendly mobile experience that serves as a benchmark for quality in modern Android development.",
            250
        ),
        Data(
            com.robert.appbar.R.drawable.ro1,
            "John",
            "Doe",
            "A robust Android application that focuses on seamless navigation, efficient memory management, and optimized rendering for a smoother user journey.",
            300
        ),
        Data(
            com.robert.appbar.R.drawable.ro2,
            "Emma",
            "Watson",
            "Designed with scalability in mind, ensuring that the app can handle thousands of users simultaneously while maintaining speed and responsiveness.",
            280
        ),
        Data(
            com.robert.appbar.R.drawable.ro3,
            "Michael",
            "Smith",
            "An elegant combination of modern UI/UX practices with advanced Android APIs to deliver an immersive and interactive mobile experience.",
            400
        ),
        Data(
            com.robert.appbar.R.drawable.ro4,
            "Sophia",
            "Brown",
            "The app integrates innovative animations and intuitive controls, making it not only functional but also delightful to use on a daily basis.",
            350
        ),
        Data(
            com.robert.appbar.R.drawable.ro5,
            "Liam",
            "Johnson",
            "Crafted with Jetpack Compose, the project highlights the power of declarative UI, reducing boilerplate code and increasing development speed.",
            320
        ),
        Data(
            com.robert.appbar.R.drawable.ro6,
            "Olivia",
            "Taylor",
            "A project that emphasizes accessibility, ensuring inclusivity by supporting screen readers, dynamic text, and color contrast optimization.",
            360
        ),
        Data(
            com.robert.appbar.R.drawable.github,
            "James",
            "Anderson",
            "Optimized for low-end devices while still providing a premium feel, balancing performance and design across all Android ecosystems.",
            310
        ),
        Data(
            com.robert.appbar.R.drawable.star,
            "Isabella",
            "Martinez",
            "Demonstrates strong security practices including encrypted storage, secure authentication, and protection against common mobile threats.",
            330
        ),
        Data(
            com.robert.appbar.R.drawable.google,
            "Ethan",
            "Williams",
            "Focused on future-ready architecture, using clean code principles, MVVM, and modularization for easier testing and maintenance.",
            390
        )
    )
    Scaffold(
        Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "GitHub Rebo", Modifier.fillMaxWidth(), textAlign = TextAlign.Center
                    )
                })
        }) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            LazyColumn {
                items(data){ card ->
                    ReboCard(card)

                }
            }

        }

    }

}

@Preview
@Composable
private fun previewReboScreeen() {
    reboScreen()

}



