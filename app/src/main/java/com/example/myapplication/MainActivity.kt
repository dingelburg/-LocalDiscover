package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme{
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Create our list of fake data
                    val fakePlaces = listOf(
                        Place(id=1,"Secret Garden Cafe", "A cozy cafe hidden behind a flower shop."),
                        Place(id=2,"The Old Watchtower", "Historic ruin with a panoramic view of the city."),
                        Place(id=3,"Riverbend Dog Park", "A spacious off-leash park by the water."),
                        Place(id=4,"Art Alley", "An alleyway filled with vibrant street art murals."),
                        Place(id=5,"The Nook Bookstore", "A tiny, independent bookstore with rare finds.")
                    )

                    // Display our main screen and pass the fake data to it
                    LocalDiscoverScreen(places = fakePlaces)
                }
            }
        }
    }
}




