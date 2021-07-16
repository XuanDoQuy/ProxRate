package com.xuandq.proxrate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xuandq.rate.ProxRateDialog
import com.xuandq.rate.RatingDialogListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val config = ProxRateDialog.Config()
        config.setListener(object : RatingDialogListener{
            override fun onChangeStar(rate: Int) {

            }

            override fun onSubmitButtonClicked(rate: Int, comment: String?) {

            }

            override fun onLaterButtonClicked() {

            }
        })

        ProxRateDialog.init(this, config)

        txt.setOnClickListener {
            ProxRateDialog.showAlways(supportFragmentManager)
//            ProxRateDialog.showIfNeed(supportFragmentManager)
        }
    }

}