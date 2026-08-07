package com.example.wordquest.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    @GET("api/v2/entries/en/{word}")
    fun checkWord(
        @Path("word") word: String
    ): Call<List<Any>>
}