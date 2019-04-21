package Modelo;

public interface Interface {
	String []interesesC= {"Organizativo","supervision","orden","analisis y sintesis"," colaboracion ", "calculo","liderazgo ","participacion activa"};
	String []interesesH= {"Precisi�n Verbal ","Organizaci�n","Relaci�n de Hechos ","Ling��stica"," Orden  ", "Justicia ","El hombre anal�tico  "};
	String []interesesA= {"Est�tico","Arm�nico ","Manual  ","Visual "," Auditivo  ", "observacion y analisis ","Senso-Perceptivo"};
	String []interesesS= {"Asistir ","Investigativo ","Precisi�n ","Senso-Perceptivo "," Anal�tico ", "Ayudar ","Curar  ","Rehabilitar "};
	String []interesesI= {"C�lculo ","Cient�fico  ","Manual  ","Exacto "," Planificar  ", "Organizar  ","Controlar"};
	String []interesesD= {"Justicia  ","Equidad   ","Colaboraci�n   ","Esp�ritu de Equipo  "," Liderazgo   ", "Coordinaci�n   ","Destreza F�sica "};
	String []interesesE= {"Investigaci�n ","Orden ","Organizaci�n","analisis y sintesis"," Num�rico ", "Clasificar ","Precisi�n  ","Exacto "};
	String []aptitudC= {"Persuasivo ","Objetivo ","Pr�ctico","Tolerante ","Responsable ","Ambicioso ","Din�mico ","Resolutivo "};
	String []aptitudH= {"Responsable","Justo","Conciliador","Persuasivo","Sagaz","Imaginativo","Comprensivo","Estabilidad Emocional"};
	String []aptitudA= {"Sensible","Imaginativo","Creativo ","Detallista","Innovador ","Intuitivo ","Paciente ","Espont�neo"};
	String []aptitudS= {"Altruista","Solidario","Paciente","Comprensivo","Respetuoso","Persuasivo","Servicial","Observador"};
	String []aptitudI= {"Preciso ","Pr�ctico","Cr�tico ","Anal�tico ","R�gido ","Racional ","Independiente"};
	String []aptitudD= {"Arriesgado","Solidario","Valiente","Agresivo","Persuasivo","Aventurero","Equilibrio Ps�quico"};
	String []aptitudE= {"Met�dico","Anal�tico","Observador","Introvertido","Paciente","Seguro","Independiente","Intuitivo"};
	 String []preguntas= {"1 �Aceptar�a trabajar escribiendo art�culos en la secci�n econ�mica de un diario? ",
			"2 �Se ofrecer�a para organizar la despedida de soltero/a de uno/a de uno de sus amigos/amigas?",
			"3 �Te gustar�a dirigir un proyecto de urbanizaci�n en tu provincia?" , 
			"4 �A una frustraci�n siempre opones un pensamiento positivo?",
			"5 �Te dedicar�as a socorrer a personas accidentadas o atacadas por asaltantes?",
			"6 �Cuando eras chico, te interesaba saber c�mo estaban construidos tus juguetes?",
			"7 �Te interesan m�s los misterios de la naturaleza que los secretos de la tecnolog�a?",
			"8 �Escuchas atentamente los problemas que te plantean tus amigos?",
			"9 �Te ofrecer�as para explicar a tus compa�eros un determinado tema que ellos no entendieron?",
			"10 �Eres exigente y cr�tico con tu equipo de trabajo?" , 
			"11 �Te atrae armar rompecabezas o puzzles?",
			"12 �Puedes establecer la diferencia conceptual entre macroeconom�a y microeconom�a?" , 
			"13 �Usar uniforme te hace sentir distinto, importante?" , 
			"14 �Participar�as como profesional en un espect�culo de acrobacia a�rea?",
			"15 �Organizas tu dinero de manera que te alcance hasta el pr�ximo cobro?" , 
			"16 �Convences f�cilmente a otras personas sobre la validez de tus argumentos?" , 
			"17 �Est�s informado sobre los nuevos descubrimientos que se est�n realizando sobre la Teor�a del Big-Bang?",
			"18 �Ante una situaci�n de emergencia act�as r�pidamente?" , 
			"19 �Cuando tienes que resolver un problema matem�tico, perseveras hasta encontrar la soluci�n?" , 
			"20 �Si te convocara tu club preferido para planificar, organizar y dirigir un campo de deportes, aceptar�as?" , 
			"21 �Eres el que pone un toque de alegr�a en las fiestas?",
			"22 �Crees que los detalles son tan importantes como el todo?",
			"23 �Te sentir�as a gusto trabajando en un �mbito hospitalario?", 
			"24 �Te gustar�a participar para mantener el orden ante grandes des�rdenes y cataclismos?",
			"25 �Pasar�as varias horas leyendo alg�n libro de tu inter�s?",
			"26 �Planificas detalladamente tus trabajos antes de empezar?" , 
			"27 �Entablas una relaci�n casi personal con tu computadora?",
			"28 �Disfrutas modelando con arcilla?",
			"29 �Ayudas habitualmente a los no videntes a cruzar la calle?",
			"30 �Consideras importante que desde la escuela primaria se fomente la actitud cr�tica y la participaci�n activa?",
			"31 �Aceptar�as que las mujeres formaran parte de las fuerzas armadas bajo las mismas normas que los hombres?",
			"32 �Te gustar�a crear nuevas t�cnicas para descubrir las patolog�as de algunas enfermedades a trav�s del microscopio?" ,		
			"33 �Participar�as en una campa�a de prevenci�n contra la enfermedad de Chagas?" , 
			"34 �Te interesan los temas relacionados al pasado y a la evoluci�n del hombre? " , 
			"35 �Te incluir�as en un proyecto de investigaci�n de los movimientos s�smicos y sus consecuencias?" , 
			"36 �Fuera de los horarios escolares, dedicas alg�n d�a de la semana a la realizaci�n de actividades corporales?" , 
			"37 �Te interesan las actividades de mucha acci�n y de reacci�n r�pida en situaciones imprevistas y de peligro?" , 
			"38 �Te ofrecer�as para colaborar como voluntario en los gabinetes espaciales de la NASA?" , 
			"39 �Te gusta m�s el trabajo manual que el trabajo intelectual?" , 
			"40 �Estar�as dispuesto a renunciar a un momento placentero para ofrecer tu servicio como profesional?",
			"41 �Participar�as de una investigaci�n sobre la violencia en el f�tbol?" , 
			"42 �Te gustar�a trabajar en un laboratorio mientras estudias?" , 
			"43 �Arriesgar�as tu vida para salvar la vida de otro que no conoces?" , 
			"44 �Te agradar�a hacer un curso de primeros auxilios?",
			"45 �Tolerar�as empezar tantas veces como fuere necesario hasta obtener el logro deseado?" , 
			"46 �Distribuyes tus horarios del d�a adecuadamente para poder hacer todo lo planeado?" , 
			"47 �Har�as un curso para aprender a fabricar los instrumentos y/o piezas de las m�quinas o aparatos con que trabajas?",
			"48 �Elegir�as una profesi�n en la tuvieras que estar algunos meses alejado de tu familia, por ejemplo el marino?" , 
			"49 �Te radicar�as en una zona agr�cola-ganadera para desarrollar tus actividades como profesional?",
			"50 �Cuando est�s en un grupo trabajando, te entusiasma producir ideas originales y que sean tenidas en cuenta?",
			"51 �Te resulta f�cil coordinar un grupo de trabajo?" , 
			"52 �Te result� interesante el estudio de las ciencias biol�gicas?" , 
			"53 �Si una gran empresa solicita un profesional como gerente de comercializaci�n, te sentir�as a gusto desempe�ando ese rol?" , 
			"54 �Te incluir�as en un proyecto nacional de desarrollo de la principal fuente de recursos de tu provincia?",
			"55 �Ten�s inter�s por saber cuales son las causas que determinan ciertos fen�menos, aunque saberlo no altere tu vida?",
			"56 �Descubriste alg�n fil�sofo o escritor que haya expresado tus mismas ideas con antelaci�n?" , 
			"57 �Desear�as que te regalen alg�n instrumento musical para tu cumplea�os?" , 
			"58 �Aceptar�as colaborar con el cumplimiento de las normas en lugares p�blicos?" , 
			"59 �Crees que tus ideas son importantes, y haces todo lo posible para ponerlas en pr�ctica?" , 
			"60 �Cuando se descompone un artefacto en tu casa, te dispones prontamente a repararlo?" , 
			"61 �Formar�as parte de un equipo de trabajo orientado a la preservaci�n de la flora y la fauna en extinci�n?",
			"62 �Acostumbras a leer revistas relacionadas con los �ltimos avance s cient�ficos y tecnol�gicos en el �rea de la salud?" , 
			"63 �Preservar las ra�ces culturales de nuestro pa�s, te parece importante y  necesario?",
			"64 �Te gustar�a realizar una investigaci�n que contribuyera a hacer m�s justa la distribuci�n de la riqueza?" , 
			"65 �Te gustar�a realizar tareas auxiliares en una nave, como por ejemplo izado y\r\n arriado de velas, pintura y conservaci�n del casco, arreglo de aver�as,conservaci�n de motores, etc?" ,		
			"66 �Crees que un pa�s debe poseer la m�s alta tecnolog�a armamentista, a cualquier precio?",
			"67 �La libertad y la justicia son valores fundamentales en tu vida?\r\n" , 
			"68 �Aceptar�as hacer una pr�ctica rentada en una industria de productos alimenticios en el sector de control de calidad?",
			"69 �Consideras que la salud p�blica debe ser prioritaria, gratuita y eficiente para todos?",
			"70 �Te interesar�a investigar sobre alguna nueva vacuna?",
			"71 �En un equipo de trabajo, prefer�s el rol de coordinador?",
			"72 �En una discusi�n entre amigos, te ofreces como mediador?",
			"73 �Est�s de acuerdo con la formaci�n de un cuerpo de soldados profesionales?",
			"74 �Luchar�as por una causa justa hasta las �ltimas consecuencias?" , 
			"75 �Te gustar�a investigar cient�ficamente sobre cultivos agr�colas?",
			"76 �Har�as un nuevo dise�o de una prenda pasada de moda, ante una reuni�n imprevista?" , 
			"77 �Visitar�as un observatorio astron�mico para conocer en acci�n el funcionamiento de los aparatos?",
			"78 �Dirigir�as el �rea de importaci�n y exportaci�n de una empresa?",
			"79 �Te inhib�s al entrar a un lugar nuevo con gente desconocida?",
			"80 �Te gratificar�a el trabajar con ni�os?",
			"81 �Har�as el dise�o de un afiche para una campa�a contra el sida?" , 
			"82 �Dirigir�as un grupo de teatro independiente?",
			"83 �Enviar�as tu curr�culum a una empresa automotriz que solicita gerente para su �rea de producci�n?" , 
			"84 �Participar�as en un grupo de defensa internacional dentro de alguna fuerza armada?" ,
			"85 �Te costear�as tus estudios trabajando en una auditor�a?",
			"86 �Eres de los que defiendes causas perdidas?" , 
			"87 �Ante una emergencia epid�mica participar�as en una campa�a brindando tu ayuda?",
			"88 �Sabr�as responder que significa ADN y ARN?",
			"89 �Elegir�as una carrera cuyo instrumento de trabajo fuere la utilizaci�n de un idioma extranjero?",
			"90 �Trabajar con objetos te resulta m�s gratificante que trabajar con personas?" , 
			"91 �Te resultar�a gratificante ser asesor contable en una empresa reconocida?",
			"92 �Ante un llamado solidario, te ofrecer�as para cuidar a un enfermo?" , 
			"93 �Te atrae investigar sobre los misterios del universo, por ejemplo los agujeros negros?",
			"94 �El trabajo individual te resulta m�s r�pido y efectivo que el trabajo grupal?" , 
			"95 �Dedicar�as parte de tu tiempo a ayudar a personas de zonas carenciadas?" , 
			"96 �Cuando eleg�s tu ropa o decoras un ambiente, tienes en cuenta la combinaci�n de los colores, las telas o el estilo de los muebles?" , 
			"97 �Te gustar�a trabajar como profesional dirigiendo la construcci�n de una empresa hidroel�ctrica?",
			"98 �Sabes qu� es el PBI?"};


}
