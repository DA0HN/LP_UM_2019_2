package programacaoFuncional_LAMBDA.consumer.util;

import java.util.function.Consumer;

import programacaoFuncional_LAMBDA.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override public void accept(Product p) {
		p.setPrice( p.getPrice() * 1.1 );
	}

}
