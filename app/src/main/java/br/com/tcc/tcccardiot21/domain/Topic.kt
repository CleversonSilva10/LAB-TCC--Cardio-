package br.com.tcc.tcccardiot21.domain

import java.io.Serializable

enum class Topic(val title: String) : Serializable {
    DOWNS_SYNDROME("❤ Síndrome de Down (SD)"),
    HEART("❤ O Coração"),
    CONGENITAL_HEART_DISEASES("❤ Cardiopatias Congênitas (CC)"),
    PEDIATRIC_INTENSIVE_CARE("❤ Unidade De Terapia Intensiva Pediátrica (UTIP)"),
    COMPLICATION_PREVENTION("❤ Cuidados e Prevenções"),
    ENGINE_MILESTONES("❤ Crescimento e Desenvolvimento"),
    SPECIAL_SITUATIONS("❤ Apoio aos Pais"),
    REFERENCIAS("❤ Referências Bibliograficas"),
    CONSCIENTIZAO_SIMBOLOS("❤ Conscientização e símbolos"),
    ABOUT_APP("❤ Quem somos nós"),
}

enum class SubTopic(val title: String) : Serializable {

    // region DOWNS_SYNDROME
    DOWNS_SYNDROME_DEFINITIONS("O que é Síndrome de Down?"),
    DOWNS_SYNDROME_CHROMOSOMES("Cromossomos"),
    DOWNS_SYNDROME_CHARACTERISTICS("Características da SD"),
    DOWNS_SYNDROME_PROBLEMS("Problemas de Saúde na SD"),

    // region HEART
    HEART_DEFINITIONS("Átrios e Ventrículos"),
    HEART_ANATOMY("Valvas do coração"),
    HEART_BLOOD_CIRCULATION("Sangue venoso e arterial"),
    HEART_FUNCTION("Função do coração"),

    // region CONGENITAL_HEART_DISEASES
    CONGENITAL_DEFINITIONS("O que é Cardiopatia Congênita?"),
    CONGENITAL_HEART_DISEASES_SYNDROME_HEART_DISEASES("A SD e as Cardiopatias"),
    CONGENITAL_HEART_DISEASES_ATRIOVENTRICULAR_SEPTAL_DEFECT("Defeito do septo atrioventricular (DSAV)"),
    CONGENITAL_HEART_DISEASES_COMUNICATION_INTERATRIAL("Comunicação Interatrial (CIA)"),
    CONGENITAL_HEART_DISEASES_COMUNICATION_INTERVENTRICULAR("Comunicação Intreventricular (CIV)"),
    CONGENITAL_HEART_DISEASES_DUCT_ARTERIAL_PERSISTENCE("Persistência do Canal Arterial (PCA)"),
    CONGENITAL_HEART_TRETALOGIA("Tetralogia de Fallot (T4F)"),
    CONGENITAL_HEART_DISEASES_PULMONARY_HYPERTENSION("Hipertensão Pulmonar e Insuficiência Cardíaca"),
    CONGENITAL_HEART_DISEASES_SYMPTOMS("Sinais e sintomas das CC"),
    CONGENITAL_HEART_DISEASES_RISK_FACTORS("Fatores de risco para CC"),
    CONGENITAL_HEART_DISEASES_EXAMS("Exames"),
    CONGENITAL_HEART_DISEASES_TREATMENT("Tratamento"),

    //region PEDIATRIC_INTENSIVE_CARE
    PEDIATRIC_DEFINITIONS("Após a cirurgia"),
    PEDIATRIC_INTENSIVE_CARE_ICU_TEAM("A Equipe da UTI"),
    PEDIATRIC_INTENSIVE_CARE_POSTOPERATIVE("Fios e tubos"),

    //region COMPLICATION_PREVENTION
    COMPLICATION_PREVENTION_DEFINITIONS("As orientações"),
    COMPLICATION_PREVENTION_SURGICAL_WOUND("Ferida operatória"),
    COMPLICATION_PREVENTION_BACTERIAL_ENDOCARDITIS("Endocardite bacteriana"),
    COMPLICATION_PREVENTION_RESPIRATORY_INFECTIONS("Infecções respiratórias"),
    COMPLICATION_PREVENTION_APNEIA_OBSTRUTIVA("Apnéia obstrutiva do sono"),
    COMPLICATION_PREVENTION_CALENDARY("Calendário de vacinação"),
    COMPLICATION_PREVENTION_BRONCO("Broncoaspiração"),
    COMPLICATION_PREVENTION_TRAQUEOSTOMIA("Traqueostomia"),
    COMPLICATION_PREVENTION_SINAIS("Sinais de dificuldade respiratória"),
    COMPLICATION_PREVENTION_DIFICULDADE("Dificuldade respiratória"),
    COMPLICATION_PREVENTION_NUTRITIONAL_ASPECTS("Aspectos nutricionais"),
    COMPLICATION_PREVENTION_GASTROSTOMIA("Gastrostomia"),



    //region ENGINE_MILESTONES
    ENGINE_MILESTONES_MOTOR("Crescimento e desenvolvimento motor"),
    ENGINE_MILESTONES_DEFINITIONS("Marcos motores"),
    ENGINE_MILESTONES_REFERENCE("Tabela de referência"),
    ENGINE_MILESTONES_ENGINE_DELAY("Atraso motor"),
    ENGINE_MILESTONES_INTERVATION("Intervenção precoce"),
    ENGINE_MILESTONES_STIMULATION("Dicas para a estimulação"),
    ENGINE_MILESTONES_LINKS("Links para estimulação na SD"),

    //region SPECIAL_SITUATIONS
    SPECIAL_SITUATIONS_DEFINITIONS("Os pais e as emoções"),
    SPECIAL_SITUATIONS_GASTROSTOMY("A importância do apoio"),
    SPECIAL_SITUATIONS_INFORMATION("Informações principais da cardiopatia"),
    SPECIAL_SITUATIONS_ATTENTION("Quando procurar ajuda médica?"),
    SPECIAL_SITUATIONS_TELEFONE("Telefone úteis"),




    // region REFERENCIAS
    REFERENCIAS("Referências"),

    // region REFERENCIAS
    CONSCIENTIZAO_SIMBOLOS("Referências"),

    // region ABOUT_APP
    ABOUT_APP("Quem somos nós"),

}