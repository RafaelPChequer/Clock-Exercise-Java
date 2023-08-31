import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();  // Cria uma instância da classe Clock
        Scanner scanner = new Scanner(System.in);  // Cria um scanner para ler entradas do usuário

        boolean running = true;  // Variável para controlar a execução do programa

        while (running) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Definir novo horário");
            System.out.println("2. Zerar relógio");
            System.out.println("3. Calcular tempo no cronômetro");
            System.out.println("4. Imprimir formato de 24 horas");
            System.out.println("5. Imprimir formato AM/PM");
            System.out.println("6. Obter horas");
            System.out.println("7. Obter minutos");
            System.out.println("8. Obter segundos");
            System.out.println("9. Sair");
            int choice = scanner.nextInt();  // Lê a escolha do usuário

            switch (choice) {
                case 1:
                    System.out.print("Digite as novas horas: ");
                    int newHours = scanner.nextInt();
                    System.out.print("Digite os novos minutos: ");
                    int newMinutes = scanner.nextInt();
                    System.out.print("Digite os novos segundos: ");
                    int newSeconds = scanner.nextInt();
                    clock.set(newHours, newMinutes, newSeconds);  // Define um novo horário no relógio
                    break;
                case 2:
                    clock.reset();  // Zera o relógio
                    System.out.println("Relógio zerado.");
                    break;
                case 3:
                    System.out.print("Digite as novas horas: ");
                    int stopWatchHours = scanner.nextInt();
                    System.out.print("Digite os novos minutos: ");
                    int stopWatchMinutes = scanner.nextInt();
                    System.out.print("Digite os novos segundos: ");
                    int stopWatchSeconds = scanner.nextInt();
                    int elapsedTime = clock.stopWatch(stopWatchHours, stopWatchMinutes, stopWatchSeconds); // Calcula o tempo decorrido
                    System.out.println("Tempo no cronômetro: " + elapsedTime + " segundos.");
                    break;
                case 4:
                    clock.print24HourFormat();  // Imprime o horário no formato de 24 horas
                    break;
                case 5:
                    clock.printAMPMFormat();  // Imprime o horário no formato AM/PM
                    break;
                case 6:
                    System.out.println("Horas: " + clock.getHours());  // Obtém e imprime as horas
                    break;
                case 7:
                    System.out.println("Minutos: " + clock.getMinutes());  // Obtém e imprime os minutos
                    break;
                case 8:
                    System.out.println("Segundos: " + clock.getSeconds());  // Obtém e imprime os segundos
                    break;
                case 9:
                    running = false;  // Sai do loop e encerra o programa
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();  // Fecha o scanner
        System.out.println("Programa encerrado.");
    }
}
