package com.amengu.horscocapp.domain.model

import dagger.hilt.android.lifecycle.HiltViewModel


data class PredictionModel(
    val horoscope: String,
    val sign: String
)