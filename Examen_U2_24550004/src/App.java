import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception {
      Scanner read = new Scanner(System.in);
        int opc =0;
      double juego =0;
      String Computadora="";
      String Jugador="";
      int Ganadas;
      int Perdidas;
      int Empate;
        while (opc!=4){
            System.out.println("Elige una opcion:");
            System.out.println("1.Piedra, 2.Papel, 3.Tijeras, 4.Salir");
            opc = read.nextInt();
            juego = Math.random();
            if(juego<=.3){
                Computadora="Piedra";
            }else if (juego>.3 && juego<.6){
                Computadora="Papel";
            }else if (juego>.6 && juego<.9);{
                Computadora="Tijeras";
            }
            if(opc==1){
                Jugador="Piedra";
            }else if (opc==2){
                Jugador="Papel";
            }else if (opc==3){
                Jugador="Tijeras";
            }
        System.out.println("Resultado de la Computadora= "+Computadora);
        if(Computadora.equals("tijeras") && Jugador.equals("piedra") || Computadora.equals("piedra") && Jugador.equals("papel") ||Computadora.equals("papel") && Jugador.equals("tijeras")){
            System.out.println("GANASTE");
            Ganadas++;
        }else if(Computadora.equals("tijeras") && Jugador.equals("papel") || Computadora.equals("piedra") && Jugador.equals("tijeras") || Computadora.equals("papel") && Jugador.equals("piedra")){
            System.out.println("PERDISTE");
            Perdidas++;
        }else if(Computadora.equals(Jugador)){
            System.out.println("EMPATE");
        Empate++; 
        System.out.println(" ");

        System.out.println("Partidas Perdidas = "+Perdidas);
        System.out.println("Partidas Ganadas = "+Ganadas);
        System.out.println("Partidas Empatadas = "+Empate);
        }
        System.out.println("Thanks for playings");
        

    }

    }



