package campus;
import java.util.*;
//TODO: fix calificaciones get and set
public class Estudiante{
    private long expediente = 1l;
    private String nombre = "";
    private String apellidos = "";
    private String carrera = "";
    private int creditosOtorgados = 0;
    private int creditosTotales = 0;
    private float[] calificaciones = null;

    public Estudiante(long expediente, String nombre,
                      String apellidos, int creditosTotales, String carreraEstudiante)
    {
        setNombre(nombre);
        setExpediente(expediente);
        setApellidos(apellidos);
        setCreditosTotales(creditosTotales);
        setCarrera(carreraEstudiante);
    }

    public Estudiante(long expediente, String nombre,
                      String apellidos, int creditosTotales,
                      String carreraEstudiante, int creditosOtorgados, float[] calificaciones )
    {
        this(expediente, nombre, apellidos, creditosTotales, carreraEstudiante);
        setCalificaciones(calificaciones);
        setCreditosOtorgados(creditosOtorgados);
    }

    public void setNombre(String nombre)
    {
        if ("" != nombre)
            this.nombre = nombre;
    }
    public void setApellidos(String apellidos)
    {
        if ("" != apellidos)
            this.apellidos = apellidos;
    }
    public void setExpediente(long expediente)
    {
        if (0 < expediente)
            this.expediente = expediente;
    }
    public void setCarrera(String carrera)
    {
        if ("" != carrera)
            this.carrera = carrera;
    }
    public void setCreditosTotales(int creditosTotales)
    {
        if (0 < creditosTotales)
            this.creditosTotales = creditosTotales;
    }
    public void setCreditosOtorgados(int creditosOtorgados)
    {
        if (0 < creditosOtorgados)
            this.creditosOtorgados = creditosOtorgados;
    }
    public void setCalificaciones(float[] calificaciones)
    {
        if(null != calificaciones)
            this.calificaciones = calificaciones;
    }

    public String getNombre()
    {
        return nombre;
    }
    public String getApellidos()
    {
        return apellidos;
    }
    public long getExpediente()
    {
        return expediente;
    }
    public String getCarrera()
    {
        return carrera;
    }
    public int getCreditosTotales()
    {
        return creditosTotales;
    }
    public int getCreditosOtorgados()
    {
        return creditosOtorgados;
    }
    public float[] getCalificaciones()
    {
        return  calificaciones;
    }
    public void desplegar()
    {
        int index = 0;

        System.out.printf("\n expediente:\t" + getExpediente() +
                          "\n apellidos:\t" + getApellidos() +
                          "\n nombre:\t" + getNombre() +
                          "\n carrera:\t" + getCarrera() +
                          "\n creditos otorgados:\t" + getCreditosOtorgados() +
                          "\n creditos totales:\t" + getCreditosTotales() +
                          "\n Calificaciones:\t");
        if (calificaciones == null)
        {
            System.out.printf("0");
        }
        else{
            for (index = 0 ; index < calificaciones.length-1 ; index++){
                System.out.printf("%f ",calificaciones[index]);
            }
        }
        System.out.printf("\n promedio:\t" + promedioAlumno() +
                          "\n moda:\t" + modaAlumno() +
                          "\n mediana:\t" + medianaAlumno() +
                          "\n avance carrera:\t" + avanceCarrera());
    }

    public float promedioAlumno()
    {
        float promedio = 0.0f;
        if (calificaciones != null)
        {
            for(int i = 0; i < calificaciones.length-1 ;i++)
                promedio += calificaciones[i];
            promedio /= (calificaciones.length-1);
        }
        return promedio;
    }

    public float modaAlumno()
    {
        float moda = 0.0f;
        int frecTemp,frecModa = 0;


        if (calificaciones != null) {
            Arrays.sort(calificaciones);
            for(int i = 0; i < calificaciones.length-1 ;i++) {
                frecTemp = 1;
                for (int j = 0; j < calificaciones.length-1; j++) {
                    if (calificaciones[i] == calificaciones[j])
                        frecTemp++;
                }
                if(frecTemp > frecModa)
                {
                    frecModa = frecTemp;
                    moda = calificaciones[i];
                }
            }
        }


        return moda;
    }

    public float medianaAlumno()
    {
        float mediana = 0.0f;
        if (calificaciones != null) {
            int num = calificaciones.length-1;
            Arrays.sort(calificaciones);
            if((num%2) != 0)
                mediana = calificaciones[(int)(num/2)+1];//element (num/2)+1 because array have an unwanted element
            else
                mediana = (calificaciones[(num/2)] + calificaciones[(num/2)+1])/2;

        }
        return mediana;
    }

    public float avanceCarrera() {
        float avance = 0.0f;
        avance = (creditosOtorgados * 100) / creditosTotales;
        return avance;
    }
}
