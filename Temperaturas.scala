import scala.collection.mutable.ArrayBuffer

/*
 * Una empresa que realiza estadisticas acerca de las 
 * temperaturas en regiones especificas de un pais, 
 * desea crear un listado con las temperaturas que 
 * descendieron de 0 grados.
 * Considerando que dichas temperaturas se almacenan 
 * en un vector, la empresa desea remover todas las 
 * temperaturas escepto la primera con un numero 
 * negativo(menor a cero grados)
 * Crea un programa en Scala que realice dicho filtro 
 * de temperaturas.
 */

object Temperaturas {
	def main(args: Array[String]): Unit = {

			val temp = new ArrayBuffer[Int]//(10)

					temp += (-9, -5, -2, 0, 10, 20 ,30)

					//temp.remove(2)
					temp.trimEnd(0)
					
					for(i <- 1 to temp.length-1)
						println(temp(i))






	}
}