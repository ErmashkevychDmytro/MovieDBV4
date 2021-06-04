package com.example.movie.presentation.detail.adapter

import com.example.movie.data_source.database.entity.ActorEntity
import com.example.movie.data_source.database.entity.MovieEntity
import com.google.android.youtube.player.YouTubePlayerView


interface ActorMovieListener {
    fun onClickActor(actor: ActorEntity)
}