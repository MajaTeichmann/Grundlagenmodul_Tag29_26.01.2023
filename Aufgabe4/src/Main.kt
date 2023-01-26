//todo: Wir wollen einen Computer erstellen. Der Computer soll an- und ausschaltbar sein.
// Und wenn er an ist, soll man E-Mails verschicken können.
// Der Computer hat eine Eigenschaft:
// on vom Typ Boolean, das angibt, ob der Computer gerade an (true) oder aus (false) ist.
// Der Computer hat einen Konstruktor:
// - Computer()
// und die Methoden:
// - pressOnButton(), das den Computer anmacht, wenn er noch nicht an ist.
// - pressOffButton(), das den Computer ausmacht, wenn er noch nicht aus ist.
// - sendEMail(), das in der Konsole "EMail sent!" ausgibt, wenn der Computer gerade an ist.
// Hier siehst du das Klassendiagramm des Computers:
// Aufgabe:
// - Erstelle die Computer-Klasse in der Aufgabendatei Computer.kt.
// - Erstelle in der main()-Funktion der Aufgabendatei Main.kt eine Computer-Instanz.
// - Schalte den Computer dann an, versende eine E-Mail und schalte ihn wieder aus.

fun main(){
    var computer = Computer(false)

    computer.pressOnButton()
    Thread.sleep (3000)
    computer.sendEMail()
    Thread.sleep (3000)
    computer.pressOffButton()
}