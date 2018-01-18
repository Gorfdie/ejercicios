package es.cip.diego;

public class Conversions{

    public static float CelToFar(float num){
        float result = (num * 9/5)+32;
        return result;
    }

    public static float FarToCel(float num){
        float result = (float) ((num - 32)/ 1.8);
        return result;
    }

}
