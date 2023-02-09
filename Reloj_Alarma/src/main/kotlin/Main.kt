fun main() {
    var miHora = Reloj(18, 35, 23)
    var seg = 0
    /*while(seg<1000){
        miHora.ticTac()
        miHora.display()
        seg+=1
    }*/
    var miAlarma = Alarma()
    miAlarma.setTime()
    miAlarma.setAlarm()
    while (seg < 3000) {
        miAlarma.ticTac()
        seg += 1
        if (seg ==1000){
            miAlarma.display()
        }else if(seg == 2000){
            miAlarma.display()
        }else if(seg == 3000){
            miAlarma.display()
        }
    }
}