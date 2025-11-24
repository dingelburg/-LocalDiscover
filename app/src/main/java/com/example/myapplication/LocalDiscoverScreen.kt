package com.example.myapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LocalDiscoverScreen(places: List<Place>) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("LocalDiscover") }
            )
        }
    ) { innerPadding ->
        LazyColumn(modifier = Modifier.padding(innerPadding)) {
          items(
              items = places,
              key = {place -> place.id}
          ) { place ->
              PlaceCard(place = place)
          }
        }
    }
}
// --- ADD THE CODE BELOW THIS LINE, AT THE END OF THE FILE ---



@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun LocalDiscoverScreenPreview() {
    MyApplicationTheme {
        val previewPlaces = listOf(
            Place(id = 1, name = "Preview Cafe", description = "A cafe just for the preview."),
            Place(id = 2, name = "Preview Park", description = "A park that only exists here."),
            Place(id = 3, name = "Preview Museum", description = "A museum you can't actually visit.")
        )
        // Here, we CALL the function from above with our preview data
        LocalDiscoverScreen(places = previewPlaces)
    }
}
