package com.omdb.cartrack.data.repositories

import com.omdb.cartrack.data.model.MovieDetail
import com.omdb.cartrack.data.network.ApiInterface
import com.omdb.cartrack.data.network.SafeApiRequest

class MovieDetailRepository(
    private val api: ApiInterface
) : SafeApiRequest() {

    suspend fun getMovieDetail(
        title: String,
        apiKey: String
    ): MovieDetail {

        return apiRequest { api.getMovieDetailData(title, apiKey) }
    }


}