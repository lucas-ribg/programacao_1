fun main (){
    val r = khttp.get("https://viacep.com.br/ws/09580500/json/")//, auth=BasicAuthorization("user", "pass"))
    println(r.statusCode)
// 200
    println(r.headers["Content-Type"])
// "application/json; charset=utf-8"
    println(r.text)
// """{"type": "User"..."""
    println(r.jsonObject["logradouro"])
// org.json.JSONObject
}