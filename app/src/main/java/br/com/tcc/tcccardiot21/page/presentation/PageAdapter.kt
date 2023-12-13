package br.com.tcc.tcccardiot21.page.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.tcc.tcccardiot21.databinding.DescriptionItemBinding
import br.com.tcc.tcccardiot21.databinding.HeaderItemBinding
import br.com.tcc.tcccardiot21.databinding.ImageItemBinding
import br.com.tcc.tcccardiot21.databinding.LinkItemBinding
import br.com.tcc.tcccardiot21.page.presentation.model.Page
import br.com.tcc.tcccardiot21.page.presentation.model.PageType
import br.com.tcc.tcccardiot21.page.presentation.viewmodel.ImageViewHolder

class PageAdapter(private var items: List<Page>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            PageType.HEADER.ordinal -> {
                HeaderViewHolder(HeaderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            }
            PageType.DESCRIPTION.ordinal -> {
                DescriptionViewHolder(DescriptionItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            }
            PageType.IMAGE.ordinal -> {
                ImageViewHolder(ImageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            }
            PageType.LINK.ordinal -> {
                LinkViewHolder(LinkItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            }
            else -> throw IllegalArgumentException("ViewHolder not defined")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is HeaderViewHolder -> holder.bind(items[position] as Page.Header)
            is DescriptionViewHolder -> holder.bind(items[position] as Page.Description)
            is ImageViewHolder -> holder.bind(items[position] as Page.Image)
            is LinkViewHolder -> holder.bind(items[position] as Page.Link)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is Page.Header -> PageType.HEADER
            is Page.Description -> PageType.DESCRIPTION
            is Page.Image -> PageType.IMAGE
            is Page.Link -> PageType.LINK
        }.ordinal
    }

    override fun getItemCount(): Int = items.size
}