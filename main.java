import entidades.persona;
import java.util.ArrayList;
import java.util.Scanner;

import implementacion.personadatos;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        int opc;
        personadatos pd= new personadatos();
        Scanner teclado=new Scanner(System.in);
        //Existentes
        persona p1= new persona();
        p1.setId(1);
        p1.setNombres("Jose");
        p1.setAp_paterno("Carrion");
        p1.setAp_materno("Flores");
        p1.setDireccion("Jr. buenos aires");
        p1.setSexo("H");

        pd.Create(p1);

        persona p2= new persona();
        p2.setId(2);
        p2.setNombres("Jorge");
        p2.setAp_paterno("Quispe");
        p2.setAp_materno("Rodriguez");
        p2.setDireccion("Jr. carlos mariategui");
        p2.setSexo("H");

        pd.Create(p2);

        persona p3= new persona();
        p3.setId(3);
        p3.setNombres("Roberto");
        p3.setAp_paterno("Moron");
        p3.setAp_materno("Ors");
        p3.setDireccion("Jr. barcelona");
        p3.setSexo("H");

        pd.Create(p3);
        //MENU
        do{
            System.out.println(":::::::::::::Bienvenido al Sistema:::::::::::");
            System.out.println("Ingrese la opción correspondiente a la acción que desea utilizar:\n1.-Crear\n2.-Listar\n3.-Eliminar\n4.-Actualizar");
            opc= teclado.nextInt();
            switch (opc) {
                case 1:
                    persona p4= new persona();
                    String nombre, appaterno, apmaterno, direcc, sexo;
                    System.out.println("Ingrese el nombre:");
                    nombre= teclado.next();
                    System.out.println("Ingrese el Apellido paterno:");
                    appaterno= teclado.next();
                    System.out.println("Ingrese el Apellido materno:");
                    apmaterno= teclado.next();
                    System.out.println("Ingrese la dirección:");
                    direcc= teclado.next();
                    System.out.println("Ingrese el sexo:");
                    sexo= teclado.next();
                    p4.setId(4);
                    p4.setNombres(nombre);
                    p4.setAp_paterno(appaterno);
                    p4.setAp_materno(apmaterno);
                    p4.setDireccion(direcc);
                    p4.setSexo(sexo);

                    pd.Create(p4);
                break;
                case 2:
                    for(persona ps: pd.listaPersonas()){
                    System.out.println("\nID: "+ps.getId()+"\nNombres:"+ps.getNombres()+"\nApellido paterno: "+ps.getAp_paterno()+"\nApellido Materno:"+ps.getAp_materno()+"\nDirección: "+ps.getDireccion());
                        
                }
                break;
                case 3:
                int Tipoid;
                System.out.println("Ingrese la ID del nombre que desea eliminar:");
                Tipoid = teclado.nextInt();
                pd.eliminarPersonas(Tipoid);
                System.out.println("Eliminando Datos....");
                break;
                case 4:System.out.println("\nActualizando y listando datos....\n");
                    for(persona ps: pd.listaPersonas()){
                    System.out.println("\nID: "+ps.getId()+"\nNombres:"+ps.getNombres()+"\nApellido paterno: "+ps.getAp_paterno()+"\nApellido Materno:"+ps.getAp_materno()+"\nDirección: "+ps.getDireccion());
                }
                break;
                default:System.out.println("Opción incorrecta, ingrese una de las que le aparece en pantalla");
            }

        }while(opc!=0);









        
        
        
    }
}