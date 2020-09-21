package Aula2109Kotlin.Excecao

fun main (){
    val nomes = ArrayList<String>()
    nomes.add("Pato")
    nomes.add("Cachorro")
    nomes.add("Gato")

    try{
       println("Terceiro elemento: ${nomes.get(3)}")
}
    catch(ex:Exception){
        println("Ocorreu uma exceção ${ex.message}")
    }
}