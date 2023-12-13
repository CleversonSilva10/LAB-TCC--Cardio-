package br.com.tcc.tcccardiot21.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import br.com.tcc.tcccardiot21.databinding.SimpleItemBinding

class SimpleItemView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAt: Int = 0
) : ConstraintLayout(context, attrs, defStyleAt) {

    private val binding =
        SimpleItemBinding.inflate(LayoutInflater.from(context), this, true)

    var title: String = ""
        set(value) {
            field = value
            binding.titleSimpleItemText.text = value
        }
}