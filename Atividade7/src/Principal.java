
public class Principal {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        ControleRemoto controle = new ControleRemoto(tv);

        // Testando o controle do volume
        //Verifica qual o volume atual da Tv
        System.out.println("Volume inicial: " + controle.consultarVolume());
        //Aumenta o volume
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
        //Depois verifica novamente o volume
        System.out.println("Volume após aumentar: " + controle.consultarVolume());
        //Diminuir o volume
        controle.diminuirVolume();
        //Verifica novamente o volume atual
        System.out.println("Volume após diminuir: " + controle.consultarVolume());

        // Testando o controle do canal
        //Consulta em qual canal a tv esta no momento
        System.out.println("Canal inicial: " + controle.consultarCanal());
        //Aumenta o canal
        controle.aumentarCanal();
        controle.aumentarCanal();
        controle.aumentarCanal();
        //Consulta o canal novamente depois de aumentar
        System.out.println("Canal após aumentar: " + controle.consultarCanal());
        //Agora ele diminuir um canal
        controle.diminuirCanal();
        //Apos diminuir ele faz a consulta novamente
        System.out.println("Canal após diminuir: " + controle.consultarCanal());
        //Agora ele escolhe um canal especifico
        controle.irParaCanalIndicado(120);
        controle.consultarCanal();
      
        
    }
    
}
