package io.fajarca.marvel.domain.model.response

import com.squareup.moshi.Json


data class CharacterDto(
    @Json(name = "data")
    val `data`: Data = Data()
) {
    data class Data(
        @Json(name ="results")
        val results: List<Result> = listOf()
    ) {
        data class Result(
            @Json(name ="id")
            val id: Long = 0,
            @Json(name ="name")
            val name: String = "",
            @Json(name ="thumbnail")
            val thumbnail: Thumbnail = Thumbnail()
        ) {
            data class Thumbnail(
                @Json(name ="extension")
                val extension: String = "",
                @Json(name ="path")
                val path: String = ""
            )
        }
    }
}