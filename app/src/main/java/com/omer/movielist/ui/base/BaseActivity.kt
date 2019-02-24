package com.omer.movielist.ui.base

import android.app.AlertDialog
import android.os.Bundle
import android.view.WindowManager
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject


abstract class BaseActivity<VM : ViewModel> : DaggerAppCompatActivity() {

    private val TAG: String = BaseActivity::class.java.simpleName

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    protected lateinit var viewModel: VM


    abstract fun getViewModel(): Class<VM>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(getViewModel())
    }

    protected fun showAlertDialog(dialogBuilder: AlertDialog.Builder.() -> Unit) {
        val builder = AlertDialog.Builder(this)
        builder.dialogBuilder()
        val dialog = builder.create()
        if (!isFinishing) dialog.show()
    }

    protected fun showNotCancelableAlertDialog(dialogBuilder: AlertDialog.Builder.() -> Unit) {
        val builder = AlertDialog.Builder(this)
        builder.dialogBuilder()
        val dialog = builder.create()
        dialog.setCancelable(false)
        dialog.setCanceledOnTouchOutside(false)
        if (!isFinishing) dialog.show()
    }

    fun AlertDialog.Builder.positiveButton(text: String = "Okay", handleClick: (which: Int) -> Unit = {}) {
        this.setPositiveButton(text, { _, which -> handleClick(which) })
        this.setOnCancelListener { dialog -> dialog.dismiss() }
    }

    fun AlertDialog.Builder.negativeButton(text: String = "Cancel", handleClick: (which: Int) -> Unit = {}) {
        this.setNegativeButton(text, { _, which -> handleClick(which) })
        this.setOnCancelListener { dialog -> dialog.dismiss() }
    }

    fun AlertDialog.Builder.neutralButton(text: String = "Do", handleClick: (which: Int) -> Unit = {}) {
        this.setNeutralButton(text, { _, which -> handleClick(which) })
        this.setOnCancelListener { dialog -> dialog.dismiss() }
    }


    fun setWindowTouchable(isTouchable: Boolean) {
        if (!isTouchable) {
            window?.setFlags(
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
            )
        } else {
            window?.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
        }
    }

    abstract fun observe()
}