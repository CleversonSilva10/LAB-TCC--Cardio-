package br.com.tcc.tcccardiot21.page.presentation.model

import androidx.annotation.DrawableRes

sealed class Page {
    class Header(val title: String) : Page()
    class Description(val title: String) : Page()
    class Image(@DrawableRes val image: Int = 0, val description: String? = null) : Page()
    class Link(val url: String, val text: String? = null) : Page()
}

enum class PageType {
    HEADER,
    DESCRIPTION,
    IMAGE,
    LINK
}
