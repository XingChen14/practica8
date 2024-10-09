PROJECT TITLE: 
Práctica 8 Herencia

PURPOSE OF PROJECT: Diseñar software orientado a objetos clases mediante el reuso de código y la herencia, con actitud analítica y responsable.

VERSION or DATE: Version 1 (09/10/2024)

HOW TO START THIS PROJECT:

AUTHORS: Ana Chen Zhang

USER INSTRUCTIONS:
    Implementar clases de una jerarquía de herencia.

ACTIVITIES:
    Crear un nuevo repositorio en un directorio llamado practica8
            mkdir practica8
            cd practica8
            crear el archivo .gitignore para que no versione los archivos .class
            git init
    Implementar las clases que se muestran en la Figura 1, las cuales están relacionadas de la siguiente manera:
            DispositivoElectronico es la clase raíz. 
            DispositivoElectronicoDeConsumo y  ComponenteElectronico son un tipo de DispositivoElectronico.
            Microprocesador, Pantalla y Sensor son un tipo de ComponenteElectronico.
            Television y Computadora son un tipo de DispositivoElectronicoDeConsumo.
            Smartphone es un tipo de Computadora.
    Los atributos por clase se muestran en la siguiente tabla:
        DispositivoElectronico
                fabricante: String  //inmutable
                numeroSerie: String  //inmutable
                marca: String   //inmutable
                nombre: String  //inmutable
                costo: float //mutable
                componentes: ArrayList<ComponenteElectronico>  //mutable usar   
            Metodos:
                agregarComponente()
                quitarComponente()
        ComponenteElectronico
            esParteDe: DispositivoElectronico //mutable
        DispositivoElectronicoDeConsumo
                encendido: boolean // mutable por medio de los 
            Métodos 
                enceder()
                apagar()
                isEncendido() //getter
        Microprocesador
                cacheRAM: int  //inmutable
                velocidadHz: long  //inmutable
        Pantalla
                resolucionX: int //inmutable
                resolucionY: int  //inmutable
        Sensor
                tipo: String  //inmutable
                unidadDeMedida: String //inmutable
                valor: int //inmutable
        Television
                pantalla: Pantalla  //inmutable
        Computadora
                cpu: Microprocesador //mutable
                ramMB: long //mutable
        Smartphone
                sensorDeHuella: Sensor //inmutable
                pantalla: Pantalla // inmutable
        AppDemoHerencia
            ninguno
        
        Los atributos inmutables (aquellos que sólo tienen getter) deben ser inicializados en el constructor.
        Los atributos mutables (aquellos que tienen getter y setter) podrán o no ser inicializados en el constructor, es decir se requiere tener un constructor para cada caso.
        Todas las clases, con excepción de AppDemoHerencia, deberán sobreescribir el método toString( ), de tal forma que la representación en cadena de cada objeto contenga el valor de todos sus atributos.
    La clase AppDemoHerencia servirá para mostrar el funcionamiento de las demás clases. Deberá implementar sólo el método main(). Dentro de este método se deberá implementar la siguiente funcionalidad con variables locales:
        Un ArrayList llamado listaDeSmartphones, conteniendo dos objetos del tipo Smartphone ya inicializados con valores en todos sus atributos.
        Un ArrayList llamado listaDeTVs, conteniendo dos objetos del tipo Television ya inicializados con valores en todos sus atributos.
        Una vez creados los objetos, desplegar con un ciclo:
            El valor de todos los atributos (incluyendo los heredados) de cada objeto en la listaDeSmartphones.
            El valor de todos los atributos (incluyendo los heredados) de cada objeto en la listaDeTVs.
    Versionar el código y subir el código a GitHub
            git add .
            git commit -m "mensaje de la versión"
            git push origin main
    Entregar por classroom el URL del repositorio de código en GitHub 


Recommendations for implementation:
    Desarrollar las clases de lo general a lo particular e ir probando cada una conforme se van terminando. Utilizar AppDemoHerencia para probar cada clase.

    El orden de construcción propuesto para facilitar el desarrollo es el siguiente:
        AppDemoHerencia (iniciar sin código en el método main() e ir agregando código de cada clase que se vaya desarrollando) 
        DispositivoElectronico
        ComponenteElectronico
        Microprocesador
        Pantalla
        Sensor
        DispositivoElectronicoDeConsumo
        Television
        Computadora
        Smartphone

DELIVERY:
    Entregar el enlace al repositorio de GitHub

EVALUATION CRITERIA
    Correcta implementación de las clases, atributos, constructores y métodos.
    Funcionalidad del programa.
    Estructura y organización del código.
    Legibilidad del código (indentación, nombrado de variables, comentarios y documentación).
    Uso adecuado de encapsulamiento, herencia y polimorfismo.
