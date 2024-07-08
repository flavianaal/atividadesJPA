public class ControleRemoto {
    private Televisao televisao;

    public ControleRemoto() {
        this.televisao = new Televisao(); // Inicializa a televisão com valores padrão
    }

    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
    }

    public int consultarVolume() {
        //verifica se a televisao esta configurada e não e nula
        if (televisao != null) {
            //retorna o volume atual da televisao
            return televisao.getVolume();
        } else {
            //Se a televisao não esta configurada ela imprimir uma mensagem de erro
            System.out.println("Televisão não está configurada.");
            return -1; // Retorna um valor de erro
        }
    }

    public int consultarCanal() {
        //verifica se a televisao esta configurada e não e nula
        if (televisao != null) {
            //retorna o canal atual da televisao
            return televisao.getCanal();
        } else {
            System.out.println("Televisão não está configurada.");
            return -1; // Retorna um valor de erro
        }
    }

    public void aumentarVolume() {
        //verifica se a televisao esta configurada e não e nula
        if (televisao != null) {
            //Chama o metodo aumetar o volume 
            televisao.aumentarVolume();
        } else {
            System.out.println("Televisão não está configurada.");
        }
    }

    public void diminuirVolume() {
        if (televisao != null) {
            televisao.diminuirVolume();
        } else {
            System.out.println("Televisão não está configurada.");
        }
    }

    public void aumentarCanal() {
        if (televisao != null) {
            televisao.aumentarCanal();
        } else {
            System.out.println("Televisão não está configurada.");
        }
    }

    public void diminuirCanal() {
        if (televisao != null) {
            televisao.diminuirCanal();
        } else {
            System.out.println("Televisão não está configurada.");
        }
    }

    public int irParaCanalIndicado(int canal) {
        if (televisao != null) {
            televisao.irParaCanalIndicado(canal);
        } else {
            System.out.println("Televisão não está configurada.");
        }
        return 0;
    }

    public Televisao getTelevisao() {
        return televisao;
    }

    public void setTelevisao(Televisao televisao) {
        this.televisao = televisao;
    }
}
