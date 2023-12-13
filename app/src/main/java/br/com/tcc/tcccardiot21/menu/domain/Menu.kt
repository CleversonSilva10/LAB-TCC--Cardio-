package br.com.tcc.tcccardiot21.menu.domain

import br.com.tcc.tcccardiot21.domain.Topic
import java.io.Serializable

data class Menu(val topic: Topic, val subMenus: List<SubMenu>? = null) : Serializable