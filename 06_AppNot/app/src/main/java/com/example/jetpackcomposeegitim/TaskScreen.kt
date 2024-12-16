package com.example.jetpackcomposeegitim

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TasksScreen() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Text(
            text = "Görevler Ekranı",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTasksScreen() {
    TasksScreen()
}
