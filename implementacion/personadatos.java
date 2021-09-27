package implementacion;
import java.util.ArrayList;
import entidades.persona;

public class personadatos {
    
    ArrayList<persona> lista=new ArrayList<>();

    public void Create(persona p){
        System.out.println("Insertando: "+p.getNombres());
        lista.add(p);
    }
    public ArrayList<persona> listaPersonas(){
        return lista;
    }
    public void eliminarPersonas(int id){
        for(persona s: lista){
            if(id==s.getId()){
                System.out.println("Elinando registro de: "+s.getNombres());
                lista.remove(s);
            }
        }
    }


}
