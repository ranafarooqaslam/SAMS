package com.fastservices.sams.modules.companycode

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import android.content.Intent
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.fastservices.sams.Constants
import com.fastservices.sams.MainActivity
import com.fastservices.sams.R
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.models.ClientInfo
import com.fastservices.sams.databinding.ActivityCompanyCodeBinding
import com.fastservices.sams.modules.base.BaseActivity
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.login.LoginActivity
import kotlinx.android.synthetic.main.activity_company_code.*


class CompanyCodeActivity : BaseActivity(), View.OnClickListener {


    private lateinit var viewModel: CompanyCodeVM

    private lateinit var binding: ActivityCompanyCodeBinding

    var handler: Handler? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = DataBindingUtil.setContentView(this, R.layout.activity_company_code)
        viewModel = ViewModelProviders.of(this).get(CompanyCodeVM::class.java)
        binding.viewModel = viewModel
        handler = Handler()

        super.onCreate(savedInstanceState)

    }

    override fun setUp(savedInstanceState: Bundle?) {
        viewModel.clientInfo.observe(this, Observer { clientInfo ->
            clientInfo?.let { openLoginActivity(it) }
        })

        handler?.postDelayed({
            if (SamsApplication.getPreferenceManager().hasUserLoggedIn() == false) {
                viewsContainer.visibility = View.VISIBLE
            } else {
                finish()
                startActivity(Intent(applicationContext, MainActivity::class.java))
            }
        }, 2000)

        if (Constants.DEBUG)
            viewModel.companyCode = "1234"

    }

    override fun getViewModel(): BaseVM? {
        return viewModel
    }


    private fun openLoginActivity(clientInfo: ClientInfo) {
        finish()

        startActivity(LoginActivity.getIntent(applicationContext, clientInfo))
    }


    override fun onClick(v: View?) {


    }


}