import java.util.Scanner;

public class BalanceamentoParenteses{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Expressão: ");
        String exp = entrada.nextLine();
        try{
            boolean balanceada = isBalanceada(exp);
            if (balanceada){
                System.out.println("Parenteses balanceados");
            }
            else{
                System.out.println("Parenteses desbalenceados");
            }
        }catch (Exception e){
            System.out.println("Erro");
        }

    }

    public static boolean isBalanceada(String exp) throws Exception{
        Pilha pilha = new Pilha();
        char c;

        for (int i = 0; i < exp.length(); i++){
            c = exp.charAT(i);
            if (c == '('){
                pilha.push();
            }
            else if (c == ')'){
                if( pilha.isEmpty()){
                    return false;
                }
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }
}