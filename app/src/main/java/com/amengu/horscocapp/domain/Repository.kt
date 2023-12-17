package com.amengu.horscocapp.domain

import com.amengu.horscocapp.domain.model.PredictionModel

interface Repository {

    suspend fun getPrediction(sign:String): PredictionModel?
}