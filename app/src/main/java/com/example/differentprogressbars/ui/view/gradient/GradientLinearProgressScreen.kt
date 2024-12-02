package com.example.differentprogressbars.ui.view.gradient

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.differentprogressbars.ui.viewmodel.ProgressViewModel

@Composable
fun GradientLinearProgressScreenOld(viewModel: ProgressViewModel) {
    val progress = viewModel.progress.value
    val gradientBrush = Brush.horizontalGradient(colors = listOf(Color.Blue, Color.Green))

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(10.dp)
            .padding(16.dp)
            .background(Color.Gray.copy(alpha = 0.3f), shape = RoundedCornerShape(50))
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width * progress
            drawRoundRect(
                brush = gradientBrush,
                size = androidx.compose.ui.geometry.Size(width, size.height),
                cornerRadius = androidx.compose.ui.geometry.CornerRadius.Zero
            )
        }
    }
}

@Composable
fun GradientLinearProgressScreen(viewModel: ProgressViewModel) {
    // Get the current progress from the ViewModel
    val progress = viewModel.progress.value
    val gradientBrush = Brush.horizontalGradient(colors = listOf(Color.Blue, Color.Green))

    Box(
        modifier = Modifier
            .fillMaxWidth()  // Fill the width of the parent container
            .height(10.dp)  // Fixed height for progress bar
            .padding(16.dp)  // Padding around the progress bar
            .background(Color.Gray.copy(alpha = 0.3f), shape = RoundedCornerShape(50))  // Background color and rounded corners
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            // Calculate the width of the progress bar based on progress value
            val width = size.width * progress  // Progress will range from 0f to 1f
            drawRoundRect(
                brush = gradientBrush,
                size = androidx.compose.ui.geometry.Size(width, size.height),
                cornerRadius = androidx.compose.ui.geometry.CornerRadius.Zero
            )
        }
    }

    // Optionally, show progress as a text below the progress bar
    Spacer(modifier = Modifier.height(8.dp))  // Add space between progress bar and text
    Text(
        text = "${(progress * 100).toInt()}%",  // Show progress in percentage format
        style = MaterialTheme.typography.bodyMedium,
        color = Color.Black,
        textAlign = TextAlign.Center
    )
}



@Composable
fun GradientCircularProgressScreen(viewModel: ProgressViewModel) {
    val progress = viewModel.progress.value
    val gradientBrush = Brush.linearGradient(colors = listOf(Color.Cyan, Color.Magenta))

    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Canvas(modifier = Modifier.size(100.dp)) {
            val strokeWidth = 10f
            val size = this.size.minDimension
            val sweepAngle = progress * 360f
            drawArc(
                brush = gradientBrush,
                startAngle = -90f,
                sweepAngle = sweepAngle,
                useCenter = false,
                size = Size(size, size),
                style = Stroke(width = strokeWidth)
            )
        }
    }
}

@Composable
fun GradientLinearProgressWithTextScreenOld(viewModel: ProgressViewModel) {
    val progress = viewModel.progress.value
    val gradientBrush = Brush.horizontalGradient(colors = listOf(Color.Blue, Color.Green))

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
                brush = gradientBrush,
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
fun GradientLinearProgressWithTextScreen(viewModel: ProgressViewModel) {
    val progress = viewModel.progress.value
    val gradientBrush = Brush.horizontalGradient(colors = listOf(Color.Blue, Color.Green))

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Create a container for the progress bar background and progress
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Canvas for drawing the gradient progress bar
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp) // Fixed height for the progress bar
                    .background(Color.Gray.copy(alpha = 0.3f), shape = RoundedCornerShape(50))
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val width = size.width * progress // Calculate the width based on the progress
                    drawRoundRect(
                        brush = gradientBrush,
                        size = androidx.compose.ui.geometry.Size(width, size.height),
                        cornerRadius = androidx.compose.ui.geometry.CornerRadius.Zero
                    )
                }
            }

            // Show the progress as text below the progress bar
            Spacer(modifier = Modifier.height(8.dp)) // Add some spacing
            Text(
                text = "${(progress * 100).toInt()}%", // Display percentage as text
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        }
    }
}


@Composable
fun GradientCircularProgressWithTextScreen(viewModel: ProgressViewModel) {
    val progress = viewModel.progress.value
    val gradientBrush = Brush.linearGradient(colors = listOf(Color.Red, Color.Yellow))

    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Canvas(modifier = Modifier.size(100.dp)) {
            val strokeWidth = 10f
            val size = this.size.minDimension
            val sweepAngle = progress * 360f
            drawArc(
                brush = gradientBrush,
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

