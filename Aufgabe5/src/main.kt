// Du hast heute die Keywords open, override, final und super kennengelernt, oder kennst sie bereits aus einer
// vorherigen Vorlesung.
// Hier seht ihr ein Klassendiagramm mit drei Klassen:
//
// Basisklasse Tier:
// Mit der Methode makeNoise() das "Animal noises..." in der Konsole ausgibt.
// Unterklasse Hund:
// Mit der Methode makeNoise() das "Woof!" in der Konsole ausgibt.
// Unterklasse Katze:
// Mit der Methode makeNoise() das "Miau." in der Konsole ausgibt.
// Im Klassendiagramm kann man erkennen, das alle drei Klassen die Methode makeNoise() haben. Das bedeutet, dass die
// Unterklasse die Methode makeNoise() der Basisklasse überschreiben (Override).

//todo: a)
// - Erstelle die Klassen. Erstelle dazu selbstständig die Dateien, die du dafür brauchst.
// - Überschreibe in den Unterklassen (Hund, Katze) die Methode makeNoise() der Basisklasse (Tier).
// - Instanziiere einen Hund und eine Katze, lass sie Geräusche machen.
// - In der Konsole sollte folgendes ausgegeben werden:
// Woof!
// Miau.

fun main(){
    var hund = Hund()
    var katze = Katze()
    hund.makeNoise()
    katze.makeNoise()
}

//todo: b)
// Wie du sehen kannst, wird der Code der Methode makeNoise() der Basisklasse (Tier) nicht ausgeführt (es wird kein
// "Animal noises..." in der Konsole ausgegeben). Er wurde überschriebene. Möchten wir allerdings die überschriebene
// Methode der Basisklasse ausführen, müssen wir mit dem keyword super die Basisklasse referenzieren.
// - Füge diese Zeile Code in die makeNoise()-Methode der Hund und der Katzen-Klasse hinzu.
// - super.makeNoise()
// - Schau dir an, was jetzt in der Konsole ausgegeben wird. Es sollte folgendes ausgegeben werden:

//todo: c)
// Eine überschreibende (override fun) Methode ist ebenfalls open. Um zu verhindern, dass sie wieder überschrieben wird,
// kann man sie mit final schützen.
// - Mach die Hunde-Klasse offen und schütze die überschreibende Methode (makeNoise()) mit finalsf