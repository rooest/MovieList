package com.omer.movielist.ui.moviedetail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import com.omer.movielist.R
import com.omer.movielist.databinding.ActivityMovieDetailBinding
import com.omer.movielist.ui.base.BaseActivity
import com.omer.movielist.utils.delegates.contentView
import com.orhanobut.logger.Logger

class MovieDetailActivity : BaseActivity<MovieDetailViewModel>() {


    private val mBinding: ActivityMovieDetailBinding by contentView(R.layout.activity_movie_detail)

    override fun getViewModel(): Class<MovieDetailViewModel> = MovieDetailViewModel::class.java

    companion object {

        const val EXTRA_MOVIE_RESULT = "EXTRA_MOVIE_RESULT"

        fun newInstance(context: Context, result: String): Intent {
            val intent = Intent(context, MovieDetailActivity::class.java)
            intent.putExtra(EXTRA_MOVIE_RESULT, result)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getIntentExtra()
        mBinding.viewmodel = viewModel
    }

    private fun getIntentExtra() {
        intent?.let {
            if (it.hasExtra(EXTRA_MOVIE_RESULT)) {
                viewModel.setIntentResult(it.getStringExtra(EXTRA_MOVIE_RESULT))
            }
        }
    }

    override fun observe() {
        viewModel.tvSeriesResultLD.observe(this, Observer {
            mBinding.serieItem = it
        })
        viewModel.backBtnClicked.observe(this, Observer {
            finish()
        })

        viewModel.isLoading.observe(this, Observer {
            mBinding.isLoading = it
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}