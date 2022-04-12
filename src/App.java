public class App {
    public static void main(String[] args){
        
        String valor = "mamifero";

        switch (valor){

          case "homem":
            System.out.println("É um ser humano");
            break;
            
          case "mamifero":
            System.out.println("É um animal");
            break;

          default:
            System.out.println("Valor incorreto!");
            break;  
        }
    }
}
