package com.example.textinputlayoutapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initWidget()
        initData()
    }

    abstract fun getLayoutId(): Int

    open fun initWidget() {}

    open fun initData() {}

}