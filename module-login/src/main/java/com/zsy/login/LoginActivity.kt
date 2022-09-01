package com.zsy.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.zsy.common.utils.precision2
import com.zsy.login.databinding.ActivityLoginBinding

@Route(path = "/login/activity")
class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val a = 10
        binding.textView.text = a.precision2
    }
}