package com.omer.movielist.ui.movielist

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.omer.movielist.R
import com.omer.movielist.data.model.TvSerieResult
import com.omer.movielist.databinding.ActivityMovieListBinding
import com.omer.movielist.ui.base.BaseActivity
import com.omer.movielist.ui.moviedetail.MovieDetailActivity
import com.omer.movielist.utils.delegates.contentView

class MovieListActivity : BaseActivity<MovieListViewModel>(), MovieItemClickListener {


    private lateinit var movieListAdapter: MovieListAdapter

    private val mBinding: ActivityMovieListBinding by contentView(R.layout.activity_movie_list)

    override fun getViewModel(): Class<MovieListViewModel> = MovieListViewModel::class.java

    override fun observe() {

        viewModel.isLoading.observe(this, Observer {
            mBinding.isLoading = it
        })
        viewModel.tvSerieResultLD.observe(this, Observer {
            movieListAdapter.submitList(it)
        })

        viewModel.tvResultAsStirng.observe(this, Observer {
            startActivity(MovieDetailActivity.newInstance(this, it))
        })

        viewModel.apiError.observe(this, Observer {
            showAlertDialog {
                setMessage(it.statusMessage)
                positiveButton("OK") { }
            }
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        movieListAdapter = MovieListAdapter(this)
        val gridLayoutManager = GridLayoutManager(this, 2)
        mBinding.rvMovieList.adapter = movieListAdapter
        mBinding.rvMovieList.layoutManager = gridLayoutManager
    }

    override fun onMovieItemClick(itemResult: TvSerieResult?) {
        viewModel.convertClickedMovieItem(itemResult)
    }
}