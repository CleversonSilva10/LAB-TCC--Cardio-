package br.com.tcc.tcccardiot21.menu.presentation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import br.com.tcc.tcccardiot21.R
import br.com.tcc.tcccardiot21.databinding.ActivityMenuBinding
import br.com.tcc.tcccardiot21.domain.SubTopic
import br.com.tcc.tcccardiot21.domain.Topic
import br.com.tcc.tcccardiot21.menu.domain.Menu
import br.com.tcc.tcccardiot21.menu.domain.SubMenu


class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        supportActionBar?.hide()

        val menus = listOf(

            Menu(
                topic = Topic.DOWNS_SYNDROME,
                subMenus = listOf(
                    SubMenu(SubTopic.DOWNS_SYNDROME_DEFINITIONS, Topic.DOWNS_SYNDROME),
                    SubMenu(SubTopic.DOWNS_SYNDROME_CHROMOSOMES, Topic.DOWNS_SYNDROME),
                    SubMenu(SubTopic.DOWNS_SYNDROME_CHARACTERISTICS, Topic.DOWNS_SYNDROME),
                    SubMenu(SubTopic.DOWNS_SYNDROME_PROBLEMS, Topic.DOWNS_SYNDROME),
                )
            ),
            Menu(
                topic = Topic.HEART,
                subMenus = listOf(
                    SubMenu(SubTopic.HEART_DEFINITIONS, Topic.HEART),
                    SubMenu(SubTopic.HEART_ANATOMY, Topic.HEART),
                    SubMenu(SubTopic.HEART_BLOOD_CIRCULATION, Topic.HEART),
                    SubMenu(SubTopic.HEART_FUNCTION, Topic.HEART)

                )
            ),
            Menu(
                topic = Topic.CONGENITAL_HEART_DISEASES,
                subMenus = listOf(
                    SubMenu(SubTopic.CONGENITAL_DEFINITIONS, Topic.CONGENITAL_HEART_DISEASES),
                    SubMenu(SubTopic.CONGENITAL_HEART_DISEASES_SYNDROME_HEART_DISEASES, Topic.CONGENITAL_HEART_DISEASES),
                    SubMenu(SubTopic.CONGENITAL_HEART_DISEASES_ATRIOVENTRICULAR_SEPTAL_DEFECT, Topic.CONGENITAL_HEART_DISEASES),
                    SubMenu(SubTopic.CONGENITAL_HEART_DISEASES_COMUNICATION_INTERATRIAL, Topic.CONGENITAL_HEART_DISEASES),
                    SubMenu(SubTopic.CONGENITAL_HEART_DISEASES_COMUNICATION_INTERVENTRICULAR, Topic.CONGENITAL_HEART_DISEASES),
                    SubMenu(SubTopic.CONGENITAL_HEART_DISEASES_DUCT_ARTERIAL_PERSISTENCE, Topic.CONGENITAL_HEART_DISEASES),
                    SubMenu(SubTopic.CONGENITAL_HEART_TRETALOGIA, Topic.CONGENITAL_HEART_DISEASES),
                    SubMenu(SubTopic.CONGENITAL_HEART_DISEASES_PULMONARY_HYPERTENSION, Topic.CONGENITAL_HEART_DISEASES),
                    SubMenu(SubTopic.CONGENITAL_HEART_DISEASES_SYMPTOMS, Topic.CONGENITAL_HEART_DISEASES),
                    SubMenu(SubTopic.CONGENITAL_HEART_DISEASES_RISK_FACTORS, Topic.CONGENITAL_HEART_DISEASES),
                    SubMenu(SubTopic.CONGENITAL_HEART_DISEASES_EXAMS, Topic.CONGENITAL_HEART_DISEASES),
                    SubMenu(SubTopic.CONGENITAL_HEART_DISEASES_TREATMENT, Topic.CONGENITAL_HEART_DISEASES),
                )
            ),
            Menu(
                topic = Topic.PEDIATRIC_INTENSIVE_CARE,
                subMenus = listOf(
                    SubMenu(SubTopic.PEDIATRIC_DEFINITIONS, Topic.PEDIATRIC_INTENSIVE_CARE),
                    SubMenu(SubTopic.PEDIATRIC_INTENSIVE_CARE_ICU_TEAM, Topic.PEDIATRIC_INTENSIVE_CARE),
                    SubMenu(SubTopic.PEDIATRIC_INTENSIVE_CARE_POSTOPERATIVE, Topic.PEDIATRIC_INTENSIVE_CARE)
                )
            ),
            Menu(
                topic = Topic.COMPLICATION_PREVENTION,
                subMenus = listOf(
                    SubMenu(SubTopic.COMPLICATION_PREVENTION_DEFINITIONS, Topic.COMPLICATION_PREVENTION),
                    SubMenu(SubTopic.COMPLICATION_PREVENTION_SURGICAL_WOUND, Topic.COMPLICATION_PREVENTION),
                    SubMenu(SubTopic.COMPLICATION_PREVENTION_BACTERIAL_ENDOCARDITIS, Topic.COMPLICATION_PREVENTION),
                    SubMenu(SubTopic.COMPLICATION_PREVENTION_RESPIRATORY_INFECTIONS, Topic.COMPLICATION_PREVENTION),
                    SubMenu(SubTopic.COMPLICATION_PREVENTION_CALENDARY, Topic.COMPLICATION_PREVENTION),
                    SubMenu(SubTopic.COMPLICATION_PREVENTION_BRONCO, Topic.COMPLICATION_PREVENTION),
                    SubMenu(SubTopic.COMPLICATION_PREVENTION_APNEIA_OBSTRUTIVA, Topic.COMPLICATION_PREVENTION),
                    SubMenu(SubTopic.COMPLICATION_PREVENTION_TRAQUEOSTOMIA, Topic.COMPLICATION_PREVENTION),
                    SubMenu(SubTopic.COMPLICATION_PREVENTION_SINAIS, Topic.COMPLICATION_PREVENTION),
                    SubMenu(SubTopic.COMPLICATION_PREVENTION_NUTRITIONAL_ASPECTS, Topic.COMPLICATION_PREVENTION),
                    SubMenu(SubTopic.COMPLICATION_PREVENTION_GASTROSTOMIA, Topic.COMPLICATION_PREVENTION),
                )
            ),
            Menu(
                topic = Topic.ENGINE_MILESTONES,
                subMenus = listOf(
                    SubMenu(SubTopic.ENGINE_MILESTONES_DEFINITIONS, Topic.ENGINE_MILESTONES),
                    SubMenu(SubTopic.ENGINE_MILESTONES_REFERENCE, Topic.ENGINE_MILESTONES),
                    SubMenu(SubTopic.ENGINE_MILESTONES_ENGINE_DELAY, Topic.ENGINE_MILESTONES),
                    SubMenu(SubTopic.ENGINE_MILESTONES_INTERVATION, Topic.ENGINE_MILESTONES),
                    SubMenu(SubTopic.ENGINE_MILESTONES_STIMULATION, Topic.ENGINE_MILESTONES),
                    SubMenu(SubTopic.ENGINE_MILESTONES_LINKS, Topic.ENGINE_MILESTONES),
                )
            ),
            Menu(
                topic = Topic.SPECIAL_SITUATIONS,
                subMenus = listOf(
                    SubMenu(SubTopic.SPECIAL_SITUATIONS_DEFINITIONS, Topic.SPECIAL_SITUATIONS),
                    SubMenu(SubTopic.SPECIAL_SITUATIONS_GASTROSTOMY, Topic.SPECIAL_SITUATIONS),
                    SubMenu(SubTopic.SPECIAL_SITUATIONS_INFORMATION, Topic.SPECIAL_SITUATIONS),
                    SubMenu(SubTopic.SPECIAL_SITUATIONS_ATTENTION, Topic.SPECIAL_SITUATIONS),
                    SubMenu(SubTopic.SPECIAL_SITUATIONS_TELEFONE, Topic.SPECIAL_SITUATIONS),
                )
            ),
            Menu(topic = Topic.REFERENCIAS),
            Menu(topic = Topic.ABOUT_APP),
            Menu(topic = Topic.CONSCIENTIZAO_SIMBOLOS),


        )

        binding.recycler.adapter = MenuAdapter(list = menus, onClickMenu = {
            val data = Intent()
            data.putExtra("topic", it.topic)
            setResult(RESULT_OK, data)
            finish()
        }, onClickSubMenu = {
            val data = Intent()
            data.putExtra("topic", it.topic)
            data.putExtra("subTopic", it.subTopic)
            setResult(RESULT_OK, data)
            finish()
        })

        binding.view.setOnClickListener { finish() }
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.enter_finish, R.anim.exit_finish)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.enter_finish, R.anim.exit_finish)
    }
}