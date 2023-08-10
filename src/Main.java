public class Main {
    public static void main(String[] args) {
        Balao b1 = new Balao(5,"30","azul","", 5.00,60.00,"",10);
        Balao b2 = new Balao(2,"48","azul","", 5.00,60.00,"",10);
        System.out.println(b2.getId()+ "," + b2.getRegistro());

        String resultado = b1.voar(new Combustivel());
        System.out.println(resultado);

        Pessoa p1 = new Pessoa("gabis",5678467,"12343.23443.233", 1137309640,1139997696,"gabis", "jjljksdgfew de fnojrnohtoijthnpge- 181");

        Balao b3 = new Balao(4,"59","verde","", 5.00,60.00,"",10);

        Piloto l3 = new Piloto("Torredo",1234567890,1234658695);
    }
}