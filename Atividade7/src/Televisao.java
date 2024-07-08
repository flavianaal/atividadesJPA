
public class Televisao {
    
    
    private int canal;
    private int volume;
   

    public Televisao() {
    }

    public Televisao(int canal, int volume, int canalDesejado) {
        this.canal = 1; //Canal inicial
        this.volume = 10; //Volume inicial
       
    }

    //Metodo para aumentar o volume da tv
    public void aumentarVolume(){
        //Verifica de o volume e menor que 100 e se for verdadeiro ele imcrenta de 1 em 1
        if (this.volume < 100) {
            this.volume++;
        } else {
            //Se o volume for maior que 100 ele imprime essa mensagem
            System.out.println("Volume máximo atingido.");
        }
    }
    
    //Metodo para diminuir o volume da tv
    public void diminuirVolume(){
        //verifica se o valor atribuido e maior que 0 e se for verdadeiro podera diminuir
        if (this.volume > 0) {
            this.volume--;
        } else {
            System.out.println("Volume mínimo atingido.");
        }
        
    }
    
    //Metodo para aumetar os canais da Tv
    public void aumentarCanal(){
        //Incremetar o canal em 1
        this.canal++;
    }
    
    //Metodo para diminuir os canais
    public void diminuirCanal(){
        //verifica se o valor atribuido e maior que 1 e se for verdadeiro podera diminuir
        if (this.canal > 1) {
            this.canal--;
        } else {
            System.out.println("Número de canal mínimo atingido.");
        }
    }
    
    //metodo para selecionar um canal
    public int irParaCanalIndicado(int canalDesejado) {
        //Verifica se o canam e maior que 1 e menor que 100
        if (canalDesejado >= 1 && canalDesejado <= 100) {
            this.canal = canalDesejado;
        } else {
            System.out.println("Número de canal inválido.");
        }
        return 0;
    }
  

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

   
    

 
}
