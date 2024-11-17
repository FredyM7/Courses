
public class Automovil implements Comparable<Automovil> {

    private int id;
    private String fabricante;
    private String modelo;
    private TipoAutomovil tipo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;


    private static int capacidadEstanqueEstatico = 30;
    private static Color colorPatente = Color.NARANJA;
    private static int ultimoId;
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";

    public Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }
    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoAutomovil getTipo() { return tipo; }

    public void setTipo(TipoAutomovil tipo) { this.tipo = tipo; }

    public Color getColor() { return color; }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Color getColorPatente() { return colorPatente; }

    public static void setColorPatente(Color colorPatente) { Automovil.colorPatente = colorPatente; }

    public static int getCapacidadEstanqueEstatico() { return capacidadEstanqueEstatico; }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) { Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico; }

    public Motor getMotor() { return motor; }

    public void setMotor(Motor motor) { this.motor = motor; }

    public Estanque getEstanque() {

        if(this.estanque == null) {
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) { this.estanque = estanque; }

    public Persona getConductor() { return conductor; }

    public void setConductor(Persona conductor) { this.conductor = conductor; }

    public Rueda[] getRuedas() { return ruedas; }

    public void setRuedas(Rueda[] ruedas) { this.ruedas = ruedas; }

    public Automovil addRueda(Rueda rueda){

        if(indiceRuedas < this.ruedas.length) this.ruedas[indiceRuedas++] = rueda;

        return this;
    }


    public String verDetalle () {

        StringBuilder sb = new StringBuilder();
        sb.append("auto.id = "+ this.id);
        sb.append("\nauto.fabricante = "+ this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);

        if(this.tipo != null) {
            sb.append("\nauto.tipo = " + this.getTipo().getDescripcion());
        }

        sb.append("\nauto.colorPatente = " + colorPatente);
        sb.append("\nauto.color = " + this.color);

        if(this.motor != null) {
            sb.append("\nauto.motor.getCilindrada() = " + this.motor.getCilindrada());
        }

        if(this.conductor != null) {
            sb.append("\nConductor: " + this.getConductor());
        }

        if(this.ruedas != null) {
            sb.append("\nRuedas del automóvil: ");
            for(Rueda r: this.getRuedas()) {
                sb.append("\n"+r.getFabricante()+", aro: "+r.getAro()+", ancho: "+ r.getAncho());
            }
        }
        System.out.println();

        return sb.toString();
    }

    public String acelerar(int rpm) {
        return "El auto "+this.fabricante+" acelerando a "+rpm+" rpm";
    }

    public String frenar() {
        return this.fabricante+" "+this.modelo+" frenando...\n";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar +"\n"+frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina) {
        return km/(this.getEstanque().getCapacidad()*porcentajeGasolina);
    }

    public float calcularConsumo(int km, int porcentajeGasolina) {
        return km/(this.getEstanque().getCapacidad()*(porcentajeGasolina/100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeGasolina) {
        return km/(Automovil.capacidadEstanqueEstatico*(porcentajeGasolina/100f)); //En métodos statics sólo podremos trabajar con atributos statics, argumentos que se pasan por el método o en su defecto valores estáticos escritos dentro del método (ej: números, 50, etc)
    }

    @Override
    public boolean equals(Object obj){

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equalsIgnoreCase(a.getFabricante())
                && this.modelo.equalsIgnoreCase(a.getModelo()));
    }

    @Override
    public String toString() {
        return this.id + " : " + this.fabricante+ " " + modelo;
    }

    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.fabricante);
    }
}
