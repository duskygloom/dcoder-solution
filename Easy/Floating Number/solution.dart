import "dart:io";

main() {
  int howMany = int.parse(stdin.readLineSync());
  List approx = new List(howMany);
  for (int i = 0; i < howMany; i++) {
    double decimal = double.parse(stdin.readLineSync());
    approx[i] = decimal.toStringAsFixed(2);
  }
  for (String i in approx) {
    print(i);
  }
}
