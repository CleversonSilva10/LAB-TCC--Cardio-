package br.com.tcc.tcccardiot21.view

import androidx.recyclerview.widget.RecyclerView
import br.com.tcc.tcccardiot21.databinding.SimpleItemBinding
import br.com.tcc.tcccardiot21.menu.domain.SubMenu

class MenuItemViewHolder(val binding: SimpleItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: SubMenu, onClickItem: ((SubMenu) -> Unit)?) = with(binding) {
        titleSimpleItemText.text = item.subTopic.title
        titleSimpleItemText.setOnClickListener {
            onClickItem?.invoke(item)
        }
    }
}