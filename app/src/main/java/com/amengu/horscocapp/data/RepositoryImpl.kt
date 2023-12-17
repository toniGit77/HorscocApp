package com.amengu.horscocapp.data

import android.util.Log
import com.amengu.horscocapp.data.network.HoroscopeApiService
import com.amengu.horscocapp.data.network.response.PredictionResponse
import com.amengu.horscocapp.domain.Repository
import com.amengu.horscocapp.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("aris", "Ha ocurrido un error ${it.message}") }
        return null
    }
}