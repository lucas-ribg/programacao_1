package dao

import models.Produto
import shared.SharedPaths
import java.sql.DriverManager

class ProdutoDAO : GenericoDAO{
    override fun pegarUm(id: Int): Any {
        // Criando uma conexão com o banco
        val connection = ConnectionDAO()
        val resultSet = connection.executeQuery("SELECT * FROM produtos WHERE id == ${id};")
        // Intera pelo resultado obtido
        var produto : Produto? = null
        while (resultSet?.next()!!){
            val produto = Produto(
                resultSet.getInt("id"),
                resultSet.getString("nome"),
                resultSet.getDouble("valor"),
                resultSet.getInt("quantidade"),

                )
            println("Produto encontrado: ${produto}")
        }
        connection.close()
        return produto!!
    }

    override fun pegarTodos(): List<Any> {
        val produtos = mutableListOf<Produto>()
        var connection : ConnectionDAO? = null
        try {
            // Criando uma conexão com o banco
            val connection = ConnectionDAO()
            val resultSet = connection.executeQuery("SELECT * FROM produtos;")
            // Intera pelo resultado obtido
            while (resultSet?.next()!!) {
                produtos.add(
                    Produto(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getDouble("valor"),
                        resultSet.getInt("quantidade"),
                    )
                )
            }
            connection.close()
        }
        catch (exception:Exception){
            exception.printStackTrace()
        }
        finally {
            connection?.close()
        }
        return produtos
    }

    override fun inserirUm(objeto: Any) {
        val connectionDAO = ConnectionDAO()
        val preparedStatement = connectionDAO.getPreparedStatement("""
            INSERT INTO produtos 
            (nome, valor, quantidade)
            VALUES (?,?,?);
            """.trimMargin())
        val produto = objeto as Produto
        preparedStatement?.setString(1, produto.nome)
        preparedStatement?.setDouble(2, produto.valor)
        preparedStatement?.setInt(3, produto.quantidade)
        preparedStatement?.executeUpdate()
        //connectionDAO.commit()
        connectionDAO.close()
    }

    override fun inserirVarios(lista: List<Any>) {
        TODO("Not yet implemented")
    }

    override fun atualizar(objeto: Any) {
        val connectionDAO = ConnectionDAO()
        val preparedStatement = connectionDAO.getPreparedStatement("""
            UPDATE produtos 
            SET nome=?, valor=?, quantidade=?
            WHERE id=?;
            """.trimMargin())
        val produto = objeto as Produto
        preparedStatement?.setString(1, produto.nome)
        preparedStatement?.setDouble(2, produto.valor)
        preparedStatement?.setInt(3, produto.quantidade)
        preparedStatement?.setInt(4, produto.id)
        preparedStatement?.executeUpdate()
        //connectionDAO.commit()
        connectionDAO.close()
    }

    override fun deletar(id: Int) {
        TODO("Not yet implemented")
    }
}