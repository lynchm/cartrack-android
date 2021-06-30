package com.omdb.cartrack.data.repositories

import com.omdb.cartrack.data.model.SearchResults
import com.omdb.cartrack.data.network.ApiInterface
import com.omdb.cartrack.data.network.SafeApiRequest

class HomeRepository(
    private val api: ApiInterface
) : SafeApiRequest() {

    suspend fun getMovies(
        searchTitle: String,
        apiKey: String,
        pageIndex: Int
    ): SearchResults {

        return apiRequest { api.getSearchResultData(searchTitle, apiKey, pageIndex) }
    }


}