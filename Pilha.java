public class Pilha{
    //atributos

    private final static int TAM_DEFAULT = 100;
    private int topoPilha;
    private char e[];

    //contrutores

    public Pilha( int tamanho){
        e = new char[tamanho];
        topoPilha = -1;
    }
    
    public Pilha() {
        this(TAM_DEFAULT);
    }

    public boolean isEmpty(){

        return topoPilha == -1;
    }
    
    public boolean isFull(){

        return topoPilha == e.length -1;
    }

    public void push(char e) throws Exception{

        if(!isFull()){
            this.e[++topoPilha] = e;

        }
        else{
            throw new Exception("Overflow - Estouro da Pilha");
        }
    }
    
    public char pop() throws Exception{
        if(!isEmpty()){
            return this.e[this.topoPilha--];
        }
        else{
            throw new Exception("Underflow - Esvaziamento da Pilha");
        }
    }  

    public char topo() throws Exception{

        if(!isEmpty()){
            return this.e[this.topoPilha];
        }
        else{
            throw new Exception("Underflow - Esvaziamento da Pilha");
        }
    }

    public int sizeElements() {
        return topoPilha+1;
    }
    
}