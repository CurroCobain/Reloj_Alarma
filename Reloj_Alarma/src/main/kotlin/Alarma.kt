class Alarma: Reloj() {
    var horaAlarma: Int = 0
        get():Int {
            return field
        }
        set(valor: Int) {
            if (valor in 0..23) {
                field = valor
            } else if (valor > 23) {
                field = valor % 24
            }
        }
    var minutoAlarma: Int = 0
        get():Int {
            return field
        }
        set(valor: Int) {
            if (valor in 0..59) {
                field = valor
            } else if (valor > 59) {
                field = valor % 60
                hora += valor / 60
            }
        }
    fun setAlarm(){
        println("Dime a qué hora quieres que suene la alarma: ")
        this.horaAlarma= readln().toInt()
        println("Dime en qué minuto quieres que suene la alarma: ")
        this.minutoAlarma= readln().toInt()
    }
    override fun ticTac(){
            super.ticTac()
            if (this.segundos==0){
                if(this.minutos==minutoAlarma) {
                    if (this.hora == horaAlarma) {
                        super.display()
                        println("ALARMA SONANDO!!!!!!")
                    }
                }
            }
        }


    }

