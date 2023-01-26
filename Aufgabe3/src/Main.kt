//todo: Wir wollen eine Person erstellen.
// Die Person hat die Eigenschaften:
// - name (Name) vom Typ String
// - phoneNumber (Telefonnummer) vom Typ Int
// - age (Alter) vom Typ Int
// Die Person hat einen Konstruktor:
// - Person(), mit den Parametern name, phoneNumber und age.
// Es speichert die übergebenen Parameter in den Eigenschaften ab.
// und die Methode:
// - sayHello(), das "Hallo an alle!" in der Konsole ausgibt.
// Hier siehst du das Klassendiagramm für eine Person.
// - Erstelle die Person-Klasse in der Aufgabendatei Person.kt.
// - Erstelle in der main()-Funktion der Aufgabendatei Main.kt eine Person-Instanz mit beliebigen Namen, Telefonnummer und Alter.
// - Lass die Person hallo sagen.

fun main(){
    var hansPeter = Person("Hans Peter", 12345678, 43)

    hansPeter.sayHello()
}