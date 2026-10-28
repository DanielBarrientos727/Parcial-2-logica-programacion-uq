import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bucles {

    public static void main(String[] args) {

        System.out.println("==============================================");

        // Loops o ciclos

        // Típico: repetir instrucciones manualmente

        System.out.println("Hola, Java");
        System.out.println("Hola, Java");
        System.out.println("Hola, Java");
        System.out.println("Hola, Java");
        System.out.println("Hola, Java");

        // Código de mala calidad: repetir mucho código

        // Bucle for clásico con contador
        // Tiene contador

        // 0, 1, 2, 3, 4

        // El contador i empieza en 0.
        // Mientras i sea menor que 5, el ciclo se ejecuta.
        // i++ aumenta el contador en 1.
        // Cuando i llega a 5, la condición i < 5 es falsa
        // y el ciclo termina.

        for (int i = 0; i < 5; i++) {
            System.out.println("Hola, Java");
        }

        // El contador aumenta de 3 en 3.

        for (int e = 0; e <= 10; e += 3) {
            System.out.println("Hola, Java");
        }

        // Cuenta regresiva desde 100 hasta 1.

        for (int i = 100; i > 0; i--) {
            System.out.println("Hola, Gaby");
        }

        // Array de nombres

        String[] names = {"Daniel", "Juan", "Carlos"};

        // Recorre el array desde la posición 0
        // hasta la última posición válida.

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Array de frutas
        // Si agregamos o quitamos frutas, el ciclo
        // se adapta automáticamente gracias a length.

        String[] frutas = {
                "Piña",
                "Cereza",
                "Manzana",
                "Durazno",
                "Banano"
        };

        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }

        //for-each ->no es ordenado

        String[] pais = {
                "Afganistán",
                "Albania",
                "Alemania",
                "Andorra",
                "Angola",
                "Antigua y Barbuda",
                "Arabia Saudita",
                "Argelia",
                "Argentina",
                "Armenia",
                "Australia",
                "Austria",
                "Azerbaiyán",
                "Bahamas",
                "Bangladés",
                "Barbados",
                "Baréin",
                "Bélgica",
                "Belice",
                "Benín",
                "Bielorrusia",
                "Birmania",
                "Bolivia",
                "Bosnia y Herzegovina",
                "Botsuana",
                "Brasil",
                "Brunéi",
                "Bulgaria",
                "Burkina Faso",
                "Burundi",
                "Bután",
                "Cabo Verde",
                "Camboya",
                "Camerún",
                "Canadá",
                "Catar",
                "Chad",
                "Chequia",
                "Chile",
                "China",
                "Chipre",
                "Ciudad del Vaticano",
                "Colombia",
                "Comoras",
                "Corea del Norte",
                "Corea del Sur",
                "Costa de Marfil",
                "Costa Rica",
                "Croacia",
                "Cuba",
                "Dinamarca",
                "Dominica",
                "Ecuador",
                "Egipto",
                "El Salvador",
                "Emiratos Árabes Unidos",
                "Eritrea",
                "Eslovaquia",
                "Eslovenia",
                "España",
                "Estados Unidos",
                "Estonia",
                "Esuatini",
                "Etiopía",
                "Filipinas",
                "Finlandia",
                "Fiyi",
                "Francia",
                "Gabón",
                "Gambia",
                "Georgia",
                "Ghana",
                "Granada",
                "Grecia",
                "Guatemala",
                "Guyana",
                "Guinea",
                "Guinea-Bisáu",
                "Guinea Ecuatorial",
                "Haití",
                "Honduras",
                "Hungría",
                "India",
                "Indonesia",
                "Irak",
                "Irán",
                "Irlanda",
                "Islandia",
                "Islas Marshall",
                "Islas Salomón",
                "Israel",
                "Italia",
                "Jamaica",
                "Japón",
                "Jordania",
                "Kazajistán",
                "Kenia",
                "Kirguistán",
                "Kiribati",
                "Kuwait",
                "Laos",
                "Lesoto",
                "Letonia",
                "Líbano",
                "Liberia",
                "Libia",
                "Liechtenstein",
                "Lituania",
                "Luxemburgo",
                "Madagascar",
                "Malasia",
                "Malaui",
                "Maldivas",
                "Malí",
                "Malta",
                "Marruecos",
                "Mauricio",
                "Mauritania",
                "México",
                "Micronesia",
                "Moldavia",
                "Mónaco",
                "Mongolia",
                "Montenegro",
                "Mozambique",
                "Namibia",
                "Nauru",
                "Nepal",
                "Nicaragua",
                "Níger",
                "Nigeria",
                "Noruega",
                "Nueva Zelanda",
                "Omán",
                "Países Bajos",
                "Pakistán",
                "Palaos",
                "Palestina",
                "Panamá",
                "Papúa Nueva Guinea",
                "Paraguay",
                "Perú",
                "Polonia",
                "Portugal",
                "Reino Unido",
                "República Centroafricana",
                "República del Congo",
                "República Democrática del Congo",
                "República Dominicana",
                "Ruanda",
                "Rumanía",
                "Rusia",
                "Samoa",
                "San Cristóbal y Nieves",
                "San Marino",
                "San Vicente y las Granadinas",
                "Santa Lucía",
                "Santo Tomé y Príncipe",
                "Senegal",
                "Serbia",
                "Seychelles",
                "Sierra Leona",
                "Singapur",
                "Siria",
                "Somalia",
                "Sri Lanka",
                "Sudáfrica",
                "Sudán",
                "Sudán del Sur",
                "Suecia",
                "Suiza",
                "Surinam",
                "Tailandia",
                "Tanzania",
                "Tayikistán",
                "Timor Oriental",
                "Togo",
                "Tonga",
                "Trinidad y Tobago",
                "Túnez",
                "Turkmenistán",
                "Turquía",
                "Tuvalu",
                "Ucrania",
                "Uganda",
                "Uruguay",
                "Uzbekistán",
                "Vanuatu",
                "Venezuela",
                "Vietnam",
                "Yemen",
                "Yibuti",
                "Zambia",
                "Zimbabue"
        };

        for (String paises : pais) {
            System.out.println(pais);
        }

        //For sirve para todas las escructuras ya vistas
        //Sirve para Hashset, HashMap, Array, ArrayList
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number : numbers) {
            System.out.println(numbers);
        }

        // Maps -> No garantiza un orden
        HashMap<String, String> emails = new HashMap<>();

        emails.put("Daniel", "daniel@gmail.com");
        emails.put("Daniel2", "daniel2@gmail.com");
        emails.put("DanielDev", "danieldev@gmail.com");

// Recorrer el mapa e imprimir las claves y sus valores
        for (Map.Entry<String, String> email : emails.entrySet()) {
            System.out.println("Usuario: " + email.getKey());
            System.out.println("Correo: " + email.getValue());
            System.out.println("-------------------------");
        }


        // Buscador estilo Google
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n========================================");
        System.out.println("          BUSCADOR JAVA");
        System.out.println("========================================");
        System.out.print("Buscar: ");

        String busqueda = scanner.nextLine().toLowerCase();
        boolean encontrado = false;

        System.out.println("\nResultados de búsqueda:\n");

        for (Map.Entry<String, String> email : emails.entrySet()) {

            String usuario = email.getKey();
            String correo = email.getValue();

            if (usuario.toLowerCase().contains(busqueda)
                    || correo.toLowerCase().contains(busqueda)) {

                System.out.println("Usuario: " + usuario);
                System.out.println("Correo:  " + correo);
                System.out.println("----------------------------------------");

                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron resultados.");
        }

        System.out.println("\nBúsqueda finalizada.");

    }

}