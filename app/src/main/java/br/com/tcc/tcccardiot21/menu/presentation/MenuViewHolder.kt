package br.com.tcc.tcccardiot21.menu.presentation

import androidx.recyclerview.widget.RecyclerView
import br.com.tcc.tcccardiot21.databinding.MenuItemBinding
import br.com.tcc.tcccardiot21.menu.domain.Menu
import br.com.tcc.tcccardiot21.menu.domain.SubMenu

class MenuViewHolder(val binding: MenuItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Menu, onClickMenu: (Menu) -> Unit, onClickSubMenu: (SubMenu) -> Unit) =
        with(binding.menuItem) {
            titleMenu = item.topic.title
            clickMenu = { onClickMenu.invoke(item) }
            clickSubmenu = onClickSubMenu
            item.subMenus?.let { subMenus = it}
        }
}