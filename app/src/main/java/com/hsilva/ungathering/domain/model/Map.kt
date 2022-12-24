package com.hsilva.ungathering.domain.model

data class Map(
    val id: Int,
    val name: String,
    val size: Int,
    val lands: List<Land>,
)
