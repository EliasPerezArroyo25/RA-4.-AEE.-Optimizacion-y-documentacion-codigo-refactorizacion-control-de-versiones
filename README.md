# Refactorización de RefactorizacioinLegacy 

Esta refactorización se va a llevar a cabo en NetBeans.Para eso se tendrá que configurar el proyecto:

* Se crea el proyecto RefactorizacioinLegacy en Netbeans como aplicación de Java  
* Una vez creado, se crea el paquete facturación que es donde se empaquetara y se añadirá dentro la clase FacturacionLegacy con el código proporcionado dentro.  
* Ahora se implementarán las pruebas unitarias separadas del código de producción creando un test con Junit  seleccionado y todo desmarcado para crear una plantilla limpia. Una vez creado, entramos en el paquete y el .java y se sustituye todo lo de dentro por el código proporcionado en FacturacionLegacyTest.java  
* En este caso no ha habido que importar ninguna librería nueva.  
* Finalmente, se realizarán las pruebas que la clase funciona perfectamente.

## Fase 1: Análisis de la Deuda Técnica
El código proporcionado sufre de 3 grandes principales problemas, uso de números imaginarios, declaración de variables sin uso, y mala estructuración del código que dificulta la legibilidad al programador:

* En el código se usan variables como *”cT,m,tC,dV”* que son muy poco intuitivas para el programador, además de insertar números manualmente en vez de crear constantes, lo cual confunde de donde provienen dichos números

* El código peca de un mal uso de variables, ya que estas no solo no son intuitivas, también son desaprovechadas, siendo declaradas pero no usadas en el código

* La estructura del código peca de una formación, el código hace un código excesivo de if-else, que se no tienen sentido, dándole una forma que dificulta su legibilidad
	
## Fase 2: Refactorización Asistida por el IDE
Ahora en el código de la clase se empezará refactorizando usando las herramientas de Netbeans:
*  Cambio de ct a calcularTotal.
*  Se declaran las constantes con nombres descriptivos.
*  Se eliminan los ifs innecesarios
*  se reconstruye la estructura
## Fase 3: Verificación, Documentación y Entrega
Después de haber factorizado, se comprueba si sigue funcionando todo bien, de ser así pasaremos a la documentación dentro del código, usando la herramienta javadocs

*  Se añade comentario explicando qué hace cada parte del código
*  Se usan los @params para indicar que valor reciben las variables
*  Se usa el @return para indicar que devuelve
