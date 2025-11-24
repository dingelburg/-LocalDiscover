package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
// This is a "Composable" function. It describes a piece of UI.
// It takes a `Place` object as a parameter to display its data.
@Composable
fun PlaceCard(place: Place) {
    // Card provides a nice, contained look with a shadow.
    Card(
        modifier = Modifier
            .fillMaxWidth() // Make the card take up the full width
            .padding(vertical = 8.dp, horizontal = 16.dp), // Add some space around the card
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        // A Column arranges its children vertically.
        Column(
            modifier = Modifier.padding(16.dp) // Add padding inside the card
        ) {
            // Display the name of the place.
            Text(
                text = place.name,
                style = MaterialTheme.typography.titleLarge // Use a predefined style for the title
            )
            // Add a little vertical space between the title and description.
            Spacer(modifier = Modifier.height(4.dp))
            // Display the description of the place.
            Text(
                text = place.description,
                style = MaterialTheme.typography.bodyMedium // Use a predefined style for the body text
            )
        }
    }
}


    @Preview(showBackground = true)
    @Composable
    fun PlaceCardPreview() {
        MyApplicationTheme {
            PlaceCard(
                place = Place(
                    id = 1,
                    name = "Hidden Park",
                    description = "A quiet little park with a nice fountain."
                )
            )
        }
    }


