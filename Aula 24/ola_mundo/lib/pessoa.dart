import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class Pessoa{
  final String nome;
  final String url;
  final String subText;

  //Construtor da classe
  Pessoa({
    required this.nome,
    required this.url,
    required this.subText
  });
}

class MinhaListaDinamica extends StatefulWidget{
  const MinhaListaDinamica({Key? key}):super(key: key);

  @override
  State<MinhaListaDinamica> createState() => _MinhaListaDinamicaState();
}

class _MinhaListaDinamicaState extends State<MinhaListaDinamica> {
  List<Pessoa> pessoas  = [Pessoa(nome: "Supra Lover", url: "", subText: "Cars Lover"),
  Pessoa(nome: "Supra Rater", url: "", subText: "Cars Lover"),
  Pessoa(nome: "Normal Person ", url: "", subText: "Cars Lover")];

  @override
  Widget build(BuildContext context){
    return Scaffold(
      appBar:AppBar(title: const Text("Minha Lista Dinâmica"),),
      body: ListView.builder(
        itemCount: pessoas.length,
        itemBuilder: (context, itemIndex){
          return ListTile(
            title: Text("${pessoas[itemIndex].nome}"),
            leading: Image.network("${pessoas[itemIndex].url}"),
            subtitle: Text("${pessoas[itemIndex].subText}")
          );
        },
      ),
    );
  }
}

