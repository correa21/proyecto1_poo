package campus;
//TODO: Fix materiasImpartidas get and set
public class Profesor{
    private String nombre = "";
    private String departamentoAdscrito = "";
    private int aniosDeExperiencia = 0;
    private String[] materiasImpartidas = null;

    public Profesor(String[] materiasImpartidas, String nombre,
                      String departamentoAdscrito, int aniosDeExperiencia)
    {
        setNombre(nombre);
        setAniosDeExperiencia(aniosDeExperiencia);
        setDepartamentoAdscrito(departamentoAdscrito);
        setMateriasImpartidas(materiasImpartidas);
    }

    public void setNombre(String nombre)
    {
        if ("" != nombre)
            this.nombre = nombre;
    }
    public void setDepartamentoAdscrito(String departamentoAdscrito)
    {
        if ("" != departamentoAdscrito)
            this.departamentoAdscrito = departamentoAdscrito;
    }
    public void setAniosDeExperiencia(int aniosDeExperiencia)
    {
        if (0 <= aniosDeExperiencia)
            this.aniosDeExperiencia = aniosDeExperiencia;
    }
    public void setMateriasImpartidas(String[] materiasImpartidas)
    {
        if(null != materiasImpartidas)
            this.materiasImpartidas = materiasImpartidas;
    }

    public String getNombre()
    {
        return nombre;
    }
    public String getDepartamentoAdscrito()
    {
        return departamentoAdscrito;
    }

    public int getAniosDeExperiencia()
    {
        return aniosDeExperiencia;
    }
    public String[] getMateriasImpartidas()
    {
        return  materiasImpartidas;
    }
    public void desplegar()
    {
        System.out.printf(" Departamento Adscrito:\t" + getDepartamentoAdscrito() +
                          "\n Nombre:\t" + getNombre() +
                          "\n Anios De Experiencia:\t" + getAniosDeExperiencia() +
                          "\n Materias Impartidas:\t");
        for (String str : materiasImpartidas){
            if(str == null){
                break;
            }
            System.out.printf("%s ",str);
        }
        System.out.println("\n Cantidad de materias impartidas:\t" + (materiasImpartidas.length-1));
    }
    public void numeroMateriasImpartidas()
    {
        System.out.printf("%d", materiasImpartidas.length-1);
    }
}
