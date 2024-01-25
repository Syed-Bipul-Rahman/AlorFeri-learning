import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Demo',
      theme: ThemeData(),
      home: const MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key});

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  var colors = [
    Colors.redAccent,
    Colors.green,
    Colors.black,
    Colors.blueAccent,
    Colors.pinkAccent,
    Colors.orangeAccent,
    Colors.grey,
    Colors.purple,
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.orangeAccent,
        title: const Text(
          "Hello",
          style: TextStyle(
              color: Colors.white,
              fontStyle: FontStyle.italic,
              fontWeight: FontWeight.w700),
        ),
      ),
      body: GridView.builder(
        itemBuilder: (context, index) {
          return Padding(
            padding: const EdgeInsets.all(8.0),
            child: Container(
              color: colors[index],
            ),
          );
        },
        gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
          crossAxisCount: 3,
          //maxCrossAxisExtent: 100, crossAxisSpacing: 10, mainAxisSpacing: 10
        ),
        itemCount: colors.length,
      ),

      //gridview count
      // GridView.count(
      //   crossAxisCount: 4,
      //   children: [
      //     Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black12,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black12,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black12,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black12,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black12,
      //       ),
      //     ),Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black12,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black12,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black12,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black12,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black,
      //       ),
      //     ), Padding(
      //       padding: const EdgeInsets.all(8.0),
      //       child: Container(
      //         color: Colors.black12,
      //       ),
      //     ),
      //   ],
      // ),
    );
  }
}
