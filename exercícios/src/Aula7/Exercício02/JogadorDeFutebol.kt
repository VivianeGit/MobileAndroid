package Aula7.Exercício02

class JogadorDeFutebol (val nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int){
    fun fazerGol(){
        energia -= 5
        alegria += 10
        gols += 1
         println("Gooool")

    }
    fun correr(){
        energia -= 10
        println("Cansei.")

    }

}
