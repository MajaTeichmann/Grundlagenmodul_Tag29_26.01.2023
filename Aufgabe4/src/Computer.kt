class Computer (var on: Boolean){

    fun pressOnButton(){
        if(!on){
            println("Fahre Computer hoch!")
            Thread.sleep (1000)
            println("...")
            Thread.sleep (1000)
            println("...")
            Thread.sleep (1000)
            println("...")
            on = true
        }
        else{
            println("Ich bin schon an! Biep Bop!")
        }
    }

    fun pressOffButton(){
        if (!on){
            println("...")
            Thread.sleep (3000)
            println("...")
            Thread.sleep (3000)
            println("...")
        }
        else{
            println("Was möchten Sie tun? [1] für Energiesparmodus, [2] für Neustart, [3] für Herunterfahren, [4] für Vorgang abbrechen")
            var offButtonPressed = readln()

            if (offButtonPressed == "1" || offButtonPressed == "2" || offButtonPressed == "3" || offButtonPressed == "4"){
                when(offButtonPressed){
                    "1" -> ruhemodus()
                    "2" -> neustart()
                    "3" -> herunterfahren()
                    "4" -> println("Vorgang wird abgebrochen!")
                }
            }
            else{
                println("Fehlerhafte Eingabe")
            }
        }
    }

    fun ruhemodus(){
        println("Versetze Computer in Ruhemodus!")
        var on = false
        Thread.sleep (10000)
        println("...")
        var ruhemodusEingabe = readln()
        if (ruhemodusEingabe == ""){
            ruhemodusBeenden()
        }
    }

    fun ruhemodusBeenden(){
        var on = false
        println("Was möchten Sie jetzt tun?")
        println("[1] -> Computer reaktivieren, [2] -> nichts")
        var eingabe = readln()
        if (eingabe == "1" || eingabe == "2"){
            when(eingabe){
                "1" -> pressOnButton()
                "2" -> {
                    Thread.sleep (10000)
                    return ruhemodusBeenden()
                }
            }
        }
    }

    fun neustart(){
        println("Starte Neustart!")
        Thread.sleep (5000)
        println("Fahre Computer runter!")
        println("...")
        Thread.sleep (1000)
        println("...")
        Thread.sleep (1000)
        println("...")
        on = false
        println()
        Thread.sleep (5000)
        println("Fahre Computer hoch!")
        println("...")
        Thread.sleep (1000)
        println("...")
        Thread.sleep (1000)
        println("...")
        on = true
    }

    fun herunterfahren(){
        println("Fahre Computer runter!")
        on = false
    }

    fun sendEMail(){
        if (on){
            println("EMail wird geschrieben!")
            println("...")
            Thread.sleep(1000)
            println("...")
            Thread.sleep(1000)
            println("...")
            Thread.sleep(1000)
            println("EMail sent!")
            Thread.sleep(1000)
        }
    }
}