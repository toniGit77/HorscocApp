package com.amengu.horscocapp.domain

import com.amengu.horscocapp.domain.model.PredictionModel
import dagger.hilt.android.HiltAndroidApp

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}