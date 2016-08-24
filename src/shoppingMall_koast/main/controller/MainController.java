package shoppingMall_koast.main.controller;

import shoppingMall_koast.order.controller.OrderController;
import shoppingMall_koast.product.controller.ProductController;

public class MainController {

	public static OrderController orderController = new OrderController(this);
	public static ProductController productController = new ProductController(this);
	public static UserController userController = new UserController(this);
	public static ArticleController articleController = new ArticleController(this);
	public static LoginController loginController = new LoginController(this);
	
}
