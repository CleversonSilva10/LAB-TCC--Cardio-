package br.com.tcc.tcccardiot21.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.tcc.tcccardiot21.databinding.SimpleItemBinding
import br.com.tcc.tcccardiot21.menu.domain.SubMenu

class MenuItemAdapter(
    private val list: List<SubMenu>,
    private val onClickItem: ((SubMenu) -> Unit)?
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = SimpleItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return MenuItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MenuItemViewHolder).bind(list[position], onClickItem)
    }

    override fun getItemCount(): Int  = list.size
}