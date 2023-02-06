open class Reloj (){
    protected var hora: Int = 0
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
    protected var minutos: Int = 0
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
    protected var segundos: Int = 0
        get():Int {
            return field
        }
        set(valor: Int) {
            if (valor in 0..59) {
                field = valor
            } else if (valor > 59) {
                field = valor % 60
                minutos += valor / 60
            }
        }

    constructor(hor: Int, min: Int, seg: Int) : this() {
        this.hora = hor
        this.minutos = min
        this.segundos = seg
    }

    fun setTime(){
        println("Introduzca la hora: ")
        this.hora= readln().toInt()
        println("Introduzca los minutos: ")
        this.minutos= readln().toInt()
        println("Introduzca los segundos: ")
        this.segundos= readln().toInt()
    }
    open fun display(){
        println("%02d:%02d:%02d".format(this.hora,this.minutos,this.segundos))
    }
    open fun ticTac(){
        this.segundos+=1
    }
}