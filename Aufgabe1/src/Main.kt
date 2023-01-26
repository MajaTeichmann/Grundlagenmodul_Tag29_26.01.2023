//todo: Wir wollen einen Hund erstellen. Der Hund hat als Eigenschaft einen Namen und eine Rasse. Der Hund kann bellen.
// Aufgabe:
// - Erstelle (in der Datei Hund.kt) eine Hunde-Klasse.
// - Erstelle (in der Datei Main.kt) eine Hunden-Instanz, mit dem Namen "Bello" und der Rasse "Golden-Retriever".
// - Lass den Hund bellen.

fun main(){
    var bello = Hund("Bello", "Golden-Retriever")

    bello.bellen()
}