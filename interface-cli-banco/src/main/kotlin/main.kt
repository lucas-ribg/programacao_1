import dao.ProdutoDAO
import models.Produto
import java.sql.DriverManager

fun main(args: Array<String>) {
    // Cria um DAO para os produtos
    val produtosDAO = ProdutoDAO()
    var produtos = produtosDAO.pegarTodos()
    // Intera pelo resultado obtido
    for (produto in produtos){
        println(produto)
    }
    produtosDAO.inserirUm(Produto(0, "Agua", 5.0, 12))
    produtos = produtosDAO.pegarTodos()
    //Intera pelo resultado obtido
    for(produto in produtos){
        println(produto)
    }
}