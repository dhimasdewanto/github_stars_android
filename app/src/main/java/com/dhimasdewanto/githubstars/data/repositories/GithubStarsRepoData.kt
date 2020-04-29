package com.dhimasdewanto.githubstars.data.repositories

import androidx.lifecycle.LiveData
import com.dhimasdewanto.githubstars.core.ITEMS_PER_PAGE
import com.dhimasdewanto.githubstars.data.datasources.GithubStarsNetworkSource
import com.dhimasdewanto.githubstars.domain.entities.GitHubStars
import com.dhimasdewanto.githubstars.domain.repositories.GithubStarsRepo

class GithubStarsRepoData(
    private val networkSource: GithubStarsNetworkSource
) : GithubStarsRepo {
    override suspend fun getGithubStars(page: Int): LiveData<List<GitHubStars>> {
        networkSource.fetchGithubStars(page, ITEMS_PER_PAGE)
        return networkSource.downloadedGitHubStars
    }
}