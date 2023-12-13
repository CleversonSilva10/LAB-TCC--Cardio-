package br.com.tcc.tcccardiot21.menu.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.tcc.tcccardiot21.databinding.MenuItemBinding
import br.com.tcc.tcccardiot21.menu.domain.Menu
import br.com.tcc.tcccardiot21.menu.domain.SubMenu

class MenuAdapter(
    private val list: List<Menu>,
    private val onClickMenu: (Menu) -> Unit,
    private val onClickSubMenu: (SubMenu) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = MenuItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return MenuViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MenuViewHolder).bind(list[position], onClickMenu, onClickSubMenu)
    }

    override fun getItemCount(): Int = list.size
}