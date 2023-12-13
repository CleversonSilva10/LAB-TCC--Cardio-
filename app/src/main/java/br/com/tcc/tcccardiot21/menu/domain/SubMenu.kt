package br.com.tcc.tcccardiot21.menu.domain

import br.com.tcc.tcccardiot21.domain.SubTopic
import br.com.tcc.tcccardiot21.domain.Topic
import java.io.Serializable

data class SubMenu(val subTopic: SubTopic, val topic: Topic, val hasSelected: Boolean = false) :
    Serializable