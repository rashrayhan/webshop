package shop.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import shop.domain.Product;
import shop.domain.ShoppingCart;

public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, String> {

}
