import java.util.Scanner;

public class CodePlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 1;
        double valor = 0, valortotal = 0, frete = 0;
        String escolhaProduto, escolhaFrete;

        System.out.println("Seja bem-vindo à loja de jogos! Nós vendemos diversos itens relacionados a games.");

        while (escolha != 0) {
            System.out.println("Digite o número referente ao produto que você está interessado em comprar:");
            System.out.println(" 1 - Consoles\n 2 - Jogos\n 3 - Periféricos\n 4 - PC");
            escolha = scanner.nextInt();
            scanner.nextLine(); 

            valor = 0; 

            switch (escolha) {
                case 1:
                    System.out.println("Digite a letra referente ao console que você deseja comprar:");
                    System.out.println("1 - Playstation 5 R$1500");
                    System.out.println("2 - Xbox Series X R$1000");
                    System.out.println("3 - Nintendo Switch R$900");
                    escolhaProduto = scanner.nextLine();

                    if (escolhaProduto.equals("1")) valor = 1500;
                    else if (escolhaProduto.equals("2")) valor = 1000;
                    else if (escolhaProduto.equals("3")) valor = 900;

                    System.out.println("Você será direcionado para um de nossos atendentes via WhatsApp:");
                    System.out.println("Pagamento - (62) 99749-5520 \nSuporte - (62)99629-4650");
                    break;

                case 2:
                    System.out.println("Escolha o jogo disponível na nossa loja (mídia física):");
                    System.out.println("1 - Elden Ring R$200\n2 - God of War Ragnarok R$230\n3 - Call of Duty MW2 R$250");
                    System.out.println("4 - Halo Infinite R$180\n5 - Horizon Forbidden West R$250\n6 - Forza Horizon 5 R$300");
                    System.out.println("7 - Mario Party: Jamboree R$290\n8 - The Legend of Zelda: Breath of the Wild R$300\n9 - New Pokémon Snap R$299");
                    escolhaProduto = scanner.nextLine();

                    switch (escolhaProduto) {
                        case "1" -> valor = 200;
                        case "2" -> valor = 230;
                        case "3" -> valor = 250;
                        case "4" -> valor = 180;
                        case "5" -> valor = 250;
                        case "6" -> valor = 300;
                        case "7" -> valor = 290;
                        case "8" -> valor = 300;
                        case "9" -> valor = 299;
                    }

                    System.out.println("Você será direcionado para um de nossos atendentes via WhatsApp:");
                    System.out.println("Pagamento - (62) 99749-5520 \nSuporte - (62)99629-4650");
                    System.out.println("OBS: Todos os jogos viram com o manual original e itens de colecionador.");
                    break;

                case 3:
                    System.out.println("Escolha o periférico que deseja comprar:");
                    System.out.println("1 - Action Figure Kratos 20cm R$400\n2 - Mario e Luigi vs Bowser 30cm R$700\n3 - Detetive Pikachu 15cm R$300");
                    System.out.println("4 - Controle PS5 Original R$300\n5 - Controle Xbox Series X Original R$250\n6 - TV 4K 30\" Samsung R$999");
                    escolhaProduto = scanner.nextLine();

                    switch (escolhaProduto) {
                        case "1" -> valor = 400;
                        case "2" -> valor = 700;
                        case "3" -> valor = 300;
                        case "4" -> valor = 300;
                        case "5" -> valor = 250;
                        case "6" -> valor = 999;
                    }

                    System.out.println("Você será direcionado para um de nossos atendentes via WhatsApp:");
                    System.out.println("Pagamento - (62) 99749-5520 \nSuporte - (62)99629-4650");
                    break;

                case 4:
                    System.out.println("Desejaria montar o seu computador do 0 ou pegar um montado de nossa loja?");
                    System.out.println("1 - PC Montado\n2 - Montar PC \n3 - Voltar");
                    escolhaProduto = scanner.nextLine();

                    if (escolhaProduto.equals("1")) {
                        System.out.println("Escolha o PC Montado:");
                        System.out.println("1 - Computador Gamer, AMD Ryzen 5 5500, GeForce RTX 4060 8GB, 16GB DDR4, SSD 480GB - R$ 3.260,00");
                        System.out.println("2 - PC Gamer Completo, Intel Core i5, RX 580 8GB, 16GB DDR3, SSD 480GB + Monitor + Kit Periféricos - R$ 4.559,00");
                        System.out.println("3 - PC GAMER, RYZEN 7 5700X WATER COOLER 240MM 32GB SSD 1TB RTX 4060 8GB GABINETE GAMER - R$ 7.139,00");
                        System.out.println("4 - Voltar");
                        escolhaProduto = scanner.nextLine();

                        if (escolhaProduto.equals("1")) valor = 3260;
                        else if (escolhaProduto.equals("2")) valor = 4559;
                        else if (escolhaProduto.equals("3")) valor = 7139;

                        System.out.println("Você será direcionado para um de nossos atendentes via WhatsApp:");
                        System.out.println("Pagamento - (62) 99749-5520 \nSuporte - (62)99629-4650");

                    } else if (escolhaProduto.equals("2")) {
                        System.out.println("Vamos com a CodePlay montar seu pc dos sonhos!");

                        // Perguntas sobre montar PC do 0
                        // Gabinete
                        System.out.println("Qual gabinete combina mais com seu estilo?");
                        System.out.println("1 - Cooler Master MasterBox Q300L | R$ 300");
                        System.out.println("2 - Corsair Carbide Series 275R | R$ 500");
                        System.out.println("3 - NZXT H510 | R$ 700");
                        System.out.println("4 - InWin PRISM | R$ 1.200");
                        System.out.println("5 - Voltar");
                        escolhaProduto = scanner.nextLine();
                        if (escolhaProduto.equals("1")) valor += 300;
                        else if (escolhaProduto.equals("2")) valor += 500;
                        else if (escolhaProduto.equals("3")) valor += 700;
                        else if (escolhaProduto.equals("4")) valor += 1200;

                        // Placa mãe
                        System.out.println("Qual placa mãe deseja?");
                        System.out.println("1 - Asus TUF Gaming B550M-Plus | R$ 899,99");
                        System.out.println("2 - MSI MPG B550 Gaming Plus | R$ 999,22");
                        System.out.println("3 - Gigabyte B650M D3HP | R$ 1.062,20");
                        System.out.println("4 - Asus ROG Strix B650-A Gaming Wi-Fi | R$ 2.299,99");
                        System.out.println("5 - Voltar");
                        escolhaProduto = scanner.nextLine();
                        if (escolhaProduto.equals("1")) valor += 899.99;
                        else if (escolhaProduto.equals("2")) valor += 999.22;
                        else if (escolhaProduto.equals("3")) valor += 1062.20;
                        else if (escolhaProduto.equals("4")) valor += 2299.99;

                        // Memória RAM
                        System.out.println("Qual a quantidade de memória RAM?");
                        System.out.println("1 - Dimm Gamer Warrior 4GB PC4-19200 - MM417 | R$ 129,90");
                        System.out.println("2 - Redragon Gamer 16GB DDR4 3200MHz GM702 | R$ 379,00");
                        System.out.println("3 - Kingston Fury Beast Gamer 16GB DDR4 3200MHz | R$ 519,90");
                        System.out.println("4 - Memória RAM Gamer 8GB 3000MHz RGB DDR4 T-Force Delta | R$ 300,00");
                        System.out.println("5 - Voltar");
                        escolhaProduto = scanner.nextLine();
                        if (escolhaProduto.equals("1")) valor += 129.90;
                        else if (escolhaProduto.equals("2")) valor += 379.00;
                        else if (escolhaProduto.equals("3")) valor += 519.90;
                        else if (escolhaProduto.equals("4")) valor += 300.00;

                        // Processador
                        System.out.println("Qual processador deseja?");
                        System.out.println("1 - AMD Ryzen 5 3600 | R$ 1.099,00");
                        System.out.println("2 - Intel Core i7-12700K | R$ 2.699,00");
                        System.out.println("3 - AMD Ryzen 7 5800X | R$ 2.199,00");
                        System.out.println("4 - Intel Core i5-12600K | R$ 1.799,00");
                        System.out.println("5 - Voltar");
                        escolhaProduto = scanner.nextLine();
                        if (escolhaProduto.equals("1")) valor += 1099.00;
                        else if (escolhaProduto.equals("2")) valor += 2699.00;
                        else if (escolhaProduto.equals("3")) valor += 2199.00;
                        else if (escolhaProduto.equals("4")) valor += 1799.00;

                        // Placa de vídeo
                        System.out.println("Qual placa de vídeo você prefere?");
                        System.out.println("1 - NVIDIA GeForce RTX 3060 | R$ 2.500,00");
                        System.out.println("2 - NVIDIA GeForce RTX 3070 | R$ 3.900,00");
                        System.out.println("3 - AMD Radeon RX 6600 XT | R$ 2.800,00");
                        System.out.println("4 - NVIDIA GeForce RTX 4090 | R$ 10.000,00");
                        System.out.println("5 - Voltar");
                        escolhaProduto = scanner.nextLine();
                        if (escolhaProduto.equals("1")) valor += 2500.00;
                        else if (escolhaProduto.equals("2")) valor += 3900.00;
                        else if (escolhaProduto.equals("3")) valor += 2800.00;
                        else if (escolhaProduto.equals("4")) valor += 10000.00;

                        // Armazenamento
                        System.out.println("Escolha seu armazenamento:");
                        System.out.println("1 - SSD Kingston 480GB | R$ 299,00");
                        System.out.println("2 - SSD Samsung 1TB | R$ 699,00");
                        System.out.println("3 - HD Seagate 2TB | R$ 399,00");
                        System.out.println("4 - Voltar");
                        escolhaProduto = scanner.nextLine();
                        if (escolhaProduto.equals("1")) valor += 299.00;
                        else if (escolhaProduto.equals("2")) valor += 699.00;
                        else if (escolhaProduto.equals("3")) valor += 399.00;

                        // Fonte de alimentação
                        System.out.println("Qual fonte de alimentação deseja?");
                        System.out.println("1 - Corsair CV550 550W | R$ 349,00");
                        System.out.println("2 - EVGA 600W | R$ 389,00");
                        System.out.println("3 - Corsair RM750x 750W | R$ 549,00");
                        System.out.println("4 - Voltar");
                        escolhaProduto = scanner.nextLine();
                        if (escolhaProduto.equals("1")) valor += 349.00;
                        else if (escolhaProduto.equals("2")) valor += 389.00;
                        else if (escolhaProduto.equals("3")) valor += 549.00;

                        // Cooler
                        System.out.println("Escolha um cooler para o seu PC:");
                        System.out.println("1 - Cooler Master Hyper 212 | R$ 149,00");
                        System.out.println("2 - NZXT Kraken X63 | R$ 1.199,00");
                        System.out.println("3 - Cooler Master MasterLiquid | R$ 799,00");
                        System.out.println("4 - Voltar");
                        escolhaProduto = scanner.nextLine();
                        if (escolhaProduto.equals("1")) valor += 149.00;
                        else if (escolhaProduto.equals("2")) valor += 1199.00;
                        else if (escolhaProduto.equals("3")) valor += 799.00;
                    }

                    break;

                case 0:
                    
                    break;

                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            
            if (escolha >= 1 && escolha <= 4) {
                
                frete = 0;

                System.out.println("Caso seu produto necessite de frete, escolha a região onde você mora:");
                System.out.println("1 - Norte R$50\n2 - Sul R$60\n3 - Centro Oeste R$0\n4 - Sudeste R$40\n5 - Nordeste R$65\n6 - Retirar na loja");
                escolhaFrete = scanner.nextLine();

                switch (escolhaFrete) {
                    case "1" -> frete = 50;
                    case "2" -> frete = 60;
                    case "3" -> frete = 0;
                    case "4" -> frete = 40;
                    case "5" -> frete = 65;
                    case "6" -> frete = 0;
                }

                valortotal += (valor + frete);

                System.out.println("Valor do produto: R$" + valor);
                System.out.println("Valor do frete: R$" + frete);
                System.out.println("O valor total da sua compra é: R$" + valortotal);

                System.out.println("Deseja comprar mais alguma coisa? (Digite 9 para sim e 0 para não)");
                escolha = scanner.nextInt();
                scanner.nextLine(); 
            }
        }

        System.out.println("Obrigado por comprar na nossa loja. Iremos te direcionar para um de nossos atendentes para realizar o pagamento, volte sempre!");
        scanner.close();
    }
}
