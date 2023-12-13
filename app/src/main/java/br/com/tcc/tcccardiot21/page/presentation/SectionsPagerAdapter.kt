package br.com.tcc.tcccardiot21.page.presentation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import br.com.tcc.tcccardiot21.domain.SubTopic

class SectionsPagerAdapter(fm: FragmentManager) :
    FragmentStatePagerAdapter(fm) {

    private var list: List<SubTopic> = listOf()

    override fun getItem(position: Int): Fragment {
        return PageFragment.newInstance(list[position])
    }

    override fun getItemPosition(`object`: Any): Int {
        return POSITION_NONE
    }

    override fun getCount(): Int {
        return list.size
    }

    fun setData(list: List<SubTopic>) {
        this.list = list
        notifyDataSetChanged()
    }

    fun getPosition(subTopic: SubTopic): Int {
        list.forEachIndexed { index, sub ->
            if (sub == subTopic) return index
        }
        return 0
    }
}