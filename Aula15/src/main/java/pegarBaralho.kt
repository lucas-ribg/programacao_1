fun main(){
    val embaralhar = khttp.get("http://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1")
    val baralho_id = embaralhar.jsonObject["deck_id"]

    val comprar = khttp.get("http://deckofcardsapi.com/api/deck/$baralho_id/draw/?count=1")
    val carta = comprar.jsonObject["cards"]
    println(carta)


}