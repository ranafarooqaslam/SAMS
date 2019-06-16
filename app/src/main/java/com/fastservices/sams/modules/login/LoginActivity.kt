package com.fastservices.sams.modules.login

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.View
import com.fastservices.sams.Constants
import com.fastservices.sams.ImageLoader
import com.fastservices.sams.MainActivity
import com.fastservices.sams.R
import com.fastservices.sams.data.models.ClientInfo
import com.fastservices.sams.databinding.ActivityLoginBinding
import com.fastservices.sams.modules.base.BaseActivity
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.companycode.CompanyCodeVM
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity(), View.OnClickListener {


    lateinit var binding: ActivityLoginBinding

    private lateinit var viewModel: LoginVM

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        viewModel = ViewModelProviders.of(this).get(LoginVM::class.java)
        binding.viewModel = viewModel

        ImageLoader.loadImage(ivLogo, intent.getStringExtra(EXTRA_LOGO))
        ImageLoader.loadImage(ivCustomBackground, intent.getStringExtra(EXTRA_BACKGROUND_IMAGE))
        super.onCreate(savedInstanceState)

    }

    override fun setUp(savedInstanceState: Bundle?) {

        viewModel.loginSuccess.observe(this, Observer { _ ->
            openMainActivity()
        })

        if (Constants.DEBUG) {
            viewModel.username = "saad"
            viewModel.password = "saad"
        }

    }


    override fun getViewModel(): BaseVM? {
        return viewModel
    }

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.btnLogin -> openMainActivity()
        }

    }


    fun openMainActivity() {
        finish()
        startActivity(Intent(applicationContext, MainActivity::class.java))
    }

    companion object {

        val EXTRA_LOGO = "logo"
        val EXTRA_BACKGROUND_IMAGE = "background_image"
        fun getIntent(applicationContext: Context, clientInfo: ClientInfo) = Intent(applicationContext, LoginActivity::class.java).apply {
            putExtra(EXTRA_LOGO, clientInfo.Logo)
            putExtra(EXTRA_BACKGROUND_IMAGE, clientInfo.BackGroundImage)
        }
    }

}