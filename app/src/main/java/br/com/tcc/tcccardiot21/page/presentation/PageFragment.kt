package br.com.tcc.tcccardiot21.page.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.tcc.tcccardiot21.databinding.FragmentPageBinding
import br.com.tcc.tcccardiot21.domain.SubTopic
import br.com.tcc.tcccardiot21.extension.getSerializableEx
import br.com.tcc.tcccardiot21.page.presentation.viewmodel.PageViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class PageFragment : Fragment() {

    private val pageViewModel: PageViewModel by viewModel()
    private var _binding: FragmentPageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val subTopic = arguments?.getSerializableEx(ARG_SECTION_SUBTOPIC, SubTopic::class.java)
        subTopic?.let { pageViewModel.getPage(subTopic) }
        pageViewModel.page.observe(viewLifecycleOwner) {
            binding.recycler.adapter = PageAdapter(it)
        }
    }

    companion object {
        private const val ARG_SECTION_SUBTOPIC = "section_subtopic"

        @JvmStatic
        fun newInstance(subTopic: SubTopic): PageFragment {
            return PageFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_SECTION_SUBTOPIC, subTopic)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}