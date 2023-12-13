package br.com.tcc.tcccardiot21.page.presentation

import android.content.Intent
import android.graphics.Paint
import android.net.Uri
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import br.com.tcc.tcccardiot21.databinding.LinkItemBinding
import br.com.tcc.tcccardiot21.page.presentation.model.Page

class LinkViewHolder(private val binding: LinkItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Page.Link) = with(binding) {
        item.text?.let {
            descriptionLink.isVisible = true
            descriptionLink.text = it
        }

        url.text = item.url
        url.paintFlags = url.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        url.setOnClickListener {
            val intent = when (url.text) {
                "Guia de Estimulação (PDF) - Download" -> Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("http://www.movimentodown.org.br/wp-content/uploads/2015/10/Guia-de-estimulação-PARA-DOWNLOAD.pdf")
                )

                "Movimento Down" -> Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("http://movimentodown.org.br/crescer-com-sindrome-de-down-tutoriais/")
                )

                "Diretrizes Atenção Pessoa Síndrome Down (PDF) - Download" -> Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("http://bvsms.saude.gov.br/bvs/publicacoes/diretrizes_atencao_pessoa_sindrome_down.pdf")
                )
                else -> null
            }

            intent?.let {
                url.context.startActivity(it)
            }
        }
    }
}

