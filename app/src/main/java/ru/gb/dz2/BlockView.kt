package ru.gb.dz2

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import ru.gb.dz2.databinding.BlockViewBinding

class BlockView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    ) : LinearLayout(context, attrs) {
    private val binding = BlockViewBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
    }

    fun setTopText(text: String) {
        binding.textView1.text = text
    }

    fun setBottomText(text: String) {
        binding.textView2.text = text
    }
}