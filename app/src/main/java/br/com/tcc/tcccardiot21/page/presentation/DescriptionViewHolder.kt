package br.com.tcc.tcccardiot21.page.presentation

import androidx.recyclerview.widget.RecyclerView
import br.com.tcc.tcccardiot21.databinding.DescriptionItemBinding
import br.com.tcc.tcccardiot21.page.presentation.model.Page

class DescriptionViewHolder (private val binding: DescriptionItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Page.Description) {
        binding.description.text = item.title
    }
}