package com.bangkit.capstonebangkitv1.customview

import android.content.Context
import android.graphics.Canvas
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.util.Patterns
import android.view.View
import androidx.appcompat.widget.AppCompatEditText
import com.bangkit.capstonebangkitv1.R

class EmailCustomView: AppCompatEditText {
    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        textAlignment = View.TEXT_ALIGNMENT_VIEW_START
    }

    private fun init() {
        addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (!text.isNullOrBlank()){
                    this@EmailCustomView.error = if (!isValidEmail(text.toString())) {
                        context.getString(R.string.email_blank)
                    } else{
                        null
                    }
                }

            }

            override fun afterTextChanged(p0: Editable?) {
                if (text.isNullOrEmpty()){
                    this@EmailCustomView.error = context.getString(R.string.email_blank)
                }
            }

        })
    }

    fun isValidEmail(email: String): Boolean {
        return !email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}