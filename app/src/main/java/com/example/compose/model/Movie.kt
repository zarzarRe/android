package com.example.compose.model

data class Movie(
    val adult:Boolean,
    val backdrop_path:String,
    val belongs_to_collection:Belongs,
    val budget:Int,
    val gender: Gender,
    val homepage:String,
    val id:Int,
    val imdb_id:String,
    val original_language:String,
    val original_title:String,
    val overview:String,
    val popularity:Double,
    val poster_path:String,
    val production_companies:ProductionCompanies,
    val production_countries:ProductionCountries,
    val release_date:String,
    val revenue:Int,
    val runtime:Int,
    val spoken_languages:SpokenLanguages,
    val status:String,
    val tagline:String,
    val title:String,
    val video:Boolean,
    val vote_average:Double,
    val vote_count:Int
)


