package com.example.ecoecho.misc

import com.example.ecoecho.data.Arvore

object ArvoreDebug {
    fun getArvores(): List<Arvore> {
        return listOf(
            Arvore().apply {
                id = 0
                nome = "Ingá"
                descricao =
                    "Inga edulis é uma espécie arbórea, de padrão foliar sempre-verde ou perenifólio (Perenifólio é um adjetivo que significa folha persistente ou perene, ou seja, um atributo de plantas que mantêm as suas folhas durante todo o ano) (MONTEIRO et al., 2007)."
                imgUrl =
                    "https://upload.wikimedia.org/wikipedia/commons/e/e8/Pacay_%28Inga_feuillei%29.jpg"
                sobre =
                    """
                    <b>Espécie:</b> Ingá.<br><br>

                    <b>Taxonomia e Nomenclatura:</b><br><br>
                    De acordo com o sistema de classificação baseado no The Angiosperm Phylogeny Group (APG) III (2009), a posição taxonômica de Inga edulis obedece à seguinte hierarquia:<br><br> 

                    <b>Divisão:</b> Angiospermae<br><br>

                    <b>Clado:</b> Eurosídeas I <br><br>

                    <b>Ordem:</b> Fabales – Em Cronquist (1981), é classificada em Rosales.<br><br> 
                    
                    <b>Família:</b> Fabaceae – Em Cronquist (1981), é classificada em Leguminosae.<br><br> 

                    <b>Subfamília:</b> Mimosoideae.<br><br> 

                    <b>Gênero:</b> Inga. <br><br>

                    <b>Tribo:</b> Ingeae. <br><br>

                    <b>Seção:</b> Inga. <br><br>

                    <b>Binômio específico:</b> Inga edulis Martius – (Mart.)<br><br> 

                    <b>Primeira publicação:</b> Flora 20 (2)</b> Beibl. 113- 114. 1837.<br><br> 

                    :<b>Sinonímia botânica:</b> Mimosa ynga Vell. (1835).<br><br>

                    <b>Nomes vulgares por Unidades da Federação:</b> <br><br>
                    Acre, ingá-de-metro; Amapá, ingá-cipó; Amazonas, ingá, ingá-cipó, ingá-doce, ingáde-metro, ingá-timbó, ingá-verdadeiro; Bahia, ingá e ingá-cipó; Ceará, ingá-cipó e ingá-rabode-macaco; Distrito Federal, ingá-cipó; Espírito Santo, ingá-macarrão; Mato Grosso do Sul, ingá; Minas Gerais, angá e ingá; Pará, abaremotemo, abavemo, engá, ingá, ingácaixão, ingá-cipó, ingá-da-beirada, ingá-doce, ingá-da-praia, ingá-opeapiíba, ingá-rabo-de-mico, ingá-timbó, ingá-verdadeiro, ingaí e rabo-de-mico; Paraná, ingá, ingá-banana e ingá-de-metro;  Piauí, ingá-cipó e ingá-rabo-de-macaco; Estado do Rio de Janeiro, ingá e ingá-cipó; Santa Catarina, ingá-cipó e ingá-de-quatro-quinas; São Paulo, ingá; Sergipe, ingazeira.<br><br> 

                    <b>Nomes vulgares no exterior:</b> Colômbia, guamo; Equador, guaba mansa; Guiana Francesa, pois sucre; e no Peru, guaba, guabo e guava.<br><br>

                    <b>Etimologia:</b> o nome genérico Inga é derivado do nome indígena da planta; o epíteto específico edulis significa “comestível” e refere-se à polpa doce que reveste as sementes (LITTLE; DIXON, 1983). O nome vulgar ingá vem do tupi-guarani ib (fruto) e cá (caroço, fruto de caroço), segundo Braga (1979) ou corrutela de y-igá, “o que é embebido ou úmido”, alusivo à polpa da semente (CORRÊA, 1984c).<br><br>
                """.trimIndent()

                biologia =
                    """
                    <b>Descrição Botânica</b>:<br><br>
                                        
                    <b>Forma biológica e foliação</b>: Inga edulis é uma espécie arbórea, de padrão foliar sempre-verde ou perenifólio (Perenifólio é um adjetivo que significa folha persistente ou perene, ou seja, um atributo de plantas que mantêm as suas folhas durante todo o ano) (MONTEIRO et al., 2007). As árvores maiores de ingá-cipó atingem dimensões próximas a 28 m de altura e 90 cm de DAP (DAP é a sigla para Diâmetro à Altura do Peito, que é uma medida do diâmetro de uma árvore a 1,30 metros de altura em relação ao solo), na idade adulta. Contudo, geralmente o porte da árvore varia de 5 m a 10 m de altura.<br><br> 
                                        
                    <b>Tronco</b>: geralmente é tortuoso e muito esgalhado. O fuste (fuste é a parte do caule de uma árvore que fica entre o solo e as ramificações principais, sem ramos) é curto ou inexistente.<br><br> 
                                        
                    <b>Ramificação</b>: é dicotômica (dividido ou subdividido em dois). A copa é densa, plana e espalhada. Os ramos terminais são angulares, semicilíndricos, ferrugíneo (Ferrugíneo é um adjetivo que significa coberto de ferrugem, oxidado ou rubiginoso), pulverulentos (Plantas que parecem ser cobertas de pó) e lenticelados (Lenticelado é um termo que se refere a órgãos de arejamento encontrados em plantas lenhosas, como caules, raízes e alguns frutos. As lenticelas são pequenas fendas no tecido suberificado do caule, que permitem a troca de gases entre a planta e o meio ambiente).<br><br> 
                                        
                                        
                    <b>Casca</b>: mede 10 mm de espessura. A casca externa (ritidoma) (Ritidoma é o nome dado à camada externa da casca de plantas lenhosas, composta por células mortas. É um tecido que protege a planta de choques mecânicos, evita a desidratação e atua como isolante térmico) é acinzentada e lisa, com poucas fissuras.<br><br> 
                                        
                    <b>Folhas</b>: são compostas, alternas e paripinadas (Folhas paripinadas são folhas compostas que possuem um número par de folíolos, terminando em dois folíolos) medindo de 22 cm a 29 cm de comprimento por 16 cm a 25 cm de largura, com 4 a 6 pares de folíolos cartáceos (Folíolo é um termo botânico que se refere a cada uma das partes que compõem o limbo de uma folha composta. Significado de Cartáceo: adjetivo [Botânica] seco, flexível e tenaz, como o papel e o pergaminho), discolores (Significado de discolor [Botânica] Que tem coloração diferente de um lado e de outro), oblongo lanceolados (oblongo é um adjetivo que significa algo que é mais comprido do que largo, ou seja, é alongado ou elíptico. Lanceolado: Que tem a forma do ferro da lança [ Botânica ] que tem o limbo estreito e comprido e termina numa ponta estreita (ex.: folhas lanceoladas)), medindo de 3,8 cm a 19 cm de comprimento por 1,9 cm a 8,9 cm de largura, com margem inteira, ápice agudo (Ápice agudo é um tipo de formato de extremidade de uma folha, que se refere à porção mais distante do ponto de inserção no ramo), obtuso (cuja extremidade é arredondada, de forma arredondada), cuspidado (diz-se quando o ápice de um de um órgão (folha, fruto ou semente) é mais ou menos alongado e termina gradualmente em ponta fina ou atenuado) a base é arredondada, truncada (em botância, significa que termina por um segmento de reta), ou assimétrica (quando as duas partes da base foliar não se terminam num mesmo ponto do pecíolo); a venação (Venação é o termo botânico que se refere à disposição das nervuras de uma folha. É um critério importante para identificar grupos taxonómicos de plantas com flor) é eucampdódroma (Eucamptódroma: este tipo de venação se diferencia da camptódroma por apresentar nervuras secundárias fortemente encurvadas com parte destas curvas) a broquidódroma (Broquidódroma: as nervuras secundárias formam arcos enlaçados próximo a margem (nervura coletora) , com nervuras secundárias com 6 a 20 pares, paralelas a convergentes; apresenta glândula ou nectário foliar (Nectário, ou glândula nectarífera, é toda glândula em um organismo vegetal a princípio capaz de produzir e secretar néctar, são comuns nectários em flores) na inserção dos folíolos (Folíolo é um termo botânico que se refere a cada uma das partes que compõem o limbo de uma folha composta), é reniforme (Reniforme significa que algo tem a forma de um rim), séssil (Em botânica, séssil é um adjetivo que se refere a um órgão que não tem pecíolo, haste de suporte ou outro suporte, inserindo-se diretamente no órgão principal. Por exemplo, folhas sésseis), cupuliforme achatada (Caule achatado ou laminar especialmente adaptado à função fotossintética, em forma de cúpula, ou taça, curvinérveo), mas que retém a sua função de caule nele se inserindo por vezes ramos, folhas , com abertura longitudinal, medindo de 1 mm a 3 mm de diâmetro; as estípulas (Em botânica, estípulas são apêndices com formato de escama que se encontram na base das folhas de muitas plantas vasculares, geralmente dois, um de cada lado do pecíolo), medem de 2 mm a 6 mm de comprimento, são oblongas ou lanceoladas (oblongo é um adjetivo que significa algo que é mais comprido do que largo, ou seja, é alongado ou elíptico. Lanceolado: Que tem a forma do ferro da lança [ Botânica ] que tem o limbo estreito e comprido e termina numa ponta estreita (ex.: folhas lanceoladas)), pulverulentas (Plantas que parecem ser cobertas de pó) e caducas (que cai regularmente numa época do ano (ex.: folha caduca)), o pecíolo (Em botânica, o pecíolo é a parte da folha que liga o limbo ao caule ou à bainha, e que serve de suporte e sustentação. O pecíolo é também conhecido como pé da folha), é cilíndrico, não alado (quando provido de ala ou com uma expansão em forma de asa), ferrugíneo (Ferrugíneo é um adjetivo que significa coberto de ferrugem, oxidado ou rubiginoso), pubescente (Diz-se da planta (ou órgão vegetal) caracterizada por demonstrar pubescência (penugem)), e mede de 2 cm a 5 cm de comprimento e 0,1 a 0,2 cm de diâmetro.<br><br>
                                        
                    <b>Inflorescências</b>: são espiciformes (em forma de espátula, ou seja, achatado, oblongo, arredondado no ápice e longamente atenuado para a base), condensadas no ápice (ponta ou extremidade superior de alguma coisa) , solitárias ou agregadas em fascículos (em botânica, fascículo é um conjunto de folhas ou flores agrupadas em uma bainha que serve de base comum. Pode ser chamado de fascículo foliar ou floral), medindo de 4 cm a 13 cm de comprimento.<br><br>
                                        
                    <b>Flores</b>: são hermafroditas (organismo que possui órgãos reprodutores masculinos e femininos completos ou parciais), perfumadas, sésseis (em botânica, o termo "sésseis" refere-se a um órgão que não possui pecíolo ou haste de suporte, inserindo-se diretamente no órgão principal. Por exemplo, folhas sésseis), com corola dourado-serícea (Corola é o conjunto de pétalas de uma flor, sendo o verticilo interno do perianto, que é o conjunto de pétalas e sépalas. A palavra corola vem do latim corolla, que significa "pequena flor". Dourado-serícea: quando a superfície do órgão é revestida de muitos pêlos retos e deitados, formando um aspecto sedoso), tubular ou infundibuliforme  (infundibuliformis; infundibularis = afunilado. Inovação (Innovatio). Rebento basilar que renova uma planta herbácea), medindo de 0,9 cm a 1,9 cm de comprimento.<br><br> 
                                        
                    <b>Fruto</b>: é do tipo folículo (em botânica, folículo é um fruto simples, seco e deiscente, ou sej que cai naturalmente), medindo de 30 cm a 200 cm de comprimento por 2 cm a 5 cm de largura; é também reto, curvado ou torcido, convexo, variando do verde ao castanho, quando maduro, com nervações longitudinais (a disposição do conjunto das nervuras de uma folha ou fruto é designado por venação ou nervação, constituindo um importante critério de diagnóstico na identificação dos grupos taxonómicos das plantas com flor), é também profundamente sulcado (um fruto sulcado é um fruto depresso-globoso com três sulcos e deiscência loculicida. As sementes são numerosas, papiráceas, oval-depressas a arredondadas, ou globosas, cinza-escuras a pretas), coriáceo (adjectivo. Que tem o aspecto ou a dureza de couro (ex.: a castanha tem uma casca coriácea)),esparsamente tomentoso (fruto tomentoso uniforme, fino e preto, com diminutos e esparsos pêlos simples), com ápice agudo (em botânica, o ápice agudo de um fruto é a extremidade do fruto que termina em um ângulo menor que 90º) a rostrado (Rostrado: ápice do fruto que apresenta suas laterais enroladas e fundidas, formando uma espécie de bico rígido), base arredondada, margens espessas e lobadas (Expansão lobada, semelhante a uma pequena orelha, na base de órgãos laminares, como folhas, sépalas, etc., ou no ápice de alguns frutos, dividida em lobos,Fendida: Com fendas, podendo chegar até a nervura centra) não apiculado (apiculado (apiculatus). Provido de apículo. Apículo (Apiculum). Ponta ... Flor fértil: a que produz fruto com sementes capazes de originar novas plantas), e estipitado (O fruto estipitado, também conhecido como ovário pedunculado, é aquele em que a parte basal do ovário forma uma estrutura estreitada em forma de pedúnculo, chamada de ginopódio).<br><br> 
                                        
                    <b>Sementes</b>: são elipsoides (semente/propágulo que se apresenta com o formato de uma elipse), lisas e glabras (sem pêlos), medindo de 2 cm a 3 cm de comprimento por 1 cm a 1,5 cm de largura, revestidas por arilo (Arilo é um termo botânico que se refere a uma cobertura carnuda que envolve algumas sementes), branco, macio, fibroso (fibroso (fibrosus). Semente que possui fibras ou é delgado e comprido como uma fibra) e adocicado.<br><br>
                                        
                    <b>Biologia Reprodutiva e Eventos Fenológicos</b>:<br><br> 
                                        
                    <b>Sistema sexual</b>: Inga edulis é uma espécie hermafrodita (organismo que possui órgãos reprodutores masculinos e femininos completos ou parciais).<br><br> 
                                        
                    <b>Vetor de polinização</b>: provavelmente, essa espécie seja polinizada por melitofilia (Melitofilia é um termo botânico que se refere a um sistema de polinização em que plantas atraem abelhas e vespas para polinizá-las), um sistema de polinização em que determinadas espécies de plantas atraem insetos, especialmente abelhas e vespas, para que eles possam fazer sua polinização (a polinização é o processo de transferência do pólen da parte masculina de uma flor para a parte feminina, permitindo a fertilização e a produção de sementes). Nesse caso, as flores atraem esses insetos por meio de uma combinação de formas, cores e aromas.<br><br> 
                                        
                    <b>Floração</b>: de setembro a dezembro, no Amazonas (SOUSA et al., 2011), de outubro a dezembro, em Pernambuco (LOCATELLI; MACHADO, 2004); de novembro a abril, no Estado de São Paulo (TALORA; MORELLATO, 2000); de janeiro a março, no Estado do Rio de Janeiro (SANTOS, 1979), e de janeiro a maio, no Acre (DEUS et al., 1993).<br><br> 
                                        
                    <b>Frutificação</b>: é assincrônica (frutificação que não acontece ou não se efetiva ao mesmo tempo) por população, permitindo a produção de frutos quase o ano inteiro. Os frutos maduros ocorrem de outubro a novembro, no Estado do Rio de Janeiro (SANTOS, 1979); de dezembro a janeiro, no Paraná (MARTINS et al., (MARTINS et al., 2004), de dezembro a março, em Pernambuco (LOCATELLI; MACHADO, 2004) e de maio a dezembro, no Acre (FIRMINO, 1990). Em plantio, os indivíduos dessa espécie começam a produzir frutos com menos de 2 anos de idade (PRANCE; SILVA, 1975).<br><br>
                                        
                    <b>Dispersão de frutos e sementes</b>: por zoocoria (é o processo de dispersão de sementes, frutos ou esporos por meio de animais), por várias espécies de animais silvestres, destacando-se pássaros e mamíferos (LOCATELLI; MACHADO, 2004) e peixes (SILVA; SADDI, 1989) e por hidrocoria (é o processo de dispersão de sementes, frutos ou esporos através da água).<br><br>
                                        
                    <b>Qualidade das sementes</b>: A qualidade das sementes é importante para reconhecer o potencial de aproveitamento. Em média o grau de pureza das sementes é de 42,5 ± 11,72%. Estas informações também são importantes para a viabilização de viveiros experimentais em escolas da região amazônica (OLIVEIRA, A.V. 2024).<br><br>
                                        
                    <b>Ocorrência Natural</b>:<br><br>
                                        
                    <b>Latitudes</b>: de 10°N, na Venezuela. No Brasil, de 4°N, no Amapá, a 27°S, em Santa Catarina.<br><br> 
                                        
                    <b>Variação altitudinal</b>: de 10 m, no Estado de São Paulo, até 1.200 m, em Roraima.<br><br> 
                    """.trimIndent()

                ecologia =
                    """
                    <b>Aspectos Ecológicos:</b><br><br>

                    <b>Grupo sucessional:</b> Inga edulis é uma espécie pioneira (DURIGAN; NOGUEIRA, 1990), a secundária inicial (GARCIA et al., 2011). Apresenta ciclo de vida inferior a 20 anos (PRANCE; SILVA, 1975). <br><br>

                    <b>Importância sociológica:</b> o ingá-cipó é uma árvore de sub-bosque (é um termo botânico que se refere à vegetação de baixa estatura que cresce abaixo do dossel florestal), sendo comum na vegetação secundária. Numa mata do sul da Bahia, após 11 anos da retirada dos cacaueiros, foram encontrados 81 indivíduos dessa espécie em 1 ha, o terceiro maior índice de dispersão, com altura média de 6,27 m e DAP (Diâmetro na Altura do Peito) de 4,2 cm (FERNANDES; VINHA, 1984).<br><br> 

                    <b>Regeneração natural:</b> essa espécie foi observada regenerando-se num fragmento de Floresta Estacional Semidecidual (é um tipo de vegetação que se caracteriza por ter entre 20% e 50% das árvores perdendo as folhas no período desfavorável), Montana, em Viçosa, MG (GARCIA et al., 2011).<br><br>
                    """.trimIndent()

                consumo =
                    """
                    <b>Produtos e Utilizações:</b> <br><br>

                    <b>Aproveitamento alimentar:</b> a polpa que cobre as sementes dessa espécie é comestível, muito apreciada e consumida pelas populações de várias Unidades da Federação, onde Inga edulis ocorre, por causa da sua maciez e doçura (BERG, 1982; ANDERSER; ANDERSEN, 1988; DEUS et al., 1993).<br><br> 

                    <b>Apícola:</b> essa espécie é de grande potencial melífero (para produção de mel), com produção de néctar (solução açucarada produzida pelos vegetais em estruturas especializadas, os nectários, que serve de estímulo aos animais polinizadores ou dispersores de sementes e esporos e a partir da qual as abelhas fazem o mel) e de pólen (é o nome dado aos grãos minúsculos produzidos pelas flores das plantas com flores, que contêm o gameta masculino da planta).<br><br>

                    <b>Celulose e papel:</b> a madeira do ingá-cipó é adequada para esse uso. <br><br>

                    <b>Energia:</b> a madeira dessa espécie é de excelente qualidade para lenha (madeira utilizada como combustível, como ramos, troncos, achas, cavacos, ou qualquer pedaço de madeira) e carvão (Substância sólida, de origem mineral, vegetal ou animal, que pode ser usada como combustível. O carvão é composto principalmente por carbono, mas também contém hidrogênio, compostos orgânicos e inorgânicos).<br><br> 

                    <b>Madeira serrada e roliça:</b> a madeira de I. edulis não é indicada para uso comercial, sendo usada, ocasionalmente, em obras internas, em caixotaria (amontoado ou conjunto de caixotes, conjunto de caixas feitas de madeira) e na confecção de cangalhas (Triângulo de madeira que se coloca no pescoço dos porcos ou bois para não devastarem hortas cultivadas. Artefato, geralmente de madeira, acolchoado, que se coloca no lombo dos animais para pendurar carga.  (BOITEUX, 1947).<br><br> 

                    <b>Medicinal:</b> na medicina popular, o xarope (substância medicamentosa, de natureza líquida e adocicada, geralmente utilizada com finalidades terapêuticas). da polpa é indicado contra bronquite (é uma inflamação dos brônquios, os tubos que levam o ar para os pulmões), (DEUS et al., (1993) e a casca serve para curar feridas e diarreia (é um desarranjo intestinal caracterizado por um aumento no número de evacuações e fezes amolecidas ou líquidas), (PRANCE; SILVA, 1975).<br><br> 

                    <b>Alerta:</b> as informações sobre o uso medicinal dessa espécie são apenas um registro factual da pesquisa, não devendo servir de orientação para prescrever tratamento, curar, aliviar ou prevenir qualquer doença, muito menos substituir cuidados médicos adequados.<br><br> 

                    <b>Paisagístico:</b> espécie mais indicada para sombreamento, principalmente à beira de rios, lagos e represas (ÁRVORES…, 1997). É usada na arborização urbana de várias cidades brasileiras, entre as quais a capital do País, Brasília, DF, Seropédica, RJ, e a cidade serrana de Ubajara, CE (COUTINHO et al., 1998).<br><br> 

                    <b>Plantios com finalidade ambiental:</b> quando plantado à beira de rios, os frutos do ingá-cipó alimentam os peixes (SILVA; SADDI, 1989; ÁRVORES…, 1997). Essa espécie suporta encharcamento (o encharcamento do solo provoca falta de oxigênio (asfixia) nas raízes e consequentemente a sua morte) e inundação (grande alagamento ou fluidez no volume de águas, em consequência de chuvas, subida de maré etc.; enchente, cheia de rios), (DURIGAN; NOGUEIRA, 1990).<br><br>

                    <b>Substâncias tanantes:</b> no Acre, a casca de I. edulis serve para curtume (DEUS et al., (1993).<br><br>
                    	
                    <b>Composição do Ingá – Potencial Biotecnológico:</b><br><br>

                    <b>Variação do teor de carboidratos (são macronutrientes que fornecem energia para o organismo, sendo a principal fonte de combustível para o corpo. São também conhecidos como glicídios, hidratos de carbono ou açúcares):</b> pode variar de 58,10% a 62,16%.<br><br> 

                    <b>Variação do teor de Proteínas (macromoléculas orgânicas complexas e essenciais para o funcionamento do organismo humano. Elas são formadas por aminoácidos ligados entre si por ligações peptídicas e desempenham diversas funções no corpo):</b> o teor de proteínas pode variar de 15,87% a 20,12%. O teor de proteína não é alto, no entanto no uso desta biomassa há contribuição para alimentação humana e animal. Também indica um potencial de  aproveitamento biotecnológico, uma vez que as proteínas são feitas de unidades de aminoácidos, os quais tem valores nutricionais se a biomassa for hidrolisada (é um adjetivo que significa que algo se hidrolisou, ou seja, que sofreu um processo de hidrólise. A hidrólise é um fenômeno químico que ocorre quando uma molécula é quebrada em moléculas menores, na presença de água).<br><br>

                    <b>Grupo substâncias:</b> formadas por glicose (é um tipo de açúcar, também conhecido como monossacarídeo, que é a principal fonte de energia do organismo humano. A glicose é obtida através da alimentação e é um dos principais nutrientes das células), frutose (é um açúcar simples, também conhecido como "açúcar de fruta", que é um carboidrato importante para o organismo humano e para a maioria das plantas), sacarose (é o nome da substância química que compõe o açúcar de mesa, também conhecido como açúcar comum), xilose (é um açúcar simples, também conhecido como pentose ou açúcar da madeira), arabinose (é um monossacarídeo, ou seja, um açúcar natural, é uma aldopentose: um monossacarideo constituído por cinco átomos de carbono (pentose) e com um grupo funcional aldeído (CHO) e outros. <br><br>

                    <b>Levantamento bibliográfico:</b> Quando realiza-se o levantamento bibiográfico do Inga edulis, obtém-se para os últimos 5 anos (2018-2023) 23 artigos de pesquisa que tem em seu título este nome científico. Estes documentos apresentam termos que indicam alguns potenciais de uso da planta como: inseticida (é uma substância ou mistura de substâncias que serve para matar, repelir ou evitar insetos), agroflorestal (é um adjetivo que se refere a um sistema de produção agrícola que combina a exploração do solo com o cultivo de espécies florestais, como árvores e arbustos, em conjunto com culturas agrícolas ou forrageiras), proteínas (são macromoléculas complexas, formadas por aminoácidos ligados entre si, que são essenciais para o funcionamento do organismo), ecológico (relativo à ecologia, à ciência que estuda as relações entre os seres vivos e o meio ambiente), antioxidante (são substâncias que protegem o organismo contra os radicais livres, moléculas instáveis que podem danificar as células. A oxidação é um processo natural que ocorre no corpo, mas pode ser agravado por fatores como: Consumo excessivo de bebidas alcoólicas, Exposição ao sol, Tabagismo, Alimentação inadequada, Excesso de medicamentos), plantio de extratos, agentes antifungicos (um antifúngico ou antimicótico é uma medicação fungicida ou fungistático farmacêutica utilizada para tratar e prevenir micoses como pé de atleta), sequencia de aminoácidos (compostos orgânicos que formam as proteínas do corpo humano, sendo essenciais para a construção e reparação de tecidos), semente e antocianinas (são pigmentos naturais solúveis em água, que conferem cores vermelhas, roxas e azuis a flores, frutas e folhas).<br><br>
                    Aplicações da semente relacionadas ao aproveitamento dos polissacarídeos (são carboidratos complexos, formados por longas cadeias de monossacarídeos, que se ligam entre si por ligações glicosídicas) não são observadas nas bases de dados de periódicos nem para os últimos 20 anos. Pelo perfil de produção do I. Edulis, há um grande potencial de aproveitamento dos polissacarídeos, no entanto não está documentado.<br><br>

                    <b>Composição de nutrientes e o uso do Ingá cipó (Inga Edulis Martius) como biofertilizante (é um adubo orgânico líquido ou sólido que contém nutrientes e organismos que melhoram a saúde das plantas e do solo):</b> os macronutrientes e micronutrientes encontrados (Nitrogênio, Fósforo, Potássio, Cálcio, Magnésio, Enxofre, Boro, Cobre, Ferro, Manganês, Zinco, Molibdênio e Alumínio) demonstram um potencial para uso da semente de Ingá na fertilização (é o processo de aplicação de fertilizantes, também conhecidos como adubos, no solo para repor os nutrientes necessários para o desenvolvimento das plantas) do solo como biofertilizante. Não houve detecção de elementos nocivos como Chumbo e Cádmio. Alumínio foi encontrado em 0,02 mg.<br><br>
                    Dentre outras formas de uso, dá-se destaque o uso do Ingá cipó (Inga edulis Martius) como biofertilizante utilizado na adubação verde. Esta prática consiste na reciclagem (é o processo de reaproveitamento de materiais descartados para a produção de novos produtos ou matéria-prima) de nutrientes através da adição de biomassa vegetal fresca ao solo, em cobertura ou por incorporação, por planta produzida ou não no local, com o intuito de recuperar ou conservar a produtividade da terra. A entrada de matéria orgânica promove melhorias físicas, químicas e biológicas nas áreas inseridas, contribuindo para o aumento da porosidade (é a fração do volume total de um solo que pode ser ocupada por ar e água. A porosidade é uma medida do espaço poroso do solo, sem considerar o tamanho e a distribuição dos poros) do solo, maiores capacidade de infiltração (é o processo pelo qual a água penetra na superfície do solo e percorre verticalmente, molhando camadas mais profundas) e retenção de água (Souza et al., 2012). A utilização dessa espécie de leguminosa nodulífera (é um processo essencial para a formação de nódulos nas raízes, onde bactérias fixadoras de nitrogênio atuam) (Ingá edulis Mart.), rústica (é uma espécie que se adapta às condições de uma região e cresce sem necessidade de cuidados especiais), com rápido crescimento e potencial no fornecimento de biomassa para o enriquecimento da fertilidade de solos ou recuperação ambiental, pode fornecer maior detalhamento na melhoria da qualidade dos Latossolos (é um tipo de solo mineral que se caracteriza por ser a principal classe de solos no Brasil, ocupando cerca de 39% do território nacional) em quintais agroflorestais na região da Amazônia Central, contribuindo para enriquecer os solos da região. As plantas do gênero, embora considerado apenas para a produção de frutos, possuem multifunções, as quais contribuem para a recuperação de áreas degradadas, sendo elemento importante em sistemas agroflorestais (Pinho et al., 2011).<br><br> 
                    """.trimIndent()

                cultivo =
                    """
                    <b>Cultivo em viveiros:</b><br><br>

                    <b>Implantação de Viveiros Florestais Experimentais em Escolas:</b> o Ingá está sendo utilizado para atividades de educação ambiental, produção de mudas, arborização e paisagismo em escolas da cidade de Manaus - Amazonas e região metropolitana, onde 50 sementes (10 sementes de cada matriz (árvore de Ingá)) são levadas para serem germinadas, através do uso de uma câmara seca (Banco de Germoplasma Vegetal (é o conjunto de amostras de material genético de uma espécie vegetal, que pode ser parte da planta, de seus órgãos ou de seu tecido. É a fonte de variabilidade genética que pode ser usada para melhorar plantas. O germoplasma pode ser de uma espécie, população, cultivar ou híbrido. Ele é transmitido de uma geração para outra, sexualmente ou somaticamente, através de células reprodutivas. O germoplasma é importante para a conservação da biodiversidade vegetal, e para impedir a extinção de espécies. Para isso, é necessário coletar, armazenar e administrar o germoplasma, de forma a manter sua viabilidade, diversidade e quantidade. A conservação do germoplasma pode ser feita "in situ", em áreas naturais ou administradas, ou "ex situ", em bancos de sementes, jardins botânicos ou repositórios de tecidos. Este Banco de Germoplasma Vegetal (BGV), vem produzindo mudas para implantação de um viveiro florestal experimental desta espécie a cada semestre, ajudando na preservação ambiental e recuperação de áreas degradadas, além de promover o ensino, a pesquisa e a extensão.<br><br> 

                    <b>Características Silviculturais:</b> Inga edulis é uma espécie heliófila (diz-se do ser vivo que tem necessidade da luz solar, que vive de preferência ao sol, planta que necessita de luz solar), ou esciófila (tolerante à sombra), medianamente tolerante a geadas (orvalho congelado que, sob a forma de fina camada branca, recobre as superfícies onde cai).<br><br>

                    <b>Hábito:</b> o tronco do ingá-cipó possui ramificação acentuada. <br><br>

                    <b>Sistemas de plantio:</b> Inga edulis é uma alternativa para plantios florestais mistos nos trópicos, crescendo bem em ambientes abertos. Deus et al. (1993) afirmam que essa espécie tem potencial para plantio em capoeira (a capoeira é uma vegetação secundária que cresce em terrenos abandonados ou roçados após a derrubada de uma mata primária. O termo vem do tupi e significa "mato do passado", sendo composto pelas palavras ka'a ("mato") e uera ("do passado") inicial, ou em consórcio com outras espécies de rápido crescimento, a pleno sol. <br><br>

                    <b>Sistemas agroflorestais (SAFs):</b> o sombreamento proporcionado pelos ingazeiros pode beneficiar culturas intercaladas, como as do café e do cacau (CASTRO; KRUG, 1951). Em toda a Amazônia e nos arredores de Manaus, AM, os indivíduos de I. edulis são cultivados para sombreamento do café em quintais caseiros (RIBEIRO et al., 1999). Em sistemas agroflorestais (um sistema de uso da terra que combina a plantação de árvores ou arbustos com a cultura de produtos agrícolas, forragens ou animais) no Acre, essa espécie mostrou potencial como sombreadora para espécies que necessitam de sombra no início de seu desenvolvimento, crescendo posteriormente bem, a pleno sol (DEUS et al., 1993).<br><br>

                    <b>Crescimento e Produção:</b> Existem poucos dados sobre o crescimento de I. edulis, em plantios. Contudo, seu crescimento é rápido.<br><br>
                    	
                    <b>Colheita e beneficiamento:</b> as vagens do ingá-cipó devem ser colhidas, diretamente, da árvore, quando iniciarem a queda, ou recolhidas no chão. Em seguida, devem ser abertas, manualmente, para que se possa retirar as sementes, envoltas pelo arilo (em botânica, arilo é uma cobertura carnuda que envolve algumas sementes). <br><br>

                    <b>Número de sementes por quilograma:</b> de 565 a 1.250 sementes por quilo (SANTOS, 1979; LORENZI, 2009). <br><br>

                    <b>Tratamento pré-germinativo:</b> não há necessidade.<br><br>

                    <b>Longevidade e armazenamento:</b> as sementes de I. edulis são de comportamento fisiológico recalcitrante (sementes recalcitrantes não suportam armazenamento por longos períodos de tempo após seu desligamento da planta-mãe, dado que, à medida que sofrem dessecação sua vitalidade é proporcionalmente reduzida), não sendo recomendado seu armazenamento. O potencial de armazenamento dessas sementes é baixo, considerando-se um período de 60 dias (BARBOSA; BARBOSA, 1985). <br><br>

                    <b>Germinação em laboratório:</b> os melhores substratos para a germinação das sementes do ingá-cipó foram entre areia, entre rolo de papel e sobre papel. A temperatura que proporcionou maior velocidade de germinação foi 30 °C (BARBOSA; BARBOSA, 1985).<br><br>
                    	

                    <b>Produção de Mudas:</b> <br><br>

                    <b>Semeadura:</b> recomenda-se semear as sementes em sacos de polietileno com 20 cm de altura por 7 cm de diâmetro, ou em tubetes (são recipientes utilizados para o cultivo de mudas de plantas em viveiros, sendo uma opção prática e eficiente para a produção em larga escala) de polipropileno (é uma resina termoplástica de baixa densidade e aparência semitranslúcida e leitosa, com excelente coloração. Sua cadeia o torna facilmente moldável em altas temperaturas. Oferece um bom equilíbrio de propriedades térmicas, químicas e elétricas) de 120 cm. Eventualmente, podem-se usar canteiros (é um pedaço de terreno delimitado para o cultivo de plantas), com areia e recobertos com palha.<br><br> 

                    <b>Germinação:</b> é do tipo semihipógea (quando ocorre primeiro o surgimento do eixo embrionário da plântula, que é a parte vital do embrião de uma planta, que possui a capacidade de crescimento e de formar um novo indivíduo adulto), (OLIVEIRA, 1999). As sementes de I. edulis apresentam germinação precoce, muitas vezes observada no interior do fruto maduro. A emergência (é um estágio fundamental no ciclo de vida vegetal, marcando o início do crescimento de uma semente recém-germinada. Essa sequência complexa de eventos envolve desde a absorção de água pela semente até o aparecimento da radícula, que dará origem à raiz primária da planta) ocorre de 4 a 30 dias, podendo obter-se um índice de 71% a 100%. O tempo de produção das mudas varia de 3 a 4 meses após a semeadura. <br><br>

                    <b>Associação simbiótica:</b> o ingá-cipó é uma leguminosa fixadora de nitrogênio (N). Souza et al. (1994) e (OLIVEIRA, 1999) constataram que, quando cultivada em viveiro, essa espécie tem capacidade de formar nódulos de Rhizobium (Rizóbios são bactérias do solo que possuem habilidade para induzir a formação de nódulos nas raízes (Nódulos radiculares são estruturas encontradas na raiz das plantas, geralmente em leguminosas, que dão origem à simbiose por meio da fixação de nitrogênio) e, em alguns casos no caule, de plantas leguminosas nas raízes. Os nódulos são esféricos e brancos. Neste mesmo estudo, também foi constatada nodulação (é o processo de formação de nódulos nas raízes das plantas, que ocorre quando bactérias fixadoras de nitrogênio colonizam as raízes) em plantas crescendo em floresta secundária, no Amazonas. <br><br>

                    <b>Cuidados especiais:</b> Martins et al. (2004) recomendam usar adubação orgânica em saco plástico (25% do volume de solo) ou adubação química (4 kg m-3 de NPK na formulação 4:</b>14:</b>8). Contudo, os mesmos autores recomendam aplicar 100 g de adubo comercial de liberação lenta para cada saco de substrato de 25 kg, quando a muda for produzida em tubetes (são recipientes utilizados para o cultivo de mudas de plantas em viveiros, sendo uma opção prática e eficiente para a produção em larga escala). Caso a muda permaneça por mais de 90 dias no viveiro, deve-se complementar o substrato com adubação foliar (1 kg 500 L-1 de água).<br><br>

                    <b>Principais Pragas:</b> <br><br>

                    As formigas-cortadeiras (Ata spp.) são sempre nocivas, devendo ser combatidas sistematicamente. Outra praga que se controla com um plano bem formulado de aplicação de iscas envenenadas (estratégia recomendada para o controle das moscas das frutas, com utilização de iscas-tóxicas a qual deve ser formulada com inseticida associado) é a mosca-das-frutas (Anastrefa sp.). A lagarta da bela borboleta azul (Morpho laertes) também ataca as folhas do ingá-cipó. Foram observados ramos cortados por Oncideres saga (Coleoptera: Cerambycidae) em I. edulis, na arborização urbana, no Estado do Rio de Janeiro (COUTINHO et al., 1998).<br><br>
                    		
                    <b>Solos:</b> <br><br>

                    Inga edulis ocorre, naturalmente, em solo brejoso, de lençol freático (é a camada superior das águas subterrâneas, que se encontra, geralmente, em pequena profundidade e é abastecido pelas águas das chuvas, de onde se extrai boa parte da água para consumo e produção humanos) superficial. Na Amazônia, ocorre em solos de textura argilosa (são caracterizados por encharcarem com relativa facilidade no Inverno e tornarem-se excessivamente secos no Verão. Um solo com textura argilosa é também considerado um “solo pesado” e por essa razão revela-se difícil de ser trabalhado) (SOUZA et al., 1994). O pH desses solos varia de 4,7 a 5,8 (HARA; OLIVEIRA, 2004).<br><br>
                    """.trimIndent()

                referencias =
                    """
                    ÁRVORES ornamentais. São Paulo: Europa, 1997. 82 p. Edição especial da Revista Natureza.<br><br>

                    ANDERSEN, O.; ANDERSEN, V. U. As frutas silvestres brasileiras. Rio de Janeiro: Globo, 1988. 203 p. (Coleção do agricultor. Frutas).<br><br>

                    BARBOSA, J. M.; BARBOSA, L. M. Avaliação dos substratos, temperaturas de germinação e potencial de armazenamento de sementes de três frutíferas silvestres. Ecossistema, Espírito Santo do Pinhal, v. 10, p. 152-160, 1985.<br><br>

                    BERG, M. E. van den. Aproveitamento alternativo de essências florestais amazônicas. Silvicultura em São Paulo, São Paulo, v. 16-A, pt. 1, p. 226-231, 1982. Edição dos Anais do Congresso Nacional sobre Essências Nativas, 1982, Campos do Jordão.<br><br>

                    BOITEUX, H. Madeiras de construção de Santa Catarina. Florianópolis: IBGE, 1947. 108 p. (IBGE. Publicação, 27).<br><br>

                    BRAGA, P. I. S. Subdivisão fitogeográfica, tipos de vegetação, conservação e inventário florístico da Floresta Amazônica. Acta Amazônica, Manaus, v. 4, n. 9, p. 53-80, 1979. Suplemento.<br><br>

                    CARVALHO, Paulo Ernani Ramalho. Espécies arbóreas brasileiras. Brasília, DF: Embrapa, 2014.<br><br>

                    CASTRO, Y. G. P.; KRUG, H. P. Experiências sobre germinação e conservação de sementes de “Inga edulis” espécie usada em sombreamento em cafeeiros. Ciência e Cultura, São Paulo, v. 3, n. 4, p. 263-4, 1951.<br><br>

                    "Conteúdo aberto. In: Wikipédia: a enciclopédia livre. Disponível em: https://pt.wikipedia.org/wiki/Conteúdo_aberto. Acesso em: 3 out. 2024" <br><br>

                    CORRÊA, M. P. Dicionário das plantas úteis do Brasil e das exóticas cultivadas. [reimp.]. Rio de Janeiro: Serviço de Informação Agrícola, 1984a. v. 1.<br><br>

                    CORRÊA, M. P. Dicionário das plantas úteis do Brasil e das exóticas cultivadas. [reimp.]. Rio de Janeiro: Serviço de Informação Agrícola, 1984c. v. 3.<br><br>

                    COUTINHO, C. L.; CARVALHO, A. G.; OLIVEIRA, E. da S; VEIGA, B. G. A. da. Oncideres saga (Dalmon, 1823) (Coleoptera, Cerambycidae) e a arborização urbana em Seropédica, RJ. Floresta e Ambiente, Seropédica, v. 5, n. 1. p. 50-54, jan./dez. 1998.<br><br>

                    DEUS, C. E. de; WEIGAND JUNIOR, R.; KAGEYAMA, P. Y.; VIANA, V. M.; FERRAZ, P. de A.; BORGES, H. B. N.; ALMEIDA, M. C.; SILVEIRA, M.; VICENTE, C. A. R. Comportamento de 28 espécies arbóreas tropicais sob diferentes regimes de luz em Rio Branco, Acre. Rio Branco: Ed. da Universidade Federal do Acre, 1993. 170 p.<br><br>

                    DURIGAN, G.; NOGUEIRA, J. C. B. Recomposição de matas ciliares. São Paulo: Instituto Florestal, 1990. 14 p. (IF. Série registros, 4).<br><br>

                    FERNANDES, E. N.; VINHA, S. G. da. Recomposição florística do Parque Zoobotânico do Centro de Pesquisa do Cacau. Revista Theobroma, Ilhéus, v. 14, n. 1, p. 1-25, 1984.<br><br>

                    FIRMINO, J. L. Informações preliminares sobre a frutificação e a germinação de espécies frutíferas e florestais da região de Rio Branco – AC. 1990. 30 f. Monografia (Graduação em Biologia) – Parque Zoobotânico, Universidade Federal do Acre, Rio Branco.<br><br>

                    GARCIA, C. C.; REIS, M. das G. F.; REIS, G. G. dos; PEZZOPANE, J. E. M.; LOPES, H. N. S.; RAMOS, D. C. Regeneração natural de espécies arbóreas em fragmento de Floresta Estacional Semidecidual montana, no domínio da Mata Atlântica, em Viçosa, MG. Ciência Florestal, Santa Maria, v. 21, n. 4, p. 677-688, out./dez. 2011.<br><br>

                    HARA, F. A. dos S.; OLIVEIRA, L. A. Características fisiológicas e ecológicas de isolados de rizóbios oriundos de solos ácidos e álicos de Presidente Figueiredo, Amazonas. Acta Amazonica, Manaus, v. 34, n. 3, p. 343-357, 2004.<br><br>

                    LITTLE, E. L.; DIXON, R. G. Arboles comunes de la Provincia de Esmeraldas, Ecuador. Washington, DC: Peace Corps, 1983. 536 p.<br><br>

                    LOCATELLI, E.; MACHADO, I. C. Fenologia das espécies arbóreas de uma mata serrana (brejo de altitude) em Pernambuco, Nordeste do Brasil. In: PORTO, K. C.; CABRAL, J. J. P.; TABARELLI, M. (Org.). Brejos de altitude em Pernambuco e Paraíba: história natural, ecologia e conservação. Brasília, DF: Ministério do Meio Ambiente, 2004. p. 255-276. (Série biodiversidade, 9).<br><br>

                    LORENZI, H. Árvores brasileiras: manual de identificação e cultivo de plantas arbóreas nativas do Brasil. Nova Odessa: Instituto Plantarum, 2009. v. 3, 384 p.<br><br>

                    MARTINS, S. S.; SILVA, I. C.; DE BORTOLO, L.; NEPOMUCENO, A. N. Produção de mudas de espécies florestais nos viveiros do Instituto Ambiental do Paraná. Maringá: Clichetec, 2004. 185 p.<br><br>

                    MONTEIRO, A. de M. e S.; SANTOS, J. U. M. dos; BASTOS, M. de N. do C.; JARDIM, M. A. G. Contribuição ao estudo fenológico das espécies do gênero Inga P. Muller (Leguminosae – Mimosoideae), ocorrentes na Reserva Mocambo, Belém, Pará. In: GOMES, J. I.; MARTINS, M. B.; MARTINS-DASILVA, R. C. V.; ALMEIDA, S. S. (Ed.). Mocambo: diversidade e dinâmica biológica da Área de Pesquisa Ecológica do Guamá (APEG). Belém, PA: Museu Paraense Emílio Goeldi: Embrapa Amazônia Oriental, 2007. p. 293-307.<br><br>

                    OLIVEIRA, D. M. T. Morfologia de plântulas e plantas jovens de 30 espécies arbóreas de Leguminosae. Acta Botanica Brasilica, São Paulo, v. 13, n. 3, p. 263- 269, 1999.<br><br>

                    PINHO, R.C.; Alfaia, S.S.; Miller, R.P.; Uguen, K.; Magalhães, L.D.; Ayres, M.; Freitas, V.; Trancoso, R. 2011. Islands of fertility: Soil improvement under indigenous homegardens in the savannas of Roraima, Brazil. Agroforest Syst. 81: 235-247.<br><br>

                    PRANCE, G. T.; SILVA, M. F. da. Árvores de Manaus. Manaus: Inpa, 1975. 312 p.<br><br>

                    RIBEIRO, R. J.; HIGUCHI, N.; SANTOS, J. dos; AZEVEDO, C. P. de. Estudo fitossociológico nas regiões de Carajás e Marabá - Pará, Brasil. Acta Amazonica, Manaus, v. 29, n. 2, p. 207-223, 1999.<br><br>

                    SANTOS, N. dos. Fenologia. Rodriguésia, Rio de Janeiro, v. 31, n. 50, p. 223-226, 1979.<br><br>

                    SILVA, D. S. B.; SADDI, N. Frutos nativos da Ilha de Taiamã na alimentação da ictiofauna. In: CONGRESSO NACIONAL DE BOTÂNICA, 40., 1989, Cuiabá. Resumos... Cuiabá: Sociedade Botânica do Brasil, 1989. p. 83.<br><br>

                    SOUSA, J. dos S. de; BASTOS, M. de N. do C. O gênero Inga (Leguminosae-Mimosoideae) na Província Petrolífera de Urucu, Coari, Amazonas, Brasil. Rodriguésia, Rio de Janeiro, v. 62, n. 2, p. 283-297, 2011.<br><br>

                    SOUZA, L.A.G. 2012. Guia da biodiversidade de fabaceae do Alto Rio Negro. Projeto Fronteiras: Alto Rio Negro. Amazonas. p. 118.<br><br>

                    SOUZA, L. A. G. de; SILVA, M. F. da; MOREIRA, F. W. Capacidade de nodulação de cem leguminosas da Amazônia. Acta Amazonica, Manaus, v. 24, n. 1/2, p. 9-18, 1994.<br><br>

                    TALORA, D. C.; MORELLATO, P. C. Fenologia de espécies arbóreas em floresta de planície litorânea do Sudeste do Brasil. Revista Brasileira de Botânica, São Paulo, v. 23, n. 1, p. 13-26, 2000.<br><br>
                    """.trimIndent()
            }
        )
    }
}