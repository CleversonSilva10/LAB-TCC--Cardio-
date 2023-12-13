package br.com.tcc.tcccardiot21.page.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.tcc.tcccardiot21.domain.SubTopic
import br.com.tcc.tcccardiot21.page.PageRepository
import br.com.tcc.tcccardiot21.page.presentation.model.Page

class PageViewModel(private val repository: PageRepository) : ViewModel() {

    private val _page = MutableLiveData<List<Page>>()
    val page: LiveData<List<Page>>
        get() = _page

    fun getPage(subTopic: SubTopic) {
        _page.value = repository.getPage(subTopic)
    }
}