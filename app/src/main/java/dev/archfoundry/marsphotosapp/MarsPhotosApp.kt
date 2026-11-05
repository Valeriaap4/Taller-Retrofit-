package dev.archfoundry.marsphotosapp

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import dev.archfoundry.marsphotosapp.ui.screen.HomeScreen
import dev.archfoundry.marsphotosapp.ui.screen.MarsViewModel

@Composable
fun MarsPhotosApp() {
    val viewModel: MarsViewModel = viewModel(factory = MarsViewModel.Factory)
    Scaffold { innerPadding ->
        HomeScreen(
            marsUiState = viewModel.marsUiState,
            retryAction = viewModel::getMarsPhotos,
            contentPadding = innerPadding
        )
    }
}
