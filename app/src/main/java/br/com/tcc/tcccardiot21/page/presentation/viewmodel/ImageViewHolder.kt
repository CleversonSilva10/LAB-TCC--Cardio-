package br.com.tcc.tcccardiot21.page.presentation.viewmodel

import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import br.com.tcc.tcccardiot21.databinding.ImageItemBinding
import br.com.tcc.tcccardiot21.page.presentation.model.Page

class ImageViewHolder(private val binding: ImageItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Page.Image) = with(binding) {
        item.description?.let {
            descriptionImage.isVisible = true
            descriptionImage.text = it
        }

        if (item.image != 0) image.setImageResource(item.image)
        else image.isVisible = false
    }
}