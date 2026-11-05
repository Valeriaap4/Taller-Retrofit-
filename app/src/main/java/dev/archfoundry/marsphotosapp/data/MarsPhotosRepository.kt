package dev.archfoundry.marsphotosapp.data

import dev.archfoundry.marsphotosapp.model.MarsPhoto
import dev.archfoundry.marsphotosapp.network.MarsApiService

interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}
