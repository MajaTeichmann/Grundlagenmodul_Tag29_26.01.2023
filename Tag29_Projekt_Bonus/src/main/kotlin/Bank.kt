open class Bank {
    var name: String
    var kontoNummer: String
    var iban: String
    var betrag: Double

    constructor(name: String, kontoNummer: String, iban: String, betrag: Double) {
        this.name = name
        this.kontoNummer = kontoNummer
        this.iban = iban
        this.betrag = betrag
    }

    fun bankBetreten(){
        println("Hallo lieber Kunde, was möchten Sie tun?")
        println("[1] Konto verwalten")
        println("[2] abbrechen")
        var eingabe = readln()
        when(eingabe){
            "2" -> println("Auf wiedersehen!")
            "1" -> {
                println("Wir lesen nun Ihre Bankkarte ein.")
                println("...")
                Thread.sleep(1000)
                println("...")
                Thread.sleep(1000)
                println("...")
                Thread.sleep(1000)
                bankTerminal()
            }
        }
    }

    fun bankTerminal(){
        println("Was möchten Sie tun?")
        println("[1] Geld einzahlen, [2] Geld abheben, [3] Kontostand abfragen, [4] Vorgang abbrechen")
        var eingabe = readln()
        when(eingabe){
            "1" -> {
                einzahlen()
            }
            "2" -> {
                auszahlen()
            }
            "3" -> {
                kontostand()
            }
            "4" -> {
                println("Vorgang wird abgebrochen")
                println("Auf Wiedersehen")
            }
        }
    }

    fun kontostand(){
        println("Ihr aktuelles Guthaben beträgt: ${betrag}€")
        Thread.sleep(3000)
        bankTerminal()
    }

    fun einzahlen(){
        println("Wie viel Euro willst du einzahlen?")
        var einzahlen = readln().toDouble()
        betrag = betrag + einzahlen
        Thread.sleep(2000)
        println("Du hast ${einzahlen}€ eingezahlt.")
        println("Dein neuer Kontostand beträgt: ${betrag}")
        bankTerminal()
    }

    fun auszahlen(){
        println("Ihr aktuelles Guthaben beträgt: ${betrag}€")
        println("Wie viel Geld wollen Sie abheben?")
        var eingabe = readln().toDouble()
        if(eingabe <= betrag){
            betrag = betrag - eingabe
        }
        else{
            println("Du kannst dein Konto nicht überziehen. Nenne mir einen kleineren Betrag!")
            auszahlen()
        }
        kontostand()
    }
}