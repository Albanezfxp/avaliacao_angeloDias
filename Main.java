package provaAngeloFDias1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do produto:\n");
        String name = sc.next();
        System.out.println("Preço do produto:\n");
        double price = sc.nextDouble();
        System.out.println("Quantidade do produto:\n");
        int quantityInStock = sc.nextInt();

        Produto produto = new Produto(name,price,quantityInStock);

        System.out.println("Quantidade de items vendido: \n");
        produto.saleProduct(sc.nextInt());

        System.out.printf(
                "Produto: " + name +
                        "\nPreço: R$ " + price +
                        "\nEstoque antes da venda: " + quantityInStock + " unidades" +
                        "\nVenda realizada: " + produto.quantityInSale + " unidades\n" +
                        "Estoque atualizado: " + produto.quantityInStock
        );
        produto.saleProduct(sc.nextInt());
        System.out.printf(
                "Produto: " + name +
                        "\nPreço: R$ " + price +
                        "\nEstoque antes da venda: " + quantityInStock + " unidades" +
                        "\nVenda realizada: " + produto.quantityInSale + " unidades\n" +
                        "Estoque atualizado: " + produto.quantityInStock
        );
        System.out.println("\n\nNão foi feito por IA");
    }
}
