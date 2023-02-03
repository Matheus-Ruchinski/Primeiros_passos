package edu.rachinski.variaveis;
public class Variares {
//"return" que esse método vai retornar alguma coisa
//"concat" concatenar/juntar 
    public static void main (String [] args){
        String primeiroNome = "Matheus";
        String segundoNome = "Rachinski";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "O resultado foi" + primeiroNome.concat(" ").concat(segundoNome);
    }
}
