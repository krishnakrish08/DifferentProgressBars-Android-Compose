package com.example.differentprogressbars.ui.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableFloatStateOf
import androidx.lifecycle.ViewModel

class ProgressViewModel : ViewModel() {
    // Progress values for each progress bar type
    private val _progress = mutableFloatStateOf(0.5f) // Default progress value is 50%
    val progress: State<Float> = _progress

    // Function to update the progress value
    fun updateProgress(value: Float) {
        _progress.floatValue = value
    }
}
