public class App {
    public static void main(String[] args) throws Exception {

        User newUser = new User();

        newUser.setName("Arthur");
        newUser.setLastName("Alcantara");
        newUser.setEmail("arthuralcantara.dev@gmail.com");
        newUser.setPassword("#########");

        Address newUserAddress = new Address();
        newUserAddress.setStreet("Rua biruleibe");
        newUserAddress.setCity("Leibe");
        newUserAddress.setState("Pernambuco");
        newUserAddress.setCountry("Brazil");
        newUserAddress.setCep("52046527");

        System.out.println(
                "Nome: " + newUser.getName() + newUser.getLastName() + "\n" + "cidade: " + newUserAddress.getCity());

    }
}
