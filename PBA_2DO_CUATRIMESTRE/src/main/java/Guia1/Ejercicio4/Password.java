package Guia1.Ejercicio4;

public class Password {

    private int longitud;
    private String text;

    public Password(){}
    public Password(String text){
        this.longitud = text.length();
        this.text = text;
    }


    public boolean esFuerte(){
        int counter =0;
        int counterMinus = 0;
        int counterNumbers = 0;
        for (int i =0; i<this.longitud; i++){
            if(this.text.charAt(i) >= 65 && this.text.charAt(i)<=90){
            counter++;
            }
        }
        for (int i =0; i<this.longitud; i++){
            if(this.text.charAt(i) >= 48 && this.text.charAt(i) <= 57){
            counterNumbers++;
            }
        }
        for (int i =0; i<this.longitud; i++){
            if(this.text.charAt(i) >= 97 && this.text.charAt(i) <= 122){
            counterMinus++;
            }
        }
        if(counter>=2 && counterNumbers>=5 && counterMinus>=1){
            return true;
        }
        return false;
    }

    public void texto(){}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLongitud(){
        return longitud;
    }

    @Override
    public String toString() {
        return "Password{" +
                "text='" + text + '\'' +
                '}';
    }
}
