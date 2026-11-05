package dev.archfoundry.marsphotosapp.network

import dev.archfoundry.marsphotosapp.model.MarsPhoto
import retrofit2.http.GET

interface MarsApiService {
    @GET(value = "photos")
    suspend fun getPhotos(): List<MarsPhoto>
}
