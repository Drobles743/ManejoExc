public class Longitud {
    public  char caracterEn(String txt, Integer num) throws Exception {


            if(num >= 0 && num <= txt.length()){
                return txt.charAt(num);
            }else{
                throw new Exception();
            }


    }

}
