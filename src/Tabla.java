public class Tabla {
    private int c=1, v;
    private String cad="";
    
    public Tabla(int m) {
        v=m;
    }
    
    public String MostrarT(int n){
        if(c<=10){
            cad+=v+" x "+c+" = "+n+"\n";
            c++;
            return MostrarT(n+v);
        }else{
            return cad;
        }
    }
}
