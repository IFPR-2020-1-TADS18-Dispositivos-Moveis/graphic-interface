package com.stiehl.graphicinterface

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.reflect.KClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btLinear.setOnClickListener { show(LinearActivity::class) }
        btFrame.setOnClickListener { show(FrameActivity::class) }
        btGrid.setOnClickListener { show(GridActivity::class) }
        btScroll.setOnClickListener { show(ScrollActivity::class) }
        btRelative.setOnClickListener { show(RelativeActivity::class) }
        btConstraint.setOnClickListener { show(ConstraintActivity::class) }
        btDimensions.setOnClickListener { show(ConstraintPlayingActivity::class) }
        btStrings.setOnClickListener { show(StringActivity::class) }
        btImages.setOnClickListener { show(ImageActivity::class) }
    }

    private fun show(klass: KClass<out Activity>) {
        val intent = Intent(this, klass.java)
        startActivity(intent)
    }
}