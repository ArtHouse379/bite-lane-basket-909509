package solaraenterprises.streetfood.bitelanebasket.data.repository

import solaraenterprises.streetfood.bitelanebasket.data.model.Product
import solaraenterprises.streetfood.bitelanebasket.data.model.ProductCategory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class ProductRepository {
    private val products = listOf<Product>(
        Product(
            id = 1,
            title = "Cheeseburger",
            description = "A grilled beef patty is layered with melted cheese, lettuce, tomato, and onion in a toasted sesame bun. A tangy burger sauce balances the rich, savory filling. It is a classic street-food choice served hot and ready to eat.",
            category = ProductCategory.BURGERS,
            price = 7.95,
            imageUrl = "https://images.pexels.com/photos/1556698/pexels-photo-1556698.jpeg",
        ),
        Product(
            id = 2,
            title = "Chicken Burger",
            description = "A crisp chicken fillet comes with lettuce, tomato, cheese, and creamy sauce in a soft bun. The coating stays crunchy while the chicken remains tender inside. It makes a filling handheld meal for lunch or dinner.",
            category = ProductCategory.BURGERS,
            price = 7.50,
            imageUrl = "https://images.pexels.com/photos/19737927/pexels-photo-19737927.jpeg",
        ),
        Product(
            id = 3,
            title = "Beef Taco",
            description = "Seasoned beef fills a warm corn tortilla with onion, cilantro, and a squeeze of lime. Fresh salsa adds brightness and a gentle kick. The taco is compact, savory, and easy to enjoy on the go.",
            category = ProductCategory.TACOS,
            price = 4.25,
            imageUrl = "https://images.pexels.com/photos/3264572/pexels-photo-3264572.jpeg",
        ),
        Product(
            id = 4,
            title = "Fish Taco",
            description = "Crisp fish is tucked into a corn tortilla with cabbage, cucumber, cilantro, and jalapeño. A cool sauce and fresh lime keep each bite light and balanced. It is a bright street-food option with plenty of texture.",
            category = ProductCategory.TACOS,
            price = 4.75,
            imageUrl = "https://images.pexels.com/photos/8448318/pexels-photo-8448318.jpeg",
        ),
        Product(
            id = 5,
            title = "Chicken Shawarma",
            description = "Spiced chicken is wrapped in warm flatbread with crisp vegetables and a creamy garlic sauce. The chicken is roasted for a savory char and sliced into tender pieces. This generous wrap travels well and makes a satisfying meal.",
            category = ProductCategory.WRAPS,
            price = 8.25,
            imageUrl = "https://images.pexels.com/photos/6416559/pexels-photo-6416559.jpeg",
        ),
        Product(
            id = 6,
            title = "Falafel Wrap",
            description = "Herbed chickpea falafel is rolled in flatbread with lettuce, tomato, cucumber, and tahini. The crisp falafel contrasts with the fresh vegetables and smooth sesame sauce. It is a hearty meat-free street-food favorite.",
            category = ProductCategory.WRAPS,
            price = 7.25,
            imageUrl = "https://images.pexels.com/photos/13778655/pexels-photo-13778655.jpeg",
        ),
        Product(
            id = 7,
            title = "French Fries",
            description = "Potato fries are cooked until golden with crisp edges and fluffy centers. A light seasoning of salt keeps the flavor simple and familiar. They work as a snack or an easy side for any street-food meal.",
            category = ProductCategory.SNACKS,
            price = 3.25,
            imageUrl = "https://images.pexels.com/photos/11710525/pexels-photo-11710525.jpeg",
        ),
        Product(
            id = 8,
            title = "Onion Rings",
            description = "Thick onion slices are coated in seasoned batter and fried until crisp. The sweet onion center stays tender beneath the crunchy shell. They come ready for dipping and sharing alongside a burger or wrap.",
            category = ProductCategory.SNACKS,
            price = 3.75,
            imageUrl = "https://images.pexels.com/photos/37358770/pexels-photo-37358770.jpeg",
        ),
        Product(
            id = 9,
            title = "Lemonade",
            description = "Fresh lemon juice is mixed with chilled water and just enough sugar for balance. Lemon slices add a clean citrus aroma to every glass. It is a bright, cooling drink for spicy or savory street food.",
            category = ProductCategory.DRINKS,
            price = 2.95,
            imageUrl = "https://images.pexels.com/photos/5946719/pexels-photo-5946719.jpeg",
        ),
        Product(
            id = 10,
            title = "Iced Coffee",
            description = "Fresh coffee is poured over ice and finished with a smooth splash of milk. The drink is cool, lightly creamy, and full of roasted flavor. It offers an easy pick-me-up with breakfast, lunch, or an afternoon snack.",
            category = ProductCategory.DRINKS,
            price = 3.50,
            imageUrl = "https://images.pexels.com/photos/6328975/pexels-photo-6328975.jpeg",
        ),
    )

    fun observeById(id: Int): Flow<Product?> {
        val item = products.find { it.id == id }
        return flowOf(item)
    }

    fun getById(id: Int): Product? {
        return products.find { it.id == id }
    }

    fun observeAll(): Flow<List<Product>> {
        return flowOf(products)
    }
}
