public class App {
    public static void main  (String[] args) throws Exception {
        char gender = 'f';
        String name = "ayla";
        int age = 19;
        double height = 1.65;
     System.out.println("Nome: " + name);
     System.out.println("Sua idade é: " + age);
     System.out.println("Sua altura é: " + height);

    if (age < 16){
        System.out.println(name + "não pode voltar");
    }
    else if (age < 18 || age > 64){
        System.out.println(name + "pode votar (facultativo)")
    }
    else {
        System.out.println(name + "tem que votar obrigatoriamente");

    }
}
}