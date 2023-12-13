package br.com.tcc.tcccardiot21.page.presentation

import androidx.recyclerview.widget.RecyclerView
import br.com.tcc.tcccardiot21.databinding.HeaderItemBinding
import br.com.tcc.tcccardiot21.page.presentation.model.Page

class HeaderViewHolder(private val binding: HeaderItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Page.Header) {
        binding.header.text = item.title
    }
}