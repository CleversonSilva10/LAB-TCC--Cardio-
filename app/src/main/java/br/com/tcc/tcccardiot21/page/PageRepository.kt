package br.com.tcc.tcccardiot21.page

import br.com.tcc.tcccardiot21.R
import br.com.tcc.tcccardiot21.domain.SubTopic
import br.com.tcc.tcccardiot21.domain.Topic
import br.com.tcc.tcccardiot21.page.presentation.model.Page

class PageRepository {

    fun getSubTopics(topic: Topic): List<SubTopic> {
        return when (topic) {
            Topic.DOWNS_SYNDROME -> {
                listOf(
                    SubTopic.DOWNS_SYNDROME_DEFINITIONS, SubTopic.DOWNS_SYNDROME_CHROMOSOMES,
                    SubTopic.DOWNS_SYNDROME_CHARACTERISTICS,SubTopic.DOWNS_SYNDROME_PROBLEMS,
                )
            }
            Topic.HEART -> {
                listOf(SubTopic.HEART_DEFINITIONS, SubTopic.HEART_ANATOMY,SubTopic.HEART_BLOOD_CIRCULATION,SubTopic.HEART_FUNCTION,)
            }
            Topic.CONGENITAL_HEART_DISEASES -> {
                listOf(
                    SubTopic.CONGENITAL_DEFINITIONS,SubTopic.CONGENITAL_HEART_DISEASES_SYNDROME_HEART_DISEASES, SubTopic.CONGENITAL_HEART_DISEASES_ATRIOVENTRICULAR_SEPTAL_DEFECT,
                    SubTopic.CONGENITAL_HEART_DISEASES_COMUNICATION_INTERATRIAL, SubTopic.CONGENITAL_HEART_DISEASES_COMUNICATION_INTERVENTRICULAR,
                    SubTopic.CONGENITAL_HEART_DISEASES_DUCT_ARTERIAL_PERSISTENCE, SubTopic.CONGENITAL_HEART_TRETALOGIA,SubTopic.CONGENITAL_HEART_DISEASES_PULMONARY_HYPERTENSION,
                    SubTopic.CONGENITAL_HEART_DISEASES_SYMPTOMS, SubTopic.CONGENITAL_HEART_DISEASES_RISK_FACTORS,
                    SubTopic.CONGENITAL_HEART_DISEASES_EXAMS, SubTopic.CONGENITAL_HEART_DISEASES_TREATMENT)
            }
            Topic.PEDIATRIC_INTENSIVE_CARE -> {
                listOf(
                    SubTopic.PEDIATRIC_DEFINITIONS, SubTopic.PEDIATRIC_INTENSIVE_CARE_ICU_TEAM, SubTopic.PEDIATRIC_INTENSIVE_CARE_POSTOPERATIVE)
            }
            Topic.COMPLICATION_PREVENTION -> {
                listOf(
                    SubTopic.COMPLICATION_PREVENTION_DEFINITIONS,SubTopic.COMPLICATION_PREVENTION_SURGICAL_WOUND,SubTopic.COMPLICATION_PREVENTION_BACTERIAL_ENDOCARDITIS,
                    SubTopic.COMPLICATION_PREVENTION_RESPIRATORY_INFECTIONS, SubTopic.COMPLICATION_PREVENTION_CALENDARY,
                    SubTopic.COMPLICATION_PREVENTION_BRONCO, SubTopic.COMPLICATION_PREVENTION_APNEIA_OBSTRUTIVA, SubTopic.COMPLICATION_PREVENTION_TRAQUEOSTOMIA, SubTopic.COMPLICATION_PREVENTION_SINAIS,
                    SubTopic.COMPLICATION_PREVENTION_NUTRITIONAL_ASPECTS,SubTopic.COMPLICATION_PREVENTION_GASTROSTOMIA,
                )
            }
            Topic.SPECIAL_SITUATIONS -> {
                listOf(
                    SubTopic.SPECIAL_SITUATIONS_DEFINITIONS,SubTopic.SPECIAL_SITUATIONS_GASTROSTOMY,
                    SubTopic.SPECIAL_SITUATIONS_INFORMATION,SubTopic.SPECIAL_SITUATIONS_ATTENTION, SubTopic.SPECIAL_SITUATIONS_TELEFONE
                )
            }
            Topic.ENGINE_MILESTONES -> {
                listOf(
                    SubTopic.ENGINE_MILESTONES_MOTOR,SubTopic.ENGINE_MILESTONES_DEFINITIONS,SubTopic.ENGINE_MILESTONES_REFERENCE, SubTopic.ENGINE_MILESTONES_ENGINE_DELAY,
                    SubTopic.ENGINE_MILESTONES_INTERVATION,SubTopic.ENGINE_MILESTONES_STIMULATION,
                    SubTopic.ENGINE_MILESTONES_LINKS
                )
            }
            Topic.REFERENCIAS -> {
                listOf(SubTopic.REFERENCIAS)
            }
            Topic.CONSCIENTIZAO_SIMBOLOS -> {
                listOf(SubTopic.CONSCIENTIZAO_SIMBOLOS)
            }
            Topic.ABOUT_APP -> {
                listOf(SubTopic.ABOUT_APP)
            }
        }
    }

