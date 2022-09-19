class Coche {

    // variables
    var marca: String;
    var modelo: String
        set(value) {
            field = value
        }
        get() = field

    var cv: Int
        set(cv) {
            field = cv;
        }
        get() = field
    var bastidor: String? = null;
    var velocidad: Int? = null;


    // constructores
    // public Coche(){}
    constructor(marca: String, modelo: String, cv: Int) {
        this.marca = marca;
        this.modelo = modelo
        this.cv = cv;
        this.velocidad = 0;
    }

    constructor(marca: String, modelo: String, cv: Int, bastidor: String) {
        this.marca = marca;
        this.modelo = modelo
        this.cv = cv;
        this.bastidor = bastidor;
        this.velocidad = 0;
    }

    // metodos
    fun aumentarVelocidad(velocidad: Int) {
        this.velocidad = this.velocidad?.plus(velocidad);
    }

    // si intento frenar mas de la v a la que va el coche --> false v =0
    // si intento frenar menos o igual de la v a la que va el coche --> true v = resta
    var disminucionVelocidad: (Int) -> Boolean = { v ->
        if ((this.velocidad!! - v) < 0) false
        else true
    }

    // crear metodos que permitan al coche aumentar la velocidad,
    // reducir la velocidad y parar el coche

    // getter - setter
    // tal cual los sabemos
    fun getVelocidad(): Int {
        return this.velocidad ?: 0;
    }

    fun setVelocidad(velocidad: Int) {
        this.velocidad = velocidad;
    }

    // toString

}