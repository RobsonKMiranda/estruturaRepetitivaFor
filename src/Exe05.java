import java.util.Scanner;
/*
    Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
    Lembrando que, por definição, fatorial de 0 é 1.
Exemplos:
Entrada:
4
Saída:
24
Entrada:
1
Saída:
1
Entrada:
5
Saída:
120
Entrada:
0
Saída:
1
 */
public class Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fat = 1;
        for (int i=1; i<=n; i++) {
            fat = fat * i;
        }
        System.out.println(fat);
        sc.close();
    }
}
