package br.com.tcc.tcccardiot21.page.presentation

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import br.com.tcc.tcccardiot21.R
import br.com.tcc.tcccardiot21.databinding.ActivityPageBinding
import br.com.tcc.tcccardiot21.domain.SubTopic
import br.com.tcc.tcccardiot21.domain.Topic
import br.com.tcc.tcccardiot21.extension.getSerializable
import br.com.tcc.tcccardiot21.page.presentation.viewmodel.MainViewModel
import br.com.tcc.tcccardiot21.menu.presentation.MenuActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class PageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPageBinding
    private val viewModel: MainViewModel by viewModel()
    private val sectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)
    private var subTopic: SubTopic? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        binding.title.text = "Sobre o app"

        binding.viewPager.adapter = sectionsPagerAdapter

        viewModel.listSubTopic.observe(this) {
            sectionsPagerAdapter.setData(it)
            sectionsPagerAdapter.notifyDataSetChanged()
            binding.indicator.attachToPager(binding.viewPager)
            subTopic?.let { sub ->
                binding.viewPager.currentItem = sectionsPagerAdapter.getPosition(sub)
            }
        }

        val startForResult = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                val topic = result.data?.getSerializable("topic", Topic::class.java)
                subTopic = result.data?.getSerializable("subTopic", SubTopic::class.java)

                binding.title.text = topic?.title
                topic?.let { viewModel.getSubTopics(topic) }
            }
        }

        binding.title.setOnClickListener {
            val intent = Intent(this@PageActivity, MenuActivity::class.java)
            startForResult.launch(Intent(intent))
            overridePendingTransition(R.anim.enter, R.anim.exit)
        }
    }
}