    fun getPage(subTopic: SubTopic): List<Page> {
        return when (subTopic) {
            SubTopic.DOWNS_SYNDROME_DEFINITIONS -> {
                listOf(
                    Page.Header("O QUE É SÍNDROME DE DOWN?"),
                    Page.Description("A Síndrome de Down (SD) também conhecida por trissomia 21 (T21) é uma condição genética que ocorre geralmente quando um indivíduo possui uma cópia extra do cromossomo 21."),
                    Page.Description("Após a fecundação do óvulo,  na divisão celular tipicamente estão presente 46 cromossomos, já na SD haverá um cromossomo extra resultando um indivíduo com 47 cromossomos."),
                    Page.Description("É a  síndrome genética mais comum, uma em cada 700 crianças que nascem no mundo tem Síndrome de Down.")
                )
            }
            SubTopic.DOWNS_SYNDROME_CHROMOSOMES -> {
                listOf(
                    Page.Header("O QUE SÃO CROMOSSOMOS?"),
                    Page.Description("São pequenas estruturas localizadas no interior das nossas células que carregam nossas informações genéticas, por exemplo: cor dos olhos, tipo sanguíneo, altura, dentre outros."),
                    Page.Description("O material genético  adicional na SD  altera o curso do desenvolvimento do bebê no período gestacional  e causa as características associadas à síndrome.")
                )
            }
            SubTopic.DOWNS_SYNDROME_CHARACTERISTICS -> {
                listOf(
                    Page.Header("QUAIS SÃO AS CARACTERÍSTICAS DOS BEBÊS E CRIANÇAS COM SÍNDROME DE DOWN?"),
                    Page.Description("Os bebês ou crianças com SD apresentam características peculiares, como a hipotonia (tônus muscular diminuído). Eles são bebês mais molinhos (hipotônicos) e por isso, levam mais tempo para conseguir sustentar a cabeça, sentar, engatinhar e andar.  Eles também podem ter dificuldades para falar e comer. Porém, os estímulos adequados iniciados o mais cedo possível auxiliam o bom desenvolvimento."),
                    Page.Header("A CRIANÇA COM SÍNDROME DE DOWN TEM DIFICULDADE PARA APRENDER?"),
                    Page.Description("A SD afeta a capacidade das crianças de aprender pois  elas  têm comprometimento intelectual leve a moderado. Mas elas podem aprender e desenvolver  muitas habilidades  em seu próprio tempo durante sua vida,  por isso não  se deve compará-las com outras crianças com ou sem SD.")
                )
            }
            SubTopic.DOWNS_SYNDROME_PROBLEMS -> {
                listOf(
                    Page.Header("QUAIS SÃO OS PROBLEMAS DE SAÚDE MAIS COMUNS NA SD?"),
                    Page.Description("Algumas crianças com SD podem apresentar algumas alterações em sua saúde, necessitando de cuidados e acompanhamento especializado. Dentre os problemas mais comuns estão: as cardiopatias congênitas, os  problemas respiratórios, endocrinológicos, gastrointestinais, visual, auditivo e de crescimento."),
                    Page.Description("Dependendo da condição de saúde o tratamento é especializado e  pode ser necessário iniciar quando a criança ainda é bem pequena."),
                    Page.Description("Além do acompanhamento médico especializado geralmente a criança com SD precisa de fisioterapia, fonoaudiologia, terapia ocupacional, nutricionista, dentista, psicólogo, entre outros."),
                )
            }
            SubTopic.HEART_DEFINITIONS -> {
                listOf(
                    Page.Header("O CORAÇÃO"),
                    Page.Description("O coração é um músculo que se divide em quatro câmaras:\n\n" +
                            "- Dois átrios na parte superior\n\n" +
                            "- Dois ventrículos na parte inferior"),
                    Page.Image(R.drawable.figura01),
                    Page.Description("Há  dois septos (parede)  separando o lado direito e esquerdo do coração,  ou seja, eles separam o átrio direito  do  átrio esquerdo e o ventrículo direito  do ventrículo esquerdo.\n" +
                            "Os septos  não permitem  que o sangue venoso e arterial se misturem dentro das câmaras cardíacas."),

                )
            }
            SubTopic.HEART_ANATOMY -> {
                listOf(
                    Page.Header("VALVAS DO CORAÇÃO"),
                    Page.Description("O coração possui 4 valvas: tricúspide, mitral, pulmonar e aórtica."),
                    Page.Image(R.drawable.figura03),
                    Page.Description("As valvas do coração separam as câmaras atriais das ventriculares e os ventrículos das grandes artérias (aorta e pulmonar)."),
                    Page.Description("As valvas funcionam como se fossem portas que se abrem e se fecham e têm a função de  garantir que o sangue flua em uma única direção correta."),
                    Page.Description("Os problemas que podem afetar as valvas cardíacas são: \n" +
                            "- Estenose (estreitamento) da valva, quando ela não se abre completamente impedindo o sangue de fluir; \n" +
                            "- Insuficiência (frouxidão) da valva, quando ela não se fecha completamente  fazendo com que ocorra o retorno do fluxo sanguíneo para os átrios ou ventrículos, assim o sangue não segue a direção correta."),
                    Page.Description("")

                )
            }
            SubTopic.HEART_BLOOD_CIRCULATION -> {
                listOf(
                    Page.Header("SANGUE VENOSO E ARTERIAL"),
                    Page.Description("O átrio  e o ventrículo direito (em azul) recebem do corpo, o sangue venoso, que é pobre em oxigênio."),
                    Page.Description("O átrio e ventrículo esquerdo (em vermelho) recebem  dos pulmões, sangue arterial, que é  rico em oxigênio."),
                    Page.Description("Se existirem orifícios (buraquinhos) nos septos ou se os septos estiverem ausentes ocorrerá  mistura de sangue arterial e venoso e isso não é normal."),
                    Page.Description("Estes orifícios recebem o nome de  Comunicação."),
                    Page.Image(R.drawable.figura01),
                )
            }
            SubTopic.HEART_FUNCTION -> {
                listOf(
                    Page.Header("FUNÇÕES DO CORAÇÃO"),
                    Page.Description("O coração usa seus lados esquerdo e direito para diferentes tarefas:"),
                    Page.Description("O lado direito do coração (ventrículo direito) move o sangue venoso para os pulmões através das artérias pulmonares. Nos pulmões, o sangue capta oxigênio e retorna ao lado esquerdo do coração através das veias pulmonares."),
                    Page.Description("O lado esquerdo do coração(ventrículo esquerdo) bombeia o sangue  arterial levando oxigênio para todo o corpo através da artéria principal do corpo, a artéria Aorta."),
                    Page.Image(R.drawable.figcoracaonew),
                    Page.Description("Em condições normais o sangue venoso e arterial não se misturam e o fluxo sanguíneo não encontra barreiras para fluir ou  não flui de volta para a câmara de onde saiu.")
                )
            }
            SubTopic.CONGENITAL_DEFINITIONS -> {
                listOf(
                    Page.Header("O QUE SÃO CARDIOPATIAS CONGÊNITAS?"),
                    Page.Description("As cardiopatias congênitas são defeitos no coração presentes ao nascimento, eles  podem ser defeitos simples ou muito complexos. Alguns destes defeitos podem apenas precisar de acompanhamento médico, mas a grande maioria irá precisar de tratamento cirúrgico e acompanhamento médico ao longo da vida."),
                    Page.Header("O QUE SÃO DOENÇAS CONGÊNITAS?"),
                    Page.Description("São os defeitos que ocorrem durante o período gestacional quando o bebê está se desenvolvendo, não há causas específicas para que elas ocorram, mas a combinação de problemas genéticos associados a fatores como medicamentos, substâncias nocivas à saúde ou uma doença crônica materna podem facilitar o aparecimento das doenças congênitas no feto."),
                    Page.Header("ONDE  PODEM ESTAR  LOCALIZADOS OS DEFEITOS NO CORAÇÃO?"),
                    Page.Description("Os defeitos cardíacos podem se localizar nas artérias, nas valvas ou nos septos (paredes) que separam o lado direito do lado esquerdo do coração. \n" +
                            "\n" +
                            "Em  algumas cardiopatias, o sangue arterial flui do lado esquerdo para o lado direito do coração e acaba sobrecarregando os pulmões de sangue.\n" +
                            "\n" +
                            "Já em outras ocasiões, a cardiopatia faz com que o sangue venoso flua do lado direito para o lado esquerdo resultando em diminuição na  quantidade de oxigênio enviada para os órgãos do corpo."),
                )

            }
            SubTopic.CONGENITAL_HEART_DISEASES_SYNDROME_HEART_DISEASES -> {
                listOf(
                    Page.Header("CARDIOPATIA CONGÊNITA"),
                    Page.Description("É a alteração congênita mais comum nos recém-nascidos, uma em cada 100 crianças que nascem no Brasil tem cardiopatia congênita."),
                    Page.Header("SÍNDROME DE DOWN E CARDIOPATIA CONGÊNITA"),
                    Page.Description("50% das crianças com SD tem cardiopatia congênita. \n" + "O tratamento adequado, no tempo certo, oferece a elas chance de melhor desenvolvimento e de vida saudável."),
                    Page.Header("POR QUE A SÍNDROME DE DOWN ESTÁ ASSOCIADA ÀS CARDIOPATIAS CONGÊNITAS?"),
                    Page.Description("A cópia extra do cromossomo 21 que as crianças com SD têm, provavelmente desempenha um papel importante  no desenvolvimento de defeitos cardíacos. Algumas pesquisas mostram que a mutação de determinado gene ou a ausência de algum material genético se associam com as cardiopatias congênitas."),
                    Page.Header("QUAIS SÃO OS DEFEITOS CARDÍACOS MAIS ENCONTRADOS EM BEBÊS COM SÍNDROME DE DOWN?"),
                    Page.Description("O defeito cardíaco mais comum em crianças com SD é o defeito do septo atrioventricular (DSAV), que caracteriza-se por um grande orifício no centro do coração. \n" +
                            "Outras cardiopatias comuns são a Comunicação interventricular (CIV), Persistência do canal arterial (PCA) e a Tetralogia de Fallot (T4F)."),

                    )

            }
            SubTopic.CONGENITAL_HEART_DISEASES_ATRIOVENTRICULAR_SEPTAL_DEFECT -> {
                listOf(
                    Page.Header("DEFEITO DO SEPTO ATRIOVENTRICULAR (DSAV)"),
                    Page.Description("É a cardiopatia mais comum na SD. \n" +
                            "Nesta cardiopatia os septos e as valvas que separam as câmaras cardíacas se desenvolvem de maneira incompleta  ou simplesmente não são formados, permitindo que o sangue arterial se misture com o sangue venoso.\n" +
                            "Os orifícios (buraquinhos) no septo entre os átrios recebe o nome de comunicação interatrial (CIA) e entre os ventrículos se chamam de comunicação interventricular (CIV). \n" +
                            "\n" +
                            "Uma das complicações deste defeito é aumento das pressões pulmonares (hipertensão pulmonar), que faz o coração  trabalhar com mais força, fazendo com que o músculo cardíaco se enfraqueça (insuficiência cardíaca). \n" +
                            "O tratamento desta cardiopatia é cirúrgico e é realizado antes do bebê completar seu primeiro ano de vida. \n" +
                            "\n" +
                            "O DSAV tem muitas variações e pode ser  do tipo total ou  parcial ou intermediário."),
                    Page.Image(R.drawable.figura05),
                    Page.Description("Defeito do septo atrioventricular total (DSAVT)"),
                    Page.Description("Na cor azul o sangue venoso, na cor vermelha o sangue arterial e na cor roxa o sangue venoso e arterial que se misturam por causa dos defeitos no coração."),
                )
            }
            SubTopic.CONGENITAL_HEART_DISEASES_COMUNICATION_INTERATRIAL -> {
                listOf(
                    Page.Header("COMUNICAÇÃO INTERATRIAL (CIA)"),
                    Page.Description("Nesta cardiopatia existe um orifício (buraquinho) no septo (parede) que separa o átrio direito do átrio esquerdo, com isso, o sangue arterial (rico em oxigênio) se mistura ao sangue venoso (pobre em oxigênio), fluindo, desta forma, maior quantidade de sangue do que o esperado para os pulmões."),
                    Page.Description("O tratamento da CIA pode ser  cirúrgico ou por  cateterismo cardíaco  mas em alguns casos pode ocorrer o fechamento espontâneo deste orifício(buraquinho) entre os átrios." ),
                    Page.Image(R.drawable.figura06),
                    Page.Description("Comunicação interatrial (CIA). Na cor azul o sangue venoso e na cor vermelha o sangue arterial. A seta indica a passagem do sangue arterial do átrio esquerdo para o átrio direito pela CIA." ),
                )
            }
            SubTopic.CONGENITAL_HEART_TRETALOGIA -> {
                listOf(
                    Page.Header("TETRALOGIA DE FALLOT"),
                    Page.Description("Nesta cardiopatia são encontradas 4 alterações no coração da criança."),
                    Page.Description("- Estenose (estreitamento) da valva pulmonar que dificulta a passagem do sangue do ventrículo direito para os pulmões para ser oxigenado;\n\n" +
                            "- Comunicação interventricular (CIV) é um orifício na parede (septo) que separa os ventrículos esquerdo e direito. O sangue venoso (pobre em oxigênio) se mistura com o sangue arterial (rico em oxigênio). Esta mistura de sangue diminui o suprimento de oxigênio para o corpo; \n\n" +
                            "- Artéria aorta posicionada com desvio à direita;\n\n" +
                            "- Hipertrofia da parede do ventrículo direito, que fica mais grossa e endurecida e precisa fazer mais força para bombear o sangue para os pulmões deixando o coração mais fraco com o tempo."),
                    Page.Image(R.drawable.figura09),
                    Page.Description("Tetralogia de Fallot. Na cor azul o sangue venoso, na cor vermelha o sangue arterial e na cor roxa o sangue venoso e arterial que se misturam  por causa dos defeitos no coração. A seta indica a passagem do sangue venoso  do ventrículo direito para o ventrículo esquerdo  pela comunicação interventricular (CIV)."),
                    Page.Description("Na Tetralogia de Fallot  os bebês apresentam cianose (coloração arroxeada da pele) de grau variado, pois o sangue que é enviado aos seus órgãos e ao seu corpo tem menos oxigênio."),
                    Page.Description("O tratamento desta cardiopatia é cirúrgico."),
                    Page.Image(R.drawable.figura10),
                    Page.Description("Bebê com as  extremidades do corpo de coloração arroxeada que é conhecido por cianose"),

                    )
            }
            SubTopic.CONGENITAL_HEART_DISEASES_COMUNICATION_INTERVENTRICULAR -> {
                listOf(
                    Page.Header("COMUNICAÇÃO INTERVENTRICULAR (CIV)"),
                    Page.Description("Nesta cardiopatia, o septo que separa o ventrículo direito do esquerdo se forma de maneira incompleta ou pode ocorrer  um ou mais orifícios (buraquinhos) de diversos tamanhos no septo. Com isso, o sangue arterial (rico em oxigênio) se mistura ao sangue  venoso (pobre em oxigênio) e  flui maior quantidade de sangue para os pulmões do que o normal.\n" +
                            "\n" + "Com o tempo, isto causa aumento das pressões pulmonares (hipertensão pulmonar) e  faz o coração do bebê precisar trabalhar com  mais força  enfraquecendo o seu coração (insuficiência cardíaca).\n" +
                            "Geralmente o tratamento desta cardiopatia é cirúrgico."),
                    Page.Image(R.drawable.figura07),
                    Page.Description("Comunicação interventricular (CIV). Na cor azul o sangue venoso e na cor vermelha o sangue arterial. A seta indica a passagem do sangue arterial do ventrículo esquerdo para o ventrículo direito pela CIV."),
                )
            }
            SubTopic.CONGENITAL_HEART_DISEASES_DUCT_ARTERIAL_PERSISTENCE -> {
                listOf(
                    Page.Header("PERSISTÊNCIA DO CANAL ARTERIAL (PCA)"),
                    Page.Description("O canal arterial é um vaso sanguíneo que liga duas artérias do coração do feto: a artéria pulmonar e a artéria aorta. Este canal é necessário para a circulação sanguínea durante a vida fetal.\n" +
                            "Após o nascimento do bebê, em algumas horas de vida, o canal se fecha. Quando isto não acontece, origina-se a cardiopatia congênita denominada persistência do canal arterial (PCA).\n" +
                            "Nessa cardiopatia parte do sangue arterial na artéria aorta flui para a artéria pulmonar, esta quantidade extra de sangue sobrecarrega a circulação pulmonar fazendo com que o coração do bebê tenha um trabalho extra e com o tempo se enfraqueça. \n" +
                            "O tratamento dependerá do tamanho do canal arterial, em algumas situações ele pode se fechar espontaneamente, mas em outras pode precisar de medicamentos ou de  correção cirúrgica para se fechar."),
                    Page.Image(R.drawable.figura08),
                    Page.Description("Persistência do canal Arterial (PCA)"),
                    Page.Description("Na cor azul o sangue venoso e na cor vermelha o sangue arterial."),
                    Page.Description("A seta indica a passagem do sangue arterial da artéria aorta para as artérias pulmonares pelo canal arterial que não se fechou (PCA)."),
                )
            }
            SubTopic.CONGENITAL_HEART_DISEASES_PULMONARY_HYPERTENSION -> {
                listOf(
                    Page.Header("O QUE SIGNIFICA HIPERTENSÃO PULMONAR (HP)"),
                    Page.Description("A HP é a pressão alta nos pulmões, que força o coração a trabalhar mais.  Na criança com SD ela é uma complicação que aparece muito cedo, comumente associada às cardiopatias congênitas DSAV, CIV e PCA e decorrentes das alterações do seu sistema respiratório. O tratamento da HP é determinado pelo médico e envolve a correção da cardiopatia, medicamentos, oxigenoterapia e óxido nítrico."),
                    Page.Header("O QUE É INSUFICIÊNCIA CARDÍACA (IC)?"),
                    Page.Description("O coração é um músculo que bombeia sangue arterial (rico em oxigênio) para todo o corpo. Na IC, o coração  enfraquecido não consegue bombear o sangue como deveria e isto faz com que algumas partes do corpo não recebam o  sangue arterial para funcionar normalmente. O tratamento é determinado pelo médico com conduta específica para cada caso e envolve a correção da cardiopatia, medicamentos ou indicação de marcapasso."),
                )
            }
            SubTopic.CONGENITAL_HEART_DISEASES_SYMPTOMS -> {
                listOf(
                    Page.Header("QUAIS SÃO OS SINTOMAS MAIS COMUNS DAS CARDIOPATIAS CONGÊNITAS?"),
                    Page.Description("Os sintomas são variáveis e dependem de alguns fatores como o tipo de cardiopatia, o tamanho do defeito cardíaco, a idade da criança, insuficiência cardíaca, hipertensão pulmonar entre outros fatores.\n" +
                            "Geralmente são: \n\n" +
                            "- Frequência cardíaca elevada (coração mais acelerado) \n\n" +
                            "- Frequência respiratória elevada (respiração mais rápida)\n\n" +
                            "- Dificuldade para respirar\n\n" +
                            "- Cansaço durante as mamadas\n\n" +
                            "- Saturação de oxigênio menor que o normal (<95%)\n\n" +
                            "- Dificuldade de ganhar peso e problemas de crescimento\n\n" +
                            "- Infecções respiratórias repetitivas: pneumonias, bronquiolite, broncopneumonias. \n\n" +
                            "- Cianose ou a coloração arroxeada da pele (bebê roxo) indicando que não há oxigênio suficiente no sangue\n\n" +
                            "- Cansaço aos esforços por exemplo: correr, brincar ou exercícios físicos.")
                )
            }
            SubTopic.CONGENITAL_HEART_DISEASES_RISK_FACTORS -> {
                listOf(
                    Page.Header("QUAIS SÃO OS PRINCIPAIS FATORES DE RISCO PARA O DESENVOLVIMENTO DAS CARDIOPATIAS CONGÊNITAS?"),
                    Page.Description("Para a população em geral não existe uma causa exata para que ocorra um defeito no coração do feto, porém há fatores de risco como: rubéola gestacional, diabetes mellitus, algumas medicações, consumo de bebidas alcoólicas e cigarros durante a gestação, história familiar e genética.\n" +
                            "\n" + "No caso da SD, o fator determinante para a presença de cardiopatias é genético.")
                )
            }
            SubTopic.CONGENITAL_HEART_DISEASES_EXAMS -> {
                listOf(
                    Page.Header("O DIAGNÓSTICO DA CARDIOPATIA CONGÊNITA PODE SER FEITO ANTES DO BEBÊ NASCER?"),
                    Page.Description("Sim, a cardiopatia congênita pode ser descoberta no período gestacional, mas nem sempre isso é possível e muitas vezes o diagnóstico só se confirma após o nascimento da criança."),
                    Page.Header("O QUE É ECOCARDIOGRAMA (ECO) FETAL?"),
                    Page.Description("O eco fetal é um exame de imagem realizado em gestantes de risco ou com  história familiar de cardiopatia congênita. Esse exame utiliza ondas sonoras para avaliar o funcionamento do coração do feto e identifica as cardiopatias congênitas."),
                    Page.Header("CASO O DIAGNÓSTICO DA SD SEJA FEITO NO PERÍODO GESTACIONAL É INDICADO À GESTANTE  FAZER O  ECO FETAL?"),
                    Page.Description("Sim, o eco fetal  pode ser feito a partir da 18º e 21º semanas de gestação ou  mais tarde quando o seu médico melhor determinar."),
                    Page.Header("'EM JUNHO DE 2023 FOI APROVADA A LEI QUE TORNA OBRIGATÓRIA A REALIZAÇÃO DE ECOFETAL A TODAS AS GESTANTES.'"),
                    Page.Header("O QUE É ECOCARDIOGRAMA E QUANDO DEVE SER INDICADO?"),
                    Page.Description("O ecocardiograma é o exame diagnóstico recomendado pelo ministério da saúde para as crianças com SD. É um exame que utiliza ondas sonoras para verificar como o coração e as valvas estão funcionando e detectar se há alterações nestas estruturas.\n" +
                            "\n" + "Nem todas as crianças com SD são diagnosticadas durante a gestação, porém quando o diagnóstico for feito após o nascimento, está indicado fazer o ecocardiograma no 1º mês de vida para verificar se há defeitos cardíacos."),
                    Page.Header("QUAIS SÃO OS OUTROS EXAMES QUE AJUDAM NO DIAGNÓSTICO DAS CARDIOPATIAS CONGÊNITAS?"),
                    Page.Description("São eles: \n" +
                            "- Eletrocardiograma (ECG): exame que registra a atividade elétrica do coração e o ritmo cardíaco;\n\n" +
                            "- Raio-x do tórax: pode ser feito para verificar se há uma quantidade excessiva de sangue nos pulmões ou se o coração é maior que o normal, ambos podem ser sinais de doença cardíaca;\n\n" +
                            "- Cateterismo cardíaco: É um exame feito sob anestesia que fornece mais detalhes sobre a cardiopatia, pois verifica como o sangue está sendo bombeado, as pressões no coração, a forma e a função das  câmaras cardíacas e dos vasos do coração. Este exame só é indicado em alguns casos de cardiopatia congênita, nem todas as crianças necessariamente  precisarão realizá-lo."),
                    Page.Header("SATURAÇÃO DE OXIGÊNIO"),
                    Page.Description("É uma medida da quantidade de oxigênio em nosso sangue. \n" +
                            "Nossos órgãos e tecidos precisam de  uma quantidade adequada de  oxigênio para funcionar."),
                    Page.Header("COMO ELA PODE SER VERIFICADA?"),
                    Page.Description("A saturação de oxigênio pode ser verificada com uma amostra de sangue arterial, pela gasometria arterial ou por um oxímetro que é um sensor geralmente colocado no dedo, na orelha ou no pé da criança."),
                    Page.Header("QUAL O VALOR NORMAL DA SATURAÇÃO DE OXIGÊNIO?"),
                    Page.Description("Os níveis normais de saturação de oxigênio para crianças e adultos fica entre 95% e 100%, na presença de algumas cardiopatias congênitas ou nas doenças respiratórias a saturação de oxigênio pode se encontrar mais baixa que estes valores."),
                    Page.Header("TESTE DO CORAÇÃOZINHO"),
                    Page.Description("É um teste rápido e indolor feito na maternidade. \n" +
                            "Ele verifica a saturação de oxigênio, ou seja, a  quantidade de oxigênio presente no sangue do recém-nascido por um  sensor do oxímetro colocado na mão direita e no pé.\n" +
                            "Este teste é capaz de detectar a cardiopatia congênita grave."),
                    )
            }
            SubTopic.CONGENITAL_HEART_DISEASES_TREATMENT -> {
                listOf(
                    Page.Header("PARA QUE  SERVEM OS MEDICAMENTOS PARA O TRATAMENTO DA CARDIOPATIA CONGÊNITA?"),
                    Page.Description("Crianças com  cardiopatia congênita  geralmente tomam  medicamentos antes e após suas cirurgias.\n" +
                            "O cardiologista pediátrico irá determinar se há necessidade de medicações, a dosagem e o tempo que a criança irá precisar da medicação. \n\n" +
                            "É muito  importante seguir à risca as orientações fornecidas pelo médico quanto à dose e ao horário de dar o medicamento para evitar  o esquecimento. \n" +
                            "Alguns medicamentos, por exemplo, são para ajudar no funcionamento do coração, já outros ajudam a baixar a pressão ou reduzir o acúmulo de líquido no corpo."),
                    Page.Header("'SIGA SEMPRE AS RECOMENDAÇÕES MÉDICAS'"),
                    Page.Header("TODAS AS CARDIOPATIAS CONGÊNITAS PRECISAM DE TRATAMENTO CIRÚRGICO?"),
                    Page.Description("- A maioria das cardiopatias congênitas precisam de correção cirúrgica.\n" +
                            "- Alguns defeitos cardíacos precisam ser corrigidos logo após o nascimento,  enquanto  outros são corrigidos  após meses ou anos de vida. \n" +
                            "- Há cardiopatias que são corrigidas por cateterismo cardíaco.\n" +
                            "- A equipe médica que acompanha a criança  determinará o melhor tratamento a ser seguido."),
                )
            }
            SubTopic.PEDIATRIC_DEFINITIONS -> {
                listOf(
                    Page.Header("O QUE ACONTECE LOGO APÓS A CIRURGIA?"),
                    Page.Description("Após a cirurgia cardíaca, as crianças são transferidas para a UTIP para se recuperarem e serem acompanhadas de perto pela equipe composta por profissionais qualificados no cuidado pós-operatório das áreas de medicina, enfermagem, fisioterapia, nutrição, fonoaudiologia, psicólogia, farmácia, entre outros. A equipe da UTIP manterá você informado sobre o progresso e  explicará o plano de tratamento para a recuperação de seu(a) filho (a)."),
                    Page.Description("Na UTIP as necessidades de seu(a) filho(a) serão atendidas pela equipe multiprofissional.\n" +
                            "Você estará lá para fornecer o apoio emocional, amor,  uma voz ou toque familiar para a criança. \n" +
                            "Afastar-se brevemente da UTIP ou até mesmo sair do hospital pode ajudá-lo(a) a organizar seus pensamentos, descansar e se revigorar para dar mais conforto a seu(a) filho(a)."),
                )
            }
            SubTopic.PEDIATRIC_INTENSIVE_CARE_ICU_TEAM -> {
                listOf(
                    Page.Header("QUAL O PAPEL DOS PROFISSIONAIS DA UTIP PARA A RECUPERAÇÃO DO BEBÊ OU DA CRIANÇA COM SD E CARDIOPATIA?"),
                    Page.Description("Os profissionais da UTIP trabalham de forma integrada e estabelecem objetivos comuns e prioritários para a recuperação e o bem-estar do seu(a) filho(a) no pré ou no pós-operatório de cardiopatia congênita, porém cada profissional tem  inúmeras atribuições específicas, apenas algumas dessas  são citadas abaixo:\n" +
                            "\n" +
                            "- Médica(o)intensivista: Estão presente 24 horas na UTIP;  monitoram e coordenam o tratamento para a recuperação do bebê e da criança em pré e pós operatório de cardiopatia congênita\n" +
                            "\n" +
                            "- Enfermeira(o): presente em todos os momentos da internação da criança, participam e controlam todos os processos, acompanham todas as ações da equipe multidisciplinar, sinalizam estados de descompensação da criança, coordenam os técnicos de enfermagem\n" +
                            "\n" +
                            "- Técnica(o) de Enfermagem: checam os sinais vitais, preparam e administram as medicações, cuidados de banho e alimentação, dentre outros\n" +
                            "\n" +
                            "- Fisioterapeuta: monitoram, previnem e tratam as condições respiratórias e musculoesqueléticas; em conjunto com a equipe médica atuam no suporte ventilatório e oxigenoterapia; estimulam o desenvolvimento motor do bebê e da criança com risco de sequelas motoras ou atraso motor\n" +
                            "\n" +
                            "- Fonoaudióloga(o): trabalham principalmente com as dificuldades de coordenação de sucção-respiração-deglutição, nas alterações na fala ou na  voz e prestam assistência na amamentação principalmente de bebês cardiopatas que não puderam  vivenciá-la por dificuldades que limitaram o aleitamento materno\n" +
                            "\n" +
                            "- Nutricionista: faz o aporte nutricional para promover a energia necessária para as atividades e o crescimento da criança, em conjunto com a equipe médica definem  a oferta calórica e proteica, o volume, a frequência da dieta\n" +
                            "\n" +
                            "- Psicóloga(o): atendimento aos familiares e aos pacientes propiciando a expressão dos sentimentos, medos e angústias  causados pela internação hospitalar")
                )
            }
            SubTopic.PEDIATRIC_INTENSIVE_CARE_POSTOPERATIVE -> {
                listOf(
                    Page.Header("QUAL É A FUNÇÃO DOS FIOS E TUBOS  NA CRIANÇA  EM PÓS OPERATÓRIO NA UTIP?"),
                    Page.Description("No pós-operatório você verá vários tubos e fios conectados no corpo do(a) seu(a) filho(a), eles possuem diferentes funções e alarmes programados que auxiliam na monitorização contínua da criança.\n" +
                            "- Fios para a monitorização da frequência cardíaca, respiratória, pressão e saturação de oxigênio \n\n" +
                            "- Vias para o fornecimento de medicações\n\n" +
                            "- Sonda para o esvaziamento do estômago ou para a alimentação\n\n" +
                            "- Tubo para a respiração\n\n" +
                            "- Sonda para a drenagem e mensuração da quantidade de urina\n\n" +
                            "- Drenos no tórax para drenagem de  sangue, líquidos ou ar."),
                    Page.Description("A  medida que  a criança se  recupera esses fios e tubos são removidos.\n\n" +
                            "O tempo que a criança permanece na UTIP após a cirurgia cardiovascular é variável, isto é, depende de vários fatores.\n" +
                            "Uma vez estável, a criança será transferida para a enfermaria onde continuará recebendo cuidados da equipe do hospital."),
                    Page.Header("'COMPREENDER A FUNÇÃO DOS PROFISSIONAIS E OS EQUIPAMENTOS DA UTIP \n" +
                            "PODE AJUDÁ-LO A SENTIR - SE MAIS PREPARADO PARA AJUDAR SEU(A) FILHO(A).'"),
                )
            }
            SubTopic.COMPLICATION_PREVENTION_DEFINITIONS -> {
                listOf(
                    Page.Header("CUIDADOS E PREVENÇÕES DE COMPLICAÇÕES"),
                    Page.Description("No período pós-operatório a criança se torna  mais vulnerável a infecções ou  a outras complicações."),
                    Page.Description("A equipe do hospital fornecerá à você orientações essenciais a respeito dos  cuidado com a ferida operatória (cicatriz), dieta, medicamentos, atividades que  são permitidas, retorno a consultas de acompanhamento antes da alta hospitalar,  seguir estas orientações ajudará a evitar as complicações que podem ocorrer."),
                    Page.Description("No momento das orientações fique a vontade para tirar suas dúvidas também.")
                )
            }
            SubTopic.COMPLICATION_PREVENTION_SURGICAL_WOUND -> {
                listOf(
                    Page.Header("CUIDADOS COM  A FERIDA OPERATÓRIA"),
                    Page.Description("A ferida operatória (cicatriz) está localizada no tórax da criança.\n\n" +
                            "A incisão para a cirurgia de correção de cardiopatia congênita geralmente é feita no osso esterno.\n\n" +
                            "Este osso  levará algum tempo, de 2 a 3 meses para ficar estável."),
                    Page.Image(R.drawable.figura11),
                    Page.Description("Incisão no  tórax, no osso esterno, este é o local da cicatriz após a cirurgia."),
                    Page.Description("Para garantir a cicatrização uniforme desta  ferida é preciso alguns cuidados: \n\n" +
                            "- Seguir as orientações fornecidas pela equipe de enfermagem sobre a higienização da ferida operatória\n\n" +
                            "- Evite atividades que tracionem ou comprimam o local da cicatriz ou colocar o bebê de barriga para baixo nas primeiras semanas após a cirurgia\n\n" +
                            "- Após a alta hospitalar se você observar sinais de vermelhidão, inchaço ou saída de secreção da cicatriz comunique  a enfermeira ou ao médico."),
                    Page.Description("Por 2 a 3 meses após a cirurgia  ao  pegar seu(a) filho(a) no colo coloque o seu  braço em volta da cabeça e  o outro em volta do bumbum ou das coxas, não levante seu(a) filho(a) por debaixo dos braços, pois isso estica a ferida operatória. Quando você for para casa, é importante que você ensine a qualquer pessoa que possa pegar seu bebê como fazê-lo corretamente."),
                            Page.Image(R.drawable.figura12),
                    Page.Description("Maneira adequada de  levantar a criança após a cirurgia"),
                )
            }
            SubTopic.COMPLICATION_PREVENTION_BACTERIAL_ENDOCARDITIS -> {
                listOf(
                    Page.Header("ENDOCARDITE BACTERIANA"),
                    Page.Description("As bactérias que causam cáries nos dentes podem viajar para o coração pela corrente sanguínea e causar uma infecção chamada endocardite nas valvas do coração."),
                    Page.Header("COMO PREVENIR A ENDOCARDITE BACTERIANA?"),
                    Page.Description("O cuidado com os dentes é fundamental: a higiene oral e a visita regular ao dentista, que deve ser informado sobre a cardiopatia da criança, são estratégias na prevenção de endocardite bacteriana.")
                )
            }
            SubTopic.COMPLICATION_PREVENTION_RESPIRATORY_INFECTIONS -> {
                listOf(
                    Page.Header("COMO PREVENIR AS INFECÇÕES RESPIRATÓRIAS?"),
                    Page.Description("Reduzir a  exposição  a doenças respiratórias requer medidas simples como a  higiene das mãos com água e sabão e evitar multidões, principalmente durante os meses de inverno, quando as crianças ficam mais suscetíveis ao vírus sincicial respiratório (VSR) que causa  a bronquiolite e ao vírus e influenza causador da gripe."),
                    Page.Header("POR QUE A CRIANÇA COM SD E CARDIOPATIA CONGÊNITA É  PROPENSA  AS INFECÇÕES RESPIRATÓRIAS?"),
                    Page.Description("As cardiopatias que levam uma maior quantidade de fluxo sanguíneo aos pulmões do que o normal como a DSAV, CIV, PCA e CIA deixam os pulmões mais úmidos ou congestos e propiciam as infecções respiratórias. \n" +
                            "As alterações do sistema respiratório presentes na SD, a hipotonia e a dificuldade para eliminar as secreções também contribuem para o desenvolvimento dessas infecções respiratórias"),
                    )
            }
            SubTopic.COMPLICATION_PREVENTION_CALENDARY -> {
                listOf(
                    Page.Header("VACINAÇÃO PARA CRIANÇAS COM CARDIOPATIA CONGÊNITA (CC) E SÍNDROME DE DOWN (SD)"),
                    Page.Description("As vacinas são grande aliadas na prevenção de doenças, na criança com CC e SD é importante que os pais esclareçam as dúvidas em relação às vacinas  e sigam as recomendações médicas.\n" +
                            "As crianças com SD e CC pertencem a um grupo especial e têm esquemas de vacinação  diferenciados,  além disso elas possuem direito a vacinas específicas, como  a que previne a bronquiolite até o 2º ano de vida,  esse direito  é garantido pelo SUS."),
                    Page.Header("CALENDÁRIO DE VACINAÇÃO NACIONAL PARA CRIANÇAS"),
                    Page.Header("*ESTE CALENDÁRIO NÃO SUBSTITUI A RECOMENDAÇÃO MÉDICA."),
                    Page.Description("Calendário de Vacinação\n" +
                            "\n" +
                            "Vacina: BCG\n" +
                            "Prevenção: Tuberculose\n" +
                            "Doses: Única\n" +
                            "Idade recomendada: Ao nascer\n" +
                            " \n" +
                            "Vacina: Hepatite B\n" +
                            "Prevenção: Hepatite B\n" +
                            "Doses: Única\n" +
                            "Idade recomendada: Ao nascer\n" +
                            " \n" +
                            "Vacina: Poliomielite\n" +
                            "Prevenção: Paralisia Infantil\n" +
                            "Doses: 3 doses + 2 reforços\n" +
                            "Idade recomendada: 1ª dose aos 2 meses; \n" +
                            "2ª dose aos  4meses; 3ª dose aos 6 meses; \n" +
                            "1° reforço aos 15 meses; 2° reforço aos 4 anos \n" +
                            " \n" +
                            "Vacina: Rotavírus Humano\n" +
                            "Prevenção: Diarreia\n" +
                            "Doses: 2 doses\n" +
                            "Idade recomendada: 1ª dose aos 2 meses; \n" +
                            "2ª dose aos  4meses\n" +
                            " \n" +
                            "Vacina: Pentavalente DTP+Hib+HB\n" +
                            "Prevenção: Difteria; Tétano; Coqueluche; Haemophilus Influenzae B (gripe); Hepatite\n" +
                            "Doses: 3 doses\n" +
                            "Idade recomendada: 1ª dose aos 2 meses; \n" +
                            "2ª dose aos  4meses; 3ª dose aos 6 meses; \n" +
                            " \n" +
                            "Vacina: Pneumocócica 10-valente \n" +
                            "Prevenção: Pneumonias, Meningites, Otites, Sinusites \n" +
                            "\n" +
                            "Doses: 2 doses + Reforço\n" +
                            "Idade recomendada: 1ª dose aos 2 meses; \n" +
                            "2ª dose aos 4meses; Reforço aos 12 meses; \n" +
                            " \n" +
                            "Vacina: Difteria e Tétano (DT)\n" +
                            "Prevenção: Difteria e Tétano\n" +
                            "Doses: 3 doses (Considerar doses anteriores com penta e DT)\n" +
                            "Idade recomendada:  A partir dos 7 anos de idade a cada 10 anos\n" +
                            " \n" +
                            "Vacina: Papiloma vírus humano\n" +
                            "Prevenção: Papiloma vírus humano\n" +
                            "Doses: 2 doses\n" +
                            "Idade recomendada: 9 a 14 anos ; 2ª dose: 6 meses após 1ª dose\n" +
                            " \n" +
                            "Vacina: Varicela\n" +
                            "Prevenção: Varicela\n" +
                            "Doses: 1 dose (corresponde à segunda dose da varicela)\n" +
                            "Idade recomendada: 4 anos\n" +
                            " \n" +
                            "Vacina: Palivizumabe*\n" +
                            "Prevenção: Bronquiolite\n" +
                            "Doses: mensais consecutivas, no máximo cinco aplicações \n" +
                            "Idade recomendada: 2 primeiros anos de vida em crianças com CC\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            " \n" +
                            "Vacina: Influenza*  \n" +
                            "Prevenção: Gripe \n" +
                            "Doses: anual \n" +
                            "Idade recomendada: A partir de 6 meses de vida\n" +
                            " \n" +
                            "Vacina: Meningocócica C\n" +
                            "Prevenção:  Meningite meningocócica tipo C\n" +
                            "Doses:  2 doses + Reforço\n" +
                            "Idade recomendada: 1ª dose aos 2 meses;\n" +
                            " 2ª dose aos 4meses e  reforço aos 12 meses\n" +
                            " \n" +
                            "Vacina: Febre amarela\n" +
                            "Prevenção: Febre amarela\n" +
                            "Doses:  1 dose + Reforço\n" +
                            "Idade recomendada: 9 meses Reforço: 4anos de idade\n" +
                            "  \n" +
                            "Vacina: Tríplice viral (SCR)\n" +
                            "Prevenção: Sarampo, Caxumba e Rubéola\n" +
                            "Doses: 2 doses\n" +
                            "Idade recomendada: 12 meses\n" +
                            " \n" +
                            "Vacina: Tetraviral (SCRV)\n" +
                            "Prevenção: Sarampo, Caxumba, Rubéola e Varicela\n" +
                            "Doses: 2 doses (segunda dose da SCR e primeira de varicela)\n" +
                            "Idade recomendada: 15 meses\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            " \n" +
                            "Vacina: Hepatite A\n" +
                            "Prevenção: Hepatite A\n" +
                            "Doses: 1 dose\n" +
                            "Idade recomendada: 15 meses\n" +
                            " \n" +
                            "Vacina: Tríplice bacteriana (DTP)\n" +
                            "Prevenção: Difteria;Tétano e Coqueluche;\n" +
                            "Doses: 2 reforços\n" +
                            "Idade recomendada: 1º reforço: 15 meses, 2º reforço: 4 anos de idade\n" +
                            "\n" +
                            "FONTE: Ministério da Saúde 20-09-2022.\n" +
                            "Sociedade Brasileira de Imunização 2022-2023.*"),
                )
            }
            SubTopic.COMPLICATION_PREVENTION_APNEIA_OBSTRUTIVA-> {
                listOf(
                    Page.Header("A APNÉIA OBSTRUTIVA DO SONO (AOS) É UM PROBLEMA RESPIRATÓRIO COMUM NA  CRIANÇA COM SD?"),
                    Page.Description("Crianças com SD são mais propensas de apresentar apnéia obstrutiva do sono (AOS) que é uma condição caracterizada  pelo bloqueio da entrada de ar pelo nariz fazendo com que a criança tenha ronco intenso e  pausas para  respirar durante o sono.\n" +
                            "A hipotonia (músculos mais molinhos), a obesidade e o aumento das estruturas da garganta ( amigdala e adenóides) são alguns dos  fatores que causam a  AOS na criança com SD.\n"),
                    Page.Header("POR QUE A  AOS PRECISA DE TRATAMEMENTO NA CRIANÇA COM SD?"),
                    Page.Description("Porque ela prejudica a qualidade do sono e isso impacta no seu  comportamento , a criança com SD  pode apresentar irritabilidade,  nervosismo  e agitação durante o dia. Além disso, o desenvolvimento físico e intelectual da criança  também fica prejudicado.\n" +
                            "O tratamento da AOS  pode ser cirúrgico para a remoção das adenóides e amigdalas,  mas outros tratamentos como o controle de peso e fortalecimento da musculatura oral e  do pescoço e  medicamentos anti-inflamatórios também são indicados.  Procure  um médico para o tratamento adequado se seu(a) filho(a) tiver problemas para dormir devido a AOS\n"),
                )
            }
            SubTopic.COMPLICATION_PREVENTION_BRONCO -> {
                listOf(
                    Page.Header("O QUE É BRONCOASPIRAÇÃO?"),
                    Page.Description("É a passagem de conteúdo alimentar, líquido, saliva ou vômitos nas vias respiratórias e esse conteúdo  chega aos pulmões, isso ocorre por engasgos ou por que a criança tem dificuldade para deglutir (engolir).\n" +
                            "A broncoaspiração é perigosa pois provoca quadros de pneumonia ou pode causar  asfixia  da criança."),
                    Page.Header("COMO EVITAR A BRONCOASPIRAÇÃO?"),
                    Page.Description("Manter a cabeceira elevada e não oferecer alimentos ou líquidos a criança quando ela estiver sonolenta são medidas que diminuem  os riscos  da broncoaspitração."),
                    )
            }
            SubTopic.COMPLICATION_PREVENTION_TRAQUEOSTOMIA -> {
                listOf(
                    Page.Header("O QUE É TRAQUEOSTOMIA?"),
                    Page.Description("É uma pequena abertura cirúrgica na região do pescoço através da pele até a traquéia da criança. \n" +
                            "Nesta abertura é colocado uma cânula traqueal  que mantém a via respiratória aberta e o caminho livre para  que o ar chegue aos pulmões."),
                    Page.Header("QUANDO A TRAQUEOSTOMIA ESTÁ INDICADA?"),
                    Page.Description("Geralmente nas  condições abaixo:\n\n" +
                            "- Alterações nas vias respiratórias que dificultam o fluxo de ar para os pulmões \n\n" +
                            "- Intubação prolongada (colocação de um tubo de respiração pela boca)\n\n" +
                            "- Necessidade da criança estar conectada a um aparelho que o ajuda a respirar (suporte ventilatório)\n\n" +
                            "- Incapacidade de engolir\n\n" +
                            "- Doença pulmonar crônica"),
                    Page.Header("POR QUE A TRAQUEOSTOMIA  PODE SER INDICADA PARA A CRIANÇA COM SD E CARDIOPATIA?"),
                    Page.Description("Porque a criança com SD poderá apresentar alguma dificuldade para sair do suporte ventilatório no pós-operatório  da cardiopatia por diversas causas a fraqueza muscular respiratória  e a insuficiência cardíaca são algumas delas. A taxa de traqueostomia na criança com SD é quase 3 vezes maior do que na criança sem SD por causa da presença de alterações respiratórias sendo a mais comum a obstrução das vias aéreas.\n" +
                            "A  traqueostomia poderá  ser removida quando os problemas que indicaram a sua utilização estiverem resolvidos.")
                )
            }
            SubTopic.COMPLICATION_PREVENTION_SINAIS -> {
                listOf(
                    Page.Header("SINAIS DE DIFICULDADE RESPIRATÓRIA"),
                    Page.Description("Observe se seu (a) filho(a) está respirando mais rápido do que o normal contando o número de respirações por um minuto:\n\n" +
                            "- Verifique se a região do tórax  e abdome se contrai a cada respiração, especialmente entre o tórax e o abdome e ao redor das costelas \n\n" +
                            "- Verifique se as narinas se dilatam ao inspirar o ar\n\n" +
                            "- Ouça a respiração dele (a) que pode apresentar um gemido, chiado ou secreção  na garganta\n\n" +
                            "- Sinta a pele do seu(a) filho(a) para ver se ela está fria e suada principalmente na cabeça \n\n" +
                            "- Verifique se seu(a) filho(a) está mais sonolento, difícil de acordar, mais agitado do que o normal ou \"simplesmente não está agindo como ele mesmo\n\n" +
                            "- Seu (a) filho (a) pode  inclinar-se para frente ou inclinar a cabeça para cima ou para trás para tentar respirar com mais facilidade\n\n" +
                            "- A cor da pele ao redor dos lábios, olhos, mãos e pés, especialmente nas unhas pode estar  mais pálida ou azulada"),
                )
            }
            SubTopic.COMPLICATION_PREVENTION_DIFICULDADE-> {
                listOf(
                    Page.Header("SINAIS DE DIFICULDADE RESPIRATÓRIA"),
                    Page.Description("- Observe se seu (a) filho(a) está respirando mais rápido do que o normal contando o número de respirações por um minuto\n" +
                            "- Verifique se a região do tórax  e abdome se contrai a cada respiração, especialmente entre o tórax e o abdome e ao redor das costelas\n\n" +
                            "- Verifique se as narinas se dilatam ao inspirar o ar\n\n" +
                            "- Ouça a respiração dele (a) que pode apresentar um gemido, chiado ou secreção  na garganta\n\n" +
                            "- Sinta a pele do seu(a) filho(a) para ver se ela está fria e suada principalmente na cabeça \n\n" +
                            "- Verifique se seu(a) filho(a) está mais sonolento, difícil de acordar, mais agitado do que o normal ou simplesmente não está agindo como ele mesmo\n\n" +
                            "- Seu (a) filho (a) pode  inclinar-se para frente ou inclinar a cabeça para cima ou para trás para tentar respirar com mais facilidade\n\n" +
                            "- A cor da pele ao redor dos lábios, olhos, mãos e pés, especialmente nas unhas pode estar  mais pálida ou azulada")
                )
            }
            SubTopic.COMPLICATION_PREVENTION_NUTRITIONAL_ASPECTS -> {
                listOf(
                    Page.Header("QUAIS SÃO AS DIFICULDADES QUE PODEM SER ENCONTRADAS NA ALIMENTAÇÃO DA CRIANÇA COM SD E CC?"),
                    Page.Description("Uma combinação de fatores pode resultar em dificuldades alimentares e desnutrição; como a hipotonia (falta de firmeza) dos músculos da face, incoordenação da deglutição, falta de apetite, demora para se alimentar devido ao cansaço,  recusa do alimento e  hipersensibilidade oral."),
                    Page.Header("QUAIS SÃO AS CONSEQUÊNCIAS DA DIFICULDADE ALIMENTAR NA SD COM CARDIOPATIA?"),
                    Page.Description("A desnutrição que se caracteriza em prejuízo para criança  conseguir os nutrientes necessários para o seu crescimento e desenvolvimento, dificuldade de cicatrizações no pós-operatório, aumento de risco para a  broncoaspiração, além de enfraquecer suas defesas favorecendo o surgimento de infecções."),
                    Page.Header("O QUE PODE SER FEITO PARA MELHORAR A CONDIÇÃO NUTRICIONAL?"),
                    Page.Description("Pode ser necessário a criança receber fórmulas especiais que irão prover os nutrientes que ela precisa.\n" +
                            " Às vezes as crianças com SD e cardiopatia congênita precisam de uma sonda no estômago ou intestino por determinado período,  para que não precisem queimar tantas calorias para mamar ou comer e consigam ganhar peso.\n" +
                            "O suporte do nutricionista no contexto hospitalar ou ambulatorial é fundamental para a criança."),
                    Page.Header("A CRIANÇA PODERÁ SE ALIMENTAR NORMALMENTE APÓS A RETIRADA DA SONDA?"),
                    Page.Description("Quando a alimentação via oral for liberada a criança pode voltar a  mamar ou a comer normalmente. Porém, não é incomum que ela precise da fonoaudiologia para aprender ou reaprender a coordenação necessária para sugar, mastigar e engolir.")
                    )
            }
            SubTopic.COMPLICATION_PREVENTION_GASTROSTOMIA -> {
                listOf(
                    Page.Header("O QUE É GASTROSTOMIA (GTM) E QUANDO ELA É INDICADA?"),
                    Page.Description("É um pequeno tubo que entra no estômago através de uma pequena abertura no abdômen. Ela é  utilizada para fornecer alimentos, água e remédios.\n\n" +
                            "Está indicada em situações específicas como: dificuldade de deglutir ou quando a criança precisa da sonda nasoenteral (no sistema digestivo) por um período prolongado para obter os nutrientes. \n\n" +
                            "Durante o uso da GTM pode haver  treino da deglutição pela fonoaudiologia \n\n" +
                            "A necessidade de GTM pela criança pode ser temporária ou permanente."),
                )
            }
            SubTopic.ENGINE_MILESTONES_MOTOR -> {
                listOf(
                    Page.Header("O CRESCIMENTO E A CRIANÇA COM SD E CARDIOPATIA CONGÊNITA (CC)"),
                    Page.Description("O crescimento  é um processo que ocorre de maneira contínua e dinâmica indicando  o estado de saúde da criança e depende de condições genéticas e fatores ambientais adequados. Ele  representa o aumento do tamanho corporal e a sua evolução é acompanhada pelo perímetro cefálico (tamanho da cabeça), estatura, peso corporal e o índice de massa corpórea (IMC)."),
                    Page.Header("A CRIANÇA COM SD E CARDIOPATIA TEM RESTRIÇÕES DE CRESCIMENTO ?"),
                    Page.Description("Devido as questões genéticas, de modo geral, as crianças com SD possuem alterações das estruturas ósseas que restringem o seu crescimento desde o período gestacional. \n" +
                            "Quando a criança com SD tem cardiopatia congênita  a velocidade do  seu crescimento no primeiro ano de vida é ainda menor  e  esse fator  associa-se a gravidade da cardiopatia, as intervenções cirúrgicas,  ao maior gasto calórico e a  dificuldades para se alimentar causado pela hipotonia e alterações orofaciais."),
                    Page.Header("QUAIS SÃO AS CARACTERÍSTICAS QUE A CRIANÇA COM SD APRESENTA EM RELAÇÃO A ESTATURA E AO PESO CORPORAL?"),
                    Page.Description("É comum que nos 2 primeiros anos de vida a crianças com SD  apresente baixa estatura e baixo peso e que a partir dos 3 anos até a adolescência elas tenham tendência ao sobrepeso por causa de fatores hormonais, diminuição do gasto energético e alimentação inadequada."),
                    Page.Description("É importante os pais encorajarem desde a infância os hábitos alimentares saudáveis, a autonomia para as atividades diárias  e se houver liberação médica a prática de atividade física, ressaltando que  há esportes que são contraindicados para a crianças com SD e CC."),
                    )
            }

            SubTopic.ENGINE_MILESTONES_DEFINITIONS -> {
                listOf(
                    Page.Header("MARCOS DO DESENVOLVIMENTO"),
                    Page.Description("Os primeiros anos de vida são fundamentais para o desenvolvimento sensório motor da criança . \n" +
                            "Marcos motores são as posturas e os movimentos que a criança consegue realizar em determinada idade como: segurar a cabeça, rolar, sentar, engatinhar e andar.\n\n" +
                            "É importante frisar que existe uma variação esperada sobre a idade em que as crianças típicas ou com SD alcançam um determinado marco motor, por isso devemos evitar as comparações. Por exemplo, algumas crianças com desenvolvimento típico começam a andar com 10 meses enquanto que outras podem começar a andar depois de completar 1 ano de idade. As crianças com SD atingem esses mesmos marcos motores, porém mais tardiamente."),
                    Page.Image(R.drawable.figura13),
                    Page.Header("QUANDO A CRIANÇA COM SD E CARDIOPATIA ALCANÇA OS MARCOS MOTORES?"),
                    Page.Description("Muitos bebês e crianças com SD apresentam atraso motor e grande variação no progresso, considerando-se as diferenças individuais que levam alguns a realizar certas atividades mais cedo e outros mais tarde.\n" +
                            "Fatores como a  cardiopatia congênita, tempo de internação hospitalar prolongado, necessidade de traqueostomia ou gastrostotmia aumenta o risco para os atrasos do desenvolvimento motor."),
                    )
            }
            SubTopic.ENGINE_MILESTONES_ENGINE_DELAY -> {
                listOf(
                    Page.Header("QUAIS AS CAUSAS PARA O ATRASO MOTOR NA CRIANÇA COM SD E CARDIOPATIA CONGÊNITA?"),
                    Page.Description("Uma combinação de fatores como  a imaturidade cerebral, estado nutricional,  hipotonia  (menor firmeza muscular), frouxidão das articulações e falta de equilíbrio, associados com um comprometimento intelectual e um ambiente nem sempre estimulador podem gerar atrasos para o desenvolvimento. \n" +
                            "\n" +
                            "Por causa dos desafios que a criança com SD e cardiopatia congênita enfrenta ela pode não conseguir receber os estímulos motores de forma adequada para o  seu desenvolvimento, principalmente nos primeiros meses de vida ou antes da correção da cardiopatia. \n" +
                            "\n" +
                            "Outras questões relacionadas a fatores como a gravidade da cardiopatia, oxigenação mais baixa, cianose (bebê roxo), baixo peso, necessidade de poupar energia e cansaço podem prejudicar o curso do desenvolvimento."),
                )
            }
            SubTopic.ENGINE_MILESTONES_REFERENCE -> {
                listOf(
                    Page.Header("TABELA DE REFERÊNCIA"),
                    Page.Description("A tabela abaixo demonstra a idade média e as variações normais dos marcos do desenvolvimento da criança com SD."),
                    Page.Image(R.drawable.new_taberef),
                )
            }
            SubTopic.ENGINE_MILESTONES_INTERVATION -> {
                listOf(
                    Page.Header("O QUE SIGNIFICA INTERVENÇÃO PRECOCE?"),
                    Page.Description("A  intervenção precoce ocorre nos primeiros anos de vida da criança com atraso motor, devendo-se iniciar a estimulação o quanto antes. \n" +
                            "\n" +
                            "Os profissionais que fazem essa intervenção geralmente são das áreas da fisioterapia, terapia ocupacional e fonoaudiologia.\n" +
                            "\n" +
                            "- A fisioterapia se concentra no desenvolvimento motor, no alcance de marcos motores e na prevenção complicações  ortopédicas e posturais. Além disso, a fisioterapia respiratória auxilia a  criança na vigência de infecções respiratórias\n" +
                            "\n" +
                            "- A terapia ocupacional ajuda as crianças a desenvolver habilidades para a independência como: abrir e fechar coisas, pegar e soltar brinquedos de vários tamanhos e formas, empilhar e construir, manipular objetos diversos e funcionais em sua rotina \n" +
                            "\n" +
                            "- A fonoaudiologia trabalha as estruturas orofaciais que estabelecem a base para as habilidades de comunicação e também auxiliam na alimentação, incluindo a amamentação."),
                    Page.Header("'PARA A INTERVENÇÃO PRECOCE É IMPORTANTE A LIBERAÇÃO MÉDICA PARA GARANTIR TOTAL SEGURANÇA À CRIANÇA  COM SD E CARDIOPATIA'"),
                    Page.Header("COMO BEBÊS E CRIANÇAS APRENDEM?"),
                    Page.Description("Eles(as) aprendem por meio de tentativas em realizar algo, repetições daquilo que foi aprendido e pela interrelação com o ambiente onde ela está se desenvolvendo, por isso ela precisa  ter a oportunidade de explorar o ambiente, alcançar e agarrar brinquedos, virar a cabeça enquanto observa um objeto em movimento, rolar,  engatinhar e andar.  As atividades  motoras ajudam e potencializam a capacidade da criança de se comunicar, pensar, memorizar e entender.\n" +
                            "As crianças com SD, assim como as crianças típicas, possuem sua própria personalidade e aprendem no seu ritmo, têm pontos fortes e fracos e precisam de estímulos direcionados pois têm necessidades únicas.")
                )
            }
            SubTopic.ENGINE_MILESTONES_STIMULATION -> {
                listOf(
                    Page.Header("COMO OS PAIS PODEM  AJUDAR NO DESENVOLVIMENTO MOTOR  DA CRIANÇA COM SÍNDROME DE DOWN E CARDIOPATIA CONGÊNITA?"),
                    Page.Description("- Ajude  o  seu  bebês a juntar as mãos e brincar com as mãos e os pés.\n" +
                            "\n" +
                            "- Dê ao bebê brinquedos que ele consiga segurar, brinquedos de causa e efeito e que se movem facilmente. \n" +
                            "\n" +
                            "- Móbiles e brinquedos espelhados motivam o bebê a levantar a cabeça, alcançar e explorar o brinquedo. \n" +
                            "\n" +
                            "- Falar claramente e com calma, brincar, cantar músicas e ler livros juntos ajuda no aprendizado de sons e palavras.\n" +
                            "\n" +
                            "- Estabelecer rotinas para acordar, dormir, brincar, estudar e para as refeições, definir estas rotinas faz com que eles se sintam mais organizados e confiantes. \n" +
                            "\n" +
                            "- As crianças com SD devem ser socialmente incluídas em suas famílias, escolas e comunidades, pois isso potencializa seu aprendizado.\n" +
                            "\n" +
                            "- Estimule e valorize  suas conquistas.\n" +
                            "\n" +
                            "- Encoraje-os a serem ativos e a participarem das decisões.\n" +
                            "\n" +
                            "- Leve-os para consultas e exames regulares de audição, visão e de  saúde.")
                )
            }
            SubTopic.ENGINE_MILESTONES_LINKS -> {
                listOf(
                    Page.Header("ALGUNS SITES DE INFORMAÇÃO SOBRE A ESTIMULAÇÃO SENSORIAL E MOTORA PARA BEBÊS COM SÍNDROME DE DOWN ESTÃO DISPONÍVEIS GRATUITAMENTE E SÃO AQUI COMPARTILHADOS PARA AMPLIAR SUAS OPÇÕES NA BUSCA DE ATUALIZAÇÃO E INFORMAÇÃO SOBRE O TEMA."),
                    Page.Header("LINKS:"),
                    Page.Link("Guia de Estimulação (PDF) - Download"),
                    Page.Link("Movimento Down"),
                    Page.Link("Diretrizes Atenção Pessoa Síndrome Down (PDF) - Download"),
                )
            }
            SubTopic.SPECIAL_SITUATIONS_DEFINITIONS -> {
                listOf(
                    Page.Header("OS PAIS E AS EMOÇÕES"),
                    Page.Description("Papai e mamãe, ao receber a notícia  sobre a SD e da cardiopatia congênita é normal sentir emoções como: medo, angústia, preocupação e tristeza. \n" +
                            "\n\n" +
                            "Além de estar em um mundo novo de informações médicas, que podem ser difíceis para a sua compreensão, você também precisa aprender sobre os cuidados do bebê com necessidades especiais.\n" +
                            "\n\n" +
                            "Não tenha medo de fazer perguntas até que suas dúvidas sejam resolvidas e se dê tempo para aprender sobre a  SD e a cardiopatia congênita de seu(a) filho(a).\n" +
                            "\n\n" +
                            "Lembre-se que você  não está sozinha (o)."))

            }
            SubTopic.SPECIAL_SITUATIONS_GASTROSTOMY -> {
                listOf(
                    Page.Header("A IMPORTÂNCIA DO APOIO"),
                    Page.Description("Você precisa de apoio e fazer algumas coisas  para cuidar de si mesmo...\n" +
                            "- Sempre que possível, reserve um tempo para você, o suporte dos seus familiares e amigos são essenciais, principalmente durante a internação hospitalar, para que você possa descansar, se alimentar e se distrair\n" +
                            "\n\n" +
                            "- Procure por grupos de apoio ou converse com pais que já passaram ou estão passando pela mesma situação, mas lembre-se que cada família terá experiências únicas\n" +
                            "\n\n" +
                            "- Cuide de sua saúde é preciso estar bem para poder cuidar do seu(a) filho(a) \n" +
                            "\n\n" +
                            "- Durante a internação hospitalar da criança, não deixe de contar com o apoio de serviços que o hospital oferece como: psicologia e serviço social."),
                    )

            }
            SubTopic.SPECIAL_SITUATIONS_ATTENTION -> {
                listOf(
                    Page.Header("QUANDO DEVO PROCURAR AJUDA  MÉDICA PARA O MEU(A) FILHO(A)?"),
                    Page.Description("Os pais precisam ficar atentos a sinais e sintomas que o bebê ou a criança cardiopata apresenta quando não está bem. É indicada a busca de suporte médico adequado o quanto antes em casos como:\n\n" +
                            "- Alteração no comportamento alimentar: como a diminuição de apetite, vômitos ou diarréia\n\n" +
                            "- Piora do esforço para respirar, chiado no peito, respiração mais rápida e maior cansaço\n\n" +
                            "- Mudanças na cor da pele como: aumento na palidez, coloração mais arroxeada\n\n" +
                            "- Mãozinhas ou pezinhos mais frios e sudorese fria\n\n" +
                            "- Presença de secreção, inchaço ou vermelhidão na ferida operatória\n\n" +
                            "- Mudanças de comportamento: o bebê pode estar mais sonolento ou mais irritado e choroso"),
                    Page.Header("EM SITUAÇÃO DE URGÊNCIA PROCURE PELO PRONTO SOCORRO MAIS PRÓXIMO"),
                )
            }
            SubTopic.SPECIAL_SITUATIONS_TELEFONE -> {
                listOf(
                    Page.Header("TELEFONES ÚTEIS"),
                    Page.Description("SERVIÇO DE ATENDIMETO MÓVEL DE URGÊNCIA - SAMU 192"),
                    Page.Description("BOMBEIROS 193"),
                    Page.Description("DEFESA CIVIL 199"),
                    Page.Description("DIREITOS HUMANOS 100"),
                    Page.Description("DISQUE-SAUDE /OUVIDORIA  SUS 136"),
                    Page.Description("AGÊNCIA NACIONAL DE VIGILÂNCIA SANITÁRIA - ANVISA 0800-642-9782"),
                    Page.Description("COMUNICAÇÃO PARA PORTADORES DE NECESSIDADES ESPECIAIS 142"),
                )
            }
            SubTopic.SPECIAL_SITUATIONS_INFORMATION -> {
                listOf(
                    Page.Header("QUAIS SÃO AS  INFORMAÇÕES PRINCIPAIS  QUE OS PAIS DEVEM POSSUIR  A RESPEITO DA CARDIOPATIA CONGÊNITA DE SEU (A) FILHO(A):"),
                    Page.Description("É importante saber o nome da cardiopatia, o procedimento cirúrgico realizado e a data, o nome das medicações que a criança recebe, a saturação de oxigênio normal para seu filho(a) como entrar em contato com o médico da criança ou com o hospital que ela está sendo acompanhada."),
                    Page.Description("Guardar todas as informações que você recebeu sobre o diagnóstico do (a) seu(a) filho(a) em um único lugar."),
                    Page.Description("Uma pasta ou fichário para armazenar e organizar  os papéis dados a você pelo hospital ou pelos médicos irá  ajuda-lo nos momentos que você precisa acessar as informações."),
                    )
            }
            SubTopic.REFERENCIAS -> {
                listOf(
                    Page.Header("REFERÊNCIAS BIBLIOGRÁFICAS"),
                    Page.Description("ABELLAN, DM.  Cardiopatias Congênitas. In: MUSTACCHI, Z.; SALMONA, P.; MUSTACCHI, R. (org.). Trissomia 21 (síndrome de Down): nutrição, educação e saúde. São Paulo: Memnon, 2017. p. 117- 125.\n" +
                            "\n" +
                            "ALVES, A C.; UMEDA, I. Fisioterapia na Cardiologia Pediátrica. São Paulo: Manole, 2021.\n" +
                            "\n" +
                            "ALZAWAD, Zainab et al. “Parents' Challenges beyond the Pediatric Intensive Care Unit: Fraying at the Seams while Balancing between Two Worlds, Home and Hospital.” Children (Basel, Switzerland) vol. 9,2 267. 16 Feb. 2022, doi:10.3390/children9020267 Acesso 03 mar 2023\n" +
                            "\n" +
                            "BRASIL. Ministério da Saúde. https://www.gov.br/saude/pt-br/assuntos/saude-de-a-a-z/c/calendario-nacional-de-vacinacao\n" +
                            "\n" +
                            "BULL, M. J. Down syndrome. New England Journal of Medicine, Massachusetts, v. 382, n. 24, p. 2344-2352, 2020. DOI 10.1056/NEJMra1706537\n" +
                            "\n" +
                            "CALLÉ, A. et al.. Going home after a child’s cardiac surgery: education for safe care. Revista Brasileira de Enfermagem, v. 74, n. Rev. Bras. Enferm., 2021 74 suppl 4, 2021. \n" +
                            "\n" +
                            "HAMILL, CS et al. “Tracheostomy in the pediatric trisomy 21 population.” International journal of pediatric otorhinolaryngology vol. 140 (2021): 110540. doi:10.1016/j.ijporl.2020.110540\n" +
                            "\n" +
                            "KONSTANTINOS,D.; CONSTANTINE, A. et al Cardiovascular Complications of Down Syndrome: Scoping Review and Expert Consensus. Circulation v. 147, p. 425-44, 2023\n" +
                            "\n" +
                            "LAUDATO, N.; YAGIELA, L.; et al. Understanding parents' informational needs in the pediatric intensive care unit: A qualitative study. Progress in Pediatric Cardiology, v. 57, 2020. https://doi.org/10.1016/j.ppedcard.2019.101172\n" +
                            "\n" +
                            "MORIYAMA, C.; HERRERO, D; MASSETTI, T. Intervenção fisioterapêutica na T21. In: MUSTACCHI, Z.; SALMONA, P.; MUSTACCHI, R. (org.). Trissomia 21 (síndrome de Down): nutrição, educação e saúde. São Paulo: Memnon, 2017. p. 191-210.\n" +
                            "\n" +
                            "POSKANZER, Sheri A et al. “Feeding difficulty and gastrostomy tube placement in infants with Down syndrome.” European journal of pediatrics vol. 179,6 (2020): 909-917. doi:10.1007/s00431-020-03591-x\n" +
                            "\n" +
                            "STANLEY, MA et al. “Clinical identification of feeding and swallowing disorders in 0-6 month old infants with Down syndrome.” American journal of medical genetics. Part A vol. 179,2 (2019): 177-182. doi:10.1002/ajmg.a.11 Acesso em:  03 mar. 2023\n" +
                            "\n" +
                            "SANTOS RA, COSTA LH, LINHARES RC, PRADELLA-HALLINAN M, COELHO FMS, OLIVEIRA G da P. Sleep disorders in Down syndrome: a systematic review. Arq Neuro-Psiquiatr [Internet]. V. 80, n .4, p 424–43, 2022  Available from: https://doi.org/10.1590/0004-282X-ANP-2021-0242\n" +
                            "\n" +
                            "SANTORO,S.; STEFFENSEN, E. Congenital heart disease in Down syndrome – A review of temporal changes. Journal of Congenital Cardiology; London Vol. 5 (2021) 1-14 DOI:10.1186/s40949-020-00055-7. Acesso em 03 Mar 2023\n" +
                            "\n" +
                            "SOCIEDADE BRASILEIRA DE IMUNIZAÇÕES (SBIM).  https://sbim.org.br/calendarios-de-vacinacao. Acesso em 05 Junho de 2023 \n" +
                            "\n" +
                            "SOCIEDADE BRASILEIRA DE PEDIATRIA (SBP). Departamento científico de genética. Diretrizes de atenção à saúde de pessoas com síndrome de down. 2020. Disponível em: https://www.sbp.com.br/fileadmin/user_upload/22400bDiretrizes_de_atencao_ a_saude_de_pessoas_com_Down.pdf. Acesso em: 18 fev. 2023\n" +
                            "\n" +
                            "WIJNHOVEN, Trudy M et al. “Assessment of gross motor development in the WHO Multicentre Growth Reference Study.” Food and nutrition bulletin vol. 25,1 Suppl (2004): S37-45. doi:10.1177/15648265040251S105\n" +
                            "\n" +
                            "VERSACCI, P; DI CARLO, D; DIGILIO,et al. Cardiovascular disease in Down syndrome. Current Opinion in Pediatrics 30(5):p 616-622, October 2018. | DOI: 10.1097/MOP.0000000000000661 \n" +
                            "\n" +
                            "http://www.movimentodown.org.br/2013/07/que-sono-pessoas-com-sindrome-de-down-tem-tendencia-a-desenvolver-problemas-para-domir\n" +
                            "\n" +
                            "https://revistapesquisa.fapesp.br/crescer-com-down/"),


                )
            }
            SubTopic.CONSCIENTIZAO_SIMBOLOS -> {
                listOf(
                    Page.Header("DATA DA CONSCIENTIZAÇÃO E SÍMBOLOS"),
                    Page.Description("❤ 12 de Junho  é o dia nacional  da conscientização da Cardiopatia Congênita (CC)\n" +
                            "\n" +
                            "❤ Esta data é importante para que as CC e as instituições que cuidam de crianças com CC  ganhem visibilidade  e apoio da sociedade\n" +
                            "\n" +
                            "❤ As cores do símbolo das CC são o vermelho e o azul e eles representam o sangue arterial (vermelho) e o sangue venoso (azul) \n"),
                    Page.Image(R.drawable.cardiopatiasimbolo),
                    Page.Description("❤ 21 de Março é o  dia internacional da  conscientização da Síndrome de Down (SD)\n" +
                            "\n" +
                            "❤ Esta data tem por objetivo conscientizar a nossa  sociedade sobre os direitos igualitários, a importância de políticas inclusivas e a convivência  social saudável que promova o  bem estar  de indivíduos com SD\n" +
                            "\n" +
                            "❤ As cores do símbolo da SD são o  amarelo e o azul \n" +
                            "\n" +
                            "❤ A SD pode ser conhecida também por Trissomia 21(T21)\n" +
                            "\n" +
                            "❤ 1 em cada 700 crianças que nascem no mundo tem SD ou T21.\n" +
                            "\n"),
                    Page.Image(R.drawable.sindromesimbolo)

                )
            }
            SubTopic.ABOUT_APP -> {
                listOf(
                    Page.Header("QUEM SOMOS NÓS"),
                    Page.Description("Somos um grupo de professores e pesquisadores apaixonados por crianças com Síndrome de Down e pelo tópico de cardiopatias congênitas, desejosos por aliar o conhecimento em saúde e a tecnologia para facilitar a vida dos pais por meio da informação. \n" +
                            "\n" +
                            "Esperamos que esse app possa ajudá-lo na compreensão das cardiopatias e colaborar  para amenizar as ansiedades e preocupações tornando essa jornada pela recuperação da criança mais leve.")
                )
            }
        }
    }
}