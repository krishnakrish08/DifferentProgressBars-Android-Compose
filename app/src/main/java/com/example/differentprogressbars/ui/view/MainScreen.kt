package com.example.differentprogressbars.ui.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.differentprogressbars.ui.viewmodel.ProgressViewModel

@Composable
fun MainScreen(navController: NavController, viewModel: ProgressViewModel) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { navController.navigate("linear_progress") }) {
            Text(text = "Linear Progress Bar")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("circular_progress") }) {
            Text(text = "Circular Progress Bar")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("indeterminate_linear") }) {
            Text(text = "Indeterminate Linear Progress Bar")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("indeterminate_circular") }) {
            Text(text = "Indeterminate Circular Progress Bar")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("custom_linear") }) {
            Text(text = "Custom Linear Progress Bar")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("custom_circular") }) {
            Text(text = "Custom Circular Progress Bar")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("linear_with_text") }) {
            Text(text = "Linear Progress with Text")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("circular_with_text") }) {
            Text(text = "Circular Progress with Text")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("gradient_linear") }) {
            Text(text = "Gradient Linear Progress Bar")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("gradient_circular") }) {
            Text(text = "Gradient Circular Progress Bar")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("gradient_linear_with_text") }) {
            Text(text = "Gradient Linear Progress with Text")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("gradient_circular_with_text") }) {
            Text(text = "Gradient Circular Progress with Text")
        }
    }
}

@Composable
@Preview
fun MainScreenPreview() {
    val navController = rememberNavController()
    val viewModel: ProgressViewModel = viewModel()
    MainScreen(navController = navController, viewModel = viewModel)
}
