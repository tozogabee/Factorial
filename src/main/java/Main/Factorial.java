package Main;

public class Factorial {

    public Factorial() {
    }

    public int factor(int num){

        int result = 1;

        if(num>0){
            for(int i=1;i<=num;++i){
                result *=i;
            }
        }
        return result;
    }


}
