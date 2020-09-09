package campus;

public class Profesor{
    private String nombre = "";
    private String departamentoAdscrito = "";
    private int aniosDeExperiencia = 0;
    private String[] materiasImpartidas;

    public Profesor(String[] materiasImpartidas, String nombre,
                      String departamentoAdscrito, int aniosDeExperiencia)
    {
        setNombre(nombre);
        setAniosDeExperiencia(aniosDeExperiencia);
        setDepartamentoAdscrito(departamentoAdscrito);
        setMateriasImpartidas(materiasImpartidas);
    }

    private void setNombre(String nombre)
    {
        if ("" != nombre)
            this.nombre = nombre;
    }
    private void setDepartamentoAdscrito(String departamentoAdscrito)
    {
        if ("" != departamentoAdscrito)
            this.departamentoAdscrito = departamentoAdscrito;
    }
    private void setAniosDeExperiencia(int aniosDeExperiencia)
    {
        if (0 <= aniosDeExperiencia)
            this.aniosDeExperiencia = aniosDeExperiencia;
    }
    private void setMateriasImpartidas(String[] materiasImpartidas)
    {
        if(null != materiasImpartidas)
            this.materiasImpartidas = materiasImpartidas;
    }

    private String getNombre()
    {
        return nombre;
    }
    private String getDepartamentoAdscrito()
    {
        return departamentoAdscrito;
    }

    private int getAniosDeExperiencia()
    {
        return aniosDeExperiencia;
    }
    private String[] getMateriasImpartidas()
    {
        return  materiasImpartidas;
    }
    public void desplegar()
    {
        System.out.printf(" Departamento Adscrito:\t" + getDepartamentoAdscrito() +
                          "\n Nombre:\t" + getNombre() +
                          "\n Anios De Experiencia:\t" + getAniosDeExperiencia() +
                          "\n Materias Impartidas:\t" + getMateriasImpartidas());
    }
    public void numeroMateriasImpartidas()
    {
        System.out.println(getMateriasImpartidas().length);
    }
}
