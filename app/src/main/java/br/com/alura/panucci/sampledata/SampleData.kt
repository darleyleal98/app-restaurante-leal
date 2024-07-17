package br.com.alura.panucci.sampledata

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.RestaurantMenu
import androidx.compose.material.icons.outlined.LocalBar
import br.com.alura.panucci.model.Product
import br.com.alura.panucci.ui.components.BottomAppBarItem
import java.math.BigDecimal

val sampleProducts = listOf(
    Product(
        name = "Spaghetti Carbonara",
        price = BigDecimal("14.99"),
        description = "Spaghetti com molho cremoso de ovo, pancetta e queijo parmesão.",
        image = "https://th.bing.com/th/id/OIP.8Nai58Hxl3_vwXfst0T8TAHaFj?rs=1&pid=ImgDetMain",
        isDrink = false
    ),
    Product(
        name = "Caesar Salad",
        price = BigDecimal("9.99"),
        description = "Salada de alface romana, croutons e molho Caesar, coberta com queijo parmesão.",
        image = "https://th.bing.com/th/id/OIP.rFjQIBU3QHhINA6QVSbi1QHaLH?rs=1&pid=ImgDetMain",
        isDrink = false
    ),
    Product(
        name = "Margherita Pizza",
        price = BigDecimal("12.99"),
        description = "Pizza tradicional italiana com molho de tomate, mussarela e manjericão fresco.",
        image = "https://th.bing.com/th/id/R.03fec869d7e8b711dce7a88cf97b98e4?rik=IX7k6xZ7CjNqPg&pid=ImgRaw&r=0",
        isDrink = false
    ),
    Product(
        name = "Tiramisu",
        price = BigDecimal("6.99"),
        description = "Sobremesa italiana clássica com camadas de biscoitos, café e creme de mascarpone.",
        image = "https://th.bing.com/th/id/OIP.PUtVCGjYekdsCCjiYvoBPAHaE7?rs=1&pid=ImgDetMain",
        isDrink = false
    ),
    Product(
        name = "Espresso",
        price = BigDecimal("2.99"),
        description = "Café espresso italiano forte e aromático.",
        image = "https://th.bing.com/th/id/R.741c918c88bf86a1fe985194e3e9a43f?rik=%2bvJiRnL9Y5qTJg&pid=ImgRaw&r=0",
        isDrink = true
    ),
    Product(
        name = "Ravioli de Ricota e Espinafre",
        price = BigDecimal("13.99"),
        description = "Massa recheada com ricota e espinafre, servida com molho de tomate fresco.",
        image = "https://www.comidaereceitas.com.br/wp-content/uploads/2018/01/Ravioli-verde-com-queijo-ricota-espinafre-e-nozes.jpg",
        isDrink = false
    ),
    Product(
        name = "Lasagna Bolognese",
        price = BigDecimal("15.99"),
        description = "Lasagna tradicional com camadas de massa, carne moída, molho de tomate e queijo.",
        image = "https://th.bing.com/th/id/R.b45e8dc3a1ea5196132267339944d82c?rik=zbW%2fpwxansJR%2bQ&pid=ImgRaw&r=0",
        isDrink = false
    ),
    Product(
        name = "Risotto de Cogumelos",
        price = BigDecimal("14.49"),
        description = "Arroz cremoso com uma variedade de cogumelos frescos e parmesão.",
        image = "https://th.bing.com/th/id/R.da45db76222f033ac7c76633e01d145d?rik=1Di%2ffVxghzhkiQ&pid=ImgRaw&r=0",
        isDrink = false
    ),
    Product(
        name = "Fettuccine Alfredo",
        price = BigDecimal("13.49"),
        description = "Massa fettuccine com molho cremoso de queijo parmesão e manteiga.",
        image = "https://www.daringgourmet.com/wp-content/uploads/2015/11/Fettuccine-Alfredo-3.jpg",
        isDrink = false
    ),
    Product(
        name = "Panna Cotta",
        price = BigDecimal("6.49"),
        description = "Sobremesa italiana suave e cremosa com calda de frutas vermelhas.",
        image = "https://th.bing.com/th/id/R.99c30c52bcd46111c9ba7de08badc25f?rik=z8bT8%2bRsvULeLg&riu=http%3a%2f%2fbuonapappa.net%2fwp-content%2fuploads%2f2015%2f08%2fvanilla-bean-panna-cotta-square.jpg&ehk=NUpNCGJLVMxZRkB2ab%2fSTvXs6UmRTdOK4eUCbKFhzTs%3d&risl=1&pid=ImgRaw&r=0",
        isDrink = false
    ),
    Product(
        name = "Bruschetta",
        price = BigDecimal("7.99"),
        description = "Torradas de pão italiano com tomate, manjericão e azeite de oliva.",
        image = "https://th.bing.com/th/id/R.12a43e72b98cc0cd03c7139536820300?rik=bDkNeIrb%2bTIc8A&pid=ImgRaw&r=0",
        isDrink = false
    ),
    Product(
        name = "Gelato de Pistache",
        price = BigDecimal("4.99"),
        description = "Sorvete italiano artesanal com sabor de pistache.",
        image = "https://cocina.guru/wp-content/uploads/2022/08/receta-de-helado-de-pistacho.jpg",
        isDrink = false
    ),
    Product(
        name = "Caprese Salad",
        price = BigDecimal("8.99"),
        description = "Salada de tomate, mussarela fresca e manjericão, regada com azeite e vinagre balsâmico.",
        image = "https://www.onceuponachef.com/images/2019/07/Caprese_Salad-1200x1558.jpg",
        isDrink = false
    ),
    Product(
        name = "Gnocchi al Pesto",
        price = BigDecimal("13.99"),
        description = "Nhoque de batata com molho pesto de manjericão.",
        image = "https://th.bing.com/th/id/OIP._gz0yrcZ0z_iBvsfrXlYzAHaHK?rs=1&pid=ImgDetMain",
        isDrink = false
    ),
    Product(
        name = "Cannoli",
        price = BigDecimal("5.99"),
        description = "Doce italiano com recheio cremoso de ricota e pedacinhos de chocolate.",
        image = "https://th.bing.com/th/id/OIP.Vh7gtglxphZepQGEd0UKqQHaE8?rs=1&pid=ImgDetMain",
        isDrink = false
    ),
    Product(
        name = "Prosecco",
        price = BigDecimal("19.99"),
        description = "Espumante italiano refrescante e levemente doce.",
        image = "https://th.bing.com/th/id/OIP.GAMZBh7BurBzC1HprzwfsAHaE7?rs=1&pid=ImgDetMain",
        isDrink = true
    ),
    Product(
        name = "Arancini",
        price = BigDecimal("8.49"),
        description = "Bolinhas de arroz recheadas com carne e queijo, fritas até ficarem douradas.",
        image = "https://th.bing.com/th/id/OIP.ZZUreIAzn4ofPYv8Ghjv0QHaE7?rs=1&pid=ImgDetMain",
        isDrink = false
    ),
    Product(
        name = "Polenta Cremosa",
        price = BigDecimal("12.99"),
        description = "Polenta suave e cremosa com molho de cogumelos.",
        image = "https://th.bing.com/th/id/OIP.KaRteQqqiZZSG-CrtxFo-AHaFj?rs=1&pid=ImgDetMain",
        isDrink = false
    ),
    Product(
        name = "Torta della Nonna",
        price = BigDecimal("7.99"),
        description = "Torta italiana recheada com creme de baunilha e coberta com pinhões.",
        image = "https://th.bing.com/th/id/R.77dbc96e550424534772ef6efd0c2681?rik=gj%2b4ZZFTmtDgSA&pid=ImgRaw&r=0",
        isDrink = false
    ),
    Product(
        name = "Bellini",
        price = BigDecimal("10.99"),
        description = "Coquetel italiano feito com prosecco e purê de pêssego.",
        image = "https://th.bing.com/th/id/R.03e6e180ad288d98fbf6e116e929a3c0?rik=rrOVyQMnqc3ZAw&pid=ImgRaw&r=0",
        isDrink = true
    ),
    Product(
        name = "Limoncello",
        price = BigDecimal("5.99"),
        description = "Licor italiano de limão, doce e refrescante.",
        image = "https://th.bing.com/th/id/OIP.quvqOpM-b0CiITYRN-fJBAHaLH?rs=1&pid=ImgDetMain",
        isDrink = true
    ),
    Product(
        name = "Antipasto Misto",
        price = BigDecimal("16.99"),
        description = "Seleção de frios, queijos e azeitonas italianas.",
        image = "https://th.bing.com/th/id/OIP.lhQ6VGmuwG9C_kchpefs6gHaE7?rs=1&pid=ImgDetMain",
        isDrink = false
    ),
    Product(
        name = "Tagliatelle al Ragu",
        price = BigDecimal("14.99"),
        description = "Massa tagliatelle com molho de carne ao estilo bolonhesa.",
        image = "https://lp-cms-production.imgix.net/2020-11/tagliatelle_al_ragu_G%20(2).jpg?auto=format&fit=crop&sharp=10&vib=20&ixlib=react-8.6.4&w=850&q=35&dpr=3",
        isDrink = false
    ),
    Product(
        name = "Zabaglione",
        price = BigDecimal("6.99"),
        description = "Sobremesa leve e espumosa feita com gemas, açúcar e vinho Marsala.",
        image = "https://th.bing.com/th/id/R.2cbab180fcc7300c4c83851f585fc899?rik=ECzTQ1l2g3e3gg&pid=ImgRaw&r=0",
        isDrink = false
    ),
    Product(
        name = "Cappuccino",
        price = BigDecimal("3.99"),
        description = "Café espresso com leite vaporizado e espuma de leite.",
        image = "https://th.bing.com/th/id/R.da39668e8d00c9a6895755ebdad865ec?rik=pgjutCTYQ9I95w&pid=ImgRaw&r=0",
        isDrink = true
    ),
    Product(
        name = "Pasta Primavera",
        price = BigDecimal("12.49"),
        description = "Massa com vegetais frescos, alho e azeite de oliva.",
        image = "https://th.bing.com/th/id/OIP.aHtFIDPbhylMJ27uGWUKngHaJQ?rs=1&pid=ImgDetMain",
        isDrink = false
    ),
    Product(
        name = "Minestrone Soup",
        price = BigDecimal("8.99"),
        description = "Sopa italiana rica em vegetais, feijão e macarrão.",
        image = "https://th.bing.com/th/id/OIP.feMvZ2Uhgda8ECYFvwpb6AHaKZ?rs=1&pid=ImgDetMain",
        isDrink = false
    ),
    Product(
        name = "Osso Buco",
        price = BigDecimal("21.99"),
        description = "Pernil de vitela cozido lentamente em molho de tomate e vinho.",
        image = "https://th.bing.com/th/id/OIP.EBKiQ0LiSVHnTT4BlPJwwwHaE8?rs=1&pid=ImgDetMain",
        isDrink = false
    ),
    Product(
        name = "Affogato",
        price = BigDecimal("5.49"),
        description = "Sorvete de baunilha com café espresso quente.",
        image = "https://www.thespruceeats.com/thmb/5PcCBEaUd1U1eFxfcKKPLVnZzfA=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/affogato-4776668-hero-08-40d7a68d12ba46f48eaea3c43aba715c.jpg",
        isDrink = false
    ),
    Product(
        name = "Chianti",
        price = BigDecimal("18.99"),
        description = "Vinho tinto italiano robusto e seco.",
        image = "https://th.bing.com/th/id/R.e2bcac061f6480797ac7492600941d2a?rik=DjlMhYZc79tFIw&pid=ImgRaw&r=0",
        isDrink = true
    )
)