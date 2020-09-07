package campus;

public class Estudiante
{
    private long expediente = 1l;
    private String nombre = "";
    private String apellidos = "";
    private String carrera = "";
    private int creditosOtorgados = 0;
    private int creditosTotales = 0;
    private float[] calificaciones;

    public Estudiante(long expediente, String nombre,
                      String apellidos, int creditosTotales)
    {
        setNombre(nombre);
        setExpediente(expediente);
        setApellidos(apellidos);
        setCreditosTotales(creditosTotales)
    }

    public Estudiante(long expediente, String nombre,
                      String apellidos, int creditosTotales
                      float[] calificaciones, int creditosOtorgados)
    {
        (expediente, nombre, apellidos, creditosTotales);
        setCalificaciones(calificaciones);
        setCreditosOtorgados(creditosOtorgados);
    }

    private void setNombre(String nombre)
    {
        if ("" != nombre)
            this.nombre = nombre;
    }
    private void setApellidos(String apellidos)
    {
        if ("" != apellidos)
            this.apellidos = apellidos;
    }
    private void setExpediente(long expediente)
    {
        if (0 < expediente)
            this.expediente = expediente;
    }
    private void setCarrera(String carrera)
    {
        if ("" != carrera)
            this.carrera = carrera;
    }
    private void setCreditosTotales(int creditosTotales)
    {
        if (0 < creditosTotales)
            this.creditosTotales = creditosTotales;
    }
    private void setCreditosOtorgados(int creditosOtorgados)
    {
        if (0 < creditosOtorgados)
            this.creditosOtorgados = creditosOtorgados;
    }
    private void setCalificaciones(float[] calificaciones)
    {
        if(null != calificaciones)
            this.calificaciones = calificaciones;
    }

    private String getNombre()
    {
        return nombre
    }
    private String getApellidos()
    {
        return apellidos;
    }
    private long getExpediente()
    {
        return expediente;
    }
    private String getCarrera()
    {
        return carrera;
    }
    private int getCreditosTotales()
    {
        return creditosTotales;
    }
    private int getCreditosOtorgados()
    {
        return creditosOtorgados;
    }
    private float[] getCalificaciones()
    {
        return  calificaciones;
    }
    public void desplegar()
    {
        System.out.printf(" expediente:\t" + getExpediente +
                          "\n apellidos:\t" + getApellidos +
                          "\n nombre:\t" + getNombre +
                          "\n carrera:\t" + getCarrera +
                          "\n creditos otorgados:\t" + getCreditosOtorgados +
                          "\n creditos totales:\t" + getCreditosTotales +
                          "\n calificaciones:\t" + getCalificaciones);
    }
}