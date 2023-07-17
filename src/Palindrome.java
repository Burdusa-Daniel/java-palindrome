import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*Consegna: scrivere un programma che chiede all’utente di inserire una parola e gli risponde se è una parola palindroma oppure no*/
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci una parola");
        String a = input.nextLine();
        boolean ok=false;
        for (int i = 0; i < a.length()/2; i++) {
                if(a.charAt(i)==a.charAt(a.length()-1-i)){
                    ok=true;
                }
        }
        if(ok){
            System.out.println("la parola è palindroma");
        }else{
            System.out.println("la parola non è palindroma");
        }

        /*boolean palindroma = true;
        int startIndex = 0;
        int endIndex = a.length()-1;
        for(; startIndex < endIndex; startIndex++, endIndex-- ) {
            if(a.charAt(startIndex) != a.charAt(endIndex)) {
                palindroma = false;
                break;
            }
        }

        if (palindroma){
            System.out.println("la parola è palindroma");
        }else{
            System.out.println("la parola non è palindroma");
        }*/
    }
}
