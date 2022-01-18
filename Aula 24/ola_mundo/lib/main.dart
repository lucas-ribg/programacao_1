import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Meu App',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const MinhaListaEstatica(),
    );
  }
}

class MinhaListaEstatica extends StatelessWidget {
  //Construtor
  const MinhaListaEstatica({ Key? key }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Is that a supra?"),
      ),
      body: ListView(
        children: [
          ListTile(
            title: Text("Supra"),
            leading: CircleAvatar(
              radius: 24.0,
              child: Image.network("https://i.pinimg.com/originals/b5/8e/c2/b58ec27a733e11b091f7c7b532f81087.jpg", fit:BoxFit.contain)
            ),
            subtitle: Text("Is that a Supra?")
          ),
          ListTile(
            title: Text("New Supra"),
            leading: CircleAvatar(
              radius: 24.0,
              child: Image.network("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWnn3OOq5E1RP00JKFrDMMGzMO_gplVxNXBBC2x6TAFuzaO6xzTIeSWXEzClR8YHfnsuw&usqp=CAU", fit:BoxFit.contain),
            ),
            subtitle: Text("This is new Supra :(")
          ),
        ],
      ),
    );
  }
}