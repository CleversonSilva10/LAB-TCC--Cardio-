package br.com.tcc.tcccardiot21.view

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import br.com.tcc.tcccardiot21.R
import br.com.tcc.tcccardiot21.databinding.MenuItemViewBinding
import br.com.tcc.tcccardiot21.menu.domain.Menu
import br.com.tcc.tcccardiot21.menu.domain.SubMenu

class MenuItemView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAt: Int = 0
) : ConstraintLayout(context, attrs, defStyleAt) {

    private val binding =
        MenuItemViewBinding.inflate(LayoutInflater.from(context), this, true)

    var titleMenu: String = ""
        set(value) {
            field = value
            binding.title.text = value
            binding.title.setOnClickListener {
                if (subMenus.isNullOrEmpty()) {
                    clickMenu?.invoke()
                } else {
                    binding.list.isVisible = !binding.list.isVisible
                }
            }
        }

    var subMenus: List<SubMenu>? = null
        set(value) {
            field = value
            value?.let {
                addSimpleItem(value)
            }
        }

    var clickMenu: (() -> Unit)? = null

    var clickSubmenu: ((SubMenu) -> Unit)? = null

    fun addSimpleItem(list: List<SubMenu>) {
        binding.list.removeAllViews()
        list.forEach { item ->
            binding.list.addView(SimpleItemView(context).apply {
                this.title = item.subTopic.title
                setOnClickListener {
                    clickSubmenu?.invoke(item)
                }
            })
        }

    }

    init {
        parseAttrs(context, attrs)
    }

    private fun parseAttrs(context: Context, attrs: AttributeSet?) {
        /*context.withStyledAttributes(attrs, R.styleable.StatementBenefitsEmptyState) {
            imageViewEmpty = getDrawable(
                R.styleable.StatementBenefitsEmptyState_statementImageEmpty
            )
            titleTextViewEmpty =
                getString(R.styleable.StatementBenefitsEmptyState_statementTitleEmptyTextView).orEmpty()
            subtitleTextViewEmpty =
                getString(R.styleable.StatementBenefitsEmptyState_statementSubtitleEmptyTextView).orEmpty()
        }*/
    }
}
