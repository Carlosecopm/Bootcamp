package sicronoAssicrono;

public class ThreadExemplo {
    public static void main(String[] args) {
        BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
        BarraDeCarregamento2 barraDeCarregamento21 = new BarraDeCarregamento2();
        barraDeCarregamento2.start();
        barraDeCarregamento21.start();
    }
}

class GerarPdf implements Runnable {
    @Override
    public void run() {
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento implements Runnable {
    @Override
    public void run() {
        System.out.println("Loading...");
    }
}

class BarraDeCarregamento2 extends Thread {
    public void run(){
        super.run();
        System.out.println("rodou " + this.getName());
    }
}
