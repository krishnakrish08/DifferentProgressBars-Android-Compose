package com.example.differentprogressbars.ui.view.progressbars

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.style.TextAlign
import com.example.differentprogressbars.ui.viewmodel.ProgressViewModel

@Composable
fun LinearProgressScreen(viewModel: ProgressViewModel) {
    val progress = viewModel.progress.value
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        LinearProgressIndicator(
            progress = { progress },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        )
        Text(text = "${(progress * 100).toInt()}%")
    }
}

@Composable
fun CircularProgressScreen(viewModel: ProgressViewModel) {
    val progress = viewModel.progress.value
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CircularProgressIndicator(
            progress = { progress },
            modifier = Modifier.padding(16.dp),
            strokeWidth = 8.dp,
        )
        Text(text = "${(progress * 100).toInt()}%")
    }
}

@Composable
fun IndeterminateLinearProgressScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        LinearProgressIndicator(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }
}

@Composable
fun IndeterminateCircularProgressScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CircularProgressIndicator(modifier = Modifier.padding(16.dp))
    }
}

@Composable
fun CustomLinearProgressScreen(viewModel: ProgressViewModel) {
    val progress = viewModel.progress.value
    val customBrush = Brush.horizontalGradient(colors = listOf(Color.Green, Color.Yellow))

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .height(10.dp)
            .padding(16.dp)
            .background(Color.Gray.copy(alpha = 0.3f), shape = RoundedCornerShape(50))
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width * progress
            drawRoundRect(
                brush = customBrush,
                size = androidx.compose.ui.geometry.Size(width, size.height),
                cornerRadius = androidx.compose.ui.geometry.CornerRadius.Zero
            )
        }
    }
    Text(
        text = "${(progress * 100).toInt()}%",
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp),
        style = MaterialTheme.typography.bodyMedium,
        color = Color.Black,
        textAlign = TextAlign.Center
    )
}

@Composable
fun CustomCircularProgressScreen(viewModel: ProgressViewModel) {
    val progress = viewModel.progress.value
    val customBrush = Brush.linearGradient(colors = listOf(Color.Cyan, Color.Magenta))

    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Canvas(modifier = Modifier.size(100.dp)) {
            val strokeWidth = 10f
            val size = this.size.minDimension
            val sweepAngle = progress * 360f
            drawArc(
                brush = customBrush,
                startAngle = -90f,
                sweepAngle = sweepAngle,
                useCenter = false,
                size = Size(size, size),
                style = Stroke(width = strokeWidth)
            )
        }
        Text(
            text = "${(progress * 100).toInt()}%",
            modifier = Modifier.align(Alignment.Center),
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Black
        )
    }
}

@Composable
fun LinearProgressWithTextScreen(viewModel: ProgressViewModel) {
    val progress = viewModel.progress.value
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        LinearProgressIndicator(
            progress = { progress },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        )
        Text(text = "${(progress * 100).toInt()}%")
    }
}

@Composable
fun CircularProgressWithTextScreen(viewModel: ProgressViewModel) {
    val progress = viewModel.progress.value
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CircularProgressIndicator(
            progress = { progress },
            modifier = Modifier.padding(16.dp),
            strokeWidth = 8.dp,
        )
        Text(text = "${(progress * 100).toInt()}%")
    }
}
