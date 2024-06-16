package com.example.myapp // Make sure this matches your actual directory structure

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.os.Bundle
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterApp() // Ensure CounterApp is called here
        }
    }
}

@Composable
fun counterApp() {
    Surface(color = MaterialTheme.colors.background) {
        Column {
            CounterDisplay(count = 0)
            CounterButton(onClick = { /* TODO: Increment count */ }, text = "Increment")
            CounterButton(onClick = { /* TODO: Decrement count */ }, text = "Decrement")
        }
    }
}

@Composable
fun counterDisplay(count: Int) {
    // Display count
}

@Composable
fun counterButton(onClick: () -> Unit, text: String) {
    // Button code
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}
