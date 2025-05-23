package com.dudoji.android.network.dto

data class MapSection(
    val x: Int,
    val y: Int,
    val explored: Boolean,
    val mapData: String? = null,
)

data class MapSectionResponse(
    val mapSections: List<MapSection>,
)