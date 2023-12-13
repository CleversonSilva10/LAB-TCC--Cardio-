package br.com.tcc.tcccardiot21.page.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.tcc.tcccardiot21.domain.SubTopic
import br.com.tcc.tcccardiot21.domain.Topic
import br.com.tcc.tcccardiot21.page.PageRepository

class MainViewModel(private val repository: PageRepository) : ViewModel() {

    private val _listSubTopics = MutableLiveData(listOf(SubTopic.ABOUT_APP))
    val listSubTopic: LiveData<List<SubTopic>>
        get() = _listSubTopics

   fun getSubTopics(topic: Topic) {
        _listSubTopics.value = repository.getSubTopics(topic)
    }
}