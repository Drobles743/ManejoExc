
public class Raiz  {
   public double raiz(double num) throws NumeroNegativoExcepcion {
       if(num>0){
          return(Math.sqrt(num));
       }else{
           throw new NumeroNegativoExcepcion();
       }
   }


}
