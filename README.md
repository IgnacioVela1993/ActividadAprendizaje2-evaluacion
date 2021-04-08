# ActividadAprendizaje2-evaluacion
Desarrollo de una aplicación que muestra el saldo en tu cuenta corriente, muestra tu cuenta de ahorro y te bloquea, en caso de saldo en negativo, tu tarjeta de crédito. 

Contamos con una clase añadida donde encontramos un menú principal desde el cual el usuario puede escoger crear objetos de las tres clases y visualizar cualquiera de los objetos creados.

El fin de la aplicación es que el usuario pueda extraer dinero y se descuente de su cuenta. Igualmente, hay una clase de CuentaDeAhorro donde se bonifica cada vez que el usuario extrae dinero. La última clase, Tarjeta, tiene el fin de bloquearse si el saldo se queda en cero. 

Dentro de los métodos / funcionalidades que vamos a encontrar son las siguientes:

Para la clase CUENTACORRIENTE: Hemos creado una funcionalidad que no permite al usuario sacar más dinero cuando llega a números rojos. Igualmente, otra de las funcionalidades dentro de CUENTACORRIENTE es sumar dinero al ingresar. (Método: +IngresarSaldo()) Por tanto, actualiza el saldo inicial.

Para la clase CUENTAAHORRO: Permite que cada vez que se ingrese dinero, se bonifique el saldo existente, multiplicando por 0.01. (Método: +BonificaciónSaldo())

Para la clase TARJETA: Encontramos la funcionalidad bloquear tarjeta si el saldo se encuentra en números rojos. (Método: BloquearTarjeta())
