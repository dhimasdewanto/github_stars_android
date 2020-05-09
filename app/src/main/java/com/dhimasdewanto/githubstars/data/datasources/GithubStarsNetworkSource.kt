package com.dhimasdewanto.githubstars.data.datasources

import androidx.lifecycle.LiveData
import com.dhimasdewanto.githubstars.domain.entities.GitHubStars

interface GithubStarsNetworkSource {
    val downloadedGitHubStars : LiveData<List<GitHubStars>>

    suspend fun fetchGithubStars(
        page: Int,
        searchQuery: String? = null
    )

    suspend fun loadMoreData()
}