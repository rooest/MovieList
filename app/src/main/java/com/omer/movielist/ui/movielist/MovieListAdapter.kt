package com.omer.movielist.ui.movielist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.omer.movielist.data.model.TvSerieResult
import com.omer.movielist.databinding.ItemMovieBinding
import com.omer.movielist.utils.DebouncedOnClickListener

class MovieListAdapter constructor(movieItemClickListener: MovieItemClickListener) :
    PagedListAdapter<TvSerieResult, MovieListAdapter.MovieListViewHolder>(TvSerieResult.DIFF_CALL) {

    private var mMovieItemClickListener: MovieItemClickListener = movieItemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListViewHolder =
        MovieListViewHolder.create(parent, mMovieItemClickListener)

    override fun onBindViewHolder(holder: MovieListViewHolder, position: Int) {
        return holder.bind(getItem(position) as TvSerieResult)
    }


    class MovieListViewHolder constructor(
        private val binding: ItemMovieBinding,
        private val movieItemClickListener: MovieItemClickListener
    ) : RecyclerView.ViewHolder(binding.root) {


        fun bind(tvSerieResult: TvSerieResult) = with(binding) {
            binding.cardMovieItem.setOnClickListener(object : DebouncedOnClickListener(1000) {
                override fun onDebouncedClick(v: View) {
                    movieItemClickListener.onMovieItemClick(tvSerieResult)
                }
            })

            binding.itemResult = tvSerieResult
        }

        companion object {
            fun create(parent: ViewGroup?, movieItemClickListener: MovieItemClickListener): MovieListViewHolder {
                val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent?.context), parent, false)
                return MovieListViewHolder(binding, movieItemClickListener)
            }
        }
    }

}