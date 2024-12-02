package com.example.differentprogressbars.ui.view.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.differentprogressbars.ui.view.MainScreen
import com.example.differentprogressbars.ui.view.gradient.GradientCircularProgressScreen
import com.example.differentprogressbars.ui.view.gradient.GradientCircularProgressWithTextScreen
import com.example.differentprogressbars.ui.view.gradient.GradientLinearProgressScreen
import com.example.differentprogressbars.ui.view.gradient.GradientLinearProgressWithTextScreen
import com.example.differentprogressbars.ui.view.progressbars.CircularProgressScreen
import com.example.differentprogressbars.ui.view.progressbars.CircularProgressWithTextScreen
import com.example.differentprogressbars.ui.view.progressbars.CustomCircularProgressScreen
import com.example.differentprogressbars.ui.view.progressbars.CustomLinearProgressScreen
import com.example.differentprogressbars.ui.view.progressbars.IndeterminateCircularProgressScreen
import com.example.differentprogressbars.ui.view.progressbars.IndeterminateLinearProgressScreen
import com.example.differentprogressbars.ui.view.progressbars.LinearProgressScreen
import com.example.differentprogressbars.ui.view.progressbars.LinearProgressWithTextScreen
import com.example.differentprogressbars.ui.viewmodel.ProgressViewModel

@Composable
fun ProgressBarApp() {
    val navController = rememberNavController()
    val viewModel: ProgressViewModel = viewModel()

    NavHost(navController = navController, startDestination = "main_screen") {
        composable("main_screen") {
            MainScreen(navController = navController, viewModel = viewModel)
        }
        composable("linear_progress") { LinearProgressScreen(viewModel = viewModel) }
        composable("circular_progress") { CircularProgressScreen(viewModel = viewModel) }
        composable("indeterminate_linear") { IndeterminateLinearProgressScreen() }
        composable("indeterminate_circular") { IndeterminateCircularProgressScreen() }
        composable("custom_linear") { CustomLinearProgressScreen(viewModel = viewModel) }
        composable("custom_circular") { CustomCircularProgressScreen(viewModel = viewModel) }
        composable("linear_with_text") { LinearProgressWithTextScreen(viewModel = viewModel) }
        composable("circular_with_text") { CircularProgressWithTextScreen(viewModel = viewModel) }
        composable("gradient_linear") { GradientLinearProgressScreen(viewModel = viewModel) }
        composable("gradient_circular") { GradientCircularProgressScreen(viewModel = viewModel) }
        composable("gradient_linear_with_text") { GradientLinearProgressWithTextScreen(viewModel = viewModel) }
        composable("gradient_circular_with_text") { GradientCircularProgressWithTextScreen(viewModel = viewModel) }
    }
}
