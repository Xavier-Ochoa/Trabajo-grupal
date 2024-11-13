public class EJ5 {
    private double distancia; // en metros
    private double angulo; // en grados
    private double tiempo; // en segundos

    // Constructor vacío
    public EJ5() {
    }

    // Constructor con parámetros
    public EJ5(double distancia, double angulo, double tiempo) {
        this.distancia = distancia;
        this.angulo = angulo;
        this.tiempo = tiempo;
    }

    // Getters y Setters
    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    // Método para calcular la velocidad inicial requerida
    public double calcularVelocidad() {
        // Convertimos el ángulo a radianes para usar en cálculos trigonométricos
        double anguloEnRadianes = Math.toRadians(angulo);

        // Calculamos la velocidad inicial usando la fórmula V0 = distancia / (tiempo * cos(angulo))
        double velocidad = distancia / (tiempo * Math.cos(anguloEnRadianes));

        return velocidad;
    }
}